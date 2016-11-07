package lab10;

public class Editor extends Specialist{
    
	private boolean EditType;
    	
	
	public Editor() {
	
    }
    public boolean getEditType() {
	return EditType;
    }
    public void setEditType(boolean editType) {
	this.EditType = editType;
    }
    public void displayInformation(){
	super.displayInformation();    
	if(EditType==true){
	    System.out.print(", предпочитает электронное редактирование");
	}
	else{
	    
	}
	System.out.print(", предпочитает бумажное редактирование");
	}
}
