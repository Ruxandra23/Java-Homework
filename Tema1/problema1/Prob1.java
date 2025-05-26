package problema1;

import java.util.Scanner;

public class Prob1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        do {
            System.out.print("Introduceti un numar intre 0 si 5: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Valoare invalida. Incercati din nou.");
                scanner.next();
            }
            n = scanner.nextInt();
        } while (n < 0 || n > 5);

        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Elementul " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }


        System.out.print("Tablou inversat: ");
        inversareSiAfisare(array);
    }

    public static void inversareSiAfisare(int[] arr) {
        int st = 0, dr = arr.length - 1;
        while (st < dr) {
            int temp = arr[st];
            arr[st] = arr[dr];
            arr[dr] = temp;
            st++;
            dr--;
        }

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
