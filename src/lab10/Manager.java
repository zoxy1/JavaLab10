package lab10;

public class Manager extends Employee{
    
    private StringBuffer listEmployees=new StringBuffer();
    
    public Manager() {
	
    }
    public String getlistEmployees(){
	return listEmployees.toString();
    }
    
    
    public void addListEmployees(Employee emp){
	if(this.listEmployees.length()==0){
	    this.listEmployees.append(emp.getName());    
	}
	else{
	    this.listEmployees.append(", "+emp.getName());     
	}
	
    }
    
    public void displayInformation(){
	super.displayInformation();    
	System.out.print("Cписок починенных у менеджера:"+listEmployees.toString());
	}
}
