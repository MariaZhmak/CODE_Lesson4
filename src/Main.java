import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Примитивные типы данных

//        int carrot = 23;
//        int apple = 1234;
//        System.out.println((carrot + apple) / 2);

//        int i = 2147483647;
//        long l = 123423423L;
//        double d = 12342.3;
//        boolean bool = false;

        // Как узнать максимальное значения типа Integer
//        System.out.println(Integer.MAX_VALUE);

        // Если прибавить к максимальному значению 1, то число сбросится до наименьшего значения
//        System.out.println(i + 1);

        // Практика. Вычисление BMI

//        double weight = 53;
//        double height = 1.64;

        // Пользователь может вносить свои данные самостоятельно
//        System.out.println("Ввдите свой вес (кг): ");
//        double weight = new Scanner(System.in).nextDouble();
//        System.out.println("Введите своей рост (м): ");
//        double height = new Scanner(System.in).nextDouble();
//
//        System.out.println("BMI = " + weight / (height * height));

        // Практика. Калькулятор умножения

        System.out.println("\t\t***Добро пожаловать в калькулятор умножения чисел***");
        System.out.println("Введите первое число");
        int a = new Scanner(System.in).nextInt();
        System.out.println("Введите второе число");
        int b = new Scanner(System.in).nextInt();

        System.out.println(a + " * " + b + " = " + a * b);


    }
}
