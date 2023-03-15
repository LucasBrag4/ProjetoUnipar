
package com.mycompany.cadastrocachorro;


public class construtor {
    
    public static void main(String[] args){
        ConstrutorCachorro cao1 = new ConstrutorCachorro("Pluto", 10, "marrom", "Pitbull", 5);
        ConstrutorCachorro cao2 = new ConstrutorCachorro("bob", 3, "branco", "Poodle", 5);
        ConstrutorCachorro cao3 = new ConstrutorCachorro("Spike",5, "laranja e branco", "vira-lata", 5 );
        ConstrutorCachorro cao4 = new ConstrutorCachorro("Spike",5, "laranja e branco", "vira-lata", 5 );
        ConstrutorCachorro cao5 = new ConstrutorCachorro("Spike",5, "laranja e branco", "vira-lata", 5 );
                
        System.out.println(cao1.getNome());
        System.out.println(cao1.getAltura());
        System.out.println(cao1.getCor());
        System.out.println(cao1.getRaca());
        System.out.println(cao1.getPeso());
        
        System.out.println("===================================");
        System.out.println(cao2.getNome());
        System.out.println(cao2.getAltura());
        System.out.println(cao2.getCor());
        System.out.println(cao2.getRaca());
        System.out.println(cao2.getPeso());
        
        System.out.println("===================================");
        System.out.println(cao3.getNome());
        System.out.println(cao3.getAltura());
        System.out.println(cao3.getCor());
        System.out.println(cao3.getRaca());
        System.out.println(cao3.getPeso());
        
        System.out.println("===================================");
        System.out.println(cao4.getNome());
        System.out.println(cao4.getAltura());
        System.out.println(cao4.getCor());
        System.out.println(cao4.getRaca());
        System.out.println(cao4.getPeso());
        
        System.out.println("===================================");
        System.out.println(cao5.getNome());
        System.out.println(cao5.getAltura());
        System.out.println(cao5.getCor());
        System.out.println(cao5.getRaca());
        System.out.println(cao5.getPeso());
    }
}



