import java.util.Scanner;
import static java.lang.Character.toChars;

public class Pattern15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = num; i >= 1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print((char)(j + 64) + " ");
            }
            System.out.println();
        }
    }
}