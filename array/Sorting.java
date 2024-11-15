class Array {
    public void showElement(int a[]) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");

        }
        System.out.println();
    }
}

public class Sorting {
    public static void main(String[] args) {
        Array arr = new Array();

        int array[] = { 10, 65, 444, 2, 336, 31, 7, 555, 69, 3 };

        System.out.println("The elements of the array are (before sorting): ");
        arr.showElement(array);

        for (int i = 0; i < array.length; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }

        System.out.println("The elements of the array are (after sorting): ");
        arr.showElement(array);
    }
}
