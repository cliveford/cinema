package org.cliveford.cinema;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.anyOf;
import static org.hamcrest.Matchers.is;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


public class RandomTicketAllocatorTest {

    @Test
    @DisplayName("Random Ticket Allocator should return an int between 1 and 3")
    public void checkThatRandomTicketAllocatorReturnsOneToThreeTickets() {
        RandomTicketAllocator randomTicketAllocator = new RandomTicketAllocator();
        assertThat(randomTicketAllocator.getNumberOfTickets(), anyOf(is(1), is(2), is(3)));
    }

    @Test
    @DisplayName("Stub should return int with value of 2")
    public void checkThatStubWorksAsExpected() {
        RandomTicketAllocator randomTicketAllocator = mock(RandomTicketAllocator.class);
        when(randomTicketAllocator.getNumberOfTickets()).thenReturn(2);
        int actualResult = randomTicketAllocator.getNumberOfTickets();
        assertEquals(2, actualResult);

    }

}
