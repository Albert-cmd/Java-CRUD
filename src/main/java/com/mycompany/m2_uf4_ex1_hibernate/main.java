/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m2_uf4_ex1_hibernate;

import com.mycompany.m2_uf4_ex1_hibernate.Clients;
import com.mycompany.m2_uf4_ex1_hibernate.gestioClients;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author Albert Gonzalez
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
//        QUERY SQL PER LA DB 
        
//        create database ex1; 
//create table clients ( 
// codi int, 
// nom varchar (30),
// adreça varchar (30), 
// codiPostal int, 
// poblacio varchar(30) ,
// limitCredit double,
// dataUltimaCompra date
//)
//alter table clients add primary key (codi)  


//         d’afegir, esborrar, modificar i llistar tots els ó que permeti gestionar (fer operacions és d’afegir, esborrar, modificar i llistar tots els
//registres permeti:
//• Llistar totes les dades dels clients que el seu nom coincideixi amb un introdu t per ït per
//teclat.
//• Llistar les dades dels clients ordenades per: limit de credit (ascendent i descendent) o èdit i data d’última compra.
//d’alta d’ Ultima compra

// !!!!!!!!!!!!!!!!!!!!!!11  Mirar todo en el dosier de HIBERNATE  !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!

//SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass().buildSessionFactory();
    Clients client = new Clients();
    
    gestioClients gc = new gestioClients(); 
        System.out.println("Inserta:");
    
    gc.afegeixClient(0, "Albert", "Calle de misco", 2231, "Cardedeu", 555.555,"2019-6-22");
    
        List<Clients> tornaTots = gc.tornaTots();
        
        for (Clients clients : tornaTots) {
            
            System.out.println(clients.toString());
        }

    
    
    
    System.out.println("Busca:");
    
    gc.buscarNom("Albert");
    
        System.out.println("Elimina:");
        
    gc.eliminaClient(0);
            
        
        
        for (Clients clients : tornaTots) {
            
            System.out.println(clients.toString());
        }

        
       
    }
    
}
