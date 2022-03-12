/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9;

/**
 *
 * @author Yisacor
 */
import java.util.Scanner;
import java.io.*;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LinkedList WordList = readFile();
        printList(WordList);

    }

    public static LinkedList readFile() {
        LinkedList<String> wordList = new LinkedList<>();
        try {
            String words = "C:\\Users\\Yisacor\\OneDrive\\Desktop\\File\\cecs 277\\lab-9\\src\\lab\\pkg9\\words.txt";
            Scanner s = new Scanner(new File(words));
            while (s.hasNextLine()) {
                String data = s.nextLine();

                wordList = new LinkedList<>(Arrays.asList(data.split("\n")));
                ListIterator<String> iter = wordList.listIterator();
                moveIter(data, iter);
                //wordList.add(data);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("FILE NOT FOUND");
        }
        return wordList;
    }

    public static void printList(LinkedList<String> WordList) {
        ListIterator<String> iter;
        iter = WordList.listIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }

    public static void moveIter(String wordList, ListIterator<String> iter) {
        //LinkedList<String> newList = new LinkedList<>(Arrays.asList(wordList.split("\n"))); 
       // String greater  = iter.next();
        System.out.print(iter.next());
        ListIterator<String> curr = iter;
        String temp;
        
        while (iter.hasNext()) {
            //System.out.print(wordList);
            if (wordList.compareToIgnoreCase(iter.next()) < 0) {
                    iter.next(); 
            }
            else{
                   temp = iter.next();                   
            }
            
        }
        while (iter.hasPrevious()) {
            if (wordList.compareToIgnoreCase(iter.previous()) > 0) {
                iter.next();
            }
        }
        System.out.println();
    }
}
