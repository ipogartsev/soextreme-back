package tests;

import java.time.LocalDate;
import java.util.ArrayList;

import site.Activity;
import site.Schedule;

public class TestSchedule {

	public static void main(String[] args) {
		// Test slots generation
		/*LocalDate now = LocalDate.now();
		System.out.println("Date: " + now);
		Schedule schedule = new Schedule(now, 8, 15, 30);
		System.out.println(schedule.toString());*/
		
		// Test calendar de l'activité
		Activity activity1 = new Activity(1, "Saut en parachut");
		String  start = "10/01/2023";
		String  end = "12/01/2023";
		LocalDate startDate = activity1.formatStringDate(start);
		LocalDate endDate = activity1.formatStringDate(end);
		System.out.println(activity1.getTitle());
		
		activity1.setActivityCalendar(startDate, endDate);
		ArrayList<Schedule> tab = activity1.getSchedules();
		int numSeatsAvailable = activity1.getNumMaxPerson();
		for(Schedule line: tab) {
			line.setSlots(line.generateSlots(8, 21, 30, numSeatsAvailable));;
			System.out.println(line.getDate());
			System.out.println(line.getSlots());
		}
	}

	
	
}