package sudokusolver;

/**
 * A simple data holder class for a field in a Sudoku.
 */
public class Field implements Cloneable{

	private int x;
	private int y;
	private int value = 0;
	
	/**
	 * Constructor for a Field with location <code>x</code> and <code>y</code>.
	 * Value will be 0.
	 * 
	 * @param x
	 * @param y
	 */
	public Field(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	/**
	 * Constructor for a Field with location <code>x</code> and <code>y</code> and
	 * <code>value</code>.
	 * 
	 * @param x
	 * @param y
	 */
	public Field(int x, int y, int value) {
		super();
		this.x = x;
		this.y = y;
		this.value = value;
	}
	
	public Field clone() {
		return new Field(this.x, this.y, this.value);
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Field other = (Field) obj;
		if (value != other.value)
			return false;
		if (x != other.x)
			return false;
		if (y != other.y)
			return false;
		return true;
	}
	
	/**
	 * @return the value
	 */
	public int getValue() {
		return value;
	}
	
	/**
	 * @return the x
	 */
	public int getX() {
		return x;
	}
	
	/**
	 * @return the y
	 */
	public int getY() {
		return y;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + value;
		result = prime * result + x;
		result = prime * result + y;
		return result;
	}
	
	/**
	 * Checks if this field is not filled in yet.
	 * @return			True if not filled in, false otherwise.
	 */
	public boolean isUnknown() {
		return this.value == 0;
	}

	/**
	 * @param value the value to set
	 */
	public void setValue(int value) {
		this.value = value;
	}
	
	/**
	 * @param x the x to set
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * @param y the y to set
	 */
	public void setY(int y) {
		this.y = y;
	}
	
	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "Field [x=" + x + ", y=" + y + ", value=" + value + "]";
	}
}