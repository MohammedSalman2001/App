package com.devstack.pos.dao.factory;

import com.devstack.pos.bo.custom.impn.CustomerBoImpl;
import com.devstack.pos.dao.SuperDao;

public class DaoFactory {
    public static  DaoFactory daoFactory;

    private DaoFactory(){

    }
    public static DaoFactory getInstance(){
        return daoFactory==null?daoFactory=new DaoFactory():daoFactory;
    }

    public <T> T getDao(DaoType daoType){
        switch (daoType){
            case CUSTOMER:
                return (T) new CustomerBoImpl();

            default:
                return null;
        }
    }


}
