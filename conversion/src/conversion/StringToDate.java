package conversion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class StringToDate {

	public static void main(String[] args) throws ParseException{
		// TODO Auto-generated method stub
		String sd="12/12/1999";
		Date date=new SimpleDateFormat("dd/MM/yyyy").parse(sd);
		System.out.println(date);

	}

}
