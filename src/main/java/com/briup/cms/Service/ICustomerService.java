package com.briup.cms.Service;

import com.briup.cms.bean.Customer;

public interface ICustomerService {
    Customer findById(int id);
}
