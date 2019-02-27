

import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.annotation.WebListener;

/**
 * Application Lifecycle Listener implementation class ConnectionEstablishing
 *
 */
@WebListener
public class ConnectionEstablishing implements ServletRequestListener {

    /**
     * Default constructor. 
     */
    public ConnectionEstablishing() {
        // TODO Auto-generated constructor stub
    }

	/**
     * @see ServletRequestListener#requestDestroyed(ServletRequestEvent)
     */
    public void requestDestroyed(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("request listener closed");
    }

	/**
     * @see ServletRequestListener#requestInitialized(ServletRequestEvent)
     */
    public void requestInitialized(ServletRequestEvent arg0)  { 
         // TODO Auto-generated method stub
    	System.out.println("now initializing request"
				+ arg0.getServletRequest().getRemoteAddr());
    	System.out.println("Wait for connection is establshed");
    }
	
}
