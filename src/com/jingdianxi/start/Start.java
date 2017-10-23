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
			// �ӿ���̨����ָ��
			String string = scanner.nextLine();
			// �ֽ�ָ���ַ���Ϊָ���ַ�������
			String[] order = string.split(",");
			// �ж�ָ���ַ������鳤��
			switch (order.length) {
			case 1:
				switch (string) {
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
				case "6":
					graph.print();
					break;
				case "9":
					System.out.println("END");
					scanner.close();
					return;
				default:
					System.out.println("Invalid command");
				}
				break;
			case 2:
				if (order[0].equals("5")) {
					try {
						turtle.move(Integer.parseInt(order[1]));
					} catch (Exception exception) {
						// TODO: handle exception
						System.out.println("Invalid command");
					}
				} else {
					System.out.println("Invalid command");
				}
				break;
			default:
				System.out.println("Invalid command");
				;
			}
		}
	}
}
