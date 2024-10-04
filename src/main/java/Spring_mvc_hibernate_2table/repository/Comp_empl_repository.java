package Spring_mvc_hibernate_2table.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Spring_mvc_hibernate_2table.model.Comp_empl;
import Spring_mvc_hibernate_2table.model.Company;
import Spring_mvc_hibernate_2table.model.Employee;

@Repository
public class Comp_empl_repository {

	public void insert(Company comp,Employee empl) {
		
		Configuration cfg=new Configuration()
				.configure()
				.addAnnotatedClass(Company.class)
				.addAnnotatedClass(Employee.class);
				
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
		Transaction bt = sess.beginTransaction();
		sess.save(comp);
		sess.save(empl);
		bt.commit();
		sess.close();
		sf.close();
		
	}
	
	public List<Object[]> fulldetails(Comp_empl ce) {
		Configuration cfg=new Configuration()
				.configure()
				.addAnnotatedClass(Company.class)
				.addAnnotatedClass(Employee.class);
				
		SessionFactory sf = cfg.buildSessionFactory();
		Session sess = sf.openSession();
	
		
		String sql="Select comp.depname,comp.job,emp.empname,emp.empsalary from Company comp inner Join employee emp on emp.depid=comp.Company_depid";
		
		Query query =sess.createQuery(sql);
		List<Object[]> resultList = query.getResultList();
		System.out.println(resultList);
		for(Object[] arra:resultList) {
			ce.setDepname((String)arra[0]);
			ce.setJob((String)arra[1]);
			ce.setEmpname((String)arra[2]);
			ce.setEmpsalary((Integer)arra[3]);
		}
		
		System.out.println(ce);
		
		
		
		
	
		
		return resultList;
		
	}
	
	
	
	
}
