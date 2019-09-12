/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package oop_poker;
import java.util.Random;
/**
 *
 * @author cabarronos_cis21035
 */
public class Dealer {
    Deck mydeck = new Deck();

    public Dealer() {
        this.mydeck = new Deck();
        
    }
    
    /**
     *
     * @param current
     */
    public void deal(Player current){
        Random rand = new Random();
        int i,x,y;
        for(i=0;i<2;i++){
            do{
                x = rand.nextInt(4);
                y = rand.nextInt(13);
            }while(mydeck.cardDeck[y][x].status==0);
            mydeck.cardDeck[y][x].status = 1; //signifying its used.
            current.hand[i]= mydeck.cardDeck[y][x];
        }
        
    }
    
    public void shuffle(){
        int i,j;
        for(i=0;i<4;i++){
            for(j=0;j<13;j++){
                mydeck.cardDeck[j][i].status = 0;
            }
        }
            
    }
}
