package com.Suman.CRUD.RestController;

import Entity.Passenger;
import Entity.TicketInfo;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ticket")
public class TicketRestController {

    @PostMapping(value = "/book", produces = "application/json", consumes = "application/json")
    public ResponseEntity<TicketInfo> bookTicket() {
        TicketInfo tinfo = new TicketInfo();
        tinfo.setTicketId(1234);
        tinfo.setPnr("JZL 6868");
        tinfo.setTicketStatus("CONFIRMED");

        return new ResponseEntity<>(tinfo, HttpStatus.CREATED);
    }

    @GetMapping(value = "/tickets/{ticketId}", produces = "application/json")
    public ResponseEntity<TicketInfo> getTicket(@PathVariable int ticketId) {
        // Here you can use ticketId to fetch the TicketInfo from your data source
        // For now, let's just create a dummy TicketInfo object
        TicketInfo tinfo = new TicketInfo();
        tinfo.setTicketId(ticketId);
        tinfo.setPnr("JZL 6868");
        tinfo.setTicketStatus("CONFIRMED");

        return new ResponseEntity<>(tinfo, HttpStatus.OK);

    }
}
