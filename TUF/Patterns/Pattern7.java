import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = 1; i <= num; i++){
            for(int j = num; j > i; j--){
                System.out.print("  ");
            }
            for(int k = 1; k <= (2*i - 1); k++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}