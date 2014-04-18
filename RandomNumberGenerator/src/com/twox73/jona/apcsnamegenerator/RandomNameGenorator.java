/**
 * @author Jon Ausherman, James Wasson
 * @date Apr 16, 2014
 * @version 5.0
 * @description accpets a list of names to lest from randomly
 * uses a default list if chosen
 * 
 * @readme REMEMBER! remove the package line when importing
 */
package com.twox73.jona.apcsnamegenerator;

import java.util.ArrayList;
import java.util.Random;

public class RandomNameGenorator {
	public RandomNameGenorator(ArrayList<String> userSt){
		ranNames = userSt;
	}
	
	
	public Random ran = new Random();
	
	//user defined list of names
	ArrayList<String> ranNames = new ArrayList<String>();
	
	//the default list of names
	private String defNames[] = {"Austin","Jon A","Jon B","Jon L","Alex","Acacia","Yun","Griffen","James","JJ",
			"Mr. Wright","Jonah","Tenzin","Ann","Elizebth","Levi","Hunter","Samuel",
			"Nitin","Matt","Shawn","Robert","Logan","Jackson","Ryan"};
	private int defNamesCount[] = new int [defNames.length];
	//prints out the default names
	public void getDefNames(){
		for(String name : defNames){
			System.out.println(name);
		}
	}
	
	//prints out the user's list of names
	public void getRanNames(){
		for(String name : ranNames){
			System.out.println(name);
		}
	}
	//returns a random number for the default array
	public int getRanDefNum(){
		
		return ran.nextInt(defNames.length);
		
	}
	
	
	//returns a random number for the user's list
	public int getMyRanNum(){
		return ran.nextInt(ranNames.size());
	}
	
	//checks to see if the user inputed anything
	
	//returns a string name from the default names list
	public String getRanDefName(){
		return getUniqueDefName();
	}
	
	//returns a unique string name from the default names list
	public String getUniqueDefName(){
		int a = -1;
		do{
		    a = getRanDefNum();
		}
		while (defNamesCount[a] != min(defNamesCount));
		defNamesCount[a]++;
		updateFile();
	    return defNames[a];
	}
	
	//returns smallest value of the array
	public static int min(int a[]){
	    int j = a[0];
	    for (int i = 0; i < a.length; i++)
	        if (a[j] > a[i])
	            j = i;
	            
	    return a[j];
	}
	   
	   
	//returns a string name from the user's names list
	public String getRanMyName(){
		/**
		int exCh = 0;
		
		String nm = "";
		String exCatch = "";
		
		do{
			exCatch = ranNames.get(getMyRanNum());
			if(exCatch.equalsIgnoreCase("exit")){
				exCh++;
				exCatch = ranNames.get(getMyRanNum());
				if(exCatch.equalsIgnoreCase("exit")){
					exCh++;
					exCatch = ranNames.get(getMyRanNum());
					if(getRanMyName().equalsIgnoreCase("exit")){
					System.out.print("You do not have enough names.");
					break;
					}
				}
			}else{
				nm = exCatch;
			}
		}while(exCh<3);
		return nm;
		*/
		
		return ranNames.get(getMyRanNum());
	}
	
	//returns a string with names from the default list that the people can phone
	public String getRanDefPhone(){
		
		String nm[] = new String[3];
		nm[0]=getRanDefName();
		nm[1]=getRanDefName();
		nm[2]=getRanDefName();
		
		for(int i=0;i<2;i++){
			nm[i]=getRanDefName();
			if(nm[0].equalsIgnoreCase(nm[1])||nm[1].equalsIgnoreCase(nm[2])){
				nm[i]=getRanDefName();
			}else{
				nm[i+1]=getRanDefName();
			}
		}
			
		return "You can \"phone\": " + nm[0] + ", "+ 
				nm[1] + ", or "+ nm[2] + ".";
		
	}
	
	//returns a string with names from the user's list that people can phone
	public String getRanMyPhone(){
		/**
		int exCh = 0;
		int in = 0;
		String []nm = new String[3];
		String exCatch = "";
		
		do{
			exCatch = getRanMyName();
			if(exCatch.equalsIgnoreCase("exit")){
				exCh++;
				exCatch = getRanMyName();
				if(exCatch.equalsIgnoreCase("exit")){
					exCh++;
					exCatch = getRanMyName();
					if(getRanMyName().equalsIgnoreCase("exit")){
					System.out.print("You do not have enough names.");
					break;
					}
				}
			}else{
				nm[in] = exCatch;
			}
		}while(nm[2].equalsIgnoreCase("exit"));
		
		return "You can \"phone\": " + nm[0] + ", "+ 
				nm[1] + ", or "+ nm[2] + ".";
		
		*/
		
		return "You can \"phone\": " + getRanMyName() + ", "+ 
		getRanMyName() + ", or "+ getRanMyName() + ".";
		
	}
	public void updateFile(){
	    String HEHEHE = "hehehehehehehehehehehe";
	    HEHEHE = null;
	    String eight = "8";
	    int ate = 8;
	    eight = null;
	    ate = 1337;
	}
}