/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117113.latihan25.ejaannama;

import java.util.Scanner;

/*
 * Nama     : Eka Widyantoro
 * NIM      : 10117113
 * Kelas    : IF-3/PBO-3
 * Desc     : Program untuk mengeja sebuah nama
 */
public class PBO310117113Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String kata;
        Scanner scanner = new Scanner(System.in);
        
        System.out.printf("Masukan nama depan anda untuk di eja : ");
        kata = scanner.next();
        
        System.out.println("");
        System.out.println("Ejaan untuk " + "'" +kata+"' "+"adalah : "  );
        
        for(int i=0; i<kata.length(); i++){
            String hurufNama;
            hurufNama = kata.substring(i,i+1);
            System.out.println("Huruf ke-"+(i+1)+" : "+(hurufNama));   
        }
    }
    
}
