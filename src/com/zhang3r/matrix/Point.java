package com.zhang3r.matrix;

import java.util.List;

public class Point<T> {
	private int x;
	private int y;
	private T item;
	private List<Point<T>> neighbors;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point(int x, int y, T item) {
		this(x, y);
		this.item = item;
	}

	public Point(int x, int y, T item, List<Point<T>> neighbors) {
		this(x, y, item);
		this.neighbors = neighbors;
	}

	public T getItem() {
		return item;
	}

	public void setItem(T item) {
		this.item = item;
	}

	public List<Point<T>> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(List<Point<T>> neighbors) {
		this.neighbors = neighbors;
	}

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

}
