package org.example;

import lombok.Data;
import lombok.Getter;

@Data
public abstract class Conta implements Iconta {

    private static int SEQUENCIAL = 1;
    private static int AGENCIA_PADRAO = 1;
    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;

    }


    @Override
    public void sacar(double valor) {
        this.saldo -= valor;

    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;

    }

    @Override
    public void transferir(double valor, Iconta destino) {
        this.sacar(valor);
        destino.depositar(valor);

    }

    protected void imprimirInformacoesConta() {
        System.out.println("Titular: " + this.cliente.getNome());
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numero);
        System.out.println("Saldo: " + this.saldo);

    }



}
