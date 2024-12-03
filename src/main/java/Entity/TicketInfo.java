package Entity;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
public class TicketInfo {
    private int ticketId;
    private String pnr;
    private String ticketStatus;
    public void setTicketId(int ticketId) {
        this.ticketId = ticketId;
    }

    // Setter for pnr
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    // Setter for ticketStatus
    public void setTicketStatus(String ticketStatus) {
        this.ticketStatus = ticketStatus;
    }

    // Getters (if needed)
    public int getTicketId() {
        return ticketId;
    }

    public String getPnr() {
        return pnr;
    }

    public String getTicketStatus() {
        return ticketStatus;
    }


}