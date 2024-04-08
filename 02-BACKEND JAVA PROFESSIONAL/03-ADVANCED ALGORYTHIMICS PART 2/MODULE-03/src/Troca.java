import java.util.HashMap;

public class Troca {
    private static void calculadora(int valor,int inicio, int[] moedas, HashMap<Integer, Integer> troco){
        for (int i = inicio; i < moedas.length; i++) {
            int k =  moedas[i];
            int v = valor / moedas[i];
            valor = valor % moedas[i];
            if (v != 0){troco.put(k,v);}
            calculadora(valor, i + 1, moedas, troco);
        }


    }



    public static void main(String[] args) {
        int valor = 16;
        int[] moedas = {5,2,1};
        HashMap<Integer, Integer> troco = new HashMap<>();

        calculadora(valor,0,moedas,troco);
        System.out.println("Valor para troco de R$" + valor );
        troco.forEach((k, v) -> System.out.println("notas de R$" + k  +": "+  v + " unidades"));

    }
}
