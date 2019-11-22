package com.briup.cms.Service.Impl;

import com.briup.cms.Service.ICustomerService;
import com.briup.cms.bean.Customer;
import com.briup.cms.dao.ICustomerDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImpl implements ICustomerService {
    @Autowired
    private ICustomerDao customerDao;

    @Override
    public Customer findById(int id) {

        return customerDao.queryById(id);
    }
}
