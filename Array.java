
public class Array {
    public static void main(String a[]) {
        int arr[] = {1, 2, 3, 4};
        for (int i = 0; i < 4; i++) {
            System.out.println(arr[i]);
        }

        // multidimensional array;
        int multiarray[][] = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                multiarray[i][j] = (int) (Math.random() * 10);
            }
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(multiarray[i][j]+" ");
            }
			System.out.println("");
        }

		//enhanced way of printing 2d
		for(int n[]:multiarray)  // n is printing whole array i.e; whole row.
		{
			for(int m:n){ // m is printing the every value each array
			System.out.print(m+" ");
			}
			System.out.println();
		}
    }

}
