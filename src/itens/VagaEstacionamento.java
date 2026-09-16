package itens;

public class VagaEstacionamento {
    private String atribIdent;
    private String tipoVaga;
    private float valorPorHora;
    private boolean ocupada;

    public VagaEstacionamento(String atribIdent, String tipoVaga, float valorPorHora, String status) {
        this.atribIdent = atribIdent;
        this.tipoVaga = tipoVaga;
        this.valorPorHora = valorPorHora;
        this.ocupada = false;
    }

    public boolean ocuparVaga(String tipoVeiculo) {
        if (!ocupada && tipoVaga.equals(tipoVeiculo)) {
            ocupada = true;
            return true;
        } else {
            return false;
        }
    }

    public float liberarVaga(float tempoHoras) {
        if (ocupada) {
            ocupada = false;
            return tempoHoras * valorPorHora;
        } else {
            return 0;
        }
    }

    public void exibirInformacoes() {
        System.out.println("VagaEstacionamento{" +
                "atribIdent='" + atribIdent + '\'' +
                ", tipoVaga='" + tipoVaga + '\'' +
                ", valorPorHora=" + valorPorHora +
                ", status='" + ocupada + '\'' +
                '}');
    }
}
