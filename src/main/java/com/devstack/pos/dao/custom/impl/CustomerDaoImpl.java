package com.devstack.pos.dao.custom.impl;

import com.devstack.pos.dao.custom.CustomerDao;
import com.devstack.pos.db.HibernateConfiguration;
import com.devstack.pos.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class CustomerDaoImpl implements CustomerDao {
    public void Save(Customer customer) {
        Session session= HibernateConfiguration.getHibernateConfiguration().getSession();
        Transaction transaction = session.beginTransaction();
        try{
            session.save(customer);
            transaction.commit();
        }catch (Exception e){
            e.printStackTrace();
            transaction.rollback();
        }finally {
            session.close();
        }
    }

    public void delete(Long id) {
        try {

            Session session = HibernateConfiguration.getHibernateConfiguration().getSession();
            session.delete(
                    session.find(Customer.class,id)
            );
        }catch (Exception e){

        }

    }

    public void update(Customer customer) throws ClassNotFoundException {
        Session session = HibernateConfiguration.getHibernateConfiguration().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            Customer  selectedCustomer = session.find(Customer.class, customer.getId());
            if(selectedCustomer!=null){
                selectedCustomer.setName(customer.getName());
                selectedCustomer.setAddress(customer.getAddress());
                selectedCustomer.setAddress(customer.getAddress());
                selectedCustomer.setSalary(customer.getSalary());
                session.update(selectedCustomer);
                transaction.commit();
                return;
                
            }
        }catch (Exception e){
            transaction.rollback();
            throw new ClassNotFoundException("Customer Not Found");
        }finally {
            session.close();
        }
    }

    public Customer find(Long id) {
        Session session = HibernateConfiguration.getHibernateConfiguration().getSession();
        Transaction transaction = session.beginTransaction();
        try {
            return session.find(Customer.class, id);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Customer> finAll() {
        try( Session session =HibernateConfiguration.getHibernateConfiguration().getSession()){
            Query<Customer> fromCustomer = session.createQuery("FROM Customer ", Customer.class);
            return fromCustomer.list();
        }
    }
}
