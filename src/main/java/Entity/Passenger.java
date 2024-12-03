package Entity;

import lombok.Data;

@Data
public class Passenger {
    private String name;
    private Long phno;
    private String jdata;
    private String from;
    private  String to;
    public Integer trainno;
}
