package ethan.tabulator.round.person;

import ethan.tabulator.round.Code;
import ethan.tabulator.round.School;

import java.util.Set;

/**
 * Created by Ethan on 2/20/2017.
 */
public class Judge {
    private Set<School> associations;

    private String name;

    public Judge(String name, Set<School> schools) {
        this.name = name;
        this.associations = schools;
    }

    public String getName() {
        return name;
    }

    public Set<School> getAssociations() {
        return associations;
    }
}
