package org.cliveford.cinema;

import java.util.Random;

public class RandomTicketAllocator {

    private final int NUMBER_OF_TICKETS;

    public RandomTicketAllocator() {

        Random random = new Random();
        NUMBER_OF_TICKETS = random.nextInt(3) + 1;

    }

    public int getNumberOfTickets() {
        return NUMBER_OF_TICKETS;
    }
}
