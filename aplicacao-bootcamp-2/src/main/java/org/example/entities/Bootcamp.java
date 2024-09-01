package org.example.entities;

import java.util.*;

import lombok.*;

import javax.management.ConstructorParameters;

@Getter
@Setter
@EqualsAndHashCode
public class Bootcamp {
    private Set<Dev> devs = new HashSet<>();
    private Set<Activity> activities = new HashSet<>();
    private Set<Mentoring> mentoring = new HashSet<>();

    private Date finalDate;
    private Date initialDate;
    String name;
    String description;

    public Bootcamp(String name, String description, Date initialDate, Date finalDate) {
        this.name = name;
        this.description = description;
        this.initialDate = initialDate;
        this.finalDate = finalDate;
    }

    public Set<Activity> getActivities () {return this.activities;}

}