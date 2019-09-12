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
public class Cards {
    String suit;
    int value;
    int status;
    
    
    public void displayCard(Cards curr){
       
        String rank = "Joker";
        switch(value){
            case 0:
                rank = "Ace";
                break;
            case 1:
                rank = "2";
                break;
            case 2:
                rank = "3";
                break;
             case 3:
                rank = "4";
                break;
            case 4:
                rank = "5";
                break;
            case 5:
                rank = "6";
                break;
            case 6:
                rank = "7";
                break;
            case 7:
                rank = "8";
                break;
            case 8:
                rank = "9";
                break;
            case 9:
                rank = "10";
                break;
            case 10:
                rank = "Jack";
                break;
            case 11:
                rank = "Queen";
                break;
            case 12:
                rank = "King";
                break;
        }
        
        System.out.print(rank + "of" + suit);
    }
}
