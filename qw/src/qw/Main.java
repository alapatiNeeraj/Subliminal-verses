package qw;

public class Main {

	public static void main(String[] args){
		Bill b = new Bill();
		b.setBillId(1001);
		b.setCustomerId(1001);
		b.setBillAmount(199.99);
		
		System.out.println(b.billAmount());
		
		
	}
	
}
