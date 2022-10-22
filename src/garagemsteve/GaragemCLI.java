package garagemsteve;

import br.univali.poo.veiculos.*;

/**
 *
 * @author Eduar
 */
public class GaragemCLI {

    private Galpao galpao;

    public GaragemCLI() {
        galpao = new Galpao();
        mostrarMenu();
    }

    public void mostrarMenu() {
        System.out.println("Os itens da garagem são os seguintes: ");
        Veiculo veiculo = new Iate("Perola Negra", "Eduardo Savian", 10000);
        galpao.adicionarVeiculo(veiculo);
        veiculo = new Iate("Holândes Voador", "Marcos Fehauler", 69669);
        galpao.adicionarVeiculo(veiculo);
        veiculo = new Helicoptero("Apache", "Yuri Rodrigues", 100000);
        galpao.adicionarVeiculo(veiculo);
        veiculo = new Carro(4, "Honda", "Max", "1");
        galpao.adicionarVeiculo(veiculo);
        veiculo = new Carro(2, "Ferrari", "Charles Leclerc", "16");
        galpao.adicionarVeiculo(veiculo);
        veiculo = new Caminhao(100000, "Mercedes", "Lewis Hamilton", "44");
        galpao.adicionarVeiculo(veiculo);

        galpao.imprimirInfoVeiculos();

    }

}
