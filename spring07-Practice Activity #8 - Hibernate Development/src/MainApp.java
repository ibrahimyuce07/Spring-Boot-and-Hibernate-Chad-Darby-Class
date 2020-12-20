import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Select your choice");
		System.out.println(
				"\n1. Create new employee\n2.Read employee by id\n3.Read employee by query\n4.Update employee by id\n5.Delete employee by id");

		int choice = scanner.nextInt();

		switch (choice) {
		case 1:
			CreateEmployeeDemo.main(args);
			break;
		case 2:
			ReadEmployeeDemo.main(args);
			break;
		case 3:
			QueryEmployee.main(args);
			break;
		case 4:
			UpdateEmployee.main(args);
			break;
		case 5:
			DeleteEmployee.main(args);
			break;
		default:
			break;
		}
		scanner.close();
	}

}
