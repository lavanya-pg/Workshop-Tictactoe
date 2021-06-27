package com.workshop;

import java.util.Scanner;

public class Tic
{
	public static void main(String[] args)
	{
		System.out.println("welcome to the tic-tac-toe program");
		System.out.println("Choose a letter o or x : ");
        Scanner s = new Scanner(System.in);
        char letter = s.next().charAt(0);
        char Choice;
        chooseLetter(letter);
     }
		public static void  chooseLetter(char letter)
		{
		switch(letter)
		{
		 case 'o':
		        System.out.println("player entered letter: o");
		        System.out.println("computer choice is: x");
		        break;
		 case 'x':
		        System.out.println("player entered letter: x");
		        System.out.println("computer choice is: o");
		        break;
		 }
		 }
}