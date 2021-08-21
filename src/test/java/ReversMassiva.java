public class ReversMassiva {
    public static int reverseArray(int[] items) {
        int t;

        // реверсирование массива
        for (int i = 0; i < items.length / 2; i++) {
            t = items[i];
            items[i] = items[items.length - i - 1];
            items[items.length - i - 1] = t;
        }

        return items.length;
    }

    public static void main(String[] args) {
        int [] array = { 1,2, 3, 1, 2, 8, 5, 6, 100,120 };

        reverseArray(array);
        for (int k = 0; k< array.length; k++)
            System.out.print(array [k]+" ");

    }
}
