package com.company;

import java.time.LocalDate;

public class Main {

    public static void printSeparator() {
        System.out.println("-----------");
        System.out.println("+++++++++++");
    }

    public static void printIssues(int issueCount) {
        System.out.println(issueCount);
    }


    public static int sum(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        return sum;
    }

    //Метод, задания №1:
    public static void checkYear(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println(year + " високосный год");
        } else {
            System.out.println(year + " не високосный год");
        }
    }

    //    Метод, задания №2:
    public static void checkVersion(int clientOS, int clientDeviceYear) {
        if (clientDeviceYear < 2015 && clientOS < 1) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS < 1) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS >= 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else {
            System.out.println("Установите версию приложения для Android по ссылке");
        }
    }

    //    Метод, задания №3:
    public static void checkDeliveryDays(int deliveryDistance) {
        int deliveryTime = 1;
        if (deliveryDistance >= 1 && deliveryDistance <= 20) {
            deliveryTime = 1;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 21 && deliveryDistance <= 60) {
            deliveryTime = 2;
            System.out.println("Потребуется дней: " + deliveryTime);
        } else if (deliveryDistance >= 61 && deliveryDistance <= 100) {
            deliveryTime = 3;
            System.out.println("Потребуется дней: " + deliveryTime);
        }
    }

    //    Метод, задания №4:
    public static void checkDouble(String noDouble) {
        char[] doubleNo = noDouble.toCharArray();
        boolean isFound = false;
        for (int i = 0; i < doubleNo.length; i++) {
            if (doubleNo[i] == doubleNo[i + 1]) {
                System.out.println("Дубль " + doubleNo[i]);
                return;
            }
        }
        System.out.println("Нет дублей ");
    }

    //    Метод, задания №5:
    public static void reverseArr(int[] array) {
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i] + " ");
        }
    }


    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }


    //    Задание №1:
    public static void task1() {
        int year = LocalDate.now().getYear();
        checkYear(1992);
    }


    //    Задание №2:
    public static void task2() {
        int currentYear = LocalDate.now().getYear();
        int OC = 0;
        checkVersion(1, 2014);
    }


    //    Задание №3:
    public static void task3() {
        int deliveryDistance = 100;
        checkDeliveryDays(55);
    }


    //    Задание №4:
    public static void task4() {
        String englishLetters = "abccddefgghiijjkk";
        checkDouble(englishLetters);
    }


    //    Задание №5:
    public static void task5() {
        int[] arr = {3, 2, 1, 6, 5};
        reverseArr(arr);
    }


    //    Видеоурок:
    public static void videoLesson() {
        int[] issuesByMonths = {4, 6, 7, 9, 2, 5, 12, 3, 7, 10, 6, 7, 1, 8};
        printSeparator();
        for (int i = 0; i < issuesByMonths.length; i++) {
            printIssues(issuesByMonths[i]);
            if ((i + 1) % 3 == 0) {
                printSeparator();
            }
        }
        printSeparator();
        int total = sum(issuesByMonths);
        printIssues(total);
    }
}

