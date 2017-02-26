//Sukwhan Youn


import java.util.Scanner;
import java.lang.String;
import java.lang.Character;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;


public class Palindrome{
  public static boolean isPalindrome(String s){
    Character[] sArray = new Character[s.length()];
    Stack<Character> sStack = new Stack<Character>();
    Queue<Character> sQueue = new LinkedList<Character>();
    
    for (int j=0;j<s.length();j++){
      sStack.push(s.charAt(j));
      sQueue.add(s.charAt(j));
    }
    while (!sStack.isEmpty() && !sQueue.isEmpty()){
      if (sStack.pop() != sQueue.poll()){
        return false;
      }
    }
    return true;
  }
    
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    String newInput = scan.nextLine();
    newInput = newInput.replace(" ","");
    //newInput = newInput.replace("\\s+","");
    System.out.println(isPalindrome(newInput));
  } 
}



