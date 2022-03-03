package br.com.dio;

import br.com.dio.model.Gato;

public class PrimeiroPrograma {
    public static void main(String[] args) {
        /*int a = 2, b = 3;
        System.out.println("Hello World!" + (a + b));*/

        Gato gato = new Gato();
        Livro livro1 = new Livro();
        System.out.println(gato);
        System.out.println();
        System.out.println(livro1);

    }
}
class Livro {
    private String nome;
    private Integer numPag;

    public Livro() {
    }

    public Livro(String nome, Integer numPag) {
        this.nome = nome;
        this.numPag = numPag;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numPag=" + numPag +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPag() {
        return numPag;
    }

    public void setNumPag(Integer numPag) {
        this.numPag = numPag;
    }
}