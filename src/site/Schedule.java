package site;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;


/**
 * 
 */
public class Schedule {
	private int id;
    private LocalDate date;
    private ArrayList<Slot> slots;



	/**
     * Default constructor
     */
 	public Schedule(LocalDate date, int startHour, int endHour, int duration) {
 		
		this.date = date;
		// Instance de liste de creneaux
		System.out.println("Slot generation");
		this.slots = generateSlots(startHour, endHour, duration);
	}

 	
 	


	public  static ArrayList<Slot> generateSlots(int startHour, int endHour, int duration) {
		// instance de tableau de creneaux
    	ArrayList<Slot> slots = new ArrayList<Slot>();
    	// definir le debut de slot
    	LocalTime slotStart = LocalTime.of(startHour, 0);
    	// definir la fin de slots
    	LocalTime slotsEnd = LocalTime.of(endHour, 0);
    	int slotId = 1;
    	do {
    		//Instance de Slot
    		Slot slot = null;
    		slot = new Slot(slotId, slotStart, duration );
			// Ajouter le slot dans la liste de slots
			slots.add(slot);
			// definir le nouveau slot
			slotStart = slotStart.plusMinutes(duration);
			// definir nouveau id
			slotId++;
	    } while(!slotStart.equals(slotsEnd));
	
    	return slots;
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


}