package ru.skypro;

public class Main {

    public static void main(String[] args) {
        // Задание 1
        int[] firstArray = new int[3];
        firstArray[0] = 1;
        firstArray[1] = 2;
        firstArray[2] = 3;

        double[] secondArray = {1.57, 7.654, 9.986};

        int[] thirdArray = {7, 4, 8, 12, 9, 10, 3};

        // Задание 2
        for (int i = 0; i < firstArray.length; i++) {
            if (i == firstArray[firstArray.length - 1]) {
                System.out.print(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i] + ", ");
        }
        System.out.print("/n");

        for (int i = 0; i < secondArray.length; i++) {
            if (i == secondArray[secondArray.length - 1]) {
                System.out.print(secondArray[i]);
                break;
            }
            System.out.print(secondArray[i] + ", ");
        }
        System.out.print("/n");

        for (int i = 0; i < thirdArray.length; i++) {
            if (i == thirdArray[thirdArray.length - 1]) {
                System.out.print(thirdArray[i]);
                break;
            }
            System.out.print(thirdArray[i] + ", ");
        }
        System.out.print("/n");

        // Задание 3
        for (int i = firstArray[firstArray.length - 1]; i >= 0; i -) {
            if (i == 0) {
                System.out.print(firstArray[i]);
                break;
            }
            System.out.print(firstArray[i] + ", ");
        }

        System.out.print("/n");

        for (int i = secondArray[secondArray.length - 1]; i >= 0; i -) {
            if (i == 0) {
                System.out.print(secondArray[i]);
                break;
            }
            System.out.print(secondArray[i] + ", ");
        }

        System.out.print("/n");

        for (int i = thirdArray[thirdArray.length - 1]; i >= 0; i -) {
            if (i == 0) {
                System.out.print(thirdArray[i]);
                break;
            }
            System.out.print(thirdArray[i] + ", ");
        }

        System.out.print("/n");

        // Задание 4
        for (int i = 0; i < firstArray.length; i++) {
            if (i % 2 == 1) {
                firstArray[i] = firstArray[i] + 1;
            }
        }

    }
}
