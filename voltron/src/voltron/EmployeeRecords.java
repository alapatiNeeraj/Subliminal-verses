package voltron;

public class EmployeeRecords {
public static void main(String[] args){
	Employee emp =new Employee();
	emp.setEmpId(101);
	emp.setName("Anil");
	
	PermanentEmployee per = new PermanentEmployee();
	per.setBasicPay(10000);
	per.setHra(1500);
	per.setExperience(3);
	 per.calculateSalary();
	System.out.println(per.getSalary());
}
}
