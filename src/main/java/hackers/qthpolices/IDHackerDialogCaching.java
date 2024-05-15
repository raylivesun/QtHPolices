/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/CachingServiceLocator.java to edit this template
 */
package hackers.qthpolices;

import jakarta.ejb.EJBHome;
import jakarta.ejb.EJBLocalHome;
import jakarta.jms.ConnectionFactory;
import jakarta.jms.Destination;
import jakarta.jms.Session;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;

/**
 *
 * @author admin
 */
public class IDHackerDialogCaching {
    
    private final InitialContext ic;
    private final Map<String, Object> cache;
    
    private static IDHackerDialogCaching me;
    
    static {
        try {
            me = new IDHackerDialogCaching();
        } catch (NamingException se) {
            throw new RuntimeException(se);
        }
    }
    
    private IDHackerDialogCaching() throws NamingException {
        ic = new InitialContext();
        cache = Collections.synchronizedMap(new HashMap<>());
    }
    
    public static IDHackerDialogCaching getInstance() {
        return me;
    }
    
    private Object lookup(String jndiName) throws NamingException {
        Object cachedObj = cache.get(jndiName);
        if (cachedObj == null) {
            cachedObj = ic.lookup(jndiName);
            cache.put(jndiName, cachedObj);
        }
        return cachedObj;
    }

    /**
     * Will get the ejb Local home factory. Clients need to cast to the type of
     * EJBHome they desire.
     *
     * @param jndiHomeName jndi home name matching the requested local home
     * @return the Local EJB Home corresponding to the homeName
     * @throws NamingException if the lookup fails
     */
    public EJBLocalHome getLocalHome(String jndiHomeName) throws NamingException {
        return (EJBLocalHome) lookup(jndiHomeName);
    }

    /**
     * Will get the ejb Remote home factory. Clients need to cast to the type of
     * EJBHome they desire.
     *
     * @param jndiHomeName jndi home name matching the requested remote home
     * @return the EJB Home corresponding to the homeName
     * @throws NamingException if the lookup fails
     */
    public EJBHome getRemoteHome(String jndiHomeName) throws NamingException {
        Object objref = lookup(jndiHomeName);
        return PortableRemoteObject.narrow(objref);        
    }

    /**
     * This method helps in obtaining the JMS connection factory.
     *
     * @param connFactoryName name of the connection factory
     * @return the factory for obtaining JMS connection
     * @throws NamingException if the lookup fails
     */
    public ConnectionFactory getConnectionFactory(String connFactoryName) throws NamingException {
        return (ConnectionFactory) lookup(connFactoryName);
    }

    /**
     * This method obtains the topic itself for a caller.
     *
     * @param destName destination name
     * @return the Topic Destination to send messages to
     * @throws NamingException if the lookup fails
     */
    public Destination getDestination(String destName) throws NamingException {
        return (Destination) lookup(destName);
    }

    /**
     * This method obtains the datasource itself for a caller.
     *
     * @param dataSourceName data source name
     * @return the DataSource corresponding to the name parameter
     * @throws NamingException if the lookup fails
     */
    public DataSource getDataSource(String dataSourceName) throws NamingException {
        return (DataSource) lookup(dataSourceName);
    }

    /**
     * This method obtains the E-mail session itself for a caller.
     *
     * @param sessionName session name
     * @return the Session corresponding to the name parameter
     * @throws NamingException if the lookup fails
     */
    public Session getSession(String sessionName) throws NamingException {
        return (Session) lookup(sessionName);
    }

    /**
     * Gets the URL corresponding to the environment entry name.
     *
     * @param envName the environment name
     * @return the URL value corresponding to the environment entry name
     * @throws NamingException if the lookup fails
     */
    public URL getUrl(String envName) throws NamingException {
        return (URL) lookup(envName);
    }

    /**
     * Gets boolean value corresponding to the environment entry name.
     *
     * @param envName the environment name
     * @return the boolean value corresponding to the environment entry, such as
     * SEND_CONFIRMATION_MAIL property
     * @throws NamingException if the lookup fails
     */
    public boolean getBoolean(String envName) throws NamingException {
        Boolean bool = (Boolean) lookup(envName);
        return bool;
    }

    /**
     * Gets string value corresponding to the environment entry name.
     *
     * @param envName the environment name
     * @return the String value corresponding to the environment entry name
     * @throws NamingException if the lookup fails
     */
    public String getString(String envName) throws NamingException {
        return (String) lookup(envName);
    }
}
