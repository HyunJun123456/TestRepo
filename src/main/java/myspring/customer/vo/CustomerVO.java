package myspring.customer.vo;

import java.util.Date;

public class CustomerVO {
	private int id;
	private String email;
	private String name;
	private String age;
	private Date entryDate;
	public CustomerVO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerVO(int id, String email, String name, String age, Date entryDate) {
		super();
		this.id = id;
		this.email = email;
		this.name = name;
		this.age = age;
		this.entryDate = entryDate;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public Date getEntryDate() {
		return entryDate;
	}
	public void setEntryDate(Date entryDate) {
		this.entryDate = entryDate;
	}
	@Override
	public String toString() {
		return "CustomerVO [id=" + id + ", email=" + email + ", name=" + name + ", age=" + age + ", entryDate="
				+ entryDate + "]";
	}
	
	
}
