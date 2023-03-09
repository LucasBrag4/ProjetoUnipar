
package com.mycompany.cadastrocachorro;

public class cachorro {

    public String raca;
    public int peso;
    public int patas;
    public String tamanho;
    public String cor;
    
   public void latir(){
       
        if (tamanho == "grande")
            System.out.println("Woof, woof");
        else if(tamanho == "medio")
            System.out.println("Ruffi, Ruffi");
        else 
            System.out.println("Vip, vip");
    }
}
