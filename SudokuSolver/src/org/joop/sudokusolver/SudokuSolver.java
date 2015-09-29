package org.joop.sudokusolver;

import java.util.Set;

/**
 * The SudokuSolver class solves Sudoku Objects.
 *
 */
public class SudokuSolver {

	public SudokuSolver() {
		super();
	}

	/**
	 * Solves the given <code>sudoku</code>.
	 * 
	 * @param sudoku	The sudoku to solve.
	 * @return			The solved sudoku.
	 */
	public Sudoku solve(final Sudoku sudoku) {

		if (sudoku.isSolved())
			return sudoku;

		int currentBestX = -1;
		int currentBestY = -1;
		Set<Integer> bestValues = null;

		loopBreak: for (int x = 0; x < Sudoku.SIZE; x++) {
			for (int y = 0; y < Sudoku.SIZE; y++) {
				if (sudoku.isUnknown(x, y)) {
					final Set<Integer> currentPossibleValues = sudoku.getPossibleValuesForField(x, y);
					if (currentPossibleValues.size() == 0)
						return null;
					if (bestValues == null || bestValues.size() > currentPossibleValues.size()) {
						currentBestX = x;
						currentBestY = y;
						bestValues = currentPossibleValues;
						if (bestValues.size() == 1)
							break loopBreak;
					}
				}
			}
		}

		for (final int possibleValue : bestValues) {
			final Sudoku result = solve(sudoku.clone().setFieldValue(currentBestX, currentBestY, possibleValue));
			if (result != null) {
				return result;
			}
		}
		return null;
	}
}