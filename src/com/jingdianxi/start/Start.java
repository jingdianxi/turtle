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
			// 从控制台输入指令
			String string = scanner.nextLine();
			// 分解指令字符串为指令字符串数组
			String[] order = string.split(",");
			// 判断指令字符串数组长度
			switch (order.length) {
			case 1:
				switch (string) {
				// 指令1，笔朝上
				case "1":
					turtle.setUp();
					break;
				// 指令2，笔朝下
				case "2":
					turtle.setDown();
					break;
				// 指令3，右转
				case "3":
					turtle.turnRight();
					break;
				// 指令4，左转
				case "4":
					turtle.turnLeft();
					break;
				// 指令6，输出图像
				case "6":
					graph.print();
					break;
				// 指令9，结束
				case "9":
					System.out.println("END");
					scanner.close();
					return;
				// 无效指令
				default:
					System.out.println("Invalid command");
				}
				break;
			case 2:
				// 指令5，移动且作图
				if (order[0].equals("5")) {
					// 移动步长字符串非法时异常处理
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
