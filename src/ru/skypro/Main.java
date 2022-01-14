package ru.skypro;

public class Main {

    public static void main(String[] args) {
	int [] oneMassiv = new int[3];
    oneMassiv [0] = 1;
    oneMassiv [1] = 2;
    oneMassiv [2] = 3;

    double [] twoMassiv = {1.57, 7.654, 9.986};

    int [] treeMassiv = {7, 4, 8, 12, 9, 10, 3};






        for (int i = 0; i < oneMassiv.length; i++) {
            if (i == oneMassiv[oneMassiv.length - 1]) {
                System.out.print(oneMassiv[i]);
                break;
            }
            System.out.print(oneMassiv[i] + ", ");
        }
        System.out.print("/n");

        for (int i = 0; i < twoMassiv.length; i++) {
            if (i == twoMassiv[twoMassiv.length - 1]) {
                System.out.print(twoMassiv[i]);
                break;
            }
            System.out.print(twoMassiv[i] + ", ");
        }
        System.out.print("/n");

        for (int i = 0; i < treeMassiv.length; i++) {
            if (i == treeMassiv[treeMassiv.length - 1]) {
                System.out.print(treeMassiv[i]);
                break;
            }
            System.out.print(treeMassiv[i] + ", ");
        }
        System.out.print("/n");






        for (int i = oneMassiv[oneMassiv.length - 1]; i >= 0; i-) {
            if (i == 0) {
                System.out.print(oneMassiv[i]);
                break;
            }
            System.out.print(oneMassiv[i] + ", ");
        }

        System.out.print("/n");

        for (int i = twoMassiv[twoMassiv.length - 1]; i >= 0; i-) {
            if (i == 0) {
                System.out.print(twoMassiv[i]);
                break;
            }
            System.out.print(twoMassiv[i] + ", ");
        }

        System.out.print("/n");

        for (int i = treeMassiv[treeMassiv.length - 1]; i >= 0; i-) {
            if (i == 0) {
                System.out.print(treeMassiv[i]);
                break;
            }
            System.out.print(treeMassiv[i] + ", ");
        }

        System.out.print("/n");






        for (int i = 0; i < oneMassiv.length; i++) {
            if (i % 2 == 1) {
                oneMassiv[i]= oneMassiv[i] + 1;
            }
        }

    }
}
