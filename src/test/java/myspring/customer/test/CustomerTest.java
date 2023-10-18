package myspring.customer.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.customer.mapper.CustomerMapper;
import myspring.customer.service.CustomerService;
import myspring.customer.vo.CustomerVO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = {"classpath:spring-beans-customer.xml"})
public class CustomerTest {
	@Autowired
	private DataSource dataSource;
	
	@Autowired
	private SqlSessionFactory sqlSessionFactory;
	
	@Autowired
	private SqlSession sqlSession;
	
	@Autowired
	private CustomerMapper customerMapper;
	
	@Autowired
	private CustomerService customerService; 
	
	@Test @Disabled
	public void customerService() {
		CustomerVO customer = customerService.fetchCustomer(1);
		System.out.println(customer);
	}
	
	@Test @Disabled
	public void customerMapper() {
		CustomerVO customerVO = customerMapper.fetchCustomerById(1);
		// System.out.println(customerVO);
		assertEquals("홍길동", customerVO.getName());
	}
	
	@Test @Disabled
	public void sqlSession() {
		System.out.println(sqlSession.getClass().getName());
		sqlSession.selectOne("CustomerMapper.fetchCustomerById", 1);
	}
	
	@Test 
	public void sqlSessionFactory() {
		System.out.println(sqlSessionFactory.getClass().getName());
	}
	
	
	@Test @Disabled
	public void dataSource() {
		try {
			Connection conn = dataSource.getConnection();
			DatabaseMetaData metaData = conn.getMetaData();
			System.out.println(metaData.getDatabaseProductName());
			System.out.println(metaData.getDriverName());
			System.out.println(metaData.getURL());
			System.out.println(metaData.getUserName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
