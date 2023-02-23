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
        int month = 0;
        int salary = 15_000;
        int total = 0;
        while (total <= 2_459000) {
            month++;
            total = total + salary;
            System.out.println("Месяц " + month + " сумма накоплений равна " + total + " рублей");
        }
    }
    public static void task2() {
        System.out.println("Задача 2");
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
        System.out.println();
        for (i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }

    public static void task3() {
        System.out.println();
        System.out.println("Задача 3");
        int total = 12_000_000;
        int birthRate = 17 * 12000;
        int deathRate = 8 * 12000;
        for (int i = 1; i <= 10; i++) {
            total = total + birthRate - deathRate;
            System.out.println("Год " + i +" численность населения составляет " + total);
        }
    }
    public static void task4() {
        System.out.println("Задача 4");
        int total = 15000;
        for (int i = 1; total <= 12_000_000; i++) {
            total = total + total/100*7;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
        }
    }
    public static void task5() {
        System.out.println("Задача 5");
        int total = 15000;
        for (int i = 1; total <= 12_000_000; i++) {
            total = total + total / 100 * 7;
            if (i % 6 == 0) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
            }
        }
    }
    public static void task6() {
        System.out.println("Задача 6");
        int total = 15000;
        int i = 1;
        int nineYears = i*12*9;
        for (i = 1; i <= nineYears; i++) {
            total = total + total / 100 * 7;
            if (i % 6 == 0) {
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total);
            }
        }
    }
    public static void task7() {
        System.out.println("Задача 7");
        int friday = 3;
        while (friday <= 31) {
            System.out.println("Сегодня пятница, " + friday + "-е число");
            friday += 7;
        }
    }
    public static void task8() {
        System.out.println("Задача 8");
        for (int year = 0;year <= 2123; year++) {
         if (year % 79 == 0 && year > 1823) {
             System.out.println(year);
         }
        }
    }
}