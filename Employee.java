
public class Employee {
	private String name; 
	private int age; 
	private int EmpId; 
	private double HourlyPay; 
	private String role;

public Employee () {
	this.name = "Patrick"; 
	this.age = 22;
	this.EmpId = 24367880; 
	this.HourlyPay = 15.5; 
	this.role = "Assistant"; 
}

public Employee(String name, int age, int EmpId, double HourlyPay, String role) {
	this.name= name; 
	this.age = age; 
	this.EmpId = EmpId; 
	this.HourlyPay = HourlyPay; 
	this.role = role; 
}

public Employee(String name, String role) {
	this.name = name; 
	this.role = role;
}

public String getName() {
	return this.name; 	
}

public int getEmpId() {
	return this.EmpId; 
}

public double getHourlyPay() {
	return this.HourlyPay; 
}

public String getRole() {
	return this.role; 
}

public void setName(String n) {
	this.name = n; 
}

public void setAge(int age) {
	this.age = age; 
}

public void setEmpId (int id) {
	this.EmpId = id; 
}

public void setHourlyPay(double pay) {
	this.HourlyPay = pay; 
}

public void setRole(String role) {
	this.role = role; 
}

public boolean equals(Object O) {
	if (this== O) {
		return true; 
	}
	if (O instanceof Employee) {
		Employee p1= (Employee) O;
	if (this.name == p1.name) {
	if (this.age == p1.age) {
	if (this.EmpId == p1.EmpId) {
	if (this.HourlyPay == p1.HourlyPay) {
	if (this.role == p1.role) {
		return true; 
	}
	}
	}
	}
	}
	return false;
} 

public String toString() {
	return "Employee: " + "name" + getName() + "age" + this.age + "EmpId" + getEmpId() + "HourlyPay" + this.HourlyPay() + "role" + getRole(); 
}
}


}
