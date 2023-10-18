package myspring.customer.dao;

import java.util.List;

import myspring.customer.vo.CustomerVO;

public interface CustomerDAO {
	public List<CustomerVO> readAll();
	public CustomerVO read(int id);
}
