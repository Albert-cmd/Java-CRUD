/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.m2_uf4_ex1_hibernate;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;

/**
 *
 * @author Albert Gonzalez
 */
public class gestioClients {

    public List<Clients> tornaTots() {
        org.hibernate.SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        org.hibernate.Session session = sessionFactory.openSession();
        List<Clients> Clients = session.createCriteria(Clients.class).list();
        session.close();
        return Clients;

    }

    public void afegeixClient(int codi, String nom, String adreca, Integer codiPostal, String poblacio, Double limitCredit, String dataUltimaCompra) {

        // Obrir la sessió
        org.hibernate.SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        org.hibernate.Session session = sessionFactory.openSession();
        session.beginTransaction();
        // Fer l'operació
        Clients c = new Clients();
        c.setCodi(codi);
        c.setNom(nom);
        c.setAdreca(adreca);
        c.setCodiPostal(codiPostal);
        c.setPoblacio(poblacio);
        c.setLimitCredit(limitCredit);

        c.setDataUltimaCompra(Date.valueOf(dataUltimaCompra));
        
        session.save(c);

        //Tancar la sessió
        session.getTransaction().commit();
        session.close();

    }

    public void eliminaClient(int codi) {

        // Obrir la sessió
        org.hibernate.SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        org.hibernate.Session session = sessionFactory.openSession();
        session.beginTransaction();
        // Fer l'operació
        Clients c = new Clients();
        c.setCodi(codi);
        session.delete(c);
        //Tancar la sessió
        session.getTransaction().commit();
        session.close();

    }

    public void llistarClient() {

    }

    public void modificaClient(int codi, String nom, String adreca, Integer codiPostal, String poblacio, Double limitCredit, Date dataUltimaCompra) {

        // Obrir la sessió
        org.hibernate.SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        org.hibernate.Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Fer l'operació
        Clients c = new Clients();
        c.setCodi(codi);
        c.setNom(nom);
        c.setAdreca(adreca);
        c.setCodiPostal(codiPostal);
        c.setPoblacio(poblacio);
        c.setLimitCredit(limitCredit);
        c.setDataUltimaCompra(dataUltimaCompra);
        session.merge(c);

        //Tancar la sessió
        session.getTransaction().commit();
        session.close();

    }

    public void buscarNom(String nom) {

        // Obrir la sessió
        org.hibernate.SessionFactory sessionFactory = HibernateSession.getSessionFactory();
        org.hibernate.Session session = sessionFactory.openSession();
        session.beginTransaction();

        Query getClients = session.createQuery("from Clients where nom like :nom").setParameter("nom", "%" + nom + "%");

        List<Clients> clients = getClients.list();

        for (Clients client : clients) {

            System.out.println(client.toString());

        }

    }

}
