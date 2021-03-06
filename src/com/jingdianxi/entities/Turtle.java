package com.jingdianxi.entities;
/**
 * 海龟类
 */
public class Turtle {
	// 横坐标
	private int x;
	// 纵坐标
	private int y;
	// 笔前进方向,0向右,1向下,2向左,3向上
	private int head;
	// 笔朝下状态
	private boolean isDown;
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
	/**
	 * 移动
	 * @param step 步长
	 * @param graph 图像
	 */
	public void move(int step, Graph graph) {
		// 判断方向
		switch (this.head) {
		// 向右
		case 0:
			// 判断越界
			if((this.x + step) > 49) {
				step = 50 - this.x;
			}
			// 完成轨迹
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x + i, this.y);
				}
			}
			// 移动位置
			this.x += step - 1;
			break;
		// 向下
		case 1:
			// 判断越界
			if((this.y + step) > 49) {
				step = 50 - this.y;
			}
			// 完成轨迹
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x, this.y + i);
				}
			}
			// 移动位置
			this.y += step - 1;
			break;
		// 向左
		case 2:
			// 判断越界
			if((this.x - step) < 0) {
				step = this.x + 1;
			}
			// 完成轨迹
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x - i, this.y);
				}
			}
			// 移动位置
			this.x -= step - 1;
			break;
		// 向上
		case 3:
			// 判断越界
			if((this.y - step) < 0) {
				step = this.y + 1;
			}
			// 完成轨迹
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x, this.y - i);
				}
			}
			// 移动位置
			this.y -= step - 1;
			break;
		}		
	}
}
