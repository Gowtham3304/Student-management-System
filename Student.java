import java.util.Scanner;
class Student 
{
int id;
String name;
String college;
void getInfo(int id, String name, String college) 
{
this.id = id;
this.name = name;
this.college = college;
}
void print() 
{
System.out.println("\t" +this.id+ "\t" +this.name+ "\t" +this.college);
}
void setId(int id) 
{
this.id = id;
}
void setName(String name) 
{
this.name = name;
}
void setCollege(String college) 
{
this.college = college;
}
void dispId()
{
System.out.println(this.id+"\n");
}
void dispName()
{
System.out.println(this.name+"\n");
}
void dispCollege()
{
System.out.println(this.college+"\n");
}
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
Student[] stu = new Student[50];
int n = 0;
int sum=0;
System.out.println("Welcome to student info");
int x = 1;
while (x != 0) 
{
System.out.println("Options for the student Record\n0. Exit\n1. Create\n2. View\n3. Edit");
x = sc.nextInt();
if (x == 1) 
{
System.out.println("Enter the number of Students");
n = sc.nextInt();
for (int i = sum; i <n+sum; i++) 
{
System.out.println("Enter the Student "+(i+1)+" id:");
int id = sc.nextInt();
System.out.println("Enter the Student "+(i+1)+" name:");
String name = sc.next(); 
System.out.println("Enter the College"+(i+1)+" Name:");
String college = sc.next();
Student s1 = new Student();
s1.getInfo(id, name, college);
stu[i] = s1;
}
sum=sum+n;
}
if (x == 2) 
{
System.out.println("Enter the data to be displayed \n1.Id\n2.Name\n3.College\n4.All Data");
int q=sc.nextInt();
if(q==1)
{
for (int i = 0; i < sum; i++)
{
stu[i].dispId();
}
}
if(q==2)
{
for (int i = 0; i < sum; i++)
{
stu[i].dispName();
}
}
if(q==3)
{
for (int i = 0; i < sum; i++)
{
stu[i].dispCollege();
}
}
if(q==4)
{
for (int i = 0; i < sum; i++)
{
System.out.println("\tID\tName\tCollage" );
stu[i].print();
}
}
}
if (x == 3)
{
System.out.println("Enter the student id to be changed");
int y = sc.nextInt();
int count=0;
for (int i = 0; i < sum; i++) 
{
if (stu[i].id == y)
{
count++;
System.out.println("Enter the data to be changed: 1. ID 2. Name 3. College 4.Exit");
int z = sc.nextInt();
if (z == 1)
{
System.out.println("Enter the new ID:");
int newId = sc.nextInt();
stu[i].setId(newId);
}
if (z == 2)
 {
System.out.println("Enter the new name:");
String newName = sc.next();
stu[i].setName(newName);
}     
if (z == 3)
 {
System.out.println("Enter the new college:");
String newCollege = sc.next();
stu[i].setCollege(newCollege);
} 
if(z==4)
{
System.out.println("Enter a valid input");
}
}
}
if (count==0) 
{
System.out.println("Student with ID " + y + " not found.");
}
}if (x == 0) 
{
break;
} 
if(x>3)
{
System.out.println("Enter a valid option");
}
}
System.out.println("Thank you for the experience");
}
}
                                                             
