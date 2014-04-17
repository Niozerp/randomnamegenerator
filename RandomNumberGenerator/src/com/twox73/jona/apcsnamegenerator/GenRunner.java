/**
 * @author Jon Ausherman
 * @date Apr 16, 2014
 * @version 4.5
 */
package com.twox73.jona.apcsnamegenerator;

import java.util.ArrayList;
import java.util.Scanner;



public class GenRunner {

	
	public static void main(String[] args) {
		//some sort of loop would be used here but i'm not testing the user portion
		//here you can add escape statements and what have you
		ArrayList<String> gen = new ArrayList<String>();
		Scanner scn = new Scanner(System.in);
		String name = "";
		String dummy = "";
		
		do{
			System.out.print("Enter a name (enter \"exit\" to finish adding names): ");
			name = scn.nextLine();
			if(!name.equalsIgnoreCase("exit"));{
				dummy = name;
				gen.add(name);
			}
			
		}while(!name.equalsIgnoreCase("exit"));
		
		RandomNameGenorator nameList = new RandomNameGenorator(gen);
		
		do{
			System.out.print("enter d for default list, or m for your list (type exit to end program). ");
			name=scn.next();
			if(name.equalsIgnoreCase("d")){
				System.out.println(nameList.getRanDefName());
				System.out.print(nameList.getRanDefPhone()+"\n");
			}else if(name.equalsIgnoreCase("m")){
				System.out.println(nameList.getRanMyName());
				System.out.println(nameList.getRanMyPhone()+"\n");
			}
			
		}while(!name.equalsIgnoreCase("exit"));
		
		
	}

}
