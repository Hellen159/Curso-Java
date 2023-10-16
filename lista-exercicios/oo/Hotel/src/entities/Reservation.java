package entities;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class Reservation {
	private Integer roomNumber;
	private Date checkin;
	private Date checkout;
	
	public Reservation() {
		
	}
	public Reservation(int roomNumber, Date checkin, Date checkout) {
		this.roomNumber = roomNumber;
		this.checkin = checkin;
		this.checkout = checkout;
	}
	public Integer getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(Integer roomNumber) {
		this.roomNumber = roomNumber;
	}
	public Date getCheckin() {
		return checkin;
	}
	public void setCheckin(Date checkin) {
		this.checkin = checkin;
	}
	public Date getCheckout() {
		return checkout;
	}
	public void setCheckout(Date checkout) {
		this.checkout = checkout;
	}
	
	public long duration(Date checkin, Date checkout) {
		@SuppressWarnings("deprecation")
		int diaCheckin = checkin.getDate();
		int mesCheckin = checkin.getMonth();
		int anoCheckin = checkin.getYear();
		
		int diaCheckout = checkout.getDate();
		int mesCheckout = checkout.getMonth();
		int anoCheckout = checkout.getYear();
		
		LocalDate data1 = LocalDate.of(anoCheckin, mesCheckin, diaCheckin);
	    LocalDate data2 = LocalDate.of(anoCheckout, mesCheckout, diaCheckout);

	    long diferencaEmDias = ChronoUnit.DAYS.between(data1, data2);
		
	    return diferencaEmDias;
	}
	
	public void upDateDates(Date checkin, Date checkout){
		setCheckin(checkin);
		setCheckout(checkout);
	}
	
	@Override
	public String toString() {
		return "Reservation: "+ "Room: " + roomNumber  + duration(checkin, checkout) +
				"checkin: "+getCheckin() + "checkout: " + getCheckout();
	}
	
}
