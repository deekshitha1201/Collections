import java.util.*;
public class collectionsmethods{
	public static void main(String[] args) {
	    ArrayList<Integer>a=new ArrayList<>();
	    a.add(10);
	    a.add(20);
	    a.add(30);
	    a.add(40);
	    a.add(50);
	    System.out.println("Before swapping");
		System.out.println(a);
		System.out.println("after swapping");
		Collections.swap(a,2,4);
		System.out.println(a);
		System.out.println(Collections.max(a));
		System.out.println(Collections.min(a));	
		Collections.reverse(a);
		System.out.println("reverse:"+a);
		Collections.replaceAll(a,20,30);
	    System.out.println("replace:"+a);
	    Collections.rotate(a,3);
	    System.out.println("rotate:"+a);
	    Collections.shuffle(a);
	    System.out.println("shuffle:"+a);
		
	   	}
}
