package hrank;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class Currency {

	public static void main(String[] args) {
		
		Scanner u=new Scanner(System.in);
		double payment=u.nextDouble();
		 NumberFormat formatUS = NumberFormat.getCurrencyInstance(Locale.US);
	        String us = formatUS.format(payment);
	        
	        Locale localeIndia = new Locale("en","IN");
	        NumberFormat formatIndia = NumberFormat.getCurrencyInstance(localeIndia);
	        String india = formatIndia.format(payment);

	        
	        NumberFormat formatChina = NumberFormat.getCurrencyInstance(Locale.CHINA);
	        String china = formatChina.format(payment);
	        
	        NumberFormat formatFrance = NumberFormat.getCurrencyInstance(Locale.FRANCE);
	        String france = formatFrance.format(payment);
	        
	     
	        
	        System.out.println(us+" "+india+" "+china+" "+france);
	        
	}

}
