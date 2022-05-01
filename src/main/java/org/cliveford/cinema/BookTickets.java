package org.cliveford.cinema;

import java.util.ArrayList;

public class BookTickets {

    private final int NUMBER_OF_TICKETS;
    private final ArrayList<ArrayList<Integer>> AUDITORIUM;

    public BookTickets(RandomTicketAllocator randomTicketAllocator, Auditorium auditorium) {

        NUMBER_OF_TICKETS = randomTicketAllocator.getNumberOfTickets();
        this.AUDITORIUM = auditorium.getAuditorium();

    }

    private boolean checkIfAuditoriumFull() {
        int seatCheck = 5 - NUMBER_OF_TICKETS;
        return this.AUDITORIUM.get(2).get(seatCheck) == 1;
    }

    public String booking() {
        int seatsToBook = NUMBER_OF_TICKETS;
        StringBuilder seatsBooked = new StringBuilder("Tickets booked - ");
        if (checkIfAuditoriumFull()) {
            return "Sorry the Auditorium is full";
        } else {
            for (int auditoriumRow = 0; auditoriumRow < this.AUDITORIUM.size(); auditoriumRow++) {
                if (seatsToBook == 0) break;
                for (int auditoriumColumn = 0; auditoriumColumn < 5; auditoriumColumn++) {
                    if (seatsToBook > 0) {
                        if (this.AUDITORIUM.get(auditoriumRow).get(auditoriumColumn) == 0) {
                            this.AUDITORIUM.get(auditoriumRow).set(auditoriumColumn, 1);
                            seatsToBook--;
                            if (auditoriumRow == 0) {
                                seatsBooked.append("Row:A " + "Seat number:").append(auditoriumColumn + 1).append(" ");
                            } else if (auditoriumRow == 1) {
                                seatsBooked.append("Row:B " + "Seat number:").append(auditoriumColumn + 1).append(" ");
                            } else {
                                seatsBooked.append("Row:C " + "Seat number:").append(auditoriumColumn + 1).append(" ");
                            }
                        }
                    } else {
                        break;
                    }
                }
            }
        }
        return seatsBooked.toString().trim();
    }
}
