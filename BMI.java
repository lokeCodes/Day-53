// https://www.codechef.com/problems/BMI
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
		    int m = s.nextInt();
		    int h = s.nextInt();
		    int res = m/(h*h);
		    if(res<=18){
		        System.out.println(1);
		    }else if(res>18 && res<25){
		        System.out.println(2);
		    }else if(res>=25 && res<30){
		        System.out.println(3);
		    }else{
		        System.out.println(4);
		    }
		}
	}
}
