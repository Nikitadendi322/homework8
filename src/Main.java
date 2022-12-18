public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
    }

    public static void task1() {
        System.out.println("Задача 1");
        int salary = 15000;
        int total = 0;
        int i = 1;
        while (total < 2459000 + i++) {
            total = total + salary;

            System.out.println("Месяц " + i + " сумма накоплений равна " + total + "рублей");
        }
    }

    public static void task2() {
        System.out.println("Задача 2");
        for (int i = 1; i < 11; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        {
            int b = 11;
            while (b > 1) {

                System.out.print(--b + " ");
            }
            System.out.println();
            {

            }

        }


    }

    public static void task3() {
        System.out.println("Задача 3");
        int population = 12_000_000;
        int fertility = population / 1_000 * 17;
        int mortality = population / 1_000 * 8;
        int year = 0;
        while (year < 10) {
            year++;
            population = population + fertility - mortality;
            System.out.println("Год " + year + ", численность населения составляет: " + population);
        }


    }

    public static void task4() {
        System.out.println("Задача 4");
        int sum = 15000;
        int monthNum = 1;
        while (sum <= 12000000) {
            sum *= 1.07;
            System.out.printf("месяц %d , сумма %d  \n", monthNum, sum);
            monthNum++;
        }
    }

    public static void task5() {
        System.out.println("Задача 5");
        int sum = 15000;
        int monthNum = 1;
        while (sum <= 12_000_000) {
            sum *= 1.07;
            if (monthNum % 6 == 0) {
                System.out.printf(" месяц %d, сумма %d \n", monthNum, sum);
            }
        monthNum++;
        }


    }

    public static void task6() {
        System.out.println("Задача 6");
        int sum = 15000;
        for (int i = 1; i < 9 * 12; i += 6) {
            int sumBefore = sum;
            sum *= 1 + 0.07 * 6;
            System.out.printf("Месяц %d, сумма %d  \n", i, sum - sumBefore);
        }

    }

    public static void task7() {
        System.out.println("Задача 7");
        int firstFriday = 1;
        for (int currentFriday = firstFriday; currentFriday <= 31; currentFriday += 7) {
            System.out.println("Сегодня пятница," + currentFriday + "-ое число." + "необходимо подготовить отчет,");
        }
    }

    public static void task8() {
        System.out.println("Задача 8");
        int currentYear = 2022;
        int beginning = currentYear - 200;
        int ending = currentYear + 100;
        for (int i = beginning; i < ending; ++i) {
            if (i % 79 == 0) {
                System.out.println(i);
            }
        }
    }
}
