import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class practiceClass {

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args)  {
		File file = new File("practiceFile");
		Scanner scan = null;
		String name = " ";
		try {
			scan = new Scanner(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		while(scan.hasNext()){
			name = scan.nextLine();
			System.out.println(name + " ");
			
		}
	}
}


