package org.cliveford.cinema;


public class App 
{
    public static void main( String[] args )
    {
        Auditorium auditorium = new Auditorium();
        RandomTicketAllocator randomTicketAllocator = new RandomTicketAllocator();
        BookTickets bookTickets = new BookTickets(randomTicketAllocator, auditorium);

    }
}
