/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg4.kambing;

/**
 *
 * @author Tubagus Firmansyah Hidayat
 */
public class Latihan4Kambing {

    public void tambahKambing() {
    // Deklarasi variabel lokal
    int jumlahKambing = 0;
    
    jumlahKambing = jumlahKambing +5;
    System.out.println("Jumlah Kambing setelah ditambah: " +
                     jumlahKambing);
}
    public static void main(String[] args) {
        Latihan4Kambing kambingJantan = new Latihan4Kambing();
        kambingJantan.tambahKambing();
    }
}
