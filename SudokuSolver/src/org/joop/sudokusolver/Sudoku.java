package sudokusolver;

import java.util.HashSet;
import java.util.Set;

/*
 * Added two constants to allow differently sized Sudokus to be built using the GUI.
 * Probably not the best implementation due to array size being used for sizing now
 * (used to be constants before recent update). Needs updating so both logic and GUI
 * coincide with each other.
 * 
 * Added constructor to create a blank array. GUI should be updated to allow the user
 * to select whether they want a pre-built puzzle, or want to enter their own puzzle
 * for the solver to analyze. 
 */

/**
 * The Sudoku class represents a sudoku field.
 */
public class Sudoku implements SudokuInterface {
	
	/**
	 * The amount of boxes in the Sudoku.
	 * Must be a perfect square.
	 */
	public static final int BOX_COUNT = 9;
	
	/**
	 * The amount of cells in a box.
	 * Must be a perfect square.
	 */
	public static final int BOX_SIZE = 9;
	
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
	
	/**
	 * Constructs a blank Sudoku object.
	 */
	public Sudoku(){
		super();
		int size = (int) Math.sqrt(BOX_SIZE * BOX_COUNT);
		fields = new int[size][size];
	}

	@SuppressWarnings("unchecked")
	public <T extends SudokuInterface> T cloneSudoku() {
		final int[][] clonedFields = new int[getSize()][];
		for (int i = 0; i < getSize(); i++) {
			clonedFields[i] = fields[i].clone();
		}

		return (T) new Sudoku(clonedFields);
	}

	public String toString() {
		StringBuilder toStringBuilder = new StringBuilder();
		for (int i = 0; i < getSize(); i++) {
			toStringBuilder.append("+-");
		}
		toStringBuilder.append("+");

		for (int i = 0; i < getSize(); i++) {
			toStringBuilder.append("\r\n+");
			for (int j = 0; j < getSize(); j++) {
				toStringBuilder.append((this.fields[i][j] == 0 ? " " : this.fields[i][j]) + "|");
			}
			toStringBuilder.append("\r\n");
			for (int j = 0; j < getSize(); j++) {
				toStringBuilder.append("+-");
			}
			toStringBuilder.append("+");
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
		for (int x = 0; x < getSize(); x++) {
			for (int y = 0; y < getSize(); y++) {
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
		for (int i = 0; i < getSize(); i++) {
			possibleValues.add(i + 1);
		}

		for (int i = 0; i < getSize(); i++) {
			possibleValues.remove(this.fields[field.getX()][i]);
			possibleValues.remove(this.fields[i][field.getY()]);
			possibleValues.remove(this.fields[field.getX() / 3 * 3 + i % 3][field.getY() / 3 * 3 + i / (getSize() / 3)]);
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
	
	private int getSize(){
		return fields[0].length;
	}
}