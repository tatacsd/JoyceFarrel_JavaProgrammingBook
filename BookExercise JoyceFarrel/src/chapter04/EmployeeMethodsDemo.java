package chapter04;

public class EmployeeMethodsDemo {
	public static void main(String[] args) {
		Employee aWorker = new Employee();
		
		aWorker.setValues();
		
		aWorker.methodThatUsesInstancesAttributes();
		aWorker.methodThatUsesLocalVariables();
	}

}
