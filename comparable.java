import java.util.*;
class Student implements Comparable<Student>
  {
    int id;
    public Student(int id){
      this.id=id;
    }
    public String toString(){
      return "id:"+id;
    }
    public int compareTo(Student o){
      return o.id-this.id;
    }
    }
public class comparable
{
  public static void main(String[] args){
    Student s=new Student(101);
    Student s1=new Student(102);
    Student s2=new Student(103);
    ArrayList<Student> a=new ArrayList<Student>();
    a.add(s);
    a.add(s1);
    a.add(s2);
    System.out.println("after sorting:");
    for(Student e:a)
      {
        System.out.println(e);
      }
    
  }
}  