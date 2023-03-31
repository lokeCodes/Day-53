// https://www.codechef.com/problems/EQUALISE
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c=0;
		    if(a==b){
		        c++;
		    }else if(a>b){
		        while(b<a){
		            b = b*2;
		            if(b==a)
		            c++;
		        }
		    }else{
		        while(a<b){
		            a = a*2;
		            if(a==b)
		            c++;
		        }
		    }
		    
		    if(c==1)
		    System.out.println("YES");
		    else
		    System.out.println("NO");
            
		}
	}
}
