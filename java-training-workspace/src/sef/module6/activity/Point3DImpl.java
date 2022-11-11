package sef.module6.activity;

/**
 * @author  John Doe
 * 
 * This class represents a point in 3D space.  The coordinates are represented by
 * a set of values x, y an z that represents the coordinates along each plane
 */
public class Point3DImpl extends Point2DImpl implements Point3D{
	
	private double z;
	
//	Point2DImpl pointX = new Point2DImpl();
	
	
	/**
	 * Creates a Point3D object with the default coordinate of 0,0,0 
	 *
	 */
	public Point3DImpl(){
		
	}
	
	/**
	 * Creates a Point3D object at the specified coordinates
	 * 
	 * @param x coordinate along the x axis
	 * @param y coordinate along the y axis
	 * @param z coordinate along the z axis
	 */
	public Point3DImpl(double x, double y, double z){
		
		this.x = x;
		this.y = y;
		this.z = z;
		
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#setZ(double)
	 */
	public final void setZ(double z){
		this.z = z;
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#getZ()
	 */
	public final double getZ(){
		return z;
	}
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#move(double, double, double)
	 */
	public void move(double x2, double y2, double z2){
		
		this.x = x2;
		this.y = y2;
		this.z = z2;
		
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#translate(double, double, double)
	 */
	public void translate(double x2, double y2, double z2){
		
		setX(getX() + x2);
		setY(getY() + y2);
		setZ(getZ() + z2);
		
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#equals(double, double, double)
	 */
	public boolean equals(double x2, double y2, double z2){
		
		if (getX() == x2 && getY() == y2 && getZ() == z2) {
			return true;
		}
		
		return false;
	}
	
	
	/**
	 * Compares if the coordinates are equal to the coordinates specified by the parameter
	 * 
	 * @param p the coordinates to compare
	 * 
	 * @return true if the parameter is an instance of Point3D and contain the same coordinates, false otherwise
	 */
	public boolean equals(Object p){
	
		Point3D newP = (Point3D) p ;
		
		if ((getX() == newP.getX()) && (getY() == newP.getY()) && (getZ() == newP.getZ()) ) {
			return true;
		}
		
		return false;
		
	}
	
	
	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#getDistance(sef.module5.activity.Point3D)
	 */
	public double getDistance(Point3D p){
	
		return Math.sqrt (Math.pow((getX()-p.getX()), 2) + Math.pow((getY()-p.getY()), 2)  + Math.pow((getZ()-p.getZ()), 2));
		
	}
	

	/* (non-Javadoc)
	 * @see sef.module5.activity.Point3D#getDistance(double, double, double)
	 */
	public double getDistance(double x2, double y2, double z2){
		
		return Math.sqrt (Math.pow((getX()-x2), 2) + Math.pow((getY()-y2), 2)  +  Math.pow((getZ()-z2), 2));
	
	}
	

}
