package br.univali.poo.veiculos;

public class Caminhao extends Terrestre {

    private double capacidadeCarga;

    public Caminhao(double capacidadeCarga, String modelo, String motorista, String placa) {
        super(modelo, motorista, placa);
        this.capacidadeCarga = capacidadeCarga;
    }

    public double getCapacidadeCarga() {
        return capacidadeCarga;
    }

    @Override
    public String texto() {
        return "O modelo é " + getModelo() + ", o motorista é " + getMotorista() + ", a placa é " + getPlaca() + ", a capacidade de é de " + getCapacidadeCarga() + " Kgs";
    }

}
