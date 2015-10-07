package sudokusolver;

import sudokugui.MainForm;

/**
 * Generic entry point of the class. 
 * Needs error handling and validation (goes into infinite loop if puzzle is unsolvable or has errors).
 * Needs further enhancements to logic to solve increasingly more difficult puzzles (right now only checks row, column, and box for a duplicate value).
 * Needs enhancements to GUI for look/feel, error handling, and increased functionality (i.e. clear/cancel buttons to clear a cell or cancel a selection).
 * Check TODOs for more things that need updates.
 */
public class APL {

	public static void main(String[] args) {
		@SuppressWarnings("unused")
		MainForm mf = new MainForm();
		
		/*
		final Sudoku sudoku = new Sudoku(new int[][]{
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
		*/
	}
}