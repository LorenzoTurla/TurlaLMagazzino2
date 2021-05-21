/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.turlalmagazzino2;
 import java.util.Scanner;

public class Main 
{
   
 
    
       public static void main(String[] args) 
    {
         String[] vociMenu=new String[6];
         int sceltaUtente=0;
         Scanner tastiera=new Scanner(System.in);
        
         
         
          Prodotto p =new Prodotto(23,"sedia","ikea",12.20,34);
           System.out.println(p.getNomeProdotto());
   
         vociMenu[0]="Esci";
         vociMenu[1]="Aggiungi libro";
         vociMenu[2]="Visualizza libro";
         vociMenu[3]="Elimina libro";
         vociMenu[4]="Ottieni i titoli dei libri di un autore";
         vociMenu[5]="Visualizza tutti i libri presenti";
         
         Menu menu= new Menu(vociMenu);
         
         do
         {
             sceltaUtente=menu.sceltaMenu();
             switch(sceltaUtente)
             {
                 case 0:
                 {
                   
                 }
                 case 1:
                 {
                     
                 }
                 case 2:
                 {
                   
                      break;
                 }
                
                
                 
             }
             
         }while (sceltaUtente!=0);
         
         
         
         
    }
     
        
}