import java.util.Scanner;

public class Star12 {

    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //input nilai n
        System.out.print("Masukkan nilai N : ");
        int n = input.nextInt();

        //logic
        for (int i=1; i<=n; i++) {
            System.out.print("*");
        }

    }

}