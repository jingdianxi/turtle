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
	public boolean isDown() {
		return isDown;
	}
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
	public void move(int step, Graph graph) {
		// 判断方向
		switch (this.head) {
		// 向右
		case 0:
			// 判断越界
			if((this.x + step) > 49) {
				step = 49 - this.x;
			}
			// 完成轨迹
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x + i, this.y);
				}
			}
			// 移动位置
			this.x += step;
			break;
		// 向下
		case 1:
			// 判断越界
			if((this.y + step) > 49) {
				step = 49 - this.y;
			}
			// 完成轨迹
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x, this.y + i);
				}
			}
			// 移动位置
			this.y += step;
			break;
		// 向左
		case 2:
			// 判断越界
			if((this.x - step) < 0) {
				step = this.x;
			}
			// 完成轨迹
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x - i, this.y);
				}
			}
			// 移动位置
			this.x -= step;
			break;
		// 向上
		case 3:
			// 判断越界
			if((this.y - step) < 0) {
				step = this.y;
			}
			// 完成轨迹
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x, this.y - i);
				}
			}
			// 移动位置
			this.y -= step;
			break;
		}		
	}
}
