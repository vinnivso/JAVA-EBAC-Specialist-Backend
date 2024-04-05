package org.vinnivso.demo;

import org.vinnivso.templatemethod.Advogado;
import org.vinnivso.templatemethod.Trabalhador;

public class DemoTemplateMethod {
    public static void main(String args[]) {
        Trabalhador t = new Advogado();
        t.executar();
    }
}
