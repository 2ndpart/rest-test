package exp.jsr.rest.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Todo 
{
	private String id;
	private String name;
	private String color;
	private String size;
	private int price;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getSize() {
		return size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
	    return id;
	}
	
	public Todo()
	{
	    
	}
	
	public Todo (String id, String name, String color, String size, int price)
	{
		this.id = id;
		this.name = name;
		this.color = color;
		this.size = size;
		this.price = price;
	}
	  
}
