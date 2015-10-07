package sudokusolver;

import java.util.Set;

/**
 * The interface that all Sudoku types should implement in order to be solvable by the
 * <code>SudokuSolver</code> class.
 */
public interface SudokuInterface extends Cloneable{
	
	public <T extends SudokuInterface> T cloneSudoku();
	public Set<Field> getFields();
	public Set<Integer> getPossibleValuesForField(final Field field);
	public <T extends SudokuInterface> T setFieldValue(final Field field, int value);
	public boolean isSolved();
}
