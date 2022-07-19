//Write a JAVA program to count frequency of each character in a string
  public class Frequency   
{  
     public static void main(String[] args) {  
        String str = "sai is a good boy 123 4563 @";
        int i, j, freq;   
        char string[] = str.toCharArray();  
        for(i = 0; i <str.length(); i++) {  
            freq = 1;  
            for(j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq++; 
                    string[j] =' ';  
                }
            }
          if(string[i]!=' ')
          System.out.println(string[i]+"-"+freq);
        } 
    }  
}
