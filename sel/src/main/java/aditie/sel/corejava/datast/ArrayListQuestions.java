package aditie.sel.corejava.datast;

import java.util.Collections;
import java.util.Iterator;

/*
 * @(#)ArrayListQuestions.java 1.0 Nov 08, 2017
 */

import java.util.List;

/**
 * <code>ArrayListQuestions</code> class is
 * <p>
 * <p>
 * <pre>
 * <strong>History</strong>    Name              Date            Description
 * <strong>History</strong>    --------------------------------------------------------------------
 * <strong>History</strong>   Pratyush Giri    11/8/17
 * </pre>
 *
 * @author Pratyush Giri
 * @since Nov 08, 2017
 */
public class ArrayListQuestions {
    /**
     * This method should check if the items in List A are same as List B. Here the order does no matter.
     * If list A has {"A", "B", "B", "C", "D"} and List B has {"B", "A", "D", "B", "C"}, then they are said to be the same list
     * Each of the A must be in B and each of B must be in A
     * @param listA the first list containing some items
     * @param listB the first list containing some items
     * @return true or false
     */
    public static boolean checkMatch(List listA, List listB){
        //TODO - Your code goes here
        if (listA==null || listB==null) {
            System.out.println("Null list! ");
            return false;
        }
        //System.out.println("Checking equals : "+listA +" " +listB);
        Collections.sort(listA);
        Collections.sort(listB);
        System.out.println("Checking equals : "+listA +" " +listB);
        return listA.equals(listB);
    }

    /**
     * Switches the order of values in an ArrayList of Integers in a pairwise fashion.
     * This method should switch the order of the first two values, then switch the order of the next two,
     * switch the order of the next two, and so on. For example, if the list initially stores these values:
     * {1, 2, 3, 4, 5, 6} your method should switch the first pair, 1, 2
     * the second pair, 3, 4, and the third pair, 5, 6, to yield this list: {2, 1, 4, 3, 6, 5}
     * If there are an odd number of values in the list, the final element is not moved.
     * For example, if the original list had been: {1, 2, 3, 4, 5, 6}  It would again switch pairs of values,
     * but the final value, 7 would not be moved, yielding this list:
     * {2, 1, 4, 3, 6, 5, 7}
     * @param list the list
     * @return the list with swapped pairs
     */
    public static void swapPairs(List list){

        System.out.println(" the list size is " + list.size() );
        //TODO code
        //Constraints: Do not use any other arrays, lists, or other data structures to help solve this problem,
        // though you can create as many simple variables as you like.
        if (list.equals(null) ) {
            System.out.println("Null list! ");
            }
        else if (list.isEmpty()) {
            System.out.println("Empty list! ");
            
            }
        else if ( (list.size()%2) != 0 ) {
            list.remove(list.size()-1);
            System.out.println(list.lastIndexOf("List's last Index is : "+list));
            }
        

        int count=0;
        Integer temp;
        for (Object i: list) {
             
            while(count<=list.size()-1){

            System.out.println("Swapping...: "+list.get(count)+" with "+list.get(count+1)+ " at Index: "+count+" and "+(count+1));

            temp=(Integer)list.get(count+1);
            list.set(count+1, list.get(count));
            list.set(count, temp);
            count+=2; }
            
            }

        }

    /**
     * This method accepts  an ArrayList of integers as a parameter, and removes any adjacent pair of integers in the
     * list if the left element of the pair is larger than the right element of the pair.
     * Every pair's left element is an even-numbered index in the list, and every pair's right element is an odd index
     * in the list. For example, suppose a variable named vec stores the following element values:
     * {3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1}
     * We can think of this list as a sequence of pairs: {3, 7, 9, 2, 5, 5, 8, 5, 6, 3, 4, 7, 3, 1}
     * The pairs 9-2, 8-5, 6-3, and 3-1 are "bad" because the left element is larger than the right one,
     * so these pairs should be removed. So the call of removeBadPairs(vec); would change the list to
     * store: {3, 7, 5, 5, 4, 7}. If the list has an odd length, the last element is not part of a pair and is also
     * considered "bad;" it should therefore be removed by your method. If an empty list is passed in,
     * the list should still be empty at the end of the call.
     * @param list list to remove bad pairs from.
     */
    public static void removeBadPairs(List<Integer> list){
        //todo - code
      

        if (list.equals(null)) {
            System.out.println("Null list! ");
            }
        else if (list.isEmpty()) {
            System.out.println("Empty list! ");
           
            }
        else if (!(list.size()%2==0)) {
            list.remove(list.size());
            System.out.println(list.lastIndexOf("List's last Index is : "+list));
            }
          System.out.println(list.lastIndexOf("List's last Index is : "+list));
          int count=0;
          Iterator itr=list.iterator();
          while (itr.hasNext()) {
            if ((Integer)itr.next()>(Integer)itr.next().next()){
                System.out.println("Removing...: "+list.get(count)+" "+list.get(count+1));
                itr.remove() ;
                itr.remove() ;
                count+=2;
                }
            else {System.out.println("Nothing to remove...: "+list.get(count)+" "+list.get(count+1));
            	count+=2;
            		}
            	}
    	}


}



