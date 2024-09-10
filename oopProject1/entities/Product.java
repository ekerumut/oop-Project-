package oopProject1.entities;

public class Product {
	private String courseName;
	private String teacherName;
	private double unitPrice;
	private String categoryName;
	public Product() {
		
	}
	
	public Product(String courseName, String teacherName, double unitPrice, String categoryName) {
		
		this.courseName = courseName;
		this.teacherName = teacherName;
		this.unitPrice = unitPrice;
		this.categoryName = categoryName;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}

	public double getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	
	
	
	

}
