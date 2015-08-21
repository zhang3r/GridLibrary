package com.zhang3r.matrix;

import java.util.List;

public interface Grid {
	
	
	public <T> List<Point<T>> getNeighbor(Point<T> p);
	
	public <T> List<Point<T>> getNeighbor(int x, int y);
	
	
	
}
