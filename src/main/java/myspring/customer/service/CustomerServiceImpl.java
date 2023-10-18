package myspring.customer.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.customer.dao.CustomerDAO;
import myspring.customer.vo.CustomerVO;
@Service
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDAO customerDAO; 
	
	@Override
	public List<CustomerVO> fetchCustomerList() {
		return customerDAO.readAll();
	}

	@Override
	public CustomerVO fetchCustomer(int id) {
		return customerDAO.read(id);
	}
}
