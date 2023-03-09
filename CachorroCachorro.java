package com.mycompany.cadastrocachorro;

import java.util.Scanner;



public class CachorroCachorro {

   
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        //int num;
        //int tamanho = 0;
        
       //System.out.printf("escolha uma raça: ");
       //num = ler.nextInt();
        
       
        cachorro cachorro1 = new  cachorro();
        cachorro1.raca = "Boxer";
        cachorro1.peso = 8;
        cachorro1.patas = 4;
        cachorro1.tamanho = "medio";
        cachorro1.cor = "marrom";
        cachorro1.latir();
        System.out.println(" " +cachorro1.raca);
       
        cachorro cachorro2 = new  cachorro();
        cachorro2.raca = "Poodle";
        cachorro2.peso = 4;
        cachorro2.patas = 4; 
        cachorro2.tamanho = "pequeno";
        cachorro2.cor = "branco";
        cachorro2.latir();
        System.out.println(cachorro2.raca);
        
        
        cachorro cachorro3 = new  cachorro();
        cachorro3.raca = "pinsher";
        cachorro3.peso = 3;
        cachorro3.patas = 4;
        cachorro3.tamanho = "pequeno";
        cachorro3.cor = "marrom";
        cachorro3.latir();
        System.out.println(cachorro3.raca);
       
        
        cachorro cachorro4 = new  cachorro();
        cachorro4.raca = "pitbull";
        cachorro4.peso = 10;
        cachorro4.patas = 4;
        cachorro4.tamanho = "grande";
        cachorro4.cor = "preto";
        cachorro4.latir();
        System.out.println(cachorro4.raca);
        
        cachorro cachorro5 = new  cachorro();
        cachorro5.raca = "basse";
        cachorro5.peso = 6;
        cachorro5.patas = 4;
        cachorro5.tamanho = "pequeno";
        cachorro5.cor = "marrom";
        cachorro5.latir();
        System.out.println(cachorro5.raca);
        
        
    }
    
    
}