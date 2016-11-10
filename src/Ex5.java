public class Ex5 {
    private static final int SIZE = 40;

    public static void main(String[] args) {

        int[] arr = createArray(SIZE);
        printArray(arr);
        sortArray(arr);
        printArray(arr);
    }

    public static int[] createArray(int a) {
        int[] arr = new int[a];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100) + 1;
        }
        System.out.println("Створений масив");
        return arr;
    }

    public static int[] sortArray(int[] arr) {
        for (int i = arr.length - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int t = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = t;
                }
            }
        }
        System.out.println("Відсортований масив");
        return arr;
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        System.out.println();
    }
}
