package com.devstack.pos.bo.custom.impn;

import com.devstack.pos.bo.custom.CustomerBo;
import com.devstack.pos.dao.custom.CustomerDao;
import com.devstack.pos.dao.factory.DaoFactory;
import com.devstack.pos.dao.factory.DaoType;
import com.devstack.pos.dto.CustomerDto;
import com.devstack.pos.entity.Customer;

import java.util.ArrayList;
import java.util.List;
public class CustomerBoImpl implements CustomerBo {

    CustomerDao customerDao= DaoFactory.getInstance().getDao(DaoType.CUSTOMER);
    @Override
    public void saveCustomer(CustomerDto dto) {
        customerDao.Save(
                new Customer(dto.getId(),dto.getName(),dto.getAddress(),dto.getSalary())
        );

    }

    @Override
    public void updateCustomer(CustomerDto dto) throws ClassNotFoundException {
        customerDao.update(
                new Customer(dto.getId(),dto.getName(),dto.getAddress(),dto.getSalary())
        );
    }

    @Override
    public CustomerDto findCustomer(Long id) {
        Customer customer = customerDao.find(id);
        if(customer!=null){
            return new CustomerDto(
                   customer.getId(),customer.getName(),customer.getAddress(),customer.getSalary()
            );
        }
        return null;
    }

    @Override
    public void deleteCustomer(Long id) {
            customerDao.delete(id);
    }

    @Override
    public List<CustomerDto> findAllCustomer() {
        ArrayList<CustomerDto> dtoArrayList = new ArrayList<>();
        List<Customer> customersEntity = customerDao.finAll();
        for (Customer  customer:customersEntity){
         CustomerDto dto=new CustomerDto(customer.getId(),customer.getName(),customer.getAddress(),customer.getSalary());

        dtoArrayList.add(dto);
        }

        return dtoArrayList;
    }
}
