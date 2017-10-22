package com.jingdianxi.start;

import java.util.Scanner;

import com.jingdianxi.entities.Graph;
import com.jingdianxi.entities.Turtle;

public class Start {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Graph graph = new Graph();
		Turtle turtle = new Turtle();
		Scanner scanner = new Scanner(System.in);
		while (true) {
			String string = scanner.nextLine();
			String[] order = string.split(",");
			switch (order[0]) {
			case "1":
				turtle.setUp();
				break;
			case "2":
				turtle.setDown();
				break;
			case "3":
				turtle.turnRight();
				break;
			case "4":
				turtle.turnLeft();
				break;
			case "5":
				turtle.move();
				break;
			case "6":
				graph.print();
				break;
			case "9":
				System.out.println("END");
				return;
			}
		}
	}
}
