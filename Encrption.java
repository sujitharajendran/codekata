package guviproject;

import java.util.Scanner;

public class Encrption {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	String alpha="abcdefghijklmnopqrstuvwyz";
	char[] k="abcdefghijklmnopqrstuvwxyz".toCharArray();
	//char b[]=alpha.toCharArray();
	String result="";
	String result2="";
String input1=sc.next();
String input2=sc.next();
int d=alpha.indexOf(input2.charAt(0));
for(int i=0;i<input1.length();i++){
	int k1=alpha.indexOf(input1.charAt(i))+d;
	if(k1>26 )
	{int g=k1-26;
		result=result+k[g];
	}
	else{
		result=result+k[k1];
	}
	
}

int ll=alpha.indexOf(input2.charAt(0));
System.out.println(ll);
for(int i=1;i<input2.length()-1;i++){
	int k22=alpha.indexOf(input2.charAt(i))+ll;
	if(k22>26){
		int g1=k22-26;
		result2=result2+k[g1];
	}
	else{
		result2=result2+k[k22];
	}
}
System.out.println(result+" "+input2.charAt(0)+result2+input2.charAt(input2.length()-1));
	}

}
