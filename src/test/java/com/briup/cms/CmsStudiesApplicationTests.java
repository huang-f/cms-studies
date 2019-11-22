package com.briup.cms;

import com.briup.cms.bean.Customer;
import com.briup.cms.dao.ICustomerDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CmsStudiesApplicationTests {
    @Autowired
    private ICustomerDao customerDao;

    @Test
    public void contextLoads() {
        Customer customer = new Customer();
        customer.setId(100);
        customer.setMoney(125);
        customer.setName("sd");
        customerDao.save(customer);
    }

    @Test
    public void test2(){
        customerDao.deleteAll();

    }

    @Test
    public void tsst3(){
        customerDao.deleteById(4);
    }

    @Test
    public void test4(){
        Customer customer = new Customer();
        customer.setId(7);
        customer.setMoney(12223222);
        customer.setName("好拿");
        customerDao.save(customer);
    }

    @Test
    public void test5(){
        customerDao.adc("好拿");
    }

    @Test
    public void test6(){
        List<Customer> list = customerDao.findAll();
        list.forEach(t -> System.out.println(t));
    }

    @Test
    public void test7() {
        List<Customer> list = customerDao.findAll();
        list.forEach(t -> System.out.println(t));
    }

    @Test
    public void test8(){
        Sort sort = new Sort(Sort.Direction.DESC, "id");
        List<Customer> list = customerDao.findAll(sort);
        list.forEach(t -> System.out.println(t));

    }

    @Test
    public void test9() {
        Pageable pageable = PageRequest.of(1,3);
        Page<Customer> pages = customerDao.findAll(pageable);
        System.out.println(pages.getTotalPages());//总页数
        System.out.println(pages.getTotalElements());//总记录数
        List<Customer> lists = pages.getContent();//获取查询出来的结果
        lists.forEach(t -> System.out.println(t));
    }

    @Test
    public void test10() {
        Customer customer = customerDao.getById(3);
        System.out.println(customer);
    }
    @Test
    public void test11(){
        Customer asd = customerDao.queryByIdAndName(3, "asd");
        System.out.println(asd);
    }

    @Test
    public void test12() {
        List<Customer> dao = customerDao.getByIdOrName(2, "asd");
        dao.forEach(t -> System.out.println(t));
    }

    @Test
    public void test13() {
        List<Customer> list = customerDao.findByNameLike("%d%");
        list.forEach(t -> System.out.println(t));
    }

    @Test
    public void test14() {
        Customer zxc = customerDao.zxc(3);
        System.out.println(zxc);
    }

}
