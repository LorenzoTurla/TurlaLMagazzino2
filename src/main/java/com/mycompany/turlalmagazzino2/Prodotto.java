/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.turlalmagazzino2;

/**
 *
 * @author STUDENTE
 */

/*In questa classe Inserisco i dati che servono affinche il prodotto abbia delle caratteristiche come per esempio il codice del prodotto,il nome,la categoria e tutte queste cose
e sono ovviamente  selezionate con getter e i setter e c'e' anche il toString
*/


public class Prodotto
{
    private int CodiceIdentificativo; //e un codice che serve per identificare il prodotto e cambia a seconda  del prodotto inserito.
    private String CategoriaProdotto; //la categoria consiste nel decidere se quel prodotto fa parte dei divani o delle sedie ecc...
    private String NomeProdotto; //il nome consiste nel  dire la marca del prodotto es:  categoria=divanao e nome=poltrone sofa.
    private double CostoProdotto;//Il costo e' un'informazione che non serve relativamente nel codice ma solo per darli piu' caratteristiche e sono presenti anche i centesimi per es" 15,5$ ecc...
    private int QuantitaProdotto;//La quantita' e' il numero di oggetti che ci sono di quel prodotto es: sedie ----> 50 = ci sono 50 sedie nel magazzino cosi quando vendo il prodotto dovro' fare quantita-Nprodottovenduti.
    
    //getter e setter dei relativi dati e anche il toString
    
    public Prodotto(int codiceIdentificativo, String categoriaProdotto, String nomeProdotto, double costoProdotto,int quantitaProdotto) 
    {
        this.CodiceIdentificativo = codiceIdentificativo;
        this.CategoriaProdotto = categoriaProdotto;
        this.NomeProdotto = nomeProdotto;
        this.CostoProdotto = costoProdotto;
        this.QuantitaProdotto=quantitaProdotto;
    }

    
    public int getQuantitaProdotto()
    {
       return QuantitaProdotto;
    }
   
    public int getCodiceIdentificativo() {
        return CodiceIdentificativo;
    }

    public String getCategoriaProdotto() {
        return CategoriaProdotto;
    }

    public String getNomeProdotto() {
        return NomeProdotto;
    }

    public double getCostoProdotto() {
        return CostoProdotto;
    }

     public void setQuantitaProdotto(int quantita)
    {
        this.QuantitaProdotto=quantita;
    }
    
    public void setCodiceIdentificativo(int codiceIdentificativo)
    {
        this.CodiceIdentificativo = codiceIdentificativo;
    }

    public void setCategoriaProdotto(String categoriaProdotto)
    {
        this.CategoriaProdotto = categoriaProdotto;
    }

    public void setNomeProdotto(String nomeProdotto)
    {
        this.NomeProdotto = nomeProdotto;
    }

    public void setCostoProdotto(double costoProdotto) 
    {
        this.CostoProdotto = costoProdotto;
    }
    
    public String toString()
    {
        
        String s="";
        
        System.out.println("");
        
        return s;
    }
    
    

  
 }
   
    
    
            
    
            
               
            

