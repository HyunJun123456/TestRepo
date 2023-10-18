package myspring.customer.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import myspring.customer.vo.CustomerVO;

@Mapper
public interface CustomerMapper {
	CustomerVO fetchCustomerById(int id);
	List<CustomerVO> fetchCustomerList();
}
