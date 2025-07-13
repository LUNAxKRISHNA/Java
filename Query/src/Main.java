import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        short n, rows,colm=3;
        Scanner scanner=new Scanner(System.in);

        System.out.println("Enter the size of result array");
        n=scanner.nextShort();

        System.out.println("Enter the number of rows");
        rows=scanner.nextShort();

        int[] result=new int[n];
        Arrays.fill(result,0);

        int[][] querry =new int[rows][colm];
        System.out.println("Enter the array elements");
        for(int i=0;i<rows;i++){
            for(int j=0;j<colm;j++){
                System.out.printf("%d | %d : ",i+1,j+1);
                querry[i][j]=scanner.nextInt();
            }
        }
        for(int i=0;i<rows;i++){
            for(int j=0;j<3;j++){
            querry[i][j]=querry[i][j];
            }
        }
    }
}