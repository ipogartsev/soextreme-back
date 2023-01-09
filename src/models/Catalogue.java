package models;

import java.util.ArrayList;

/**
 * 
 */
public class Catalogue{

	private ArrayList<Activity> catalogue;
    /**
     * Default constructor
     */
    public Catalogue() {
    	this.catalogue = new ArrayList<Activity>();
    }
    public Catalogue(ArrayList<Activity> activity) {
    	this.catalogue = activity;
    }
    
    public ArrayList<Activity> getCatalogue() {
		return catalogue;
	}
	public void setCatalogue(ArrayList<Activity> catalogue) {
		this.catalogue = catalogue;
	}
	// Ajout une activité dans catalogue
    public void addActivity(Activity activity) {
    	this.catalogue.add(activity);
    }
    // Delete activité de catalogue
    public void deleteActivity(Activity activity) {
    	// Rechercher l'index de activité dans catalogue
    	int index = this.catalogue.indexOf(activity);
    	this.catalogue.remove(index);
    }
    // Modifier activité dans catalogue
    public void modifyActivity(Activity activity, int index) {
    	this.catalogue.set(index, activity);
    }
    
    
}