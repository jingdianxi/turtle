package com.jingdianxi.entities;
/**
 * ͼ����
 * @param point �����,0�޹켣,1�й켣
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
	 * ��ӡͼ��
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
