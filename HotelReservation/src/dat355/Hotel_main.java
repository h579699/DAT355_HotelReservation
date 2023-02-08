package dat355;

import dat355.models.*;

public class Hotel_main {

	public static void main(String[] args) {
		// Init variables
		HotelCompany hCompany = new HotelCompany("Hotel Company");
		Hotel hotel = new Hotel("Sunset Hotel", "Hotel Address", hCompany);
		Room room1 = new Room("100", "5.floor", hotel);
		Room room2 = new Room("80", "1.floor", hotel);
		hotel.addRoom(room1);
		hotel.addRoom(room2);
		Person person = new Person("Jens", "Jens Address");
		
		// Booking room1
		Booking booking1 = new Booking("01/02/2023", "08/02/2023", "12:00", "12:00", "1", "1234 5678", person);
		room1.addBooking(booking1);
		room1.book();
		System.out.println("Room 1 state: " + room1.getStateFullName() + ", bookings: " + room1.numberOfBookings());
		
		// Canceling room1
		room1.cancel();
		room1.removeBooking(booking1);
		System.out.println("Room 1 state: " + room1.getStateFullName() + ", bookings: " + room1.numberOfBookings());
		
		// Booking room2
		room2.addBooking(booking1);
		room2.book();
		System.out.println("Room 2 state: " + room2.getStateFullName() + ", bookings: " + room2.numberOfBookings());
		System.out.println("Person bookings: " + person.getBookings().size());
	}

}
