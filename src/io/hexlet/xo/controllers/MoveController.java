package io.hexlet.xo.controllers;

import io.hexlet.xo.model.Field;
import io.hexlet.xo.model.Point;

public class MoveController {

	public boolean applyFigure(final Field field,
                            final Point point,
                            final String figure) {
		// BEGIN (write your solution here)
		final int maxSize = field.getSize();
        if (checkCoordinate(point.x, maxSize) && checkCoordinate(point.y, maxSize) && field.getFigure(point) == null){
            
                field.setFigure(point, figure);
                return true;
        }
        return false;
		// END
	}
        
        // BEGIN (write your solution here) //You may want to check the coordinates in a separate method ???
	    private  boolean checkCoordinate(final int coordinate, final int maxSize) {
        //результатом такой строки будет boolean
	    return coordinate >= 0 && coordinate < maxSize;
    }
        // END
}
