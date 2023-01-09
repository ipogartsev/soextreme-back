package models;

import java.util.ArrayList;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Class Activity - represent un fichier d'information sur activité proposée par entreprise
 * @author Irina
 */
public class Activity {
	// VARIABLES
	// id unique d'activité
	private int id;
	// titre de l'activité
    private String title;
    // description de l'activité
    private String description;
    // URL de l'image de l'activité
    private String imgURL;
    // Tarif de l'activité en euros par personne
    private double price = 50.0;
    // Nombre maximal de personnes par creneau (5 personnes maximum par default
    private int numMaxPerson = 5;
    // Si l'activité est sur simulateur - true (true par default)
    private boolean simulator = true;
    // Si l'activité est accesible pour des personnes avec mobilité reduite (false par default)
    private boolean accesHandicap = false;
    // Les avis de clients ayant participés l'activité
    private ArrayList<Comment> comments;
    // Les dates proposées por l'activité
    private ArrayList<Schedule> schedules;
    
    // CONSTRUCTEURS
	public Activity(int id, String title) {
		this.id = id;
		this.title = title;
		this.description = "";
		this.imgURL = "";
		this.schedules = new ArrayList<Schedule>();
		this.comments = new ArrayList<Comment>();
	}
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
	public int getNumMaxPerson() {
		return numMaxPerson;
	}
	public void setNumMaxPerson(int numMaxPerson) {
		this.numMaxPerson = numMaxPerson;
	}
	public ArrayList<Schedule> getSchedules() {
		return schedules;
	}
	public void setSchedules(ArrayList<Schedule> schedules) {
		this.schedules = schedules;
	}
	
	/**
	 * Formater string en localDate
	 * @param date String "d/MM/yyyy"
	 */
	public LocalDate formatStringDate(String date) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/MM/yyyy");
		//convert String to LocalDate
		LocalDate localDate = LocalDate.parse(date, formatter);
		return localDate;
	}
	
	/**
	 * Creation de tableau de dates pour l'activité
	 * @param startDate Date de debut de period
	 * @param endDate Date de fin de period
	 */
	public void setActivityCalendar(LocalDate startDate, LocalDate endDate) {
		// Créer le tableau de dates
		ArrayList<Schedule> schedules = new ArrayList<Schedule>();
		// Ajouter 1 journée pour endDate pour comparaison
		endDate = endDate.plusDays( 1 );
		// Tant que startDate est not égale endDate créer une instance de schedule et l'ajouter au tableau
		do {
			schedules.add(new Schedule(startDate));
			startDate = startDate.plusDays(1);
		}while(!startDate.equals(endDate));
		this.setSchedules(schedules);
	}
	@Override
	public String toString() {
		return "Activity [schedules=" + schedules + "]";
	}
}