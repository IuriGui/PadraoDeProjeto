package br.ufsm.poli.csi.pp.intro.meuExercicio.ex4;

public class TextoClaro implements Texto{

    @Override
    public void renderizar() {
        System.out.println("Renderizando Texto claro");
    }
}


//public class CloneUtil {
//
//    public static <T> T deepCopy(T original) throws Exception {
//
//        if (original == null) {
//            return null;
//        }
//
//        Class<?> clazz = original.getClass();
//
//        T copy = (T) clazz
//                .getDeclaredConstructor()
//                .newInstance();
//
//        for (Field field : clazz.getDeclaredFields()) {
//
//            field.setAccessible(true);
//
//            Object value = field.get(original);
//
//            // Tipos primitivos, wrappers e String
//            if (isPrimitiveOrWrapper(field.getType())
//                    || field.getType() == String.class) {
//
//                field.set(copy, value);
//
//            } else {
//
//                // Recursão para objetos internos
//                Object deepValue = deepCopy(value);
//
//                field.set(copy, deepValue);
//            }
//        }
//
//        return copy;
//    }
//
//    private static boolean isPrimitiveOrWrapper(Class<?> type) {
//
//        return type.isPrimitive()
//                || type == Integer.class
//                || type == Long.class
//                || type == Double.class
//                || type == Float.class
//                || type == Boolean.class
//                || type == Character.class
//                || type == Byte.class
//                || type == Short.class;
//    }
//}