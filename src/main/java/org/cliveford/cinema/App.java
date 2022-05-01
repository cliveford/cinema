package org.cliveford.cinema;


public class App 
{
    public static void main( String[] args )
    {
        Auditorium auditorium = new Auditorium();
        System.out.println("auditorium " + auditorium.getAuditorium());
        RandomTicketAllocator randomTicketAllocator = new RandomTicketAllocator();
        System.out.println("random ticket allocator " + randomTicketAllocator.getNumberOfTickets());
        BookTickets bookTickets = new BookTickets(randomTicketAllocator, auditorium);
        System.out.println(bookTickets.booking());

    }
}
