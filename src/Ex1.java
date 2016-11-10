public class Ex1 {
    public static void main(String[] args) {
        printTable(7, 8);
    }

    public static void printTable(int a, int b) {
        for (int i = a; i > 0; i--) {
            for (int j = b; j > 0; j--) {
                System.out.print(i * j + "\t");
            }
            System.out.println();
        }
    }
}