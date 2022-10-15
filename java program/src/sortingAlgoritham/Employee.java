package sortingAlgoritham;

public class Employee {

	

		public static Employee[] rec;
		String empName ;
		int empId;
		float salary;
		public Employee(String empName, int empId, float salary) 
		{
			
			this.empName = empName;
			this.empId = empId;
			this.salary = salary;
		}
		@Override
		public String toString() {
			return "Employee [\n empName=" + empName + ", \n empId=" + empId + ", \n salary=" + salary + "]";
		}
}