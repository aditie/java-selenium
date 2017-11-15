package java.sel.corejava.datast;


	/*
	 * @(#)HashMapQuestions.java 1.0 Nov 09, 2017
	 */

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

	/**
	 * <code>HashMapQuestions</code> class is  HashMap Questions
	 * <p>
	 * <p>
	 * <pre>
	 * <strong>History</strong>    Name              Date            Description
	 * <strong>History</strong>    --------------------------------------------------------------------
	 * <strong>History</strong>   Pratyush Giri    11/9/17
	 * </pre>
	 *
	 * @author Pratyush Giri
	 * @since Nov 09, 2017
	 */
	public class HashMapQuestions {
	    /**
	     * Takes a hashmap and then prints the HashMap.
	     * @param aMap a HashMap
	     */
		
		public static void Main(String[] args){
			
			HashMap<String,Integer> hm= new HashMap<String,Integer>();
			
			hm.put("Oranges", 100);
			hm.put("Apples", 100);
			hm.put("Flowers", 100);
			hm.put("Cakes", 100);
			hm.put("Melons", 100);
			hm.put("Tomatoes", 100);
			
			HashMap<String,Integer> hm2= new HashMap<String,Integer>();
		
			hm2.put("Spring", 100);
			hm2.put("Fall", 100);
			hm2.put("Winter", 100);
			hm2.put("Autumn", 100);
			
			HashMap<String,Integer> hm3= new HashMap<String,Integer>();
			
			
			/*Print a HashMap
			 * Copy it
			 * Remove duplicates
			 * Sort and Print
			*/
			System.out.println("Printing hm HashMap");
			print(hm);
			
			System.out.println("Printing hm2 HashMap after copying it to hm3");
			hm3=copy(hm);
			
			System.out.println("Verifying hm and hm2 match");
			System.out.println(match(hm,hm2));
			
			System.out.println("Verifying hm and hm3 match");
			System.out.println(match(hm,hm3));
			
		}
		
	    public static void print(HashMap aMap){
	        //todo write code to iterate and print in the format "key = $key, value = $value"
	    	HashMap<String, Integer> hMap= new HashMap<String, Integer>(aMap);
	    	for (String k : hMap.keySet()){
	    		System.out.print("key= "+k);
	    		System.out.println(",value= "+hMap.get(k));
	    		
	    	}
	    	
	    }

	    /**
	     * Copies the content of HashMap to another HashMap
	     * @param hm input hashmap
	     * @return a copy of the hashMap
	     */
	    public static HashMap copy(HashMap hm){
	        //todo copy to another hashmap
	    	HashMap<Object, Object> hMap=new HashMap<Object, Object>(hm);
	        return hMap;
	    }

	    /**
	     * This method removes any key that contains duplicate values.
	     * e.g., if a hashmap(key=value) contains {a=123, b=123, c=234}, then after the method, it will have
	     * {a=123, c=234}
	     * @param hm
	     */
	    public static void removeDuplicateValues(HashMap hm) {
	    	Map<Object,Object> tm=new TreeMap<Object,Object>(hm);

	    }

	    /**
	     * This method takes 2 hashMap and Checks if the keys and values are same in both hashmaps or not
	     * @param a first hash map
	     * @param b second hash map
	     * @return true or false
	     */
	    public static boolean  match(HashMap a, HashMap b){
	    	boolean result=false;
	    	result=(a.equals(b)? true :false) ;
	    		
	        return result;
	    }

	}

