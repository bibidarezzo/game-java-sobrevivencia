package com.mycompany.gamejava;

import javax.swing.JOptionPane;

/**
 * Jogo de sobrevivência em Java.
 * O jogador gerencia os atributos do personagem e tenta acumular 10 de experiência.
 * @author Gabriel
 */
public class Jogo {

    static String nome;
    static int energia = 10;
    static int fome = 0;
    static int cansaco = 0;
    static int experiencia = 0;

    public static void main(String[] args) {

        nome = JOptionPane.showInputDialog("Nome do seu personagem:");

        // Loop principal: continua enquanto o personagem estiver vivo e não tiver vencido
        while (energia > 0 && fome < 10 && cansaco < 10 && experiencia < 10) {

            exibirStatus();

            int acao = mostrarMenu();

            switch (acao) {
                case 1:
                    cacar();
                    break;
                case 2:
                    comer();
                    break;
                case 3:
                    dormir();
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        }

        fim();
    }

    // Exibe vitória ou derrota ao fim do jogo
    public static void fim() {
        if (experiencia >= 10) {
            JOptionPane.showMessageDialog(null, "Parabéns! " + nome + " venceu!");
        } else {
            JOptionPane.showMessageDialog(null, "Eita, deu ruim " + nome + " perdeu...");
        }
    }

    // Caçar: gasta energia, aumenta fome, cansaço e experiência
    public static void cacar() {
        if (energia >= 2) {
            energia = energia - 2;
            fome = fome + 1;
            cansaco = cansaco + 1;
            experiencia = experiencia + 1;
        } else {
            JOptionPane.showMessageDialog(null, nome + " está sem energia suficiente!");
        }
    }

    // Dormir: recupera energia e reduz cansaço
    public static void dormir() {
        if (energia < 10) {
            energia = energia + 1;
            cansaco = cansaco - 1;
        }
    }

    // Comer: reduz fome e recupera energia
    public static void comer() {
        if (fome > 0) {
            fome = fome - 1;
            energia = energia + 1;
        } else {
            JOptionPane.showMessageDialog(null, nome + " não está com fome!");
        }
    }

    // Exibe o menu de ações e retorna a opção escolhida
    public static int mostrarMenu() {
        int selecao = Integer.parseInt(
                JOptionPane.showInputDialog(
                        "O que " + nome + " vai fazer?"
                        + "\n"
                        + "1 - Caçar" + "\n"
                        + "2 - Comer" + "\n"
                        + "3 - Dormir" + "\n"));
        return selecao;
    }

    // Exibe os atributos atuais do personagem
    public static void exibirStatus() {
        JOptionPane.showMessageDialog(null,
                "ATRIBUTOS DE " + nome + "\n"
                + "Energia = " + energia + "\n"
                + "Fome = " + fome + "\n"
                + "Cansaço = " + cansaco + "\n"
                + "Experiência = " + experiencia + "\n");
    }
}
