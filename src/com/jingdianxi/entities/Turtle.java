package com.jingdianxi.entities;
/**
 * ������
 * @param x ������
 * @param y ������
 * @param head ��ǰ������,0����,1����,2����,3����
 * @param isDown �ʳ���״̬
 */
public class Turtle {
	private int x;
	private int y;
	private int head;
	private boolean isDown;
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	public int getHead() {
		return head;
	}
//	public void setHead(int head) {
//		this.head = head;
//	}
	public boolean isDown() {
		return isDown;
	}
//	public void setDown(boolean isDown) {
//		this.isDown = isDown;
//	}
	// �ʳ���
	public void setDown() {
		this.isDown = true;
	}
	// �ʳ���
	public void setUp() {
		this.isDown = false;
	}
	// ��ת
	public void turnLeft() {
		this.head = (this.head + 3) % 4;
	}
	// ��ת
	public void turnRight() {
		this.head = (this.head + 1) % 4;
	}
	// �ƶ�
	public void move(int step) {
		
	}
}
