// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Home {
    public static void main(String[] args) {
        Filme meuFilme = new Filme ();
        meuFilme.nome = "A Casa Monstro";
        meuFilme.anoLançamento = 2010;
        meuFilme.duracaoFilmeMinutos = 72;
        meuFilme.avaliacao = 7.1;
        meuFilme.totalDeAvaliacoes = 2;
        meuFilme.incluidoNoPlano = true;

        System.out.println("**********************************");
        System.out.println("Informações sobre o filme \n");
        System.out.println("Título: " +meuFilme.nome);
        System.out.println("Estreou em: " +meuFilme.anoLançamento);
        System.out.println("Duração: " +meuFilme.duracaoFilmeMinutos+ " Minutos");
        System.out.println("Nota IMDb: " +meuFilme.avaliacao);
        System.out.println("Total de avaliações: " +meuFilme.totalDeAvaliacoes);
        System.out.println("Incluido no plano? " +meuFilme.incluidoNoPlano);
    }
}