package org.example;

/**
 * @author VINNIVSO
 */
public class Exemplos {
    private int codigo = 1;
    private long codigoMaior = 12546;
    private double novoValorDecimal = 10.1;
    private boolean status = true;
    private String texto = "texto";

    public Exemplos() {

    }
    public Exemplos(int val) {
        this.codigo = val;
    }

    private float valorDecimal = 10.1f;
    private short shor;
    private byte baite;

    public String retornarTexto(){
        return "texto";
    }

    public int retornarInteiro(){
//        this.codigo = 11;
        int val = 1132;
        return val;
    }

    public long retornarLong(long num){
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Módulo 08");
    }
}