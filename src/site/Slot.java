package site;

import java.time.LocalTime;
/**
 * Class Slot - un creneau pour date et pour activité
 * @author Irina
 *
 */
public class Slot {
	// --- VARIABLES
	// id de creneau
	private int id;
	// Heure de debut de creneau
	private LocalTime startHour; 
	// Durée de creneau en minutes
	private int duration;
	// Nombre de places disponible pour creneau
	private int numSeatsAvailable = 0;
	// Creneau creuse si true, à default creneau plein tarif
	private boolean offPeakHour = false;
	// Id de monitor affecté pour creneau
	private int idMonitor = 0;
	// Id d'operator affecté pour creneau
    private int idOperator = 0;

	// CONSTRUCTORS
    public Slot(int id, LocalTime startHour, int duration) {
    	this.id = id;
    	this.startHour = startHour;
    	this.duration = duration;   	
    }
	public Slot(int id, LocalTime startHour, int duration, int numSeatsAvailable) {
		this.id = id;
		this.startHour = startHour;
		this.duration = duration;
		this.numSeatsAvailable = numSeatsAvailable;
	}
	

	public boolean isOffPeakHour() {
		return offPeakHour;
	}
	public void setOffPeakHour(boolean offPeakHour) {
		this.offPeakHour = offPeakHour;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalTime getStartHour() {
		return startHour;
	}

	public void setStartHour(LocalTime startHour) {
		this.startHour = startHour;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public int getNumSeatsAvailable() {
		return numSeatsAvailable;
	}

	public void setNumSeatsAvailable(int numSeatsAvailable) {
		this.numSeatsAvailable = numSeatsAvailable;
	}
	@Override
	public String toString() {
		return "Slot [id=" + id + ", startHour=" + startHour + ", duration=" + duration + ", numSeatsAvailable="
				+ numSeatsAvailable + ", offPeakHour=" + offPeakHour + "]";
	}

	
	
	
}
    

