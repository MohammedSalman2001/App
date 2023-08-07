package com.devstack.pos.bo.custom;

import com.devstack.pos.bo.SuperBo;
import com.devstack.pos.dto.CustomerDto;
import com.devstack.pos.entity.Customer;

import java.util.List;

public interface CustomerBo extends SuperBo {

    public void saveCustomer(CustomerDto dto);
    public void updateCustomer(CustomerDto dto) throws ClassNotFoundException;
    public CustomerDto findCustomer(Long id);
    public void deleteCustomer(Long id);
    public List<CustomerDto> findAllCustomer( );


}
