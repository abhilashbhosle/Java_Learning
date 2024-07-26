// The multi-dimensional array where the number of collumn elements are not fixed is called as Jagged Array.

public class JaggedArray {
    public static void main(String args[]) {
        int jagged[][] = new int[3][];
        jagged[0] = new int[3];
        jagged[1] = new int[2];
        jagged[2] = new int[4];
        for (int[] jagged1 : jagged) {
            for (int j = 0; j < jagged1.length; j++) {
                jagged1[j] = (int)(Math.random()*10);
            }
        }

        for (int[] jagged1 : jagged) {
            for (int j = 0; j < jagged1.length; j++) {
                System.out.print(jagged1[j] + " ");
            }
            System.out.println();
        }
    }
}
