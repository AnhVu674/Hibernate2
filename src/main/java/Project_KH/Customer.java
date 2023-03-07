package Project_KH;

public class Customer {
public int id;
public String fullName,email,phoneNumber,address;
public Customer(int id, String fullName, String email, String phoneNumber, String address) {
	this.id = id;
	this.fullName = fullName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.address = address;
}
public Customer(String fullName, String email, String phoneNumber, String address) {
	this.fullName = fullName;
	this.email = email;
	this.phoneNumber = phoneNumber;
	this.address = address;
}
public Customer() {
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getPhoneNumber() {
	return phoneNumber;
}
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}

}
