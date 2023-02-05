class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Sanjay";
		sal = 5000;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " + sal);
	}

	public static void main(String[] args) 
	{
		/*-- create an instance/ object of Employee --*/
		Employee emp = new Employee();
		
		/*-- access the state of object using reference --*/
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		/*-- access the state of object using reference and method --*/
		emp.getDetails();

		/*-- change the state of object using reference --*/
		emp.empno = 101;
		emp.name = "Praveen";
		emp.sal = 2500.5f;
		emp.getDetails();

		/*-- change the state of object using reference & method --*/
		emp.setDetails();
		emp.getDetails();
	}
}
