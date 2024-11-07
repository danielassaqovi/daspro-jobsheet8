import java.util.Scanner;

public class tugas2porseni12 {
    
    public static void main(String[] args) {
        
        //deklarasi inputan
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        int jmlAtlet = 5;

        //judul 
        System.out.println("=---------------------------=");
        System.out.println("=--------- Porseni ---------=");
        System.out.println("=---------------------------=\n");

        //input jumlah politeknik yang mengikuti porseni
        System.out.print("Masukkan jumlah politeknik yg daftar : ");
        int jmlPoliteknik = input.nextInt();
        input.nextLine();

        //perulangan untuk tiap politeknik
        for (int i = 1; i <= jmlPoliteknik; i++) {

            System.out.println("");
            System.out.println("-----------------------------");
            System.out.println("");

            System.out.println("Politeknik - " + i);

            //perulangan untuk tiap cabor
            System.out.println("Cabor : Badminton");
            String namaAtlet;
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = input.nextLine();
            }

            System.out.println("Cabor : Tenis Meja");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = input.nextLine();
            }

            System.out.println("Cabor : Basket");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = input.nextLine();
            }

            System.out.println("Cabor : Bola Voly");
            for (int j = 1; j <= jmlAtlet; j++) {
                System.out.print("Nama atlet " + j + "\t : ");
                namaAtlet = input.nextLine();
            }

        }

    }

}