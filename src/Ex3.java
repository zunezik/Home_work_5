public class Ex3 {
    public static void main(String[] args) {
        int[] arr = new int[]{4, 2, 7, 3, 5};
        System.out.println("Індекс максимального елемента: " + (findIndex(arr)));
    }

    public static int findIndex(int arr[]) {
        int max = arr[0];
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }
}