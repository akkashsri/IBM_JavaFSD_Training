package com.example;

public class Main {

	public void checkObject(Object obj) {
		Employee employee = (Employee) obj;

		if (employee instanceof RegularEmployee) {
			System.out.println("Regular Employee Object");
		}
		else if (employee instanceof HourlyPaidEmployee) {
			System.out.println("Hourly Paid Employee Object.");
		}
		else if(employee instanceof Employee)
		{
			System.out.println("employee object");
		}
		else
		{
			System.out.println("UNKNOWN OBJECT");
		}

	}

	public static void main(String[] args) {
		/*
		 * Scanner scanner=new Scanner(System.in); Employee employee=null; //dynamic
		 * method dispatching System.out.print("Enter ID: "); int id=scanner.nextInt();
		 * System.out.print("First Name: "); String firstName=scanner.next();
		 * System.out.print("Last Name: "); String lastName=scanner.next();
		 * System.out.print("email: "); String email=scanner.next();
		 * System.out.print("Department Name: "); String dName=scanner.next();
		 * System.out.print("Salary: "); double salary=scanner.nextDouble();
		 * System.out.print("RPH: "); double rate=scanner.nextDouble();
		 * System.out.print("What kind ofEmployee you want to create?(Regular/HPE) ");
		 * String choice=scanner.next(); Main main=new Main(); employee=new
		 * RegularEmployee(1, firstName, lastName, email, dName, salary);
		 * main.checkObject(employee); employee=new HourlyPaidEmployee();
		 * main.checkObject(employee); employee=new Employee();
		 *
		 * main.checkObject(employee);
		 *
		 *
		 * if(choice.equals("Regular")) { employee =new RegularEmployee(id, firstName,
		 * lastName, email, dName, salary);
		 * System.out.println(employee.displayDetails());
		 *
		 * } else if(choice.equals("HPE")) { employee=new HourlyPaidEmployee(id,
		 * firstName, lastName, email, lastName, rate);
		 * System.out.println(employee.displayDetails());
		 *
		 * } else { System.out.println("Invalid choice."); }
		 *
		 *
		 *
		 * switch (choice) { case "Regular": employee=new RegularEmployee(id, firstName,
		 * lastName, email, dName, salary);
		 * System.out.println(employee.displayDetails()); break; case "RPH":
		 * employee=new HourlyPaidEmployee(id, firstName, lastName, email, dName, rate);
		 * System.out.println(employee.displayDetails()); break; default:
		 * System.out.println("Invalid choice."); break; }
		 *
		 *
		 *
		 */

		Employee employees[] = new Employee[3];
		// Heterogeneous collection
		Main main = new Main();
		employees[0] = new Employee(1, "John", "Doe", "john@email.com", "CS");
		main.checkObject(employees[0]);
		employees[1] = new RegularEmployee(2, "Marry", "Public", "marry@email.com", "SALES", 12000);
		main.checkObject(employees[1]);
		employees[2] = new HourlyPaidEmployee(3, "Steve", "Peter", "steve@email.com", "ACCOUNT", 10.0);
		main.checkObject(employees[2]);

	}

}