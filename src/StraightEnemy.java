
public class StraightEnemy extends Enemy{
	int life=5;
	public StraightEnemy (double x,double y, double vx,double vy) {
		super(x,y,vx,vy);
	}
	public void draw(MyFrame f) {
		f.setColor(0,0,0);
		f.fillRect(x+8,y,14,15);
		f.setColor(0,0,0);
		f.fillRect(x+10,y,10,30);
	}
}
