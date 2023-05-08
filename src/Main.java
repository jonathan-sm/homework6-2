import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        System.out.println("домашка 6-2");
        task1();
        task2();
        task3();

    }

    public static void task1() {
        System.out.println(" задача 1");
        int year = 2024;
        yearLeap(year);


    }

    public static void task2() {
        System.out.println(" задача 2");
        int clientOS = 1;
        printInfoMessage(clientOS);


    }

    public static void task3() {
        System.out.println(" задача 3");
        int deliveryDistance =50;
        printcountDay(deliveryDistance);
    }

    public static void yearLeap(int yearNumber) {
        if ((yearNumber % 4 == 0) && (yearNumber % 100 != 0) || (yearNumber % 400 == 0)) {
            System.out.println(yearNumber + " - високосный год");
        } else {
            System.out.println(yearNumber + " - не високосный год");
        }
    }

    public static void printInfoMessage(int clientOS) {
        int year = LocalDate.now().getYear();
        String message = getInfoMessage(clientOS, year);
        System.out.println(message);


    }

    private static String getInfoMessage(int clientOS, int year) {
        if (clientOS == 0 && year < 2015) {
            return "Установите облегченную версию приложения для iOS по ссылке";
        } else if (clientOS == 0 && year >= 2015) {
            return "Установите версию приложения для iOS по ссылке";
        } else if (clientOS == 1 && year < 2015) {
            return "Установите облегченную версию приложения для Android по ссылке";
        } else if (clientOS == 1 && year >= 2015) {
            return "Установите версию приложения для Android по ссылке";
        } else {
            return "Не удалось определить версию";
        }
    }

    public static void printcountDay(int deliveryDistance) {
        int deliveryDays = countDay(deliveryDistance);

        String message;
        if (deliveryDays != -1) {
            message = String.format("Потребуется дней: %s", deliveryDays);
        } else {
            message = "Доставки нет";
        }
        System.out.println(message);

    }

    public static int countDay(int deliveryDistance) {
        if (deliveryDistance < 20) {
            return 1;
        } else if (deliveryDistance <= 60) {
            return 2;
        } else if (deliveryDistance < 100) {
            return 3;
        } else {
            return -1;
        }
    }
    }












    