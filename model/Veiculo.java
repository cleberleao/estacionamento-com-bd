package model;

public class Veiculo {
    private int id;
    private String placa;
    private String modelo;
    private String cor;
    private TipoVeiculo tipo;

    public Veiculo(String placa, String modelo, String cor, TipoVeiculo tipo){
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.tipo = tipo;
    }

    public String getModelo() {
        return modelo;
    }

    public String getPlaca() {
        return placa;
    }

    public String getCor() {
        return cor;
    }

    public TipoVeiculo getTipo() {
        return tipo;
    }

    public int getId() {
        return id;
    }
}
