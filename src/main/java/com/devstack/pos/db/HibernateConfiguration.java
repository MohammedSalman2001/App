package com.devstack.pos.db;

import com.devstack.pos.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;


public class HibernateConfiguration {
    public static  HibernateConfiguration hibernateConfiguration;
    public  SessionFactory sessionFactory;

    private HibernateConfiguration(){

        try {
            Properties properties = new Properties();
            properties.load(new FileInputStream("application.properties"));
        }catch (IOException e){
            e.printStackTrace();
        }

        Configuration configuration = new Configuration().configure().addAnnotatedClass(Customer.class);
        sessionFactory=configuration.buildSessionFactory();

    }
    public static HibernateConfiguration getHibernateConfiguration(){
       return hibernateConfiguration==null?hibernateConfiguration=new HibernateConfiguration():hibernateConfiguration;
    }
    public Session getSession(){
        return sessionFactory.openSession();
    }
}
