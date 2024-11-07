public class tugas1 {
    
    public static void main(String[] args) {

        //deklarasi variable (3)
        int n = 5;
        int h = 1;

        //logic (3)
        //mengulang per baris
        while (h <= n) {
            //bintang 1 baris
            int i = 1;
            while (i <= n) {
                if (h == 1 || h == n || i == 1 || i == n) {
                    System.out.print("5");
                }
                else {
                    System.out.print(" ");      
                }     
                i++;     
            }
            System.out.println();
            h++;
        }

    }

}