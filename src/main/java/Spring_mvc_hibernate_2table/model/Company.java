package Spring_mvc_hibernate_2table.model;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Component
@Entity
public class Company {
	@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int depid;
	private String depname;
	private String job;
	
	@OneToMany(mappedBy = "Company")
	private List<Employee>empl;
	public int getDepid() {
		return depid;
	}
	public void setDepid(int depid) {
		this.depid = depid;
	}
	public String getDepname() {
		return depname;
	}
	public void setDepname(String depname) {
		this.depname = depname;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	public List<Employee> getEmpl() {
		return empl;
	}
	public void setEmpl(List<Employee> empl) {
		this.empl = empl;
	}
	
	
	public Company(int depid, String depname, String job, List<Employee> empl) {
		super();
		this.depid = depid;
		this.depname = depname;
		this.job = job;
		this.empl = empl;
	}
	public Company() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Company [depid=" + depid + ", depname=" + depname + ", job=" + job + "]";
	}
	
	
	
}
