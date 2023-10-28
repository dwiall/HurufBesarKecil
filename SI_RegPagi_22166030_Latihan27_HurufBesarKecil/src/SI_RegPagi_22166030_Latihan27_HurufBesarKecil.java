import java.util.Scanner;
 /**
 *
 * @author 
 * Nama     : Dwi Ayu Lestari
 * Prodi    : Sistem Informasi
 * NIM      : 22166030
 * Deskripsi program : Pembuatan huruf besar dan huruf kecil yang inputannya berasal dari user
 */   
public class SI_RegPagi_22166030_Latihan27_HurufBesarKecil {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Meminta pengguna memasukkan kalimat
        System.out.print("Masukkan Kalimat: ");
        String kalimat = input.nextLine();

        // Mengonversi kalimat ke huruf besar dan huruf kecil
        String kalimatBesar = kalimat.toUpperCase();
        String kalimatKecil = kalimat.toLowerCase();

        System.out.println("\n");
        // Menampilkan hasil formatting
        System.out.println("====Hasil Formatting====");
        System.out.println("Huruf Besar: " + kalimatBesar);
        System.out.println("Huruf Kecil: " + kalimatKecil);
        
        //Menutup objek
        input.close();
    }
    
}
