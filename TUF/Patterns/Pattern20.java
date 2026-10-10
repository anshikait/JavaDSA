import java.util.Scanner;
import static java.lang.Character.toChars;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = 1; i < num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= num-i; j++){
                System.out.print("    ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

        for(int i = num; i > 0; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            for(int j = 1; j <= num-i; j++){
                System.out.print("    ");
            }
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}