package org.vinnivso.demo;

import org.vinnivso.adapter.DropBox;
import org.vinnivso.adapter.DropBoxAdapter;
import org.vinnivso.adapter.IPersistenciaArquivos;

import java.io.File;

public class DemoAdapter {
    public static void main(String args[]) {
        String file = "teste.txt";
        DropBox drop = new DropBox();
        IPersistenciaArquivos arquivos = new DropBoxAdapter(drop);
        arquivos.gravar(new File(file));
    }
}
