package br.univali.poo.veiculos;

/**
 *
 * @author Eduar
 */
public class Carro extends Terrestre {

    private int numeroOcupantes;

    public Carro(int numeroOcupantes, String modelo, String motorista, String placa) {
        super(modelo, motorista, placa);
        this.numeroOcupantes = numeroOcupantes;
    }

    public int getNumeroOcupantes() {
        return numeroOcupantes;
    }

    @Override 
    public String texto() {
        return "O modelo é " + getModelo() + ", o motorista é " + getMotorista() + ", a placa é " + getPlaca() + ", o número de ocupantes é " + getNumeroOcupantes() + " pessoas";
    }

}
