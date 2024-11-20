package hrank;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.Calendar;

class Result {

	public static String findDay(int year, int month, int day) {

//		String s = "";
//        LocalDate date = LocalDate.of(year, month, day);
//		System.out.println(date);
//		DayOfWeek days = date.getDayOfWeek();
//		System.out.println(days);
//		s = days.toString();
//
//		System.out.println(s);
//		return s;
		
//		   LocalDate l = LocalDate.of(year, month, day);
//	        String s =l.getDayOfWeek().toString();
//	        System.out.println(s);
//	        return s;
		  Calendar calendar = Calendar.getInstance();
	        calendar.set(year, month - 1, day);

	        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
	        return sdf.format(calendar.getTime()).toUpperCase();

	}

}

public class getDayofdate {
	public static void main(String[] args) throws IOException {
		 BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int month = Integer.parseInt(firstMultipleInput[0]);

        int day = Integer.parseInt(firstMultipleInput[1]);

        int year = Integer.parseInt(firstMultipleInput[2]);

		String res = Result.findDay(2023,10,24);

		 System.out.print(res);
//        bufferedWriter.write(res);
//        bufferedWriter.newLine();

		// bufferedReader.close();
		// bufferedWriter.close();
	}
}
