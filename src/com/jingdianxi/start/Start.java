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
				// ָ��1���ʳ���
				case "1":
					turtle.setUp();
					break;
				// ָ��2���ʳ���
				case "2":
					turtle.setDown();
					break;
				// ָ��3����ת
				case "3":
					turtle.turnRight();
					break;
				// ָ��4����ת
				case "4":
					turtle.turnLeft();
					break;
				// ָ��6�����ͼ��
				case "6":
					graph.print();
					break;
				// ָ��9������
				case "9":
					System.out.println("END");
					scanner.close();
					return;
				// ��Чָ��
				default:
					System.out.println("Invalid command");
				}
				break;
			case 2:
				// ָ��5���ƶ�����ͼ
				if (order[0].equals("5")) {
					// �ƶ������ַ����Ƿ�ʱ�쳣����
					try {
						if (Integer.parseInt(order[1]) != 0) {
							turtle.move(Integer.parseInt(order[1]), graph);
						}
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
