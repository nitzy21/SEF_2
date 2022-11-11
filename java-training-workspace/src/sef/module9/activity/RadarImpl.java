package sef.module9.activity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Implementation of a Radar
 */
public class RadarImpl implements Radar {

    /**
     * Constructs a new Radar
     */
    List<RadarContact> radarContact;

    public RadarImpl() {
        this.radarContact = new ArrayList<>();
    }

    /*
     * (non-Javadoc)
     * @see
     * sef.module8.activity.Radar#addContact(sef.module8.activity.RadarContact)
     */
    public RadarContact addContact(RadarContact contact) {

        if (contact == null) {
            return null;
        }
        
        for (int i = 0; i < this.getContactCount(); i++) {
            
            if (radarContact.get(i).getContactID().equals(contact.getContactID())) {
                radarContact.get(i).setBearing(contact.getBearing());
                radarContact.get(i).setDistance(contact.getDistance());

                return contact;
            }
        }

        radarContact.add(contact);

        return contact;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#getContact(java.lang.String)
     */
    public RadarContact getContact(String id) {
        
        if (id == null || id.equals("")) {
            return null;
        }
            
        for (RadarContact contact : radarContact) {
            if (contact.getContactID().equals(id)) {
               return contact;
            }
        }

        return null;
        
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#getContactCount()
     */
    public int getContactCount() {

        return this.radarContact.size();
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#removeContact(java.lang.String)
     */
    public RadarContact removeContact(String id) {

        
        RadarContact radarContactTemp = null;
        
        if (id == null || id.equals("")) {
            return null;
        }
          
        for (RadarContact contact : radarContact) {
            if (contact.getContactID().equals(id)) {
                radarContactTemp = contact;
                radarContact.remove(contact);
            }
        }

        return radarContactTemp;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#returnContacts()
     */
    public List<RadarContact> returnContacts() {
        return this.radarContact;
    }

    /*
     * (non-Javadoc)
     * @see sef.module8.activity.Radar#returnContacts(java.util.Comparator)
     */
    public List<RadarContact> returnContacts(Comparator<RadarContact> comparator) {

        Collections.sort(radarContact, comparator);
        List<RadarContact> temp = new ArrayList<>();

        temp.addAll(radarContact);

        return temp;
    }

}
