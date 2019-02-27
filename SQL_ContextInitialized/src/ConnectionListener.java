

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ConnectionListener
 *
 */
@WebListener
public class ConnectionListener implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public ConnectionListener() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("context initialized");
    	ServletContext context = arg0.getServletContext();
    	String driver = context.getInitParameter("driver");
    	String url = context.getInitParameter("url");
    	String user = context.getInitParameter("user");
    	String password = context.getInitParameter("password");
    	
    	try {
			Class.forName(driver);
			Connection con;
			con = DriverManager.getConnection(url,user,password);
			context.setAttribute("connection", con);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	     catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    }
	
}
