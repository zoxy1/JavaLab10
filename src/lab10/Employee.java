package lab10;

public class Employee {
    
    private String name="�� �������";
    private String position="�� �������";
    private int EmployeeID=1;
    private int level=1;
    static int busyID=1;
    
    public Employee() {
	EmployeeID=busyID++;
    }

    public String getName() {
	return name;
    }

    public void setName(String name) {
	
	if(name.contains("0")||name.contains("1")||name.contains("2")||name.contains("3")||name.contains("4")
	||name.contains("5")||name.contains("6")||name.contains("7")||name.contains("8")||name.contains("9")){    
	    System.out.println("\n��� �� ������ ��������� �����!");
	}
	else{
	    this.name = name; 
	}
    }

    public String getPosition() {
	return position;
    }

    public void setPosition(String position) {
	if(position.contains("0")||position.contains("1")||position.contains("2")||position.contains("3")||position.contains("4")
		||position.contains("5")||position.contains("6")||position.contains("7")||position.contains("8")||position.contains("9")){    
		    System.out.println("\n������������ ��������� �� ������ ��������� �����!");
		}
		else{
		    this.position = position; 
		}
    }

    public int getEmployeeID() {
	return EmployeeID;
    }

    public void setEmployeeID(int employeeID) {
	if(employeeID<=busyID&&employeeID>=1){
	System.out.println("\n������������� �����, ����������� ����� �� "+busyID+" �� 10000"); 
	}
	else{
	    if(employeeID>=1&&employeeID<=10000){
		EmployeeID = employeeID;
	    }
	    else{
		System.out.println("\n������������� ������ ���� �� 1 �� 10000");
	    }
	}
}

    public int getLevel() {
	return level;
    }

    public void setLevel(int level) {
	if(level>=1&&level<=3){
	this.level = level;
	}
	else{
	    System.out.println("\n������� ������ ���� �� 1 �� 3");
	}
    }
public void displayInformation(){
    
    System.out.println("\n��� ����������:"+name+", �������:"+position+", �������������:"+EmployeeID+", �������:"+level);
}

}
