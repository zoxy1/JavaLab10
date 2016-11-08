package lab10;

public class TechnicalWriters extends Employee {

	private StringBuffer skill = new StringBuffer();
	private StringBuffer editors = new StringBuffer();
	public TechnicalWriters() {

	}

	public String getSkill() {
		return skill.toString();
	}

	public void setSkill(String skill) {
		if (skill.contains("0") || skill.contains("1") || skill.contains("2") || skill.contains("3") || skill.contains("4") || skill.contains("5") || skill.contains("6") || skill.contains("7") || skill.contains("8") || skill.contains("9")) {
			System.out.println("\nНаименование навыка не должно содержать цифр!");
		} else {
			if (this.skill.length() == 0) {
				this.skill.append(skill);
			} else {
				this.skill.append(", " + skill);
			}
		}

	}
	public void setEditors(String editors) {

		if (this.editors.length() == 0) {
			this.editors.append(editors);
		} else {
			this.editors.append(", " + editors);
		}

	}

	public StringBuffer getEditors() {
		return editors;
	}
	public void displayInformation() {
		super.displayInformation();
		System.out.print("Навыки:" + skill.toString());
		System.out.print("\nПредпочитает редакторы:" + editors.toString());
	}
}
