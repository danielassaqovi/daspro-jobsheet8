import java.util.Scanner;

public class Square12 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input nilai n
        System.out.print("Masukkan nilai N : ");
        int n = input.nextInt();

        //logic
        for (int iOut = 1; iOut <= n; iOut++){
            for (int i = 1; i <= n; i++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }

}