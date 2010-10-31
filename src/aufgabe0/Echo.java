package aufgabe0;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class Echo {
	
	private PrintStream out;
	private BufferedReader in;
	

	public Echo(PrintStream out, BufferedReader in) {
		this.out = out;
		this.in = in;
	}
	
	private void print(String arg){
		this.out.println(arg);
	}

	private String invert(String arg){
		StringBuffer tmp = new StringBuffer(arg);
		tmp.reverse();
		String result = tmp.toString();
		return result;
	}
	
	private String read() throws IOException{
		return this.in.readLine();
	}
	
	public void loop(){
		
		while(true) {
			
			try {
				String tmp = read();
				if(tmp.equalsIgnoreCase("exit"))
					break;
				String result = invert(tmp);
				print(result);
			} catch (IOException e) {
				print("error in loop");
				return;
			}
			
		}
		
		print("leaving loop");
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Echo echo = new Echo(System.out, new BufferedReader(new InputStreamReader(System.in)));
		echo.loop();
	}

}
