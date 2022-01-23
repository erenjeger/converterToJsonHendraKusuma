package main;

import java.util.Scanner;

public class App {

	public static void main(String[] args) throws Exception {

		Engine eng = new Engine();
		Scanner input = new Scanner(System.in);
		
		System.out.println("Apa yang akan anda lakukan?");
		System.out.println("Mengkonversi menjadi file json");
		System.out.println("Mengkonversi menjadi file text");
		String s =  input.nextLine();
		switch(s) {
		  case "Mengkonversi menjadi file json":
			//	eng.changeToJson("src/data/hello_unicode.txt", "src/data/hello.txt"); path in my pc
			  eng.changeToJson("/var/log/nginx/error.log", "/var/log/nginx/error.text" );
			  break;
		  case "Mengkonversi menjadi file text":
			
			  eng.chengeToText();
			  break;
		}
	
	

	}

}
