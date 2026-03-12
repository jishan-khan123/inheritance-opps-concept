
class student{

String name;
int age;
int roll;
int marks;
String grade;




void display(){
    System.out.println("Name: " + name );
    System.out.println("age: " + age );
    System.out.println("roll: " + roll);
    System.out.println("marks: " + marks);
    System.out.println("Grade: " + grade);
}

}

public class oops_08 {
public static void main(String[] args){

student s1 = new student();  // object
student s2 = new student();  // object
student s3 = new student();  // object

s1.name = "jishan";
s1.age = 21;
s1.roll = 4010;
s1.marks = 450;
s1.grade = "A+";
s1.display();
        
System.out.println("this is second student data ");

s2.name = "Rihan";
s2.age = 22;
s2.roll = 4036;
s2.marks = 445;
s2.grade = "B+";
s2.display();

System.out.println("this is third student data ");

s3.name = "Aman";
s3.age = 18;
s3.roll = 4038;
s3.marks = 425;
s3.grade = "C+";
s3.display();


    }
}
