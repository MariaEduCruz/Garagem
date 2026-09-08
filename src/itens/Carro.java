package itens;

public class Carro {
    private String placa;
    private String modelo;
    private String cor;
    private String tipoVeiculo;

    public Carro(String placa, String modelo, String cor, String tipo) {
        this.placa = placa;
        this.modelo = modelo;
        this.cor = cor;
        this.tipoVeiculo = tipo;
    }

    public void exibirInformacoes() {
        System.out.println("Carro{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", cor='" + cor + '\'' +
                ", tipo='" + tipoVeiculo + '\'' +
                '}');
    }

    public boolean mesmoVeiculo(Carro outroCarro) {
        return this.tipoVeiculo.equals(outroCarro.tipoVeiculo);
    }

    public String getTipoVeiculo() {
        return tipoVeiculo;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public void setCor() {
        cor = "Preta";
    }

}
