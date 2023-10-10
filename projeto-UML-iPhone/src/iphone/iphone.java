package iphone;

import Aparelho.Aparelho;
import Internet.Internet;
import Repodutor.Repodutor;

public class iphone {

public static void main(String[] args) {
    Aparelho aparelho = new Aparelho();
    aparelho.ligar();
    aparelho.atender();
    aparelho.iniciarCorrerioVoz();

    Internet internet = new Internet();
    internet.ligar();
    internet.exibirPagina();
    internet.adicionarNovaAba();
    internet.atualizarPagina();

    Repodutor repodutor = new Repodutor();
    repodutor.ligar();
    repodutor.tocar();
    repodutor.pausar();
    repodutor.selecionarMusica();


}
}
