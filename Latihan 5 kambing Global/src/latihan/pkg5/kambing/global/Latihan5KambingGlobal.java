/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan.pkg5.kambing.global;

/**
 *
 * @author Lenovo
 */
public class Latihan5KambingGlobal {
// Variabel jumlahKambing menjadi variabel instance
    
    int jumlahKambing = 88;
    
    //Methode untuk menampilkan jumlah kambing
public void getJumlahKambing() {
      System.out.println("Jumlah Kambing: " + jumlahKambing);
    }
    
public void tambahKambing() {
      jumlahKambing = jumlahKambing +5;
      System.out.println("jumlah Kambing setelah ditambah: " +
                            jumlahKambing);
    }
    
public static void main(String[] args) {
     Latihan5KambingGlobal kambingSusu = new Latihan5KambingGlobal();
        
        //Menampilkan jumlah kambing yang ada saat program pertama x berjalan
        kambingSusu.getJumlahKambing();
        
        // Menambah satu kambing
        kambingSusu.tambahKambing();
        
        //Menampilkan jumlah kambing yang ada 
        kambingSusu.getJumlahKambing();
    }
}
