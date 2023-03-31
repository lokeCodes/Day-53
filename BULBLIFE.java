// https://www.codechef.com/problems/BULBLIFE
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
		    int n = s.nextInt();
		    int a = s.nextInt();
		    int arr[] = new int[n-1];
		    float sum=0;
		    for(int i=0;i<n-1;i++){
		        arr[i]=s.nextInt();
		        sum = sum+arr[i];
		    }
		    
		    for(int i=0;i<=n*a;i++){
		        if(sum==0){
		            System.out.println(a*n);
		            break;
		        }else if((sum+i)/n >= a){
		            System.out.println(i);
		            break;
		        } 
		    }
		}
	}
}
