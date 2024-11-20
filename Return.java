package twopointercodingakka;

public class Return {

	public static void main(String[] args) {

//		    for (int i = 0; i < 10; i++) {
//		        if (i == 5) {
//		            return; // Exits the method when i == 5
//		        }
//		        System.out.println(i);
//		    }
//		    System.out.println("This won't be printed if i == 5");

		String srk = "Shahrukh Khan, also known by the initialism SRK, is an Indian actor and film producer who works in Hindi cinema. Referred to in the media as the \"Baadshah of Bollywood\" and \"King Khan\", he has appeared in more than 100 films, and earned numerous accolades, including 14 Filmfare";

		String regex = "[,\\.\\s]";

		String s[] = srk.split(regex);
		
		
		System.out.println(s.length);
	}

}
