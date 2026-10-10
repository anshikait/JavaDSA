import java.util.Scanner;

public class Pattern13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 1;
        int j = 1;
        int count = 1;
        while(i <= num){
            j = 1; // Reset j for each row
            while(j <= i){
                System.out.print(count + " ");
                j++;
                count++;
            }
            System.out.println();
            i++;
        }  
    }  
}