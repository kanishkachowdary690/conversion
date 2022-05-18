package conversion;

public class Tester {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		A obj=new A();
       Integer i=Integer.parseInt(obj.s);
       Integer j=Integer.valueOf(obj.s);
        System.out.println(i);
        System.out.println(j);
	}

}
class A{
	public String s="hello";
}