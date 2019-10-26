package com.mycompany.m2_uf4_ex1_hibernate;
// Generated Oct 22, 2019 5:37:58 PM by Hibernate Tools 4.3.1


import java.util.Date;

/**
 * Clients generated by hbm2java
 */
public class Clients  implements java.io.Serializable {


     private int codi;
     private String nom;
     private String adreca;
     private Integer codiPostal;
     private String poblacio;
     private Double limitCredit;
     private Date dataUltimaCompra;

    public Clients() {
    }

	
    public Clients(int codi) {
        this.codi = codi;
    }
    public Clients(int codi, String nom, String adreca, Integer codiPostal, String poblacio, Double limitCredit, Date dataUltimaCompra) {
       this.codi = codi;
       this.nom = nom;
       this.adreca = adreca;
       this.codiPostal = codiPostal;
       this.poblacio = poblacio;
       this.limitCredit = limitCredit;
       this.dataUltimaCompra = dataUltimaCompra;
    }
   
    public int getCodi() {
        return this.codi;
    }
    
    public void setCodi(int codi) {
        this.codi = codi;
    }
    public String getNom() {
        return this.nom;
    }
    
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getAdreca() {
        return this.adreca;
    }
    
    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }
    public Integer getCodiPostal() {
        return this.codiPostal;
    }
    
    public void setCodiPostal(Integer codiPostal) {
        this.codiPostal = codiPostal;
    }
    public String getPoblacio() {
        return this.poblacio;
    }
    
    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }
    public Double getLimitCredit() {
        return this.limitCredit;
    }
    
    public void setLimitCredit(Double limitCredit) {
        this.limitCredit = limitCredit;
    }
    public Date getDataUltimaCompra() {
        return this.dataUltimaCompra;
    }
    
    public void setDataUltimaCompra(Date dataUltimaCompra) {
        this.dataUltimaCompra = dataUltimaCompra;
    }


    
    


}

