package Spring_mvc_hibernate_2table.util;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class Comp_empl_servlet extends AbstractAnnotationConfigDispatcherServletInitializer {

	@Override
	protected Class<?>[] getRootConfigClasses() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		// TODO Auto-generated method stub
		return new Class<?>[] {Comp_empl_config.class};
	}

	@Override
	protected String[] getServletMappings() {
		// TODO Auto-generated method stub
		 return new String[] {"/"};
	}

}
