package sef.module6.activity;


public class Point2DImpl implements Point2D {
	
	
	/**
	 * Creates a Point2D object at a default location (0,0)
	 */
	
	 protected double x;
	 protected double y;
	
	public Point2DImpl(){
		
	}
	
	/**
	 * Create a Point2D object that represents a 2D coordinate specified 
	 * by the constructor parameters
	 * 
	 * @param x coordinate of the point along the x-axis
	 * @param y coordinate of the point along the y-axis
	 */
	public Point2DImpl(double x, double y){
		this.x = x;
		this.y = y;
	}
	

	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#move(double, double)
	 */
	public final void move(double x, double y){
		this.x = x;
		this.y = y;
	}
	
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#setX(double)
	 */
	public void setX(double x){
		this.x = x;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#setY(double)
	 */
	public void setY(double y){
		this.y = y;
	}
	

	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#getX()
	 */
	public double getX(){
	
		return x;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#getY()
	 */
	public double getY(){
		
		return y;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#translate(double, double)
	 */
	public final void translate(double dx, double dy){
		
		setX(getX() + dx);
		setY(getY() + dy);
		
	}
	
	
	
	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
	public boolean equals(Object p){

//		if (p.equals(getX())) {
//			return true;
//		}
		
		Point2D newP = (Point2D) p ;
		 
		if ((getX() == newP.getX()) && (getY() == newP.getY())) {
			return true;
		}
		
		return false;
		
	}
	

	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#equals(double, double)
	 */
	public boolean equals(double x2, double y2){
		
		if (getX() == x2 && getY() == y2) {
			return true;
		}
		
		return false;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#getDistance(sef.module5.activity.Point2D)
	 */
	public final double getDistance(Point2D p){
		
		return Math.sqrt (Math.pow((getX()-p.getX()), 2) + Math.pow((getY()-p.getY()), 2));
		
	}
	
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point2D#getDistance(double, double)
	 */
	public final double getDistance(double x2, double y2){
		
		return Math.sqrt (Math.pow((getX()-x2), 2) + Math.pow((getY()-y2), 2));
		
	}
	
	
	
}
