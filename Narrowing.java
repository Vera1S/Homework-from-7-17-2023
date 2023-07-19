package Homework;

public class Narrowing {
    public static void main(String[] args) {
        //        Задание 1.
//Создайте четыре переменные: типа "byte", типа "int", типа "double", типа "float".
//Заполните все четыре переменные произвольными(на ваше усмотрение) значениями.
//С этим набором переменных сделайте преобразования типа "cужение" и "расширение".
//Запишите результаты преобразований в переменные соответствующего типа.
//Выведите результаты преобразований на экран с помощь метода System.out.println().

//        Расширение типов
        byte byteVal = 40;
        int intVal = byteVal;

        System.out.println(intVal);

//       Сужение типов
        int intVal2 = 10000;
        byte byteVal2 = (byte)intVal2;

        System.out.println(byteVal2);

        double doublenum = 12.22;
        float floatVal = 2351.11f;
        doublenum = floatVal;


        System.out.println(floatVal);
        System.out.println((double)floatVal);








    }
}
