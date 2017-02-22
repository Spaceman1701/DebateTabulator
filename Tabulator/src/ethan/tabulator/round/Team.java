package ethan.tabulator.round;

import ethan.tabulator.round.person.Competitor;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ethan on 2/20/2017.
 */
public class Team {
    private List<Competitor> competitors;
    private School school;
    private Code code;

    public Team(School school, Code code) {
        this.school = school;
        this.code = code;
        competitors = new ArrayList<>();
    }

    public List<Competitor> getCompetitors() {
        return competitors;
    }
}
