package sef.module9.activity;

/**
 * Implementation of a RadarContact
 * 
 * @author John Doe
 *
 */
public class RadarContactImpl implements RadarContact {

	
	/**
	 * Creates a RadarContact with the specified ID, bearing and distance.  
	 * 
	 * @param contactID the contact's ID
	 * @param bearing the contact's bearing
	 * @param distance the contact's distance
	 */
    
    String contactID;
    double bearing;
    double distance;
    
	public RadarContactImpl(String contactID, double bearing, double distance){
//		this.contactID = contactID;
//		this.bearing = bearing;
//		this.distance = distance;
		
		this.setContactID(contactID);
        this.setBearing(bearing); 
        this.setDistance(distance);
	}
	

	/* (non-Javadoc)
	 * @see sef.module8.activity.RadarContact#getBearing()
	 */
	public final double getBearing() {
		return bearing;
	}
	

	/* (non-Javadoc)
	 * @see sef.module8.activity.RadarContact#setBearing(double)
	 */
	public final void setBearing(double bearing) {
	   
	    if(bearing >= 360) {
            while(bearing >= 360) {
                bearing-=360;
            }
            this.bearing = bearing;
            
        } else if(bearing < 0)  {
            while(bearing < 0) {
                bearing += 360;
            }
            this.bearing = bearing;
            
        } else {
            this.bearing = bearing;
        }
          
		
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.RadarContact#getDistance()
	 */
	public final double getDistance() {
		return distance;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.RadarContact#setDistance(double)
	 */
	public final void setDistance(double distance) {
	    
	    if(distance < 0) {
	        this.distance = 0;
	    } else {	
	        this.distance = distance;
	    }
	    
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.RadarContact#getContactID()
	 */
	public final String getContactID() {
		return contactID;
	}

	/* (non-Javadoc)
	 * @see sef.module8.activity.RadarContact#setContactID(java.lang.String)
	 */
	public final void setContactID(String contactID) {
		this.contactID = contactID;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#toString()
	 */
	public String toString(){
		return this.toString();
	}
}
