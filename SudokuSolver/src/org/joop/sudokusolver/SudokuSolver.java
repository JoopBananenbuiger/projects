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
	public <T extends SudokuInterface> T solve(T sudoku) {

		if (sudoku.isSolved())
			return sudoku;

		Field currentBestField = null;
		Set<Integer> bestValues = null;

		for (final Field field : sudoku.getFields())
			if (field.isUnknown()) {
				final Set<Integer> currentPossibleValues = sudoku.getPossibleValuesForField(field);
				if (currentPossibleValues.size() == 0)
					return null;
				if (bestValues == null || bestValues.size() > currentPossibleValues.size()) {
					currentBestField = field;
					bestValues = currentPossibleValues;
					if (bestValues.size() == 1)
						break;
				}
			}

		for (final int possibleValue : bestValues) {
			final T result = solve(sudoku.cloneSudoku().setFieldValue(currentBestField, possibleValue));
			if (result != null) {
				return result;
			}
		}
		return null;
	}
}