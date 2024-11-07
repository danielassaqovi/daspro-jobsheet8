import java.util.Scanner;

public class Triangle12 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input nilai n
        System.out.print("Masukkan nilai N : ");
        int n = input.nextInt();

        //logic
        int i = 0;
        while (i <= n) {
            int j = 0;
            while (j < i) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

    }

}