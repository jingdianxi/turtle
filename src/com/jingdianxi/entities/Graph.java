package com.jingdianxi.entities;
/**
 * 图像类
 * @param point 坐标点,0无轨迹,1有轨迹
 */
public class Graph {
	private int[][] point = new int[50][50];
	/**
	 * 在指定点作标记
	 * @param x 横坐标
	 * @param y 纵坐标
	 */
	public void setPoint(int x, int y) {
		point[x][y] = 1;
	}
	/**
	 * 打印图像
	 */
	public void print() {
		for (int i = 0; i < point.length; i++) {
			for (int j = 0; j < point[i].length; j++) {
				if (point[i][j] == 0) {
					System.out.print("*");
				} else if (point[i][j] == 1) {
					System.out.print("#");
				}
			}
			System.out.println();
		}
	}
}
