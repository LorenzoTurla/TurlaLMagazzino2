/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.turlalmagazzino2;

import Eccezioni.EccezionePosizioneNonValida;
import Eccezioni.EccezionePosizioneNonVuota;
import java.time.LocalDate;
import file.TextFile;
import file.FileExeption;
import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Lorenzo
 */
public class Magazzino 
{

    void esportaProdotto(String nomeFileCSV) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Magazzino caricaelencoProdotti(String nomeFileBinario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void salvaElenco(String nomeFileBinario) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
   /* public void esportaProdotti(String nomeFile) throws IOException, EccezionePosizioneNonValida, FileExeption
    {
        TextFile f1= new TextFile(nomeFile, 'w');
        Prodotto prodotto;
        for(int i=0;i<getNumMaxAbbonati();i++)
        {
            prodotto=getProdotto(i);
            if(prodotto!=null)
            {
                f1.toFile("Codice: "+Prodotto.getCodiceIdentificativo()+"; Nome: "+abbonamento.getNome()+"; Cognome: "+abbonamento.getCognome()+"; Tipologia: "+abbonamento.getTipologia()+"; Data vendita: "+abbonamento.getDataVendita()+"; Data scadenza: "+abbonamento.getDataScadenza());  
            }
        }

    f1.close();
      
    }*/
    
}
