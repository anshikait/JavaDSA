import java.util.Scanner;
import static java.lang.Character.toChars;

public class Pattern16 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= i; j++){
                System.out.print((char)(i + 64) + " ");
            }
            System.out.println();
        }
    }
}