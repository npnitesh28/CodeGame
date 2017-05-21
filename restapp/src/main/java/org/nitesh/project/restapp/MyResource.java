package org.nitesh.project.restapp;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;

import javax.sql.DataSource;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.nitesh.project.restapp.dao.DbConnection;
import org.springframework.jdbc.core.JdbcTemplate;
import org.nitesh.project.restapp.sql.Sql;
import org.nitesh.project.restapp.sql.Sql;
import com.mysql.cj.jdbc.Blob;
import com.mysql.cj.jdbc.PreparedStatement;
/**
 * Root resource (exposed at "myresource" path)
 */
@Path("myresource")
public class MyResource {
	
	/*JdbcTemplate jdbcTemplate;*/
	DbConnection dbCon;
	PreparedStatement ps = null;
	
	/* public void setDataSource(DataSource dataSource) {
	        this.jdbcTemplate = new JdbcTemplate(dataSource);
	    }*/
	 
	 @PUT
	 @Path("insert")
	    @Produces(MediaType.TEXT_PLAIN)
	    public String dbInsert() {
		 dbCon = new DbConnection();
		 Connection con= dbCon.getConnection();
		 try {
			 ps=  (PreparedStatement) con.prepareStatement(Sql.MYDB_USERDATA_INSERT);
			ps.setString(1, "Rest1");
			ps.setString(2, "Restpass");
			ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {

			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

			if (con != null) {
				try {
					con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		}
		return "Value inserted Successfully!!";
		 /*this.jdbcTemplate.update(
			        "insert into t_actor ( first_name, middle_name, last_name, username, password, email_id, contact_number, gender, status)"
			        + " values (?, ?, ?, ? ,? ,? , ?, ?, ?)"
			        +"Leonor", "Watling", "pandey", "npnitesh", "password", "npnitesh28@gmail.com", "7042342255", "Male", "Active" );

	        return "Data inserted!";*/
	    }

    /**
     * Method handling HTTP GET requests. The returned object will be sent
     * to the client as "text/plain" media type.
     *
     * @return String that will be returned as a text/plain response.
     */
    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String getIt() {
        return "Got it!";
    }
}
