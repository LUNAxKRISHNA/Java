import java.util.Scanner;
public class  Fibonacci{
    public static void main(String[] args) {
        int n;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number");
        n=scanner.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println(fibonacci(i));
        }
    }
    static int fibonacci(int n){
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }
}