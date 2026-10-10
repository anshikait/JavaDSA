import java.util.Scanner;
import static java.lang.Character.toChars;

public class Pattern14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 0; j < i; j++){
                System.out.print((char)(j + 65) + " ");
            }
            System.out.println();
        }
    }
}