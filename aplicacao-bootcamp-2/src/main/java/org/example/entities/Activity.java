package org.example.entities;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/*@Getter
@Setter
@EqualsAndHashCode*/
public class Activity {
    private String title;
    private String description;
    @Getter
    private int workload;

    public Activity(String title, String description, int workload) {
        this.title = title;
        this.description = description;
        this.workload = workload;
    };

    public int getWorkload() {return this.workload;}
}