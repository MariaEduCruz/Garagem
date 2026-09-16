package principal;


import itens.Veiculo;
import itens.VagaEstacionamento;

public class Main {
    public static void main(String[] args) {
        Veiculo veiculo1 = new Veiculo("abc", "1", "azul", "suv");
        Veiculo veiculo2 = new Veiculo("def", "2", "branco", "normal");
        Veiculo veiculo3 = new Veiculo("ghi", "2", "amarelo", "suv");

        System.out.println("Exibir informações: ");
        veiculo1.exibirInformacoes();

        System.out.println("\nComparar tipos:");
        if (veiculo1.mesmoVeiculo(veiculo2)) {
            System.out.println(veiculo1 + " e " + veiculo2 + " são do mesmo tipo");
        } else {
            System.out.println(veiculo1 + " e " + veiculo2 + " não são do mesmo tipo");
        }
        if (veiculo1.mesmoVeiculo(veiculo3)) {
            System.out.println(veiculo1 + " e " + veiculo3 + " são do mesmo tipo");
        } else {
            System.out.println(veiculo1 + " e " + veiculo3 + " não são do mesmo tipo");
        }

        System.out.println("\nRetornar tipo veiculo:");
        veiculo1.getTipoVeiculo();


        System.out.println("\nAtualizar cor com parametro:");
        veiculo1.setCor("roxo");
        veiculo1.exibirInformacoes();

        System.out.println("\nAtualizar cor para preta:");
        veiculo1.setCor();
        veiculo1.exibirInformacoes();

        System.out.println("\n---------------------------------------\n");

        VagaEstacionamento vaga1 = new VagaEstacionamento("A1", "carro", 10, "livre");
        VagaEstacionamento vaga2 = new VagaEstacionamento("A2", "moto", 20, "livre");
        VagaEstacionamento vaga3 = new VagaEstacionamento("A3", "caminhao", 30, "ocupado");

        System.out.println("\nExibir informações:");
        vaga1.exibirInformacoes();

        System.out.println("\nOcupar vaga:");
        vaga1.ocuparVaga("carro");
        vaga1.exibirInformacoes();

        vaga2.ocuparVaga("carro");
        vaga2.exibirInformacoes();

        vaga3.ocuparVaga("caminhao");
        vaga3.exibirInformacoes();

        System.out.println("\nLiberar vaga:");
        vaga1.exibirInformacoes();
        vaga1.liberarVaga(10);
        vaga1.exibirInformacoes();

        vaga2.exibirInformacoes();
        vaga2.liberarVaga(10);
        vaga2.exibirInformacoes();

        System.out.println("Insatanciando um novo objeto");

        System.out.println("teste 1");

        Veiculo cam1 = new Veiculo("ABC", "cross", "azul", "caminhao");

        veiculo1.exibirInformacoes();

    }
}