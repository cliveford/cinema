package org.cliveford.cinema;

import java.util.Random;

public class RandomTicketAllocator {

    private final int TICKET_NUMBER;

    public RandomTicketAllocator() {

        Random random = new Random();
        TICKET_NUMBER = random.nextInt(3);

    }

    public int getTicketNumber() {
        return TICKET_NUMBER;
    }
}
