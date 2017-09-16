package chapter2;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Sourav Suman
 */
public class GroceryList {

    public static void main(String[] args) {
    	ArrayList<String> groceryList = new ArrayList<>();
    	groceryList.add("A");
    	groceryList.add("B");
    	groceryList.add("C");
    	groceryList.add("D");
    	groceryList.add("E");
    	groceryList.add("F");
    	
    	ArrayList<String> extraList = new ArrayList<String>();
    	
    	extraList.add("X");
    	extraList.add("Y");
    	extraList.add("Z");
    	
    	groceryList.addAll(extraList);
    	System.out.println(groceryList);
    	Iterator<String> itr = groceryList.iterator();
    	if(groceryList.contains("E")){
    		groceryList.remove("E");
    	}
    	/*while (itr.hasNext()) {
			if(itr.next().equals("E")){
				itr.remove();
			}
		}*/
    	System.out.println(groceryList);
    }
    
}
