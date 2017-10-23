package com.jingdianxi.entities;
/**
 * 海龟类
 * @param x 横坐标
 * @param y 纵坐标
 * @param head 笔前进方向,0向右,1向下,2向左,3向上
 * @param isDown 笔朝下状态
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
	// 笔朝下
	public void setDown() {
		this.isDown = true;
	}
	// 笔朝上
	public void setUp() {
		this.isDown = false;
	}
	// 左转
	public void turnLeft() {
		this.head = (this.head + 3) % 4;
	}
	// 右转
	public void turnRight() {
		this.head = (this.head + 1) % 4;
	}
	// 移动
	public void move(int step) {
		
	}
}
