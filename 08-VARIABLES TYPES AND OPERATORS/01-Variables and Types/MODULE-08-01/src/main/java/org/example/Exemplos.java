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


    private float valorDecimal = 10.1f;
    private short shor;
    private byte baite;

    public String retornoTexto(){
        return "texto";
    }

    public int retornaInteiro(){
        return 10;
    }

    public long retornaLong(long num){
        return num;
    }

    public static void main(String[] args) {
        System.out.println("Módulo 08");
    }
}
