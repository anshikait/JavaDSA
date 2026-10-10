import java.util.Scanner;
import static java.lang.Character.toChars;

public class Pattern18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = num-i; j <= num; j++){
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }
    }
}