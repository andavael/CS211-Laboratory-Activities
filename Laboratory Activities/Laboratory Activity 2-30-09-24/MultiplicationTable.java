import java.util.Scanner;

public class MultiplicationTable{
    public static int[][] createMultiplicationTable(int size){
        int[][] mTable = new int[size][size];
        
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                mTable[i][j] = (i + 1) * (j + 1);
            }
        }
        return mTable;
    }

    public static void displayMultiplicationTable(int[][] mTable, int size){
        System.out.println("Multiplication Table:");
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.printf("%4d", mTable[i][j]);
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size of the multiplication table: ");
        int size = input.nextInt();

        int[][] mTable = createMultiplicationTable(size);
        displayMultiplicationTable(mTable, size);

        input.close();
    }
}