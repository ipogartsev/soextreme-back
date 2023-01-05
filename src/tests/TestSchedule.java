package tests;

import java.time.LocalDate;

import site.Schedule;

public class TestSchedule {

	public static void main(String[] args) {
		// Test slots generation
		LocalDate now = LocalDate.now();
		System.out.println("Date: " + now);
		Schedule schedule = new Schedule(now, 8, 15, 30);
		System.out.println(schedule.toString());
	}

}
