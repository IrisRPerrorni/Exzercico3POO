package Ex4;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    public static void main(String[] args) {

        Peixe peixe1 = new Peixe("Tubarao",5,5,"","",19,"");
        Mamifero mamifero1 = new Mamifero("Camelo" , 3.5 , 4 ,"Marrom","",65.0,"vegetais");
        Mamifero mamifero2 = new Mamifero("Urso do Canada" , 2.4 , 4 ,"Marrom","",9.7,"vegetais e carne");
        Mamifero mamifero3 = new Mamifero("Leão" , 2.4 , 4 ,"Marrom","",9.7,"vegetais e carne");
        Mamifero mamifero4 = new Mamifero("Mico-Leão-Dourado" , 0.24 , 4 ,"Dourado","",8,"Frutas");
        Repteis repteis = new Repteis("iguana",1.0 , 4 , "verde", "mata", 35);

        System.out.println("-------Zoológico------------");

        mamifero1.descricao();
        mamifero2.descricao();
        mamifero3.descricao();
        mamifero4.descricao();
        peixe1.descricao();
        repteis.descricao();



    }
}
