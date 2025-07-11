import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        short countAlt = 0;
        short countValleys = 0;
        System.out.println("Enter the movement string: ");
        String Movement = scanner.nextLine();
        for (int i = 0; i <Movement.length(); i++) {
            if (Movement.charAt(i) == 'U' || Movement.charAt(i) == 'u') {
                countAlt++;
            }
            else if (Movement.charAt(i)=='D' || Movement.charAt(i)=='d'){
                countAlt--;
            }
            else{
                continue;
            }
            if(countAlt==0){
                if(Movement.charAt(i)=='U' || Movement.charAt(i)=='u'){
                    countValleys++;
                }
            }
        }
        System.out.printf("Altitude : %d",countAlt);
        System.out.printf("Valleys : %d",countValleys);
    }
}