# Cinnamon Cinemas Movie Theatre Seating Challenge  

## Task:  
Develop a program to allocate seats to customers purchasing tickets for a movie theatre.  

## Criteria:  
Well-designed and tested code representing real-world scenarios.  

### Business Requirements:  
The Cinnamon Cinemas movie theatre has 15 seats, arranged in 3 rows of 5.  
Rows are assigned a letter from A to C.  
Seats are assigned a number from 1 to 5.  

### User Story:  
As a Cinnamon Cinemas Movie Theatre Manager, I want to allocate seats to customers,  
so that I can control reserved seating for the theatre.  
GIVEN - a customer wants to request some tickets.  
WHEN - they request a number of seats between 1 and 3 for a movie.  
THEN - the customer should be allocated the required number of seats from the available seats on the seating plan.  
AND - the seats should be recorded as allocated.  

### Acceptance Criteria and Assumptions:  
Write a program that allocates seats based on a random integer 'number of seats' between 1 and 3.  
Your program should allocate the required number of seats from the available seats starting from seat A1  
and filling the Auditorium from left to right, front to back.  
The Auditorium is empty and all seats are available for sale when the program starts.  
The program should continue to allocate a random number of seats until it finds there are not enough seats left  
to complete the request.  
Once there are not enough seats available to be allocated then the program can halt.  


### Process followed:  
I began by sketching out an overview of how I thought the programme should flow.  
I wrote an initial failing test using hamcrest matchers to check that my RandomTicketAllocator class returned a random integer between 1 and 3.  
Refactored RandomTicketAllocator class to pass failing test.  
It was at this point that I reconsidered the bigger picture and started to consider how I could test for non-random integers, I knew this was going to be essential to test for specific scenarios e.g. Only 2 seats remain unbooked and the random integer 'number of seats' is 3 or 2 or 1.  
I realised that I needed a way to control test inputs within my unit tests to enable testing for specific scenarios.  
This led to researching test doubles which eventually led to discovering mockito.  
I created a test in RandomTicketAllocatorTest to test my understanding of mockito mocks and stubs, and it passed.  
I then created an Auditorium class to represent an empty auditorium.  
Wrote test to test Auditorium getter was returning an empty auditorium.  
I created a BookTickets class adhering to dependency inversion principles.  
I wrote two methods within BookTickets class, one checks if the auditorium is full and if it isn't the other loops through the auditorium 2d ArrayList checking for the first unbooked seat, it then books this seat and repeats until all requested seats have been booked, it then returns a message informing the booker of their booked seats rows and seat numbers.  
I wrote various tests within BookTicketsTest class implementing mockito mocks and stubs to test for specific booking scenarios.  
All tests passed.  
I refactored code as I went and tried to adhere to SOLID principles where appropriate.  

### Summary:  
I didn't always stick with a pure TDD approach for the entire project, I think this was due to a lack of understanding regarding test doubles.  
I now feel that my understanding of test doubles and Java principles as a whole has improved to the point that I would be able to apply a pure TDD approach in future projects/programs.  

### Future improvements:  
Add more unit tests

