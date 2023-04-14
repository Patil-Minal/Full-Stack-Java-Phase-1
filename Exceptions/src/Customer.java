
class AgeException extends Exception{
	AgeException(){
		
	}
	AgeException(String msg){
		super(msg);
	}
}

class customerException {
	void setAge(int age) throws AgeException{
		if(age<18|| age>60) {
			throw new AgeException("Your age is not valid");
		}
		else {
			System.out.println("Your age: "+age);
		}
	}
}

public class Customer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		customerException c = new customerException();
		try {
			c.setAge(12);
		}catch(AgeException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
