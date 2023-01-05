package site;

import java.util.ArrayList;

/**
 * 
 */
public class Activity {
	
	private int id;
    private String title;
    private String description;
    private String imgURL;
    private double price;
    private int numMaxPerson;
    private boolean simulator;
    private boolean accesHandicap;
    private ArrayList<Comment> comments;
    private ArrayList<Schedule> schedules;
    
    // Constructors
	public Activity(int id, String title, String description, String imgURL, double price, int numMaxPerson,
			boolean simulator, boolean accesHandicap) {
		this.id = id;
		this.title = title;
		this.description = description;
		this.imgURL = imgURL;
		this.price = price;
		this.numMaxPerson = numMaxPerson;
		this.simulator = simulator;
		this.accesHandicap = accesHandicap;
		this.schedules = new ArrayList<Schedule>();
		this.comments = new ArrayList<Comment>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
    
    public void addSchedule(Schedule schedule) {
    	// Add creneau
    	this.schedules.add(schedule);
    	// Set nombre de places available pour le creneau
    	schedule.setNumAvailableSeats(this.numMaxPerson);
    }

    

}