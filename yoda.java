import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class yoda {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(System.in);
		Scanner sc1 = new Scanner(new File("subject.txt"));
		Scanner sc2 = new Scanner(new File("verb.txt"));
		Scanner sc3 = new Scanner(new File("verb.txt"));

		
		String sentence = scanner.nextLine();
		String[] parts = sentence.split(" ");
		String subject = null;
		String verb = null;
		boolean checkThird = false;
		
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
		    } else if (!line2.equalsIgnoreCase(parts[1])) {
		    	subject = subject + " " + parts[1];
		    	checkThird = true;
		    	break;
		    }
		}
		
		if (checkThird) {
			while (sc3.hasNextLine()) {
				String line3 = sc3.nextLine();
				
			    if (line3.equalsIgnoreCase(parts[2])) {
			    	verb = parts[2];
			    }
			}
		}
		
		if (subject == null || verb == null) {
			System.out.println(sentence);
		}
		
		try {
			
			/*System.out.println(subject);
			System.out.println(verb);*/
			
			String t1 = sentence.replaceFirst(subject, "");
			String t2 = t1.replaceFirst(verb, "");
			
			System.out.println(t2.trim() + ", " +  subject + " " + verb);
			
		} catch (Exception e) {
			
		}

		
		
		scanner.close();	
		sc1.close();
		sc2.close();
		sc3.close();
	}
}
