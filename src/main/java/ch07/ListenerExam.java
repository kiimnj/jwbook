package ch07;

import javax.servlet.*;
import javax.servlet.annotation.WebListener;
import javax.servlet.http.HttpSessionAttributeListener;
import javax.servlet.http.HttpSessionBindingEvent;
import javax.servlet.http.HttpSessionEvent;
import javax.servlet.http.HttpSessionListener;

@WebListener
public class ListenerExam implements ServletContextListener, ServletContextAttributeListener,
    HttpSessionListener, HttpSessionAttributeListener,
    ServletRequestListener, ServletRequestAttributeListener {
  @Override
  public void attributeAdded(ServletContextAttributeEvent event) {
    event.getServletContext().log("ServletContext 속성 추가" + event.getValue());
  }

  @Override
  public void contextInitialized(ServletContextEvent sce) {
    sce.getServletContext().log("ServletContext가 시작");
  }

  @Override
  public void contextDestroyed(ServletContextEvent sce) {
    sce.getServletContext().log("ServletContext가 종료");
  }

  @Override
  public void attributeAdded(HttpSessionBindingEvent event) {
    event.getSession().getServletContext().log("Sesion 속성 추가 : " + event.getValue());
  }

  @Override
  public void sessionCreated(HttpSessionEvent se) {
    se.getSession().getServletContext().log("Sesion 생성 : " + se.getSession().getId());
  }
}
