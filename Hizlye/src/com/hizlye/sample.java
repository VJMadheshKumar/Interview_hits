package com.hizlye;

public class sample { 
	public static void main(String args[]) { 
		String s = "abcd"; 
		int n = 6; 
		int startPos = 2; 
        	n=(n/6)+1;
        
      
        drawHexagon(s,n,startPos);
     
	} 
	static void drawHexagon(String inp, int size, int pos ){
    int  len = 2 * size-1;
        boolean flag = true;
        int word = inp.length();
        int letter = 1;
        for(int i=0; i<size; i++){
            int dum = i+size;
        	for(int j =0; j<dum; j++){
                if((j==size+i-1)||(j==size-i-1))
                    if(j==pos && flag){
                        flag = false;
                    System.out.print(inp.charAt(0));}
                	else{
                        if(letter<word){
                        System.out.print(inp.charAt(letter++));
                        }
                        else
                            System.out.print("* ");
                    }
            	else
                    System.out.print("  ");
            }System.out.println("");
        
        }
  
        for(int k =0; k<size-2; k++){
        	for(int l =0; l<len; l++){
            	if((l==0)||(l==len-1))
                    if(l==pos&&flag){
                        flag = false;
                    System.out.print(inp.charAt(0));}
                	else{
                        if(letter<word){
                        	System.out.print(inp.charAt(letter++));
                        }
                    	else
                            System.out.print("* ");
                    }
                else
                    System.out.print("  ");
            }System.out.println("");
        
        }
        int res = size-1;
        for(int m = res; m>=0; m--){
        int dum2 = m+size;
            for(int n =0; n<dum2; n++){
            	if((n==size+m-1)||(n==size-m-1))
                   
                    if(n==pos && flag){
                   System.out.print(inp.charAt(0));
                    flag = false;
                    }
                	else{
                        if(letter<word)
                            System.out.print(inp.charAt(letter++));
                        else
                            System.out.print("* ");
                		}
                else
                    System.out.print("  ");
            }System.out.println("");
        }
        
        
    
    }
	
}