package myspring.customer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import myspring.customer.service.CustomerService;
import myspring.customer.vo.CustomerVO;

@Controller
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	public CustomerController() {
		System.out.println(this.getClass().getName()+" 생성자 호출");
	}
	
	@RequestMapping("/customerList.do") // 디스페쳐 서블릿이 알아서 컨트롤러를 불러줌
	public ModelAndView customerList() {
		List<CustomerVO> customerVOList = customerService.fetchCustomerList();
		// jsp 페이지 이름 / 페이지에서 불러올 이름(키값) / 넣어줄 데이터
		// ModelAndView(String viewName, String modelName, Object modelObject)
		return new ModelAndView("customerList", "customerList", customerVOList);
	}
	
	@RequestMapping("/fetchCustomer.do")
	public String getUser(@RequestParam("id") int id, Model model) {
		CustomerVO customerVO = customerService.fetchCustomer(id);
		model.addAttribute("customer", customerVO);
		return "customerInfo";
	}
}
