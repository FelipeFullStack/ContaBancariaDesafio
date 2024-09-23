package org.example;

public class Main {
    public static void main(String[] args) {

        Cliente felipe = new Cliente();
        felipe.setNome("Felipe");

        Iconta cc = new Corrente( felipe);
        Iconta cp = new Poupanca(felipe);

        cc.depositar(2000);
        cp.depositar(1900);

        cp.transferir(1900, cc);

        cc.imprimirExtrato();
        cp.imprimirExtrato();


    }
}

