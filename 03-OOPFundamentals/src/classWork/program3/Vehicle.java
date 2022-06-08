package classWork.program3;

public class Vehicle {
	private long registrationNo;
	private String brand;
	private float price;
	private float mileage;
	
	public Vehicle() {
		
	}
	public Vehicle(long registrationNo, String brand, float price, float mileage) {
		super();
		this.registrationNo = registrationNo;
		this.brand = brand;
		this.price = price;
		this.mileage = mileage;
	}
	public long getRegistrationNo() {
		return registrationNo;
	}
	public void setRegistrationNo(long registrationNo) {
		this.registrationNo = registrationNo;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public float getMileage() {
		return mileage;
	}
	public void setMileage(float mileage) {
		this.mileage = mileage;
	}
	
	public void display() {
		System.out.println("Registration Number:"+getRegistrationNo()+"\n"+"Brand:"+getBrand()+"\n"+"Price:"+getPrice()+"\n"+"Mileage:"+getMileage());
	}
}
