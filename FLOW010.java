// https://www.codechef.com/problems/FLOW010
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
		    char in = s.next().charAt(0);
		    if(in=='B' || in=='b'){
		        System.out.println("BattleShip");
		    }else if(in=='C' || in=='c'){
		        System.out.println("Cruiser");
		    }else{
		        System.out.println("Destroyer");
		    }
		}
	}
}
