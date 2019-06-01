

public class Main {
    public static void main(String[] args) {
        Math math = new Math();

        int[] array = new int[10];
        int a = 7;


        for (int i = 0; i < array.length; i++) {
            array[i] = i + 15;
        }

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.println("");
        System.out.println("Nowa tablica");

        int[] newArray = math.numbers(array, a);

        for (int i = 0; i < newArray.length; i++) {
            System.out.print(newArray[i] + ", ");


        }
    }
}