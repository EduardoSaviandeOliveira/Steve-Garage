package br.univali.poo.veiculos;

public class Helicoptero implements Veiculo {

    private String modelo;
    private String piloto;
    private double despesasMensais;

    public Helicoptero(String modelo, String piloto, double despesasMensais) {
        this.modelo = modelo;
        this.piloto = piloto;
        this.despesasMensais = despesasMensais;
    }

    
    public String getModelo() {
        return modelo;
    }

    public String getPiloto() {
        return piloto;
    }

    public double getDespesasMensais() {
        return despesasMensais;
    }
    
    

    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }

    @Override
    public String texto() {
        return "O modelo do Helicoptero é " + getModelo() + ", o nome do piloto " + getPiloto() + "as despsas mensais são " + getDespesasMensais() + " dinheiros";
    }

}
