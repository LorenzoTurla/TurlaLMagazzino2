/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.turlalmagazzino2;

import Eccezioni.EccezionePosizioneNonValida;
import file.FileExeption;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) 
    {
        String[] vociMenu = new String[8];
        int sceltaUtente = -10;
        Scanner tastiera = new Scanner(System.in);

        int CodiceIdentificativo = 0, QuantitaProdotto = 0;
        String CategoriaProdotto = null, NomeProdotto = null;
        double CostoProdotto = 0;

        Magazzino e1 = new Magazzino();

        Prodotto prodotto;

        String nomeFileBinario = "elencoProdotti.bin";
        String nomeFileCSV = "Prodotto.txt";

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

                    prodotto = new ;

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

                    prodotto = new Prodotto(CodiceIdentificativo, CategoriaProdotto, NomeProdotto, CostoProdotto, QuantitaProdotto);

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

                    break;
                }

                case 6: {
                    /*  try
                     {
                        e1.esportaProdotto(nomeFileCSV);
                        System.out.println("esportazione avvenuta correttamente!");
                     }
                    catch(IOException ec1)
                     {
                         System.out.println("Impossibile accedere al file, i libri non sono stati salvati.");
                     }
                     catch(EccezionePosizioneNonValida | FileExeption  ec2)
                     {
                         System.out.println(ec2.toString());
                     }*/

                    break;
                }
                case 7: {

                    /*try 
                {
                    e1.salvaElenco(nomeFileBinario);
                    System.out.println("Dati salvati correttamente");
                } 
                catch (IOException ex) 
                {
                    Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                }
                     */
                    break;
                }

            }

        } while (sceltaUtente != 0);

    }

}
