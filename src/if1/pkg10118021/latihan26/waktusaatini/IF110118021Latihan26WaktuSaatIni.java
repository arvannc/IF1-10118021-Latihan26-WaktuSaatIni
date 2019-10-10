/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118021.latihan26.waktusaatini;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

/**
 *
 * @author Arvan
 * NAMA     : M Arvan Nurcahyana
 * KELAS    : IF-1
 * NIM      : 10118021
 * Deskripsi Program : Waktu saat ini
 */
public class IF110118021Latihan26WaktuSaatIni {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date jam = new Date();
        Calendar cal = Calendar.getInstance();
        int hari = cal.get(Calendar.DAY_OF_WEEK);
        SimpleDateFormat formatIndonesia = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
        String[] strHari = new String[]{"Sabtu","Minggu","Senin","Selasa","Rabu"
             ,"Kamis","Jumat"};
        System.out.println("Hari ini adalah hari : "+(strHari[hari])+", "+formatIndonesia.format(jam));
        System.out.println("(Developed by : M. Arvan Nurcahyana)");
    }
    
}
