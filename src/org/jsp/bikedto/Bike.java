package org.jsp.bikedto;

public class Bike {
	private int id;
	private String color;
	private String name;
	private double price;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String i) {
		this.color = i;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bike [id=" + id + ", color=" + color + ", name=" + name + ", price=" + price + "]" + "\n";
	}
	
}
