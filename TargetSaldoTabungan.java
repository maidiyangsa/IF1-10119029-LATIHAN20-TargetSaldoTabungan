/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package targetsaldotabungan;
/**
 *
 * @author Beta Three
 * NAMA         : Adrian Maidiyangsa
 * KELAS        : IF-1
 * NIM          : 10119029
 * Deskripsi Program : Program ini berisi program target saldo tabungan, program ini dibuat sendiri
 * dan dibantu oleh sumber-sumber yang ada diinternet
 */
public class TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i;
        double saldoTarget;
        int saldoAwal = 3500000;

        saldoTarget = 6000000;

        i = 1;
        while (saldoAwal < saldoTarget) {
            System.out.print("Saldo di bulan ke-" + i + " Rp.");
            i++;
            double bunga = 0.08 * saldoAwal;
            System.out.println(saldoAwal = (int) (saldoAwal + bunga));
        }
    }

}
