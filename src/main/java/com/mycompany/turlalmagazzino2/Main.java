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
         String[] vociMenu=new String[8];
         int sceltaUtente=0;
         Scanner tastiera=new Scanner(System.in);
        
         
         
         
          Prodotto prodotto=null;
   
         vociMenu[0]="Esci";
         vociMenu[1]="Aggiungi libro";
         vociMenu[2]="Visualizza libro";
         vociMenu[3]="Elimina libro";
         vociMenu[4]="Ottieni i titoli dei libri di un autore";
         vociMenu[5]="Visualizza tutti i libri presenti";
         vociMenu[6]="Esportare in formato CSV";
         vociMenu[7]="Salva dati su file (carica all'avvio)";
         
         Menu menu= new Menu(vociMenu);
         
         do
         {
             sceltaUtente=menu.sceltaMenu();
             switch(sceltaUtente)
             {
                 case 0:
                 {
                   
                    System.out.println("L'applicazione viene chiusa");
                        break;
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