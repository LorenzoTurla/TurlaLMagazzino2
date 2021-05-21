/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.turlalmagazzino2;

/**
 *
 * @author Lorenzo
 */
public class Magazzino
{
    private Prodotto[] prodotto;
    private static int N_MAX_NUMPRODOTTI=1500; //numero di proddotti che il magazzino puo contenere
    
    public Magazzino()
    {
        prodotto=new Prodotto[N_MAX_NUMPRODOTTI];   
    }
    public Magazzino(Magazzino e)
    {
        prodotto=new Prodotto [N_MAX_NUMPRODOTTI];   
        for(int i=0;i<getNumMaxProdotti();i++)
        {
            prodotto[i]=e.getProdotto(i);
        }
    }
    public static int getNumMaxProdotti()
    {
        return N_MAX_NUMPRODOTTI;
    }
    
     public int getNumProdotti()
    {
        int contatore=0;
        for(int i=0;i<getNumMaxProdotti();i++)
        {
            if(prodotto[i]!=null)
                contatore++;
        }
        return contatore;
    }
     
     public int setProdotto(Prodotto prodotto, int posizione)
    {
        if(posizione<0||posizione>=getNumMaxProdotti())
            return -1;
        if(this.prodotto[posizione]!=null)
            return -2;
        this.prodotto[posizione]=new Prodotto(prodotto);
        return posizione;
    }

     public IscrizioniGita getIscrizioniGita(int posizione)
    {
        if(posizione<0||posizione>=getNumMaxProdotti())
            return null;
        if(prodotto[posizione]==null)
            return null;
        return new Prodotto(prodotto[posizione]);
    }

    public Prodotto[] getProdotto() {
        return prodotto;
    }

    public static int getN_MAX_NUMPRODOTTI() {
        return N_MAX_NUMPRODOTTI;
    }

  
     
  
     
    
    
}
