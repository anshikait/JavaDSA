import java.util.Scanner;
import java.lang.Math;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();

        for(int i = num; i >= 1; i--){
            for(int j = num; j >= 1; j--){
                if(i == j)
                    System.out.print(i + " ");
                else if(i < j || j < i)
                    System.out.print(Math.max(i, j) + " ");
                else
                    System.out.print("  ");
            }
            for(int j = 2; j <= num; j++){
                if(i == j)
                    System.out.print(i + " ");
                else if(i < j || j < i)
                    System.out.print(Math.max(i, j) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }

        for(int i = 2; i <= num; i++){
            for(int j = num; j >= 1; j--){
                if(i == j)
                    System.out.print(i + " ");
                else if(i < j || j < i)
                    System.out.print(Math.max(i, j) + " ");
                else
                    System.out.print("  ");
            }
            for(int j = 2; j <= num; j++){
                if(i == j)
                    System.out.print(i + " ");
                else if(i < j || j < i)
                    System.out.print(Math.max(i, j) + " ");
                else
                    System.out.print("  ");
            }
            System.out.println();
        }
    }
}