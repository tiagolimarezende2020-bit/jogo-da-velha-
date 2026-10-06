/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.com.senac.jogodavelha1;

import java.util.Scanner;

/**
 *
 * @author tiago62977806
 */
public class Jogodavelha1 {

    public static void main(String[] args) {
        
       Scanner entrada = new Scanner(System.in);
       
        Tabuleiro tabuleiro = new Tabuleiro ("1 - Cada jogador deve escolher um símbolo; "
            + "2 - O jogador 1 inicia a partida");
     
     jogador jogador1 = new jogador (1, "Daniel", 'X');
     jogador jogador2 = new jogador (2, "Ana", 'Y');
     
     tabuleiro.mostrarTabuleiro();
     
     do{
        tabuleiro.mostrarTabuleiro();
     
       if(tabuleiro.getJogadorDaVez() == 1){
           System.out.println("Jogador 1, escolha onde jogar: ");
           String local = entrada.nextLine();
           
           tabuleiro.marcarJogada(jogador1.getSimbolo(), local);
        tabuleiro.setJogadorDaVez(2);
          tabuleiro.mostrarTabuleiro();
           
       }
       else{
           System.out.println("Jogador 2, escolha onde jogar: ");
           String local = entrada.nextLine();
           
           tabuleiro.marcarJogada(jogador2.getSimbolo(), local);
          tabuleiro.setJogadorDaVez(1);
          tabuleiro.mostrarTabuleiro(); 
           
        }
           
       
     }while(tabuleiro.isHouveGanhadorUltimaRodada() == false);
    }
}
