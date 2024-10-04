package Spring_mvc_hibernate_2table.model;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Component
@Entity
public class Employee {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int empid;
	
	private String empname;
	
	private int empsalary;
	
	@ManyToOne
	Company company;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public int getEmpsalary() {
		return empsalary;
	}
	public void setEmpsalary(int empsalary) {
		this.empsalary = empsalary;
	}
	public Company getCompany() {
		return company;
	}
	public void setCompany(Company company) {
		this.company = company;
	}
	public Employee(int empid, String empname, int empsalary, Company company) {
		super();
		this.empid = empid;
		this.empname = empname;
		this.empsalary = empsalary;
		this.company = company;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + "]";
	}
	
	
	
	
	
	
	
	
	
}
