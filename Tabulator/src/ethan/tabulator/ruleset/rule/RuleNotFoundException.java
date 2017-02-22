package ethan.tabulator.ruleset.rule;

/**
 * Created by Ethan on 2/21/2017.
 */
public class RuleNotFoundException extends RuntimeException {

    public RuleNotFoundException() {
        super();
    }

    public RuleNotFoundException(String message) {
        super(message);
    }
}
