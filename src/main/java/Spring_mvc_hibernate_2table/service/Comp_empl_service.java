package Spring_mvc_hibernate_2table.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import Spring_mvc_hibernate_2table.model.Comp_empl;
import Spring_mvc_hibernate_2table.model.Company;
import Spring_mvc_hibernate_2table.model.Employee;
import Spring_mvc_hibernate_2table.repository.Comp_empl_repository;

@Service

public class Comp_empl_service {
@Autowired
	Comp_empl_repository repo;
	
	public void insert(Company comp,Employee empl) {
		repo.insert(comp, empl);
	}

	public List<Object[]> fulldetails(Comp_empl ce) {
		List<Object[]>resultlist =repo.fulldetails(ce);
		return  resultlist;
		
	}
	
	
}

