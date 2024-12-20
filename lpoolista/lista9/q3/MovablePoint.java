package lpoolista.lista9.q3;

public class MovablePoint implements Movable{
	
	private int x;
	private int y;
	private int xSpeed;
	private int ySpeed;
	public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
		super();
		this.x = x;
		this.y = y;
		this.xSpeed = xSpeed;
		this.ySpeed = ySpeed;
	}
	
	public void moveUp() {
		this.y -= this.ySpeed;
	}
	
	public void moveDown() {
		this.y += this.ySpeed;
	}
	
	public void moveLeft() {
		this.x -= this.xSpeed;
	}
	
	public void moveRight() {
		this.x += this.xSpeed;
	}
	
	@Override
	public String toString() {
		return "(" + this.x + ","  + this.y + ") speed=(" + this.xSpeed + ", " + this.ySpeed + ")";
	}
	
	
}
