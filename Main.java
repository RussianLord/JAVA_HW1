import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        task3();
    }

    static void task1() { // Вычислить n-ое треугольного число(сумма чисел от 1 до n)
        int sum = 0;
        System.out.println("Введите число N = ");
        Scanner getNum = new Scanner(System.in);
        int n = getNum.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println("Сумма чисал от 1 до " + n + " = " + sum);
        getNum.close();
    }

    static void task2() { // Вычислить n! (произведение чисел от 1 до n)
        int sum = 1;
        System.out.println("Введите число факториала = ");
        Scanner getNum = new Scanner(System.in);
        int n = getNum.nextInt();
        for (int i = 1; i <= n; i++) {
            sum = sum * i;
        }
        System.out.println("Факториал числа " + n + " равен " + sum);
        getNum.close();
    }

    static void task3() {
        /*
        Вывести все простые числа от 1 до 1000
        (простые числа - это числа которые делятся только на себя и на единицу без остатка.
        Чтобы найти остаток от деления используйте оператор % , например 10%3 будет равно единице)
         */
        for (int i = 1; i < 1000; i++) {
            int k = 0;
            for (int j = 1; j < i + 1; j++) {
                if (i % j == 0) {
                    k++;
                }
            }
            if (k == 2) {
                System.out.println(i);
            }
        }
    }

    static void task4() {
        /*
        Реализовать простой калькулятор ("введите первое число"... "Введите второе число"
        ... "укажите операцию, которую надо выполнить с этими числами"... "ответ: ...")
         */
        System.out.println("Введите первое число ");
        Scanner snum1 = new Scanner(System.in);
        double num1 = snum1.nextInt();

        System.out.println("Введите операцию ");
        Scanner soperation = new Scanner(System.in);
        char operation = soperation.next().charAt(0);

        System.out.println("Введите второе число ");
        Scanner snum2 = new Scanner(System.in);
        double num2 = snum2.nextInt();
        if (operation == '+') {
            System.out.println("Результат сложения " + num1 + " и " + num2 + " = " + (num1 + num2));
        } else if (operation == '-') {
            System.out.println("Результат вычитания " + num1 + " и " + num2 + " = " + (num1 - num2));
        } else if (operation == '*') {
            System.out.println("Результат умножения " + num1 + " на " + num2 + " = " + (num1 * num2));
        } else if (operation == '/') {
            System.out.println("Результат деления " + num1 + " на " + num2 + " = " + (num1 / num2));
        } else {
            System.out.println("Вы ввели неверную операцию!");
        }

    }
}