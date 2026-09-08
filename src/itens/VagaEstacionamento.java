package itens;

public class VagaEstacionamento {
    private String atribIdent;
    private String tipoVaga;
    private float valorPorHora;
    private String status;

    public VagaEstacionamento(String atribIdent, String tipoVaga, float valorPorHora, String status) {
        this.atribIdent = atribIdent;
        this.tipoVaga = tipoVaga;
        this.valorPorHora = valorPorHora;
        this.status = status;
    }

    public boolean ocuparVaga(String tipoVeiculo) {
        if (status.equals("livre") && tipoVaga.equals(tipoVeiculo)) {
                status = "ocupado";
                return true;
        } else {
            return false;
        }
    }

    public float liberarVaga(float tempoHoras) {
        if (status.equals("ocupado")) {
            status = "livre";
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
                ", status='" + status + '\'' +
                '}');
    }
}
