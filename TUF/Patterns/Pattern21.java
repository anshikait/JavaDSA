import java.util.Scanner;
import static java.lang.Character.toChars;

public class Pattern21 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = 1; j <= num; j++){
                if(i == 1 || i == num || j == 1 || j == num)
                    System.out.print("* ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}