/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package posttest1;

import java.util.*;
import java.io.*;

public class Main {
   
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        ArrayList arrJ = new ArrayList<>();
        ArrayList arrP = new ArrayList<>();
        
        String Judul;
        String Penyanyi;
        
        InputStreamReader ISR = new InputStreamReader(System.in);
        BufferedReader BR = new BufferedReader(ISR);
        
        while(true){
            System.out.println("==================================");
            System.out.println("       ♪♬ PLAYLIST LAGU ♪♬      ");
            System.out.println("==================================");
            System.out.println("[1] Tambah Lagu");
            System.out.println("[2] Isi Playlist");
            System.out.println("[3] Ubah Lagu");
            System.out.println("[4] Hapus Lagu");
            System.out.println("[5] Exit");
            System.out.println("==================================");
            System.out.println("Masukkan Pilihan: ");
            
            int menu = Integer.parseInt(BR.readLine());
            if (menu == 1){ 
                System.out.println("==================================");
                System.out.println("            TAMBAH LAGU           ");
                System.out.println("==================================");
                System.out.print("Masukkan Judul Lagu: ");
                Judul = BR.readLine();
                arrJ.add(Judul);
                
                System.out.print("Masukkan Nama Penyanyi: ");
                Penyanyi = BR.readLine();
                arrP.add(Penyanyi);

            } else if (menu == 2) {
                System.out.println("==================================");
                System.out.println("Indeks  Judul           Penyanyi      ");
                System.out.println("==================================");
                for (int i = 0; i < arrJ.size(); i++) {
                    for (int j = 0; j < arrP.size(); j++) {
                        System.out.println("["+i+"]\t"+arrJ.get(i)+"\t\t"+arrP.get(j));
                    }
                }
            } else if (menu == 3) {
                System.out.println("==================================");
                System.out.println("         UPDATE JUDUL LAGU        ");
                System.out.println("==================================");
                System.out.print("Masukkan Indeks Lagu: ");
                int Ind = Integer.parseInt(BR.readLine());
                int indeks = Ind - 1;

                System.out.print("Judul: ");
                String jBaru = BR.readLine();

                arrJ.set(indeks, jBaru);

            } else if (menu == 4) {
                System.out.println("==================================");
                System.out.println("         HAPUS JUDUL LAGU        ");
                System.out.println("==================================");
                System.out.print("Masukkan Indeks Lagu: ");
                int iDel = Integer.parseInt((BR.readLine()));

                arrJ.remove(iDel);
                arrP.remove(iDel);
            } else if(menu == 5){
                System.out.println("~ANDA TELAH KELUAR DARI PROGRAM~");
                break;
            }else {
                System.out.println("Pilihan yang Anda masukkan salah! Masukkan pilihan ulang!");
            } 
        }
    }
    
}
