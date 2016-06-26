package exp.jsr.rest.model;

import java.util.HashMap;
import java.util.Map;

public enum TodoDao {
	instance;
	  
	private Map<String, Todo> contentProvider = new HashMap<>();
	  
	private TodoDao() {
	    
		Todo todo = new Todo("1", "Deodorant", "Blue", "Middle", 19000);
	    contentProvider.put("1", todo);
	    
	    todo = new Todo("2", "Laptop", "Black", "Middle", 12000000);
	    contentProvider.put("2", todo);
	    
	    todo = new Todo("3", "Mouse", "Red", "Small", 1200000);
	    contentProvider.put("3", todo);
	    
	    todo = new Todo("4", "Power Bank", "White", "Large", 200000);
	    contentProvider.put("4", todo);
	  }
	  public Map<String, Todo> getModel(){
	    return contentProvider;
	  }
	  
	} 

