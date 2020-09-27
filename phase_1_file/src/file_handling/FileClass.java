package file_handling;

import java.util.Scanner;

import java.io.File;

import java.io.BufferedWriter;
import java.io.FileWriter;
	import java.io.IOException;
	

	public class  FileClass {

		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int   c;
			System.out.println("Welcome to FMS 1.0");
			
			do {
				System.out.println("press 1 for file insertion");
				System.out.println("press 2 for file deletion ");
				System.out.println("press 3 for file searching");
				System.out.println("press 4 to continue");
				System.out.println("press 0 to exit the application ");
				c= scanner.nextInt();
				switch (c) {
				case 1 : System.out.println("enter the name of file to be created");	
				String filename =scanner.next() ;
				filename = filename.concat(".txt");
				System.out.println(filename);
				
				try(FileWriter fw=new FileWriter(filename);
						
						BufferedWriter bw=new BufferedWriter(fw);
						){
					System.out.println("your file created successfully");
					System.out.println("enter the data to be written on file");
					String inputString = scanner. next();
					
					bw.write(inputString);
				
					System.out.println("Messages written to file successfully");
					
				} catch (IOException e) {
					System.out.println(e);
				}
				break;
				case 2 :System.out.println("enter the name of the file to be deleted");
				String fn = scanner.next();
				fn = fn.concat(".txt");
				System.out.println(fn);
				File myObj = new File(fn); 
				if (myObj.delete()) { 
				      System.out.println("Deleted the file: " + myObj.getName());
				    } else {
				      System.out.println("Failed to delete the file.");
				    } 
				break;
			//default:System.out.println("invalid choices...please go to main menu");
				}
			} while(c==0);
				
			
			
			
			
		}

	}
