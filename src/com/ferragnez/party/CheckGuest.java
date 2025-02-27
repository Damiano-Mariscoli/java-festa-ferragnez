package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {
    public static void main(String[] args){
        String[] arrayInvitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"} ;

        Scanner input = new Scanner(System.in);
        System.out.println("Inserisci il tuo nome:");
        String nome = input.nextLine();
        input.close();
        Boolean isOnTheList = false;
        // System.out.println(nome);
        for (int i = 0; i < arrayInvitati.length; i++){
            System.out.println(arrayInvitati[i]);
            if (arrayInvitati[i].equals(nome) ){
                isOnTheList = true;
                break;
            }
            
        }
        if(isOnTheList){
            System.out.println("Sei sulla lista e puoi entrare!");
        }else{
            System.out.println("Non sei sulla lista mi dispiace");
        }
        
    }
}
