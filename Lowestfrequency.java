//Write a JAVA program to find lowest frequency character in a string.
class Lowestfrequency   
       {  
     public static void main(String[] args) {  
        String str = "sai is a good boy 123 4563 @";
        int min=str.length(),freq;
       char lowest='s';
        char string[] = str.toCharArray();  
        for(int i = 0; i <str.length(); i++) {  
            freq= 1;  
            for(int j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq++; 
                    string[j] =' ';  
                }
            }
          if(freq<min)
          {
            if(string[i]!=' ')
            {
              min=freq;
            lowest=string[i];
            }
            
          }
        }
       System.out.println("lowest frequence character is: "+ lowest);
    }  
}