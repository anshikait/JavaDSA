import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = num; i >= 1; i--){
            for(int j = i; j < num; j++){
                System.out.print("  ");
            }
            for(int k = (2*i - 1); k >= 1; k--){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}