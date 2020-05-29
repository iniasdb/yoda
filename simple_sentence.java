import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class simple_sentence {
	
	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		Scanner sc1 = new Scanner(new File("subject.txt"));
		Scanner sc2 = new Scanner(new File("verb.txt"));

		
		String sentence = scanner.nextLine();
		String[] parts = sentence.split(" ");
		String subject = null;
		String verb = null;
		
		/*for (int i = 0; i < parts.length; i++) {
			System.out.println(parts[i]);
		}*/
		
				
		while (sc1.hasNextLine()) {
			String line = sc1.nextLine();
			
		    if(line.equalsIgnoreCase(parts[0])) { 
		        subject = parts[0];
		    }
		}
		
		while (sc2.hasNextLine()) {
			String line2 = sc2.nextLine();
			
		    if (line2.equalsIgnoreCase(parts[1])) {
		    	verb = parts[1];
		    }
		}
		
		if (subject == null || verb == null) {
			System.out.println(sentence);
		}
		
		try {
			
			String t1 = sentence.replaceFirst(subject, "");
			String t2 = t1.replaceFirst(verb, "");
			
			System.out.println(t2.trim() + ", " +  subject + " " + verb);
			
		} catch (Exception e) {
			
		}

		
		
		scanner.close();	
		sc1.close();
		sc2.close();
	}
}
