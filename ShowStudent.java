// ShowStudent.java
// client to test the Student class
 
class ShowStudent
{
public static void main (String args[])
{
Student pupil = new Student();
 
pupil.setHours(Integer.parseInt(args[0]));
pupil.setIDnumber();
pupil.setPoints(Integer.parseInt(args[1]));
pupil.showIDnumber();
pupil.showPoints();
pupil.showHours();
System.out.println("The grade point average is "
+ pupil.getGradePoint());
System.out.println(" ");
 
Student pupil2 = new Student();
pupil2.setHours(Integer.parseInt(args[2]));
pupil2.setIDnumber();
pupil2.setPoints(Integer.parseInt(args[3]));
pupil2.showIDnumber();
pupil2.showPoints();
pupil2.showHours();
System.out.println("The grade point average is "
+ pupil2.getGradePoint());
System.out.println(" ");
 
Student pupil3 = new Student();
pupil3.setHours(Integer.parseInt(args[4]));
pupil3.setIDnumber();
pupil3.setPoints(Integer.parseInt(args[5]));
pupil3.showIDnumber();
pupil3.showPoints();
pupil3.showHours();
System.out.println("The grade point average is "
+ pupil3.getGradePoint());
System.out.println(" ");
}
}
