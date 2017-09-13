package br.edu.ifpb.praticas.jsf;

import javax.faces.webapp.FacesServlet;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Created by diogomoreira on 06/09/17.
 */
@WebListener
public class JSFServletInitializer implements ServletContextListener {

    // Utilizado parar dispensar o uso de `web.xml` neste projeto
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        servletContextEvent.getServletContext().addServlet("*.xhtml", FacesServlet.class);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
