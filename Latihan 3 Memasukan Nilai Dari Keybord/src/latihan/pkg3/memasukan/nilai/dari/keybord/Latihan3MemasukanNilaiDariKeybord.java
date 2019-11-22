/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg3.memasukan.nilai.dari.keybord;
import java.util.Scanner;

/**
 *
 * @author Tubagus Firmansyah Hidayat
 */
public class Latihan3MemasukanNilaiDariKeybord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Masukan nama anda: ");
        Scanner scanner = new Scanner(System.in);
        
        String nama = scanner.next();
        System.out.println("Nama anda adalah "+nama);
    }
}
