package com.jingdianxi.entities;
/**
 * ͼ����
 */
public class Graph {
	// �����,0�޹켣,1�й켣
	private int[][] point = new int[50][50];
	/**
	 * ��ָ���������
	 * @param x ������
	 * @param y ������
	 */
	public void setPoint(int x, int y) {
		point[x][y] = 1;
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
