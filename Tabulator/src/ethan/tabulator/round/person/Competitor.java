package ethan.tabulator.round.person;

/**
 * Created by Ethan on 2/20/2017.
 */
public class Competitor {

    private String name;

    public Competitor(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object other) {
        if (other.getClass() == Competitor.class) {
            return name.equals(((Competitor)other).name);
        }
        return false;
    }
}
