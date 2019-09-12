/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_poker;

/**
 *
 * @author cabarronos_cis21035
 */
public class Deck {
    Cards[][] cardDeck = new Cards[13][4];
    Deck(){
        int i,j;
        for(i=0;i<4;i++){
            for(j=0;j<13;j++){
                switch(i){
                    case 0:
                        cardDeck[j][i].suit = "Spades";
                        break;
                    case 1:
                        cardDeck[j][i].suit = "Cloves";
                        break;
                    case 2:
                        cardDeck[j][i].suit = "Diamonds";
                        break;
                    case 3:
                        cardDeck[j][i].suit = "Hearts";
                        break;
                }
                cardDeck[j][i].value = j;
                cardDeck[j][i].status = 0; // 0 if unused, 1 if used.
            }
        }
    }
}
