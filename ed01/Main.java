package ed01;

import java.util.Scanner;

/**
 * Classe principal que executa o jogo
 */
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Placar placar = new Placar();

        System.out.print("Digite seu nome: ");
        String nome = teclado.nextLine();
        
        Jogador jogador = new Jogador(nome);
        Jogo jogo = new Jogo(jogador);

        boolean acertou = false;
        
        System.out.println("Tente adivinhar o número entre 1 e 100!");
        
        while(!acertou) {
            System.out.print("Sua tentativa: ");
            int tentativa = teclado.nextInt();
            
            String resultado = jogo.jogar(tentativa);
            
            switch(resultado) {
                case "acertou":
                    System.out.println("Parabéns! Você acertou em " + 
                        jogador.getTentativas() + " tentativas!");
                    System.out.println("Pontuação: " + 
                        jogador.getPontuacao() + " pontos");
                    acertou = true;
                    break;
                    
                case "maior":
                    System.out.println("O número secreto é maior!");
                    break;
                    
                case "menor":
                    System.out.println("O número secreto é menor!");
                    break;
            }
        }
        
        placar.adicionarJogador(jogador);
        placar.mostrarRanking();
        teclado.close();
    }
}
