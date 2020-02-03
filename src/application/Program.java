package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class Program {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		
		SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
		
		
		System.out.print("Room number: ");
		int number = sc.nextInt();
		System.out.print("Check-in (dd/MM/yyyy)");
		Date checkIn = sdf.parse(sc.next());
		System.out.print("Check-out (dd/MM/yyyy)");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Error in reservation: Reservation dates for update must be future dates");
		} else {
			Reservation res = new Reservation(number, checkIn, checkOut);
			System.out.println("Reservation: "+res);
			
			System.out.println();
			System.out.println("Enter data to update the reservation");
			System.out.print("Check-in (dd/MM/yyyy)");
			checkIn = sdf.parse(sc.next());
			System.out.println("Check-out (dd/MM/yyyy)");
			checkOut = sdf.parse(sc.next());
			res.updateDates(checkIn, checkOut); 
			
			
			System.out.println("Reservation: "+res);
		}
		
		 

	}

}
