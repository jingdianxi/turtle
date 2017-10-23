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
	public boolean isDown() {
		return isDown;
	}
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
	public void move(int step, Graph graph) {
		// �жϷ���
		switch (this.head) {
		// ����
		case 0:
			// �ж�Խ��
			if((this.x + step) > 49) {
				step = 49 - this.x;
			}
			// ��ɹ켣
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x + i, this.y);
				}
			}
			// �ƶ�λ��
			this.x += step;
			break;
		// ����
		case 1:
			// �ж�Խ��
			if((this.y + step) > 49) {
				step = 49 - this.y;
			}
			// ��ɹ켣
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x, this.y + i);
				}
			}
			// �ƶ�λ��
			this.y += step;
			break;
		// ����
		case 2:
			// �ж�Խ��
			if((this.x - step) < 0) {
				step = this.x;
			}
			// ��ɹ켣
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x - i, this.y);
				}
			}
			// �ƶ�λ��
			this.x -= step;
			break;
		// ����
		case 3:
			// �ж�Խ��
			if((this.y - step) < 0) {
				step = this.y;
			}
			// ��ɹ켣
			if (this.isDown) {
				for (int i = 0; i < step; i++) {
					graph.setPoint(this.x, this.y - i);
				}
			}
			// �ƶ�λ��
			this.y -= step;
			break;
		}		
	}
}
