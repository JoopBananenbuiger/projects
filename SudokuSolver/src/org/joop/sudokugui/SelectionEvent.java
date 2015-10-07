package sudokugui;

/**
 * A custom event that facilitates communication between observers and broadcasters
 */
public class SelectionEvent {
	private int value;
	private int x;
	private int y;
	
	public SelectionEvent(int value){
		this.value = value;
		x = -1;
		y = -1;
	}
	
	public void setValue(int value){
		this.value = value;
	}
	public int getValue(){
		return value;
	}
	
	public void setX(int x){
		this.x = x;
	}
	public int getX(){
		return x;
	}
	
	public void setY(int y){
		this.y = y;
	}
	public int getY(){
		return y;
	}
}
