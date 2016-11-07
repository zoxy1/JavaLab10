package lab10;
public class EmployeeTest {
   
  public static void main (String args[]) {
 
  Editor myEditor = new Editor();
  GraphicIllustrator myGI = new GraphicIllustrator();
  TechnicalWriters myTW = new TechnicalWriters();
  Manager myManager = new Manager();

  myEditor.setName("Fred Hanson");
  myEditor.setPosition("Editor");
  myEditor.getEmployeeID();
  myEditor.setLevel(1);
  myEditor.setSkill("technical editing");
  myEditor.setSkill("typing");
  myEditor.setEditType(false);
  myEditor.displayInformation();

  myGI.setName("Sara Smith");
  myGI.setPosition("Graphic Illustrator");
  myGI.getEmployeeID();
  myGI.setLevel(3);
  myGI.setSkill("technical illustration");
  myGI.setSkill("video production");
  myGI.setSkill("media authoring");
  myGI.displayInformation();

  myTW.setName("James Ralph");
  myTW.setPosition("Technical Writer");
  myTW.getEmployeeID();
  myTW.setLevel(1);
  myTW.setSkill("technical writing");
  myTW.displayInformation();

  myManager.setName("Susan Smith");
  myManager.setPosition("Manager");
  myManager.getEmployeeID();
  myManager.setLevel(2);
  myManager.addListEmployees(myEditor);
  myManager.addListEmployees(myGI);
  myManager.addListEmployees(myTW);
  myManager.displayInformation();
  
  } 
}
