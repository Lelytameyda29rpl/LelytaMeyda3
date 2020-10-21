/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.elbey.program;
import java.util.Scanner;

/**
 *
 * @author MOKLET-2
 */
public class PenjualanLaptop {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int diskon;
        String[] laptop = {"asus","acer","TOSHIBA"};
        int[] harga = {8000000,7000000,6000000};
        
        System.out.println("Halo Selamat Datang Di Toko Samodra");
        System.out.println("Silahkan Berbelanja");
        
        for (int i=0; i<harga.length; i++){
        System.out.println(i+ "." + laptop[i] +" seharga "+ harga[i]);
        }  
        System.out.println("Silahkan Memasukkan Pilihan Anda:");
        Scanner input = new Scanner(System.in);
        int pilihan = input.nextInt();
        System.out.println("Input Pilihan : "+laptop[pilihan]);
        
        System.out.println("Silahkan Memasukkan Nominal Uang Anda");
        int bayar = input.nextInt();
        if (bayar > harga [pilihan]){
        diskon = harga[pilihan]*10/100;
            System.out.println("Kembalian Nominal Uang Anda = "+(bayar-(harga[pilihan]-diskon)));
            
        }else if (bayar == harga[pilihan]){
        diskon = harga[pilihan]*10/100;
            System.out.println("Kembalian Nominal Anda = "+(bayar-(harga[pilihan]-diskon)));
            
        }else{
        diskon = harga[pilihan]*10/100;
            System.out.println("Nominal Uang Anda Kurang = "+(harga[pilihan]-(bayar-diskon)));
            
            
        }
            
        }
        
        
                
        }
        
        
    
    

