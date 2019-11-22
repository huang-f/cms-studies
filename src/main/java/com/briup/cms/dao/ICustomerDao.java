package com.briup.cms.dao;

import com.briup.cms.bean.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import javax.transaction.Transactional;
import java.util.List;

public interface ICustomerDao extends JpaRepository<Customer,Integer> {
    Customer queryById(int id);

    @Transactional
    void deleteById(int id);

    @Transactional
    @Modifying
    @Query("delete from Customer c where c.name = ?1")
    void adc(String name);

    Customer findById(int id);

    Customer getById(int id);

    Customer queryByIdAndName(int id, String name);

    List<Customer> getByIdOrName(int id, String name);

    List<Customer> findByNameLike(String name);

    @Query("select c.name,c.money,c.id from Customer c where c.id = ?1" )
    Customer zxc(int id);

}
