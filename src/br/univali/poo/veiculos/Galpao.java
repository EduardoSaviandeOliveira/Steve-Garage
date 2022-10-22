package br.univali.poo.veiculos;

import java.util.ArrayList;
import java.util.List;

public class Galpao {

    private List<Veiculo> veiculos;

    public Galpao() {
        veiculos = new ArrayList();

    }

    public int adicionarVeiculo(Veiculo veiculo) {
        this.veiculos.add(veiculo);
        return veiculos.lastIndexOf(veiculos);
    }

    public Veiculo selecionarVeiculo(int index) {
        return veiculos.get(index);

    }

    public void imprimirInfoVeiculos() {
        for (int i = 0; i < this.veiculos.size(); i++) {
            System.out.println(this.veiculos.get(i).texto() + "\n");

        }

    }
}
