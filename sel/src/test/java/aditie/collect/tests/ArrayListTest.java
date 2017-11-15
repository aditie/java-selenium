package aditie.collect.tests;

/*
 * @(#)ArrayTest.java 1.0 Nov 08, 2017
 */

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import aditie.sel.corejava.datast.ArrayListQuestions;

/**
 * <code>ArrayTest</code> class is
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
public class ArrayListTest {
    public static void main(String[] args){

        System.out.println("Should be false : "
                + ArrayListQuestions.checkMatch(getArrayList(23), getArrayList (34)));


        List a = getArrayList(30);
        Collections.reverse(a);
        System.out.println("Should be true : "
                + ArrayListQuestions.checkMatch(getArrayList(30), a));


        System.out.println("Should be false : "
                + ArrayListQuestions.checkMatch(getArrayList(23,9), getArrayList (23,10)));




        List<Integer> swapperList = getArrayList(1000);
        System.out.println("Before swap: ");
        for (Integer i : swapperList){
            System.out.println(i);
        }
        System.out.println("-----------------------");

        ArrayListQuestions.swapPairs(swapperList);
        System.out.println("Before swap: ");
        for (Integer i : swapperList){
            System.out.println(i);
        }
        System.out.println("-----------------------");
        
        List<Integer> intList = new ArrayList();

        intList.add(3);
        intList.add(7);
        intList.add(9);
        intList.add(2);
        intList.add(5);
        intList.add(5);
        intList.add(8);
        intList.add(5);
        intList.add(6);
        intList.add(3);
        intList.add(4);
        intList.add(7);
        intList.add(3);
        intList.add(1);



        ArrayListQuestions.removeBadPairs(intList);
        for (Integer i : intList){
            System.out.println(i);
        }
        System.out.println("-----------------------");


    }

    public static List<Integer> getArrayList(int startNumber, int howMany) {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 1; i <=5; i++) {
            result.add(startNumber+i);
        }
        return result;
    }

    public static List<Integer> getArrayList(int startNumber) {
        return getArrayList( startNumber, 10);
    }

}



