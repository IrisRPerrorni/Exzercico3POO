package Ex3;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    public static void main(String[] args) {
        Map<String,String> listaString = new HashMap<>();
        listaString.put("bola" , "azul");
        listaString.put("caneta" , "rosa");
        listaString.put("dado" , "branco" );

        for (String chave : listaString.keySet()) {
            String valor = listaString.get(chave);
            System.out.println(valor + "->" + chave);

        }
    }
}
