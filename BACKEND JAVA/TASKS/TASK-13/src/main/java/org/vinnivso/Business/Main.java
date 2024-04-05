package org.vinnivso.Business;

import org.vinnivso.Models.JuristicPerson;
import org.vinnivso.Models.NaturalPerson;
import org.vinnivso.Models.Person;

public class Main {
    public static void main(String[] args) {
        NaturalPerson individual = new NaturalPerson("Vinícius", "03/03/1899", "São Paulo", "Legalized");
        individual.setSsn(123456678l);
        individual.setLastName("Olivera");
        individual.setRelatives(3l);
        individual.setCurrency(9999999d);
        individual.setEthnicity("latin");
        individual.setReligion("Catholicism");

        JuristicPerson organization = new JuristicPerson("CCSM", "03/03/1788","Mogi das Cruzes","Authorized",1272799l,"CCSM LTDA", 999999999999999d,18900l,"Mining");
        System.out.println(organization);
    }

}
