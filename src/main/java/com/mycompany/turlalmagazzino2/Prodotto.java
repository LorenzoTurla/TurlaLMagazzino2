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
public class Prodotto
{
    private int codiceIdentificativo;
    private String categoriaProdotto;
    private String nomeProdotto;
    private double costoProdotto;
    private int quantitaProdotto;
    

    public Prodotto(int codiceIdentificativo, String categoriaProdotto, String nomeProdotto, double costoProdotto,int quantita) {
        this.codiceIdentificativo = codiceIdentificativo;
        this.categoriaProdotto = categoriaProdotto;
        this.nomeProdotto = nomeProdotto;
        this.costoProdotto = costoProdotto;
        this.quantitaProdotto=quantita;
    }

    Prodotto(String ciao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    Prodotto(Prodotto prodotto) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getQuantitaProdotto()
    {
       return quantitaProdotto;
    }
    
    public void setQuantitaProdotto(int quantita)
    {
        this.quantitaProdotto=quantita;
        
    }
   
    public int getCodiceIdentificativo() {
        return codiceIdentificativo;
    }

    public String getCategoriaProdotto() {
        return categoriaProdotto;
    }

    public String getNomeProdotto() {
        return nomeProdotto;
    }

    public double getCostoProdotto() {
        return costoProdotto;
    }

    

    public void setCodiceIdentificativo(int codiceIdentificativo) {
        this.codiceIdentificativo = codiceIdentificativo;
    }

    public void setCategoriaProdotto(String categoriaProdotto) {
        this.categoriaProdotto = categoriaProdotto;
    }

    public void setNomeProdotto(String nomeProdotto) {
        this.nomeProdotto = nomeProdotto;
    }

    public void setCostoProdotto(double costoProdotto) {
        this.costoProdotto = costoProdotto;
    }
    
    public String toString()
    {
        
        String s="";
        
        System.out.println("");
        
        return s;
    }
    
    

  
 }
   
    
    
            
    
            
               
            

