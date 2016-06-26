package exp.jsr.rest.test;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/testJersey")
public class TestJersey {
	
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getTestMessage()
	{
		return "the jersey is running on server";
	}
	
	@GET
	@Produces(MediaType.TEXT_XML)
	public String getXMLMessage()
	{
		return "<?xml version=\"1.0\"?>" + "<message> the jersey is running on server" + "</message>";
	}
	
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String getHTMLMessage() 
	{
	return "<html> " + "<title>" + "test page" + "</title>"
	        + "<body><h1>" + "the jersey is running on server" + "</body></h1>" + "</html> ";
	}
}
