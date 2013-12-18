import java.io.*;

public class in2post {
	char temp;
	
	myqueue startq = new myqueue();
	myqueue endq = new myqueue();
	mystack thestack = new mystack();
	
	public void process() throws Exception{
		
		FileReader a = new FileReader("stuff");
		BufferedReader in = new BufferedReader (a);
		
		while(in.ready() && temp != ';'){
			temp = (char) in.read();
			startq.add2rear(temp);
			startq.printq();
			if(temp == ';') processstartq();
		}
		
	}
	
	public void processstartq() {
		System.out.println("got to here");
		char val;
		while(!startq.ismtq()) {
			val = startq.remove();
			if(val >= 'A' && val <= 'Z') {
				endq.add2rear(val);
			}
			else{
				thestack.push(val);
			}
			
		}
		while(!thestack.ismt()) {
			temp = thestack.pop();
			endq.add2rear(temp);
		}
		endq.printq();
	}
}
