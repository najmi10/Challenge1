/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package challengesatu;

import java.util.Scanner;

/**
 *
 * @author ica
 */
public class Challengesatu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("\n===Komisi yang diperoleh dari Koperasi===");
        int pendapatan;
        double komisi;
        double total;
        
        //Input
        Scanner baca = new Scanner(System.in);
        System.out.println("Masukkan uang pendapatan");
        pendapatan = baca.nextInt();
        
        if(pendapatan < 20000){
        System.out.println("Mendapatkan uang jasa 10k");
        komisi = (pendapatan * 10/100);
        System.out.println("komisi : " + komisi);
        
        total = 10000 + komisi;
        System.out.println("total : " + total);
        
        
        }if(pendapatan >= 20000) { 
            System.out.println("Mendapatkan uang jasa 20k");
            komisi = (pendapatan * 15/100);
            System.out.println("komisi : " + komisi);
            
            total = 20000 + komisi;
            System.out.println("total :" + total);
            
        } if(pendapatan >= 50000) {
            System.out.println("Mendapatkan uang jasa 30k");
            komisi = (pendapatan * 20/100);
            System.out.println("komisi : " + komisi);
            
            total = 30000 + komisi;
            System.out.println("total : " + total);
            
        } if(pendapatan >= 100000) {
            System.out.println("Mendapatkan uang jasa 50k");
            komisi = (pendapatan * 30/100);
            System.out.println("komisi : " + komisi);
            
            total = 50000 + komisi;
            System.out.println("total : " + total);
            
        }else if(pendapatan >= 150000) {
            System.out.println("Mendapatkan uang jasa 75k");
            komisi = (pendapatan * 40/100);
            System.out.println("komisi : " + komisi);
            
            total = 75000 + komisi;
            System.out.println("total :" + total);
                    
                   
            
            
        
        
    }
    
}
}


    
    

