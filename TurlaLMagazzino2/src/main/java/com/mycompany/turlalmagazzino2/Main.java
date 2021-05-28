/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.turlalmagazzino2;

import file.FileExeption;
import java.io.IOException;
import java.util.Scanner;

public class Main 
{

    private final static String FILE_PATH = "magazzino.cvs";
   

    public static void main(String[] args) 
    {
        String[] vociMenu = new String[8];
        int sceltaUtente = -10;
        Scanner tastiera = new Scanner(System.in);

        int CodiceIdentificativo = 0, QuantitaProdotto = 0;
        String CategoriaProdotto = null, NomeProdotto = null;
        double CostoProdotto = 0;
        int esitoOperazione = 0;

        Magazzino m1 = new Magazzino();

        Prodotto prodotto;

        vociMenu[0] = "Esci"; //esci e chiudi il programma
        vociMenu[1] = "Aggiungi prodotto";//Aggiunge un prodotto alla lista
        vociMenu[2] = "Elimina prodotto";//Eliminare un prodotto dalla lista perché il Negozio decide di non venderlo più. 
        vociMenu[3] = "Vendere prodotto";//Vendere una certa quantità di un prodotto. Questa operazione andrà a diminuire la quantità di quel prodotto presente
        vociMenu[4] = "Acquistare prodotto";//Acquistare una certa quantità di un prodotto. Questa operazione andrà ad aumentare la quantità di quel prodotto presente.
        vociMenu[5] = "Visualizza tutti i prodotti  la cui quantità disponibile è inferiore ad un certo valore";//Visualizzare tutti i prodotti la cui quantità disponibile è inferiore ad un certo valore (inserito dall’utente) in ordine alfabetico di prodotto.
        vociMenu[6] = "Esportare in formato CSV";//Esportare in formato CSV i dati di tutti i prodotti.
        vociMenu[7] = "Salva dati su file (carica all'avvio)";//Salvare i dati su un file binario e caricarli all’ avvio dell’applicazione.

        Menu menu = new Menu(vociMenu);

        /* try 
        {
            e1=e1.caricaelencoProdotti(nomeFileBinario);
            System.out.println("Dati caricati correttamente");
        }
        catch (IOException ex) 
        {
            System.out.println("Impossibile accedere al file. I dati non sono stati caricati");
        }
        catch (FileExeption ex) 
        {
            System.out.println("Errore di lettura dal file. I dati non sono stati caricati");
        }*/
        do {
            sceltaUtente = menu.sceltaMenu();
            switch (sceltaUtente) {
                case 0: {
                    System.out.println("L'applicazione viene chiusa");
                    break;
                }
                case 1: {

                    System.out.println("Codice identificativo--> ");
                    CodiceIdentificativo = tastiera.nextInt();
                    tastiera.nextLine();
                    System.out.println("Categoria Prodotto--> ");
                    CategoriaProdotto = tastiera.nextLine();
                    System.out.println("Nome Prodotto--> ");
                    NomeProdotto = tastiera.nextLine();
                    System.out.println("Costo Prodotto--> ");
                    CostoProdotto = tastiera.nextInt();
                    System.out.println("Quantita prodotto--> ");
                    QuantitaProdotto = tastiera.nextInt();

                    Prodotto p = new Prodotto(CodiceIdentificativo, CategoriaProdotto, NomeProdotto, CostoProdotto, QuantitaProdotto);

                    esitoOperazione = m1.aggiungiProdotto(p);

                    if (esitoOperazione == -1) {
                        System.out.println("Magazzino pieno");
                    } else {
                        System.out.println("Prodotto aggiunto correttamente");
                    }

                }
                case 2: {

                    break;
                }

                case 3: {

                    break;
                }

                case 4: {

                    break;
                }

                case 5: {

                    int q;
                    String s;

                    System.out.println("Inserisci quantita");
                    q = tastiera.nextInt();
                    tastiera.nextLine();

                    s = m1.selezionaQuantita(q);

                    System.out.println(s);

                    break;
                }

                case 6: {

                    try {
                        m1.salvaMagazzino(FILE_PATH);
                        System.out.println("esportazione avvenuta correttamente!");

                    } catch (IOException ex) {
                        System.out.println("Non e stato possibile salvare il progetto \n" + ex.getMessage());

                    } catch (FileExeption ex) {
                        System.out.println("Non e stato possibile salvare il progetto \n" + ex.getMessage());

                    }
                    break;
                }

                case 7: {


                        try {
                            m1.caricaProdotto(FILE_PATH);
                            System.out.println("Dati salvati correttamente");
                        } catch (IOException ex) {
                            System.out.println("Impossibile accedere al file in scrittura");
                        
                         } catch (FileExeption ex) {
                        System.out.println("Non e stato possibile salvare il progetto \n" + ex.getMessage());

                         }

                        break;

                       }

                }
        }while (sceltaUtente != 0);
        
    }
}
