package com.zupcash.factory;

import org.springframework.stereotype.Component;

@Component
public class ContaFactory {
    public CalculoConta tipoServicoConta(String tipoServico) {
        if(tipoServico.equalsIgnoreCase("deposito")) {
            return new CalculoDeposito();
        }else if(tipoServico.equalsIgnoreCase("saque")) {
            return new CalculoSaque();
        }else {
            return null;
        }
    }
}
