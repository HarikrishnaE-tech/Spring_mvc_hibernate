package Spring_mvc_hibernate_2table.model;

public class Comp_empl {
   private int empid;
   private String empname;
   private int empsalary;
   private int depid;
   private String depname;
   private String job;
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
public Comp_empl(int empid, String empname, int empsalary, int depid, String depname, String job) {
	super();
	this.empid = empid;
	this.empname = empname;
	this.empsalary = empsalary;
	this.depid = depid;
	this.depname = depname;
	this.job = job;
}
public Comp_empl() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Comp_empl [empid=" + empid + ", empname=" + empname + ", empsalary=" + empsalary + ", depid=" + depid
			+ ", depname=" + depname + ", job=" + job + "]";
}
   
	
	
	
	
	
}
