/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.turlalmagazzino2;

import file.FileExeption;
import file.TextFile;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/**
 *
 * @author Lorenzo
 */
public class Magazzino implements Serializable {

    private final int N_MAX_PRODOTTI = 100;
    private int nProdottiPresenti = 0;

    private Prodotto[] elencoProdotti;

    public Magazzino() {
        elencoProdotti = new Prodotto[N_MAX_PRODOTTI];
    }

    public int aggiungiProdotto(Prodotto p) {
        if (nProdottiPresenti >= N_MAX_PRODOTTI) {
            return -1;
        }
        elencoProdotti[nProdottiPresenti] = new Prodotto(p);
        nProdottiPresenti++;
        return 0;
    }

    public String selezionaQuantita(int q) {
        String s = "";

        for (int i = 0; i < nProdottiPresenti; i++) {
            if (elencoProdotti[i].getQuantitaProdotto() < q) {
                s = s + elencoProdotti[i].toString() + "\n";
            }
        }

        return s;

    }

    public void salvaMagazzino(String nomeFile) throws IOException, FileExeption//gestione eccezioni
    {
        TextFile f1 = new TextFile(nomeFile, 'W');
        
        for (int i = 0; i < elencoProdotti.length; i++) 
        {
            if (elencoProdotti[i]!= null) 
            {
                f1.toFile(i + " " + elencoProdotti[i].toString());
            }

        }
        f1.close();

    }

    @Override
    public String toString() {
        return "Magazzino{" + "N_MAX_PRODOTTI=" + N_MAX_PRODOTTI + ", nProdottiPresenti=" + nProdottiPresenti + ", elencoProdotti=" + elencoProdotti + '}';
    }
    
    
    public Prodotto caricaProdotto(String nomeFile) throws IOException, FileExeption
  {
      Prodotto p;
      FileInputStream f1=new FileInputStream(nomeFile);
      ObjectInputStream reader=new ObjectInputStream(f1);
      
       try 
       {
           p=(Prodotto)reader.readObject();
           reader.close();
           return p;
       } 
       catch (ClassNotFoundException ex) 
       {
           reader.close();
           throw new FileExeption("Errore di lettura");
       }   
  }

}
