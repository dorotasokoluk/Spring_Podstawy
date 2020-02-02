package eu.sda.spring.MVCLombokPodstawy.model;


import lombok.Builder;
import lombok.Data;

import java.util.Date;
@Data
@Builder
public class Project {
    private String name;
    private Date startDate;
    private int team;

}
