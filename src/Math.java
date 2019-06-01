public class Math {

    int[] numbers(int[] arr, int a) {

        if (arr == null) {
            System.out.println("Zła tablica");

        } else if (a > arr.length) {
            System.out.println("Zła liczba");
        } else if (a == 0) {
            System.out.println("Zła liczba");

        } else {
            for (int i = 0; i < arr.length; i++) {
                if (i < a) {
                    arr[i] = a - i;

                } else {
                    arr[i] = i;

                }
            }
        }
            return arr;

    }


}
