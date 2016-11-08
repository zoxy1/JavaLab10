package lab10;

import java.util.ArrayList;

public class Manager extends Employee {

	private ArrayList<Employee> listEmployees = new ArrayList<>();

	public Manager() {

	}

	public String getlistEmployees() {

		return listEmployees.toString();
	}

	public void addListEmployees(Employee emp) {

		this.listEmployees.add(emp);

	}

	public void displayInformation() {
		super.displayInformation();
		System.out.print("Cписок починенных у менеджера:");

		for (int i = 0; i < listEmployees.size(); i++) {
			if (i == 0) {
				System.out.print(listEmployees.get(i).getName());
			} else {
				System.out.print(", " + listEmployees.get(i).getName());
			}
		}

	}
}
