public class Math {

    int[] numbers(int[] arr, int a) {
        int[] array = new int[arr.length];
        if (arr == null) {
            System.out.println("Zła tablica");

        } else if (a > arr.length) {
            System.out.println("Zła liczba");
        } else if (a == 0) {
            System.out.println("Zła liczba");

        } else {

            int x = 1;
            for (int i = 0; i < arr.length; i++) {

                if (i < a) {
                    array[i] = arr[a - x];
                    x++;

                } else {
                     array[i] = arr[i];

                }
            }
        }
            return array;

    }


}
