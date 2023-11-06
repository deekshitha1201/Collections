import java.util.*;
class employee {
    String name;
    int id;
   public employee(String name,int id){
      this.name=name;
      this.id=id;
    }
    public String toString(){
      return "empoloyee= [name=" +name+ ",id=" +id+ "]";
    }
class Sortbyname implements Comparator<employee>{
    public int compare(employee o1,employee o2){
      return o2.name.compareTo(o1.name);
    }
} }
public class comparator{
	public static void main(String[] args) {
	    employee e=new employee("purnima",25);
	    employee e1=new employee("hanshi",30);
	    employee e2=new employee("deekshu",20);
	   TreeSet<employee> a=new TreeSet<employee>(new Sortbyname());
	    a.add(e);
	    a.add(e1);
	    a.add(e2);
	    for(employee p:a){
		  System.out.println(p);
	    }
  }}
  