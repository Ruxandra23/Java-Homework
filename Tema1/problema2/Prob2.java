package problema2;

public class Prob2 {

    public static void main(String[] args) {
        int[] array1 = {1, 7, 4, 3, 9, 1};
        int[] array2 = {6, 4, 2, 8};

        sortare(array1);
        sortare(array2);

        System.out.print("Array1 sortat: ");
        afisare(array1);
        System.out.print("Array2 sortat: ");
        afisare(array2);

        int[] array3 = combinaSortat(array1, array2);

        System.out.print("Array combinat sortat: ");
        afisare(array3);
    }


    public static void sortare(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int aux = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = aux;
                }
            }
        }
    }

    public static int[] combinaSortat(int[] a, int[] b) {
        int[] rezultat = new int[a.length + b.length];
        int i = 0, j = 0, k = 0;

        while (i < a.length && j < b.length) {
            if (a[i] <= b[j]) {
                rezultat[k++] = a[i++];
            } else {
                rezultat[k++] = b[j++];
            }
        }

        while (i < a.length) {
            rezultat[k++] = a[i++];
        }

        while (j < b.length) {
            rezultat[k++] = b[j++];
        }

        return rezultat;
    }

    public static void afisare(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1)
                System.out.print(", ");
        }
        System.out.println("]");
    }
}
