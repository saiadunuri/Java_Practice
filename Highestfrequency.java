//Write a JAVA program to find highest frequency character in a string.
    class Highestfrequency   
       {  
     public static void main(String[] args) {  
        String str = "sai is a good boy 123 4563 @";
        int max=1,freq;
       char highest='s';
        char string[] = str.toCharArray();  
        for(int i = 0; i <str.length(); i++) {  
            freq= 1;  
            for(int j = i+1; j <str.length(); j++) {  
                if(string[i] == string[j]) {  
                    freq++; 
                    string[j] =' ';  
                }
            }
          if(max<freq)
          {
            if(string[i]!=' ')
            {
              max=freq;
            highest=string[i];
            }
            
          }
        }
       System.out.println("highest frequence character is: "+ highest);
    }  
}