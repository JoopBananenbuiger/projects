package org.joop.sudokusolver;

import java.util.HashSet;
import java.util.Set;

/**
 * The Sudoku class represents a sudoku field.
 */
public class Sudoku implements Cloneable {

	/**
	 * Size of the sudoku field
	 */
	public static final int SIZE = 9;

	/**
	 * Internal representation of the sudoku field.
	 */
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

	public Sudoku clone() {
		final int[][] clonedFields = new int[SIZE][];
		for (int i = 0; i < SIZE; i++) {
			clonedFields[i] = fields[i].clone();
		}

		return new Sudoku(clonedFields);
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
	 * Returns the possible values for a field with the given <code>x</code> and
	 * <code>y</code> coordinates.
	 * 
	 * @param x			The X-coordinate of the field.
	 * @param y			The X-coordinate of the field.
	 * @return			A set of possible field values.
	 */
	public Set<Integer> getPossibleValuesForField(int x, int y) {
		Set<Integer> possibleValues = new HashSet<>();
		for (int i = 1; i < 10; i++) {
			possibleValues.add(i);
		}

		for (int i = 0; i < SIZE; i++) {
			possibleValues.remove(this.fields[x][i]);
			possibleValues.remove(this.fields[i][y]);
			possibleValues.remove(this.fields[x / 3 * 3 + i % 3][y / 3 * 3 + i / 3]);
		}

		return possibleValues;
	}

	/**
	 * Sets the given <code>value</code> for a field with the given <code>x</code> and
	 * <code>y</code> coordinates. Returns the current Sudoku object.
	 * 
	 * @param x			The X-coordinate of the field.
	 * @param y			The X-coordinate of the field.
	 * @param value		The value to give to the field.
	 * @return			The current Sudoku object.
	 */
	public Sudoku setFieldValue(int x, int y, int value) {
		this.fields[x][y] = value;
		return this;
	}

	/**
	 * Returns true if the sudoku is solved, false otherwise.
	 * 
	 * @return			True if the sudoku is solved, false otherwise.
	 */
	public boolean isSolved() {
		for (int x = 0; x < SIZE; x++) {
			for (int y = 0; y < SIZE; y++) {
				if (isUnknown(x, y))
					return false;
			}
		}
		return true;
	}

	/**
	 * Checks if a field with the given <code>x</code> and <code>y</code>
	 * coordinates is not filled in yet.
	 * 
	 * @param x			The X-coordinate of the field.
	 * @param y			The X-coordinate of the field.
	 * @return			True if not filled in, false otherwise.
	 */
	public boolean isUnknown(int x, int y) {
		return this.fields[x][y] == 0;
	}
}
