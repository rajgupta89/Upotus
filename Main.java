import java.util.*; 
import java.io.*;

class Main {  
  public static String QuestionsMarks(String str) { 
    
      int i = 0;
      while(i < str.length()) {
          if(Character.isDigit(str.charAt(i))) {
              int j = i + 1;
              int qCount = 0;
              while(j < str.length()) {
                  if(str.charAt(j) == '?') qCount++;
                  if(Character.isDigit(str.charAt(j))) {
                      int sum = Integer.parseInt(str.charAt(i) + "") + Integer.parseInt(str.charAt(j) + "");
                      if(!(sum == 10 && qCount == 3)) return "false";
                      i = j;
                      break;
                  }
                  j++;
              }
          }
          i++;
      }
      return "true";
  } 
  
  public static void main (String[] args) {  
    // keep this function call here     
    Scanner s = new Scanner(System.in);
    System.out.print(QuestionsMarks(s.nextLine())); 
  }   
  
}