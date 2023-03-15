package com.mycompany.cadastrocachorro;

class ConstrutorCachorro {

    private final String nomeCachorro;
    private final int alturaCachorro;
    private final String corCachorro;
    private final String racaCachorro;
    private final int pesoCachorro;

    public ConstrutorCachorro(String nome, int altura, String cor, String raca, int peso) { //sempre referenciar os construtores AQUI
        nomeCachorro = nome;
        alturaCachorro = altura;
        corCachorro = cor;
        racaCachorro = raca;
        pesoCachorro = peso;
    }

    public String getNome() { //retorna o get atribuido no nome cachorro
        return "Nome do Cachorro: " + nomeCachorro;

    }

    public String getAltura() {
        return "Altura: " + alturaCachorro; //metodo string puxando um int
    }
    public String getCor() {
        return "Cor: "+ corCachorro;
    }
    public String getRaca() {
        return "Raça: "+ racaCachorro;
    }
    public String getPeso() {
        return "Peso: "+ pesoCachorro;
    }
}
