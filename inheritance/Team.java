package inheritance;

import encapsulation.Person;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Team {

    private String name;
    private List<Person> firstTeam;
    private List<Person> reserveTeam;

    public Team(String name) {
        setName(name);
        this.firstTeam = new ArrayList<>();
        this.reserveTeam = new ArrayList<>();
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Person> getFirstTeam() {
        return Collections.unmodifiableList(this.firstTeam);
    }

    public List<Person> getReserveTeam() {
        return Collections.unmodifiableList(this.reserveTeam);
    }

    public String getName() {
        return this.name;
    }

    public void addPlayer(Person person) {
        if (person.getAge() < 40) {
            firstTeam.add(person);
        } else {
            reserveTeam.add(person);
        }
    }

    public void setFirstTeam(List<Person> firstTeam) {
        this.firstTeam = firstTeam;
    }

    public void setReserveTeam(List<Person> reserveTeam) {
        this.reserveTeam = reserveTeam;
    }


}
