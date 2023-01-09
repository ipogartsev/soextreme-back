package models;

import java.util.ArrayList;

/**
 * 
 */
public class User {
    
	private int id;
    private String firstName;
    private String lastName;
    private String adresse;
    private String email;
    private int phone;
    private String role;
    private ArrayList<Reservation> reservations;
 
    /**
     * Default constructor
     */
    public User(int id, String firstName, String lastName, String adresse, String email, int phone, String role) {
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.adresse = adresse;
		this.email = email;
		this.phone = phone;
		this.role = role;
		this.reservations = new ArrayList<Reservation>();
	}
    
    public int getId() {
		return id;
	}
	public String getEmail() {
		return email;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	/**
     * 
     */
    public void makeReservation() {
        // TODO implement here
    }

    /**
     * 
     */
    public void addComment() {
        // TODO implement here
    }

    /**
     * 
     */
    public void getReservation() {
        // TODO implement here
    }

    /**
     * 
     */
    public void cancelReservation() {
        // TODO implement here
    }

    /**
     * 
     */
    public void resetPassword() {
        // TODO implement here
    }

}