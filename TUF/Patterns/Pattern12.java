import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i=0; i < num; i++){
            for(int j = 1; j <= i+1; j++){
                System.out.print(j + " ");
            } 
            for(int k = (2*(num-i) - 2); k >= 1; k--){
                System.out.print("  ");
            }
            for(int j = i+1; j >= 1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}