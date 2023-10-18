package myspring.customer.service;

import java.util.List;

import myspring.customer.vo.CustomerVO;

public interface CustomerService {
	public List<CustomerVO> fetchCustomerList();
	public CustomerVO fetchCustomer(int id);
}
