package org.example.entities;

import java.util.*;

import lombok.*;

@Getter
@Setter
@EqualsAndHashCode
public class Dev {
    private String name;
    private Set<Mentoring> mentoring = new HashSet<>();
    private Set<Activity> activities = new HashSet<>();
    @Getter(AccessLevel.NONE)
    @Setter(AccessLevel.NONE)
    private Set<Activity> watching = new HashSet<>();
    private Set<Activity> complete = new HashSet<>();

    public Dev(String name) {
        this.name = name;
    }

    public void subscribe(Bootcamp bootcamp) {
        this.watching.addAll(bootcamp.getActivities());
    }

    public void progress() {
        this.watching.stream().findFirst().ifPresent( activity -> {
            this.complete.add(activity);
            this.watching.remove(activity);
        });
    }

    public int totalXP() {
        return complete.stream().mapToInt(Activity::getWorkload).sum();
    }

    public String getName() {return name;}

    public  Set<Activity> getWatching() { return watching; }
}