package conversion;

public class IntToString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=10,j=20,k=30;
		String s=String.valueOf(i);
		String s1=Integer.toString(j);
		String s2=String.format("%d",k);
        System.out.println(s);
        System.out.println(s1);
        System.out.println(s2);
        
	}

}
