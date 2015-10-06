package org.joop.sudokusolver;

import java.util.Set;

/**
 * The interface that all Sudoku types should implement in order to be solvable by the
 * <code>SudokuSolver</code> class.
 */
public interface SudokuInterface extends Cloneable{
	
	public Sudoku clone();
	public Set<Field> getFields();
	public Set<Integer> getPossibleValuesForField(final Field field);
	public SudokuInterface setFieldValue(final Field field, int value);
	public boolean isSolved();
}
