/**
 * 
 */
package com.csair.jboss.jdbc;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

import org.jboss.logging.Logger;
import org.jboss.resource.adapter.jdbc.ValidConnectionChecker;

/**
 * @author SunShine
 *
 */
public class CustomValidConnectionChecker implements ValidConnectionChecker, Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9000674922012445168L;
	private static final Logger log = Logger.getLogger(CustomValidConnectionChecker.class);

	@Override
	public SQLException isValidConnection(Connection c) {
		SQLException sqe = null;
	    Statement stmt = null;
	    try
	    {
	      stmt = c.createStatement();
	      stmt.execute("SELECT 1");
//	      System.out.println("connection validation successfully."+c.getCatalog());
	      log.info("connection validation successfully."+c.getCatalog());
	    }
	    catch (SQLException e)
	    {
//	      System.out.println("warning: connection validation failed for current managed connection.");
	    	log.info("warning: connection validation failed for current managed connection.");
	      sqe = e;
	    }
	    finally
	    {
	      try
	      {
	        if (stmt != null)
	        {
	          stmt.close();
	        }

	      }
	      catch (SQLException e)
	      {
//	        System.out.println("simple close failed for managed connection"+e.getMessage());
	    	  log.info("simple close failed for managed connection"+e.getMessage());
	      }

	    }

	    return sqe;
	}

}
