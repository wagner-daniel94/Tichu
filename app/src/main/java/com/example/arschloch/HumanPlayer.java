package com.example.arschloch;

import android.view.View;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HumanPlayer extends Player
{

    public void markCard(View v){
        for(Card c: this.getCards()){
            if(c.getResourceId() == (int)v.getTag() && !c.isClicked()){
                List<Card> markedCards = new ArrayList<>();
                for(Card c1: this.getCards()){
                    if(c1.isClicked()){
                        markedCards.add(c1);
                    }
                }
                markedCards.add(c);
                if(check_combination(markedCards)) {
                    c.setClicked(true);
                    System.out.println("Card Marked");
                    //Toast.makeText(this,"new combination",Toast.LENGTH_LONG).show();
                }

                    //else Toast.makeText(this,"invalid card selected",Toast.LENGTH_LONG).show();

            }else if(c.getResourceId() ==(int)v.getTag() && c.isClicked()){
                c.setClicked(false);
                System.out.println("Card Demarked");
            }
        }


    }




    @Override
    public void play_card(int amountCardsPlayed, Card_value cardvaluePlayed)
    {

    }

    @Override
    public void wuenschen(Player arschloch, Player winner, Card wishCard){
        //winner wählt Karte aus

        if(arschloch.getCards().contains(wishCard) ){
            winner.getCards().add(wishCard);
            arschloch.getCards().remove(wishCard);
            Collections.sort(arschloch.getCards());
            Collections.sort(winner.getCards());
        }
    }

    @Override
    public void tauschen(Player arschloch, Player winner){
        /*
        Card choosenCard1;

        // winner kann 1 Karten auswählen

        arschloch.getCards().add(choosenCard1);
        winner.getCards().remove(choosenCard1);
        Collections.sort(arschloch.getCards());
        Collections.sort(winner.getCards());

        //Karten neu anzeigen

        //Bildschirm updaten
        //invalidate() bei UI Thread
        //postInvalidate() bei non UI Thread
         */
    }
}
