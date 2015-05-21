package gmit;
import java.util.*;

import javax.swing.*;

public class listExample {

	public static void main(String[] args) {
		
		// Declare and initialise the ArrayList with Name Values
		List<String> list1 = new ArrayList<String>();
		
		list1.add(new String("Will"));
		list1.add(new String("John"));
		list1.add(new String("James"));
		list1.add(new String("Frank"));
		list1.add(new String("Fred"));
		list1.add(new String("Jake"));
		list1.add(new String("Winston"));
		list1.add(new String("Wally"));
		list1.add(new String("Karen"));
		list1.add(new String("Mary"));
		list1.add(new String("Michelle"));
		list1.add(new String("Micheal"));
		list1.add(new String("Mick"));
		list1.add(new String("Valdez"));
		
		// Print to Screen the Arraylist Size and the Contents
		JOptionPane.showMessageDialog(null, "ArrayList has " + list1.size() + " Names");
		JOptionPane.showMessageDialog(null, "Here is the List " + list1);
		
		// Search for a name in the list
		String name = JOptionPane.showInputDialog(null, "Search for a Name");
		
		// Calls the method, see below
		findNameAndindex(list1, name);
		
	} // End main
	
	
	// Method passes a List of type string and a String name as parameters
	// Looks for the users input to see if it's present in the list, if it's not, then return 'Not Found'
	public static void findNameAndindex(List<String> list1, String name){
		boolean found = false;
		for(String s: list1){
			if(s.contains(name)){
				JOptionPane.showMessageDialog(null,"Found " + s + " at index " + list1.indexOf(name));
				found = true;
			}		
		}
		if(!found)
			JOptionPane.showMessageDialog(null, "Name not found");
		
	}// End findNameAndindex
	
} // End class listExample