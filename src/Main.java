import java.time.LocalDate;

public class Main {
    public static String checkLeapYear(int year) {
        String checkLeapYear = " ";
        if ((year % 4 == 0 || year % 100 == 0) && (year % 400 != 0)) {
            checkLeapYear = " год - високосный год";
        } else {
            checkLeapYear = " год - не високосный год";
        }
        return checkLeapYear;
    }

    public static String checkVerPril(int clientDeviceYear, byte clientOS) {
        int currentYear = LocalDate.now().getYear();
        String checkVerPril = " ";
        if ((clientDeviceYear < currentYear) && (clientOS == 0)) {
            checkVerPril = "Установите облегченную версию приложения для iOS по ссылке";
        } else if ((clientDeviceYear >= currentYear) && (clientOS == 0)) {
            checkVerPril = "Установите версию приложения для iOS по ссылке";
        }
        if ((clientDeviceYear < currentYear) && (clientOS == 1)) {
            checkVerPril = "Установите облегченную версию приложения для Android по ссылке";
        } else if ((clientDeviceYear >= currentYear) && (clientOS == 1)) {
            checkVerPril = "Установите версию приложения для Android по ссылке";
        }
        return checkVerPril;
    }

    public static String calculateDeliveryDays(byte distance) {
        String day = " ";
        if (distance < 20) {
            day = "1";
        } else if (distance >= 20 && distance < 60) {
            day = "2";
        } else if (distance >= 60 && distance < 100) {
            day = "3";
        } else {
            day = "Свыше 100 км доставки нет ";
        }
        return day;
    }

    public static void main(String[] args) {

        System.out.println("Задание 1");
        int year = 2024;
        System.out.println(year + checkLeapYear(year));
        System.out.println("Задание 2");
        int clientDeviceYear = 2010;
        byte clientOS = 1;
        System.out.println(checkVerPril(clientDeviceYear, clientOS));
        System.out.println("Задание 3");
        byte deliveryDistance = 50;
        System.out.println("Потребуется дней: " + calculateDeliveryDays(deliveryDistance));
    }
}