package Spring_mvc_hibernate_2table.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import Spring_mvc_hibernate_2table.model.Comp_empl;
import Spring_mvc_hibernate_2table.model.Company;
import Spring_mvc_hibernate_2table.model.Employee;
import Spring_mvc_hibernate_2table.service.Comp_empl_service;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Controller

public class Comp_emp_controller {
@Autowired
Company comp;

@Autowired
Employee empl;



@Autowired
Comp_empl_service service;
@RequestMapping("/insert")
	public void insertion(HttpServletRequest request, HttpServletResponse response) {
		String empname=request.getParameter("empname");
		int empsalary=Integer.parseInt(request.getParameter("empsalary"));
		String departname=request.getParameter("departname");
		String job=request.getParameter("job");
		
		comp.setDepname(departname);
		comp.setJob(job);
		empl.setEmpname(empname);
		empl.setEmpsalary(empsalary);
		
		List<Employee>lemp=new ArrayList();
		lemp.add(empl);
		empl.setCompany(comp);
		comp.setEmpl(lemp);
		
		service.insert(comp, empl);
		
		
	}

@RequestMapping("/fulldetails")
	public ModelAndView fulldetails(HttpServletRequest request, HttpServletResponse reponse) {
		
	Comp_empl ce=new Comp_empl();
		
		ModelAndView mv=new ModelAndView();
		String job_category=request.getParameter("job-category");
		if(job_category.contentEquals("manager")) {
		List<Object[]> resultlist =	service.fulldetails(ce);
		
		
		
	/*	for(Object[] arra:resultlist) {
			ce.setDepname((String)arra[0]);
			ce.setJob((String)arra[1]);
			ce.setEmpname((String)arra[2]);
			ce.setEmpsalary((Integer)arra[3]);
		}
		
		System.out.println(ce);
		mv.addObject("resultlist",ce);
		mv.setViewName("Display.jsp");
		}*/
	
		
		
		
		
		}
		return mv;

	
}
}

