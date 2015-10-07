package org.joop.sudokusolver;

import java.util.HashSet;
import java.util.Set;

/**
 * The Sudoku class represents a sudoku field.
 */
public class Sudoku implements SudokuInterface {

	/**
	 * Size of the sudoku field.
	 */
	private static final int SIZE = 9;

	/**
	 * Internal representation of the sudoku field.
	 */
	// Todo: it would be way prettier if this would be a Set of Fields or something,
	// and the rest of the methods would reflect that change.
	// The problem is that repeated searching trough a Set of Fields to find a given x/y location
	// is way way slower than just looking up a 2 dimensional array. 
	private int[][] fields;

	/**
	 * Constructs a sudoku object by given <code>fields</code>.
	 * 
	 * @param fields		The fields of the sudoku.
	 */
	public Sudoku(int[][] fields) {
		super();
		this.fields = fields;
	}

	@SuppressWarnings("unchecked")
	public <T extends SudokuInterface> T cloneSudoku() {
		final int[][] clonedFields = new int[SIZE][];
		for (int i = 0; i < SIZE; i++) {
			clonedFields[i] = fields[i].clone();
		}

		return (T) new Sudoku(clonedFields);
	}

	public String toString() {
		StringBuilder toStringBuilder = new StringBuilder("+-+-+-+-+-+-+-+-+-+");

		for (int i = 0; i < SIZE; i++) {
			toStringBuilder.append("\r\n+");
			for (int j = 0; j < SIZE; j++) {
				toStringBuilder.append((this.fields[i][j] == 0 ? " " : this.fields[i][j]) + "|");
			}
			toStringBuilder.append("\r\n+-+-+-+-+-+-+-+-+-+");
		}

		return toStringBuilder.toString();
	}

	/**
	 * Gets the Fields of this Sudoku.
	 * 
	 * @return The fields of this Sudoku.
	 */
	public Set<Field> getFields() {
		final Set<Field> fieldObjects = new HashSet<>();
		for (int x = 0; x < SIZE; x++) {
			for (int y = 0; y < SIZE; y++) {
				fieldObjects.add(new Field(x, y, this.fields[x][y]));
			}
		}
		return fieldObjects;
	}
	
	/**
	 * Returns the possible values for a field with the given <code>field</code>.
	 * 
	 * @param field		The field.
	 * @return			A set of possible field values.
	 */
	public Set<Integer> getPossibleValuesForField(final Field field) {
		Set<Integer> possibleValues = new HashSet<>();
		for (int i = 0; i < SIZE; i++) {
			possibleValues.add(i + 1);
		}

		for (int i = 0; i < SIZE; i++) {
			possibleValues.remove(this.fields[field.getX()][i]);
			possibleValues.remove(this.fields[i][field.getY()]);
			possibleValues.remove(this.fields[field.getX() / 3 * 3 + i % 3][field.getY() / 3 * 3 + i / 3]);
		}

		return possibleValues;
	}

	/**
	 * Sets the given <code>value</code> for a given <code>field</code>.
	 * Returns the current Sudoku object.
	 * 
	 * @param field		The field to set.
	 * @param value		The value to give to the field.
	 * @return			The current Sudoku object.
	 */
	@SuppressWarnings("unchecked")
	public <T extends SudokuInterface> T setFieldValue(final Field field, int value) {
		this.fields[field.getX()][field.getY()] = value;
		return (T) this;
	}

	/**
	 * Returns true if the sudoku is solved, false otherwise.
	 * 
	 * @return			True if the sudoku is solved, false otherwise.
	 */
	public boolean isSolved() {
		for (final Field field : getFields()){
			if (field.isUnknown()){
				return false;
			}
		}
		return true;
	}
}