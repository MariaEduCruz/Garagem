package principal;


import itens.Carro;
import itens.VagaEstacionamento;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("abc", "1", "azul", "suv");
        Carro carro2 = new Carro("def", "2", "branco", "normal");
        Carro carro3 = new Carro("ghi", "2", "amarelo", "suv");

        System.out.println("Exibir informações: ");
        carro1.exibirInformacoes();

        System.out.println("\nComparar tipos:");
        if (carro1.mesmoVeiculo(carro2)) {
            System.out.println(carro1 + " e " + carro2 + " são do mesmo tipo");
        } else {
            System.out.println(carro1 + " e " + carro2 + " não são do mesmo tipo");
        }
        if (carro1.mesmoVeiculo(carro3)) {
            System.out.println(carro1 + " e " + carro3 + " são do mesmo tipo");
        } else {
            System.out.println(carro1 + " e " + carro3 + " não são do mesmo tipo");
        }

        System.out.println("\nRetornar tipo veiculo:");
        carro1.getTipoVeiculo();


        System.out.println("\nAtualizar cor com parametro:");
        carro1.setCor("roxo");
        carro1.exibirInformacoes();

        System.out.println("\nAtualizar cor para preta:");
        carro1.setCor();
        carro1.exibirInformacoes();

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


    }
}