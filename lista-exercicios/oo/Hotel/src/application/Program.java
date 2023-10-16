package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Reservation r = new Reservation();
		
		System.out.println("Room number: \n");
		int roomNumber = sc.nextInt();
		System.out.println("Check-in date (dd/MM/yyyy): \n");
		Date checkin = sdf.parse(sc.next());
		System.out.println("Check-out date (dd/MM/yyyy): \n");
		Date checkout = sdf.parse(sc.next());
		r(roomNumber, checkin, checkout);
		

		
		sc.close();
		
	}

}
