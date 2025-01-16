# Movie Theater Booking System

## Overview
This Java application simulates a movie theater booking system, allowing users to:

- View the seating chart.
- Reserve seats (with suggestions for available seats if the chosen seat is taken).
- Cancel reservations.

The system is designed to provide a user-friendly interface and efficient seat management.

## Features

1. **View Seating Chart**:
   Displays the current layout of the seating arrangement, with indicators for available and reserved seats.

2. **Reserve a Seat**:
   Prompts the user to select a seat. If the seat is already reserved, the system suggests an alternative available seat.

3. **Cancel a Reservation**:
   Allows the user to cancel a reservation for a specific seat, making it available again.


## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/SearchingSteve/TheaterBookingSystem.git
   ```

2. Navigate to the project directory:
   ```bash
   cd TheaterBookingSystem
   ```

3. Compile the Java program:
   ```bash
   javac TheaterSeatingSystem.java
   ```

4. Run the program:
   ```bash
   java TheaterSeatingSystem
   ```

## Usage

1. Launch the application.
2. Follow the menu options to:
   - View the seating chart.
   - Reserve a seat by entering a seat identifier (e.g., `A1`).
   - Cancel a reservation by providing the reserved seat identifier.
3. Exit the application when done.

### Seating Chart Example
The seating chart is displayed as a grid with rows labeled `A` to `I` and columns labeled `1` to `9`. Each seat is represented as:
- `A`: Available
- `R`: Reserved

Example:
```
   1 2 3 4 5 6 7 8 9
A  A A A R A A A A A
B  A R A A A A A A A
C  A A A A A A A A A
```


## License
This project is provided for **personal use only**. Redistribution, modification, or commercial use in any form is strictly prohibited without prior written permission from the author.

## Author
**[Stephen Crocker](https://github.com/SearchingSteve)**

