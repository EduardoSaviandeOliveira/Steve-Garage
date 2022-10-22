package br.univali.poo.veiculos;

public class Iate implements Veiculo {

    private String nome;
    private String capitao;
    private double gastosMensais;

    public Iate(String nome, String capitao, double gastosMensais) {
        this.nome = nome;
        this.capitao = capitao;
        this.gastosMensais = gastosMensais;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCapitao() {
        return capitao;
    }

    public void setCapitao(String capitao) {
        this.capitao = capitao;
    }

    public double getGastosMensais() {
        return gastosMensais;
    }

    public void setGastosMensais(double gastosMensais) {
        this.gastosMensais = gastosMensais;
    }

    @Override
    public String texto() {

        return "O nome do Iate é " + getNome() + ", o Capitão é " + getCapitao() + " e os gastos mensais são " + getGastosMensais() + " dinheiros";

    }

}
