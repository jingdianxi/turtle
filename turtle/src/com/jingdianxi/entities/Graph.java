package com.jingdianxi.entities;
/**
 * 图像类
 * @param point 坐标点,0无轨迹,1有轨迹
 */
public class Graph {
	private int[][] point = new int[50][50];
//	public int[][] getPoint() {
//		return point;
//	}
	public void setPoint(int[][] point) {
		this.point = point;
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
