package org.vinnivso;

import org.vinnivso.manufacturers.chevrolet.Impala;
import org.vinnivso.manufacturers.chevrolet.Omega;
import org.vinnivso.manufacturers.mitsubishi.Eclipse;
import org.vinnivso.manufacturers.mitsubishi.Lancer;
import org.vinnivso.manufacturers.nissan.GTR32;
import org.vinnivso.manufacturers.nissan.GTR34;
import org.vinnivso.manufacturers.nissan.GTR35;
import org.vinnivso.manufacturers.nissan.Silvia;
import org.vinnivso.manufacturers.subaru.Impreza;
import org.vinnivso.manufacturers.subaru.Outback;
import org.vinnivso.manufacturers.toyota.SUPRAMK5;
import org.vinnivso.manufacturers.toyota.SupraMK4;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static <T>void main(String[] args) {
        List<T> carsList = new ArrayList<>();

        //Casting Class on Generics <T>
        carsList.add((T) Impala.class);
        carsList.add((T) Omega.class);
        carsList.add((T) Eclipse.class);
        carsList.add((T) Lancer.class);
        carsList.add((T) GTR32.class);
        carsList.add((T) GTR34.class);
        carsList.add((T) GTR35.class);
        carsList.add((T) Silvia.class);
        carsList.add((T) Impreza.class);
        carsList.add((T) Outback.class);
        carsList.add((T) SupraMK4.class);
        carsList.add((T) SUPRAMK5.class);
        carsList.add((T) "Unknown");
        printing(carsList);

        //Setting the List to Class<Generic>
        List<Class<?>> carsList2 = new ArrayList<>();
        carsList2.add(Impala.class);
        carsList2.add(Omega.class);
        carsList2.add(Eclipse.class);
        carsList2.add(Lancer.class);
        carsList2.add(GTR32.class);
        carsList2.add(GTR34.class);
        carsList2.add(GTR35.class);
        carsList2.add(Silvia.class);
        carsList2.add(Impreza.class);
        carsList2.add(Outback.class);
        carsList2.add(SupraMK4.class);
        carsList2.add(SUPRAMK5.class);

        //Only add Class
        //carsList2.add("Unknown");
        printing(carsList2);

    }
    public static <T> void printing(List<T> carsList) {
        for(T element : carsList) {
            System.out.println(element);
        }
        System.out.println("--------------- x ----------------");
    }
}
