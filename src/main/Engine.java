package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Engine {

	public List<String> readEachLine(String path) throws Exception {

		List<String> list = new ArrayList<String>();

		Path p = Paths.get(path);

		BufferedReader rd = Files.newBufferedReader(p);

		while (true) {
			String line = rd.readLine();
			if (line == null) {
				break;
			}
			list.add(line.toLowerCase());
		}

		return list;
	}


	public void changeToJson(String copyFrom, String writeTo) throws Exception {

	
		List<String> line = readEachLine(copyFrom);

		
		FileWriter myWriter = new FileWriter(writeTo);

		
		int no = 1;

		
		myWriter.write("{" + "\r\n");

		for (String ln : line) {
			myWriter.write("\"" + no + "\"" + " : " + "\"" + ln + "\"," + "\r\n");
			no++;
		}

		
		myWriter.write("{" + "\r\n");

		myWriter.close();
		File file = new File("src/data/hello.txt");
		 Scanner sc = new Scanner(file);
		 
		    while (sc.hasNextLine())
		      System.out.println(sc.nextLine());
		  

	}
	public void chengeToText() throws FileNotFoundException {
		
		File file = new File("/var/log/nginx/error.log");
		 Scanner sc = new Scanner(file);
		 
		    while (sc.hasNextLine())
		      System.out.println(sc.nextLine());
		  }

}
