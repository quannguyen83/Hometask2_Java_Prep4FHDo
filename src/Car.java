
public class Car {
	private int id;
	private String Make;
	private String Model;
	private int yearOfManufacture;
	private String Color;
	private int Price;
	private String registrationNumber;
	
	public Car (String make, String model, int yearOfManufacture, String color, int price, String registrationNumber) {
		this.id = 0;
		this.setMake(make);
		this.setModel(model);
		this.setYearOfManufacture(yearOfManufacture);
		this.setColor(color);
		this.setPrice(price);
		this.setRegistrationNumber(registrationNumber);
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return Make;
	}

	public void setMake(String make) {
		Make = make;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public String getColor() {
		return Color;
	}

	public void setColor(String color) {
		Color = color;
	}

	public int getPrice() {
		return Price;
	}

	public void setPrice(int price) {
		Price = price;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}
	
}
