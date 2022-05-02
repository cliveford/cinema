package org.cliveford.cinema;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

class BookTicketsTest {

    @Test
    @DisplayName("Stub should return int with value of 2")
    public void checkThatStubWorksAsExpected() {
        RandomTicketAllocator randomTicketAllocator = mock(RandomTicketAllocator.class);
        when(randomTicketAllocator.getNumberOfTickets()).thenReturn(2);
        int actualResult = randomTicketAllocator.getNumberOfTickets();
        assertEquals(2, actualResult);

    }

    @Test
    @DisplayName("Stub should return 2d Array List that equals production 2d Array List")
    public void checkThatTestListEqualsProductionList() {
        ArrayList<ArrayList<Integer>> testList = new ArrayList<>();
        ArrayList<Integer> rowA = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        ArrayList<Integer> rowB = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        ArrayList<Integer> rowC = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        testList.add(rowA);
        testList.add(rowB);
        testList.add(rowC);

        Auditorium testAuditorium = mock(Auditorium.class);
        when(testAuditorium.getAuditorium()).thenReturn(testList);
        ArrayList<ArrayList<Integer>> mockedList = testAuditorium.getAuditorium();

        Auditorium auditorium = new Auditorium();
        ArrayList<ArrayList<Integer>> productionList = auditorium.getAuditorium();

        assertEquals(mockedList, productionList);

    }

    @Test
    @DisplayName("Stub should return 2d Array List that does not equal production 2d Array List")
    public void checkThatTestListDoesNotEqualProductionList() {
        ArrayList<ArrayList<Integer>> testList = new ArrayList<>();
        ArrayList<Integer> rowA = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        ArrayList<Integer> rowB = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        ArrayList<Integer> rowC = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        testList.add(rowA);
        testList.add(rowB);
        testList.add(rowC);

        Auditorium testAuditorium = mock(Auditorium.class);
        when(testAuditorium.getAuditorium()).thenReturn(testList);
        ArrayList<ArrayList<Integer>> mockedList = testAuditorium.getAuditorium();

        Auditorium auditorium = new Auditorium();
        ArrayList<ArrayList<Integer>> productionList = auditorium.getAuditorium();

        assertNotEquals(mockedList, productionList);

    }

    @Test
    @DisplayName("Should return 'Sorry the Auditorium is full' message")
    public void checkThatCorrectMessageIsReturnedFromBookTickets() {
        ArrayList<ArrayList<Integer>> testList = new ArrayList<>();
        ArrayList<Integer> rowA = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        ArrayList<Integer> rowB = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        ArrayList<Integer> rowC = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        testList.add(rowA);
        testList.add(rowB);
        testList.add(rowC);

        Auditorium testAuditorium = mock(Auditorium.class);
        when(testAuditorium.getAuditorium()).thenReturn(testList);

        RandomTicketAllocator randomTicketAllocator = new RandomTicketAllocator();
        BookTickets bookTickets = new BookTickets(randomTicketAllocator, testAuditorium);

        String expectedMessage = "Sorry the Auditorium is full";
        String actualMessage = bookTickets.booking();

        assertEquals(expectedMessage, actualMessage);

    }

    @Test
    @DisplayName("Should return correct seats booked message")
    public void checkThatCorrectSeatsMessageIsReturnedFromBookTickets() {
        ArrayList<ArrayList<Integer>> testList = new ArrayList<>();
        ArrayList<Integer> rowA = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 0));
        ArrayList<Integer> rowB = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        ArrayList<Integer> rowC = new ArrayList<>(Arrays.asList(0, 0, 0, 0, 0));
        testList.add(rowA);
        testList.add(rowB);
        testList.add(rowC);

        Auditorium testAuditorium = mock(Auditorium.class);
        when(testAuditorium.getAuditorium()).thenReturn(testList);

        RandomTicketAllocator randomTicketAllocator = mock(RandomTicketAllocator.class);
        when(randomTicketAllocator.getNumberOfTickets()).thenReturn(3);

        BookTickets bookTickets = new BookTickets(randomTicketAllocator, testAuditorium);

        String expectedMessage = "Tickets booked - Row:A Seat number:5 Row:B Seat number:1 Row:B Seat number:2";
        String actualMessage = bookTickets.booking();

        assertEquals(expectedMessage, actualMessage);

    }

    @Test
    @DisplayName("Should return Auditorium full when only 2 seats are unbooked and three are requested")
    public void checkThatAuditoriumIsFullMessageIsReturned() {
        ArrayList<ArrayList<Integer>> testList = new ArrayList<>();
        ArrayList<Integer> rowA = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        ArrayList<Integer> rowB = new ArrayList<>(Arrays.asList(1, 1, 1, 1, 1));
        ArrayList<Integer> rowC = new ArrayList<>(Arrays.asList(1, 1, 1, 0, 0));
        testList.add(rowA);
        testList.add(rowB);
        testList.add(rowC);

        Auditorium testAuditorium = mock(Auditorium.class);
        when(testAuditorium.getAuditorium()).thenReturn(testList);

        RandomTicketAllocator randomTicketAllocator = mock(RandomTicketAllocator.class);
        when(randomTicketAllocator.getNumberOfTickets()).thenReturn(3);

        BookTickets bookTickets = new BookTickets(randomTicketAllocator, testAuditorium);

        String expectedMessage = "Sorry the Auditorium is full";
        String actualMessage = bookTickets.booking();

        assertEquals(expectedMessage, actualMessage);

    }

}