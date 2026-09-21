package JustWain;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void firstTask() {
        char value = 'g';
        char value2 = 'L';
        int x = 4162;
        int y = 5242;
        double c = 8825.16918183601127923;
        String gora = "Гора";
        int m = 7133;
        int x2 = 2698;
        String flower = "Цветок";
        int e = 9115;
        int n = 1138;
        String str = "карусель";
        String str2 = "Цветок";
        String c2 = "пицца";
        double p = 528.7452204341091254;
        System.out.println("pass");
    }

    static double secondTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x:");
        double x = scanner.nextDouble();
        return Math.log(2 * x) + Math.pow(Math.log10(x), 3) + Math.sqrt(5 * x);
    }

    static void thirdTask() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите A:");
        int A = scanner.nextInt();
        System.out.println("Введите B:");
        int B = scanner.nextInt();
        if (A != B) {
            int sum = A + B;
            A = B = sum;
        } else {
            A = B = 0;
        }
        System.out.println("Итоговый A:");
        System.out.println(A);
        System.out.println("Итоговый B:");
        System.out.println(B);
    }

    static void fourthTask() throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Данная программа считает период колебаний математического маятника.");

        System.out.println("Введите длину нити маятника l:");
        double l = scanner.nextDouble();
        if (l <= 0) {
            throw new Exception("Длина не может быть отрицательной или равной нулю.");
        }

        System.out.println("Введите ускорение свободного падения g:");
        double g = scanner.nextDouble();
        if (g <= 0) {
            throw new Exception("Ускорение свободного падения не может быть отрицательным или равным нулю.");
        }

        double T = 2 * Math.PI * Math.sqrt(l / g);
        System.out.println("Период колебания данного маятника равен:");
        System.out.printf("%.2f\n", T);
    }

    static void main() throws Exception {
        System.out.println("Задание 1");
        //firstTask();
        System.out.println("-----------------");
        System.out.println("Задание 2");
        //System.out.println(secondTask());
        System.out.println("-----------------");
        System.out.println("Задание 3");
        //thirdTask();
        System.out.println("-----------------");
        System.out.println("Задание 4");
        fourthTask();
    }
}
