package site;

import java.time.LocalTime;

public class Slot {
	private int id;
	private LocalTime startHour;  
	private int duration;
	private int numSeatsAvailable = 0;
	private boolean offPeakHour = false;
	private int idMonitor = 0;
    private int idOperator = 0;

	// CONSTRUCTORS
	public Slot(int id, LocalTime startHour, int duration, int numSeatsAvailable, boolean offPeakHour) {
		this.id = id;
		this.startHour = startHour;
		this.duration = duration;
		this.numSeatsAvailable = numSeatsAvailable;
		this.offPeakHour = offPeakHour;
	}
	public Slot(int id, LocalTime startHour, int duration) {
		this.id = id;
		this.startHour = startHour;
		this.duration = duration;
		
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
    

