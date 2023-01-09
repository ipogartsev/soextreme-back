package models;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


/**
 * Class Schedule - la date avec des creneau pour activité
 */
public class Schedule {
	//--- VARIABLES
	// Id unique
	private int id;
	// Date de l'activité
    private LocalDate date;
    // Liste de creneaux pour date
    private ArrayList<Slot> slots;

    // CONSTRUCTORS
    /**
     * Default constructor
     * @param date Date pour Activité
     * @param startHour Heure de premier creneau
     * @param endHour Heure de fin de dernier creneau
     * @param duration Durée de l'activité
     */
 	public Schedule(LocalDate date, int startHour, int endHour, int duration, int numSeats) {	
		this.date = date;
		// Instance de liste de creneaux
		System.out.println("Slot generation");
		this.slots = generateSlots(startHour, endHour, duration, numSeats);
	}
 	// Constructor pour date sans creneau
 	public Schedule(LocalDate date) {	
 		this.date = date;
 		this.slots = null;
 	}
 	
 	// METHODES 	
 	/**
 	 * Generer les creneaux entre heure de debut et heure de fin avec durée precise 
 	 * @param startHour Heure de premier creneau
 	 * @param endHour Heure de fin de dernier creneau(fin de la journée)
 	 * @param duration Durée de creneau
 	 * @return Liste de creneaux pour date
 	 */
	public ArrayList<Slot> generateSlots(int startHour, int endHour, int duration, int numSeats) {
		// instance de tableau de creneaux pour date
    	ArrayList<Slot> slots = new ArrayList<Slot>();
    	// Etablir l'heure de debut de creneaux pour une journée
    	LocalTime slotStart = LocalTime.of(startHour, 0);
    	// Etablir la fin de creneaux pour une journée
    	LocalTime slotsEnd = LocalTime.of(endHour, 0);
    	// Etablir id pour le premier creneau
    	int slotId = 1;
    	
    	// Tant que l'heure de creneau curant est moins que l'heure de fin de journée ajouter creneau dans la liste
    	do {
    		//Instance de nouveau creneau
    		Slot slot = null;
    		// Creation de nouveau creneau 
    		slot = new Slot(slotId, slotStart, duration, numSeats);
			// Ajouter le creneau dans la liste de slots
			slots.add(slot);
			// Calculer l'heure de creneau suivant
			slotStart = slotStart.plusMinutes(duration);
			// Calculer id de creneau suivant
			slotId++;
	    } while(!slotStart.equals(slotsEnd));
	
    	return slots;
	}
	

	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	@Override
	public String toString() {
		return "Schedule [slots=" + slots + "]";
	}

	public ArrayList<Slot> getSlots() {
		return slots;
	}

	public void setSlots(ArrayList<Slot> slots) {
		this.slots = slots;
	}
	
	public void setSlotsSeat(ArrayList<Slot> slots) {
		this.slots = slots;
	}


}