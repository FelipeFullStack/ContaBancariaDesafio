package org.example;

public class Corrente extends Conta {

    public Corrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("Extrato da conta corrente");
        System.out.println("Cartão de crédito: " + "Liberado");
        imprimirInformacoesConta();
    }
}
