package lpoolista.lista9.q8;

public class MovableCircle implements Movable{
	private int radius;
	private MovablePoint center;
	public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
		this.center = new MovablePoint(x, y, xSpeed, ySpeed);
		this.radius = radius;
	}
	
	public void moveUp() {
		this.center.moveUp();
	}
	
	public void moveDown() {
		this.center.moveDown();
	}
	public void moveLeft() {
		this.center.moveLeft();
	}
	public void moveRight() {
		this.center.moveRight();
	}

	@Override
	public String toString() {
		return center + ",radius=" + radius;
	}
	
}
