package voltron;

public class PermanentEmployee extends Employee{
private double basicPay;
private double hra;
private int experience;
public double getBasicPay() {
	return basicPay;
}
public void setBasicPay(double basicPay) {
	this.basicPay = basicPay;
}
public double getHra() {
	return hra;
}
public void setHra(double hra) {
	this.hra = hra;
}
public int getExperience() {
	return experience;
}
public void setExperience(int experience) {
	this.experience = experience;
}

public void calculateSalary(){
		if (experience<3){
		 setSalary(0*basicPay+basicPay+hra);
			 
		}
		else if(experience>=3 && experience<5){
				  setSalary(0.05*basicPay+basicPay+hra);
			}
		else if(experience>=5 && experience<10){
			  setSalary(0.07*basicPay+basicPay+hra);
}
		else if(experience>=10){
			 setSalary(0.12*basicPay+basicPay+hra);
}	
		
}
}
