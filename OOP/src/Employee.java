

class Emp{
	int empNo;
	String empName;
	double salary;
	
	void setEmpDetails(int empNo,String empName,double salary) {
		this.empNo = empNo;
		this.empName = empName;
		this.salary = salary;
	}
	
	void displayEmpDetails() {
		System.out.println("Employee Details- \n Emp No: "+ empNo +"\n Emp Name: "+empName+" \n Emp Salary: " +salary);
	}
	
}
public class Employee {
	public static void main(String[] args) {
		Emp e = new Emp();
		e.setEmpDetails(11, "Minal", 100000);
		e.displayEmpDetails();
	}
}
