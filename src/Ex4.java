public class Ex4 {
    private static final int A = 8;
    private static final int B = 9;

    public static void main(String[] args) {
        int[][] arr = createArr(A, B);
        printArr(arr);
        int[] newArr = maxElem(arr);
        printArr(newArr);
    }

    public static int[][] createArr(int a, int b) {
        int arr[][] = new int[a][b];
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                arr[i][j] = (int) (Math.random() * 20);
            }
        }
        return arr;
    }

    public static int[] maxElem(int arr[][]) {
        int newArr[] = new int[A];
        for (int i = 0; i < arr.length; i++) {
            int max = arr[i][0];
            for (int j = 0; j < arr[i].length; j++) {
                if (max < arr[i][j]){
                    max = arr[i][j];
                }
            }
            newArr[i] = max;
        }
        return newArr;
    }

    public static void printArr(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    public static void printArr(int arr[][]){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println();
    }

}
