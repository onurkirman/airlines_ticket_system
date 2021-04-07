# Airlines Ticket System
    Airlines Ticket System ( **ATS** ) is a project that basicaly simulates the real ticket system at airports.
    Airline Companies, Flights, Routes, Airports and Tickets are creatable and deletable objects and can 
    be assigned to multiple other objects whenever it is required.
    
    Requirements are:
        - [x] Airline Companies should be addable and removable
        - [x] Airports should be addable and removable
        - [x] Flights should be addable and removable
        - [x] Routes should be addable and removable
        - [x] Tickets should be addable and removable
            - [x] In transition process Credit Card information that bought a Ticket 
                  must be masked. (“4221161122330005” -> “422116******0005”).
            - [x] Also, in transition process the validation must be done for non-
                  integer elements/characters.
            - [x] In transition process, after every 10% increase in the quota,
                  the price of the particular flight must be incremented 10%.
        - [x] Searches and deletions with Ticket numbers should be added.
        - [ ] Unit testing for non-private methods should be implemented.
        
    Note that: "x" implies to implemented features while blank ones are the opposite.
    
    