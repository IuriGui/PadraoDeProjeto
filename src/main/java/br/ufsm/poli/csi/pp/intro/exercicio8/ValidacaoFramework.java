package br.ufsm.poli.csi.pp.intro.exercicio8;

import br.ufsm.poli.csi.pp.intro.exercicio7.ClasseExemplo;
import lombok.SneakyThrows;

import java.lang.reflect.Field;
import java.math.BigDecimal;
import java.util.Objects;

public class ValidacaoFramework implements Validator {

    public static void main(String[] args) throws ValidationException {
        ClasseExemplo classeExemplo = new ClasseExemplo();
        //classeExemplo.setId(10000L);
        classeExemplo.setNome("MeuJSONFramework");
        classeExemplo.setValor(12.0);

        ValidacaoFramework validacaoFramework = new ValidacaoFramework();
        validacaoFramework.validate(classeExemplo);
    }

    @SneakyThrows
    @Override
    public void validate(Object obj) throws ValidationException {
        if (!obj.getClass().isAnnotationPresent(Validate.class)) {
            return;
        }
        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);
            if (field.isAnnotationPresent(NotNull.class)) {
                NotNull annotation = field.getAnnotation(NotNull.class);
                if (field.get(obj) == null) {
                    throw new ValidationException("[" + field.getName() + "]"
                            + annotation.msgErro());
                }
            }
            if (Number.class.isAssignableFrom(field.getType())) {
                if (field.isAnnotationPresent(Min.class)) {
                    Min min = field.getAnnotation(Min.class);
                    Number valor = (Number) field.get(obj);
                    if (valor == null) {
                        return;
                    }
                    if (valor.doubleValue() < min.min()) {
                        throw new ValidationException("[" + field.getName() + "]"
                                + min.msgErro());
                    }
                }
                if (field.isAnnotationPresent(Max.class)) {
                    Max max = field.getAnnotation(Max.class);
                    Number valor = (Number) field.get(obj);
                    if (valor == null) {
                        return;
                    }
                    if (valor.doubleValue() > max.max()) {
                        throw new ValidationException("[" + field.getName() + "]"
                                + max.msgErro());
                    }
                }
            } else if (field.getType() == String.class
                    && field.isAnnotationPresent(Pattern.class)) {
                String valor = (String) field.get(obj);
                if (valor == null) {
                    return;
                }
                Pattern pattern = (Pattern) field.getAnnotation(Pattern.class);
                if (!valor.matches(pattern.regex())) {
                    throw new ValidationException("[" + field.getName() + "]"
                            + pattern.msgErro());
                }
            } else if (field.getType().isAnnotationPresent(Validate.class)
                    && field.get(obj) != null)
            {
                validate(field.get(obj));
            }
        }
    }
}
