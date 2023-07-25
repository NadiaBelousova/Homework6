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
        task9();
        task10();
    }

    private static void task1() {
        System.out.println("Задача1");
        for (int i=1; i<=10; i=i+1) {
            System.out.println("Итерация" + i);
        }
    }

    private static void task2() {
        System.out.println("Задача2");
        for (int i=10; i>=1; i=i-1) {
            System.out.println("Итерация" + i);
        }
    }

    private static void task3() {
        System.out.println("Задача3");
        for (int i=0; i<=17; i=i+2) {
            System.out.println("Итерация" + i);
        }
    }

    private static void task4() {
        System.out.println("Задача4");
        for (int i=10; i>=-10; i=i-1) {
            System.out.println("Итерация" + i);
        }
    }

    private static void task5() {
        System.out.println("Задача5");
        for (int i=1904; i<=2096; i=i+4) {
            System.out.println(i +" год является високосным");
        }
    }

    private static void task6() {
        System.out.println("Задача6");
        for (int i=7; i<=98; i=i+7) {
            System.out.println(i);
        }
    }

    private static void task7() {
        System.out.println("Задача7");
        for (int i=1; i<=512; i=i*2) {
            System.out.println(i);
        }
    }

    private static void task8() {
        System.out.println("Задача8");
        int deposit = 29000;
        int depositWithProfit =0;
        for (int i=1; i<=12; i++) {
            depositWithProfit=depositWithProfit+ deposit;
            System.out.println("Прошел месяц " + i + ", сумма накоплений равна " + depositWithProfit + " рублей");
        }
    }

    private static void task9() {
        System.out.println("Задача9");
        int deposit = 29000;
        double total =0;
        int depositWithPenny = deposit*100;
        int totalWithPenny =0;
        for (int i=1; i<=12; i++) {
            totalWithPenny= totalWithPenny +totalWithPenny/100;
            totalWithPenny=totalWithPenny+depositWithPenny;
            total= totalWithPenny/100;
            System.out.println("Месяц " + i + ", сумма накоплений равна" + total + " рублей");
        }
    }

    private static void task10() {
        int number=1;
        int count= number*2;
        for (int i=1; i<=10; i++) {
            count=i*2;
            System.out.println(i + "* 2" + " =" + count);
        }
    }
}


