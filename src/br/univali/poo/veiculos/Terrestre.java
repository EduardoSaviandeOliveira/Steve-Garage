package br.univali.poo.veiculos;

public abstract class Terrestre implements Veiculo {

    private String modelo;
    private String motorista;
    private String placa;

    public Terrestre(String modelo, String motorista, String placa) {
        this.modelo = modelo;
        this.motorista = motorista;
        this.placa = placa;
    }

    public void setMotorista(String motorista) {
        this.motorista = motorista;
    }

    public String getModelo() {
        return modelo;
    }

    public String getMotorista() {
        return motorista;
    }

    public String getPlaca() {
        return placa;
    }

}
