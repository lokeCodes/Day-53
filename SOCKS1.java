// https://www.codechef.com/problems/SOCKS1
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		int c = s.nextInt();
		if(a==b || b==c || c==a){
		    System.out.println("YES");
		}else{
		    System.out.println("NO");
		}
	}
}
