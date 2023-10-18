package myspring.customer.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.customer.mapper.CustomerMapper;
import myspring.customer.vo.CustomerVO;
@Repository
public class CustomerDAOImpl implements CustomerDAO{

	@Autowired
	private CustomerMapper customerMapper;
	
	@Override
	public List<CustomerVO> readAll() {
		List<CustomerVO> customerListEntity = customerMapper.fetchCustomerList();
		return customerListEntity;
	}

	@Override
	public CustomerVO read(int id) {
		CustomerVO customerEntity = customerMapper.fetchCustomerById(id);
		return customerEntity;
	}
}
