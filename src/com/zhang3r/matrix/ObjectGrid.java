package com.zhang3r.matrix;

import java.util.ArrayList;
import java.util.List;


public class ObjectGrid<T> implements Grid {
	
	List<Point<T>> grid;
	
	public ObjectGrid(){
		
	}
	
	public ObjectGrid(int x, int y){
		grid = new ArrayList<>();
		for(int i=0; i<x; i++){
			for(int j=0; j<y; j++){
				Point<T> p = new Point<T>(i,j);
				
				grid.add(p);
			}
		}
	}

	@Override
	public <T> List<Point<T>> getNeighbor(Point<T> p) {
		return null;
	}

	@Override
	public <T> List<Point<T>> getNeighbor(int x, int y) {
		// TODO Auto-generated method stub
		return null;
	}

}
