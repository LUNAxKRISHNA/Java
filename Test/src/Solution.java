import java.util.Scanner;
public class Solution {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        int t=s.nextInt();
        int d = s.nextInt();
        int D=s.nextInt();
        int a=s.nextInt();
        int b=s.nextInt();
        int c=s.nextInt();
        int totalD=d*D;
        if(totalD>=42){
            System.out.println("3");
        }
        else if(totalD>=21){
            System.out.println("2");
        }

        else if(totalD>=10){
            System.out.println("1");
        }
    }
}