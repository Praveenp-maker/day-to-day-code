package hrank;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class parallelogramwithstaticblock {
static int B;
static int H;
static boolean flag;
static Scanner n=new Scanner(System.in);

static{
    B=n.nextInt();
H=n.nextInt();
flag=true;
try{
    if(B<0||H<0){
        System.out.println("java.lang.Exception: Breadth and height must be positive");
        flag=false;
    }}
    catch(Exception e){
        System.out.println(e);
    }
}




public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}//end of main

}//end of class

