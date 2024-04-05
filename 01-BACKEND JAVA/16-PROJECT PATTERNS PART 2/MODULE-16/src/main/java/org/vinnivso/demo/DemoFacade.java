package org.vinnivso.demo;

import org.vinnivso.facade.Apartamento;
import org.vinnivso.facade.ApartamentoService;
import org.vinnivso.facade.IApartamentoService;

public class DemoFacade {
    public static void main(String args[]) {
        IApartamentoService service = new ApartamentoService();
        service.cadastarApartamento(new Apartamento(1L, "Endereco"));
    }
}
