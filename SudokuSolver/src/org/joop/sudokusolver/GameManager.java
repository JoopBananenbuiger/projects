package sudokusolver;

import java.util.HashMap;
import java.util.Set;

import sudokugui.Cell;

/**
 * Static class that handles game operations
 */
public class GameManager {
	/**
	 * Stores <code>Cell</code>s by their xy coordinates.
	 */
	private static HashMap<String, Cell> cellMap = new HashMap<String, Cell>();
	private static Sudoku aSudoku = new Sudoku();
	
	/**
	 * Solves the <code>Sudoku</code> puzzle and displays result
	 */
	public static void solvePuzzle(){
		SudokuSolver solver = new SudokuSolver();
		Sudoku solved = solver.solve(aSudoku);
		Set<Field> arr = solved.getFields();
		for(Field aField : arr){
			String key = String.valueOf(aField.getY()) + String.valueOf(aField.getX());
			cellMap.get(key).setValue(aField.getValue());
		}
	}
	
	/**
	 * Adds a cell to the HashMap. Cells are stored by their concatenated x and y coordinates:
	 * x = 0, y = 1 would be stored as "01";
	 * @param x		The x-coordinate of the cell
	 * @param y		The y-coordinate of the cell
	 * @param aCell	A cell object
	 */
	public static void addCell(int x, int y, Cell aCell){
		String key = String.valueOf(x) + String.valueOf(y);
		cellMap.put(key, aCell);
	}
	
	public static Sudoku getSudoku(){
		return aSudoku;
	}
}
