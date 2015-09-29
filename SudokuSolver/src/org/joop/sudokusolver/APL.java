package org.joop.sudokusolver;

/**
 * Generic entry point of the class. Needs a GUI badly.
 */
public class APL {

	public static void main(String[] args) {
		Sudoku sudoku = new Sudoku(new int[][]{
			  { 0, 0, 0, 0, 3, 7, 6, 0, 0},
			  { 0, 0, 0, 6, 0, 0, 0, 9, 0},
			  { 0, 0, 8, 0, 0, 0, 0, 0, 4},
			  { 0, 9, 0, 0, 0, 0, 0, 0, 1},
			  { 6, 0, 0, 0, 0, 0, 0, 0, 9},
			  { 3, 0, 0, 0, 0, 0, 0, 4, 0},
			  { 7, 0, 0, 0, 0, 0, 8, 0, 0},
			  { 0, 1, 0, 0, 0, 9, 0, 0, 0},
			  { 0, 0, 2, 5, 4, 0, 0, 0, 0}});
		System.out.println(new SudokuSolver().solve(sudoku).toString());
	}
}