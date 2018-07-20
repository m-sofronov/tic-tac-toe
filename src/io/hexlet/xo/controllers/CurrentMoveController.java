package io.hexlet.xo.controllers;
// BEGIN (write your solution here)
import io.hexlet.xo.model.Field;
// END
public class CurrentMoveController {
	// BEGIN (write your solution here)
	public String currentMove(Field field) { // возвращает фигурку того игрока, чей сейчас ход
		
		int countX = 0;
		int countO = 0;
		for (int i = 0; i < field.getSize(); i++)
			for (int i2 = 0; i2 < field.getSize(); i2++) {
				final Point p = new Point();
				p.x = i;
				p.y = i2;
				final String figure = field.getFigure(p);
//предыдущие 4 строки можно записать так: `final String figure = field.getFigure(new Point(i, i2));`
				if (figure == null) continue;
				// вместо "equals" можно использовтаь стандартный оператор "==",
				// но рекомендую поискать инфу о том, зачем использовать именно "equals" для сравнения строк.
				if (figure.equals("X")) countX++;
				if (figure.equals("O")) countO++;
			}
		if (countX == countO) {
 			return "X";
		} else {
 			return "O";
		}

	}
	// END
}
