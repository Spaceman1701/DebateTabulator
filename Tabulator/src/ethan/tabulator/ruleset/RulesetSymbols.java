package ethan.tabulator.ruleset;

/**
 * Created by Ethan on 2/21/2017.
 */
public final class RulesetSymbols {

    public static final String TAG_RULESET = "ruleset";
    public static final String TAG_GLOBAL_RULES = "global_rules";
    public static final String TAG_ROUND_PAIRING = "round_pairing";
    public static final String TAG_ROUND_RANGE = "round_range";
    public static final String TAG_ROUND_RESULT = "round_result";
    public static final String TAG_ROUND = "round";
    public static final String TAG_METHOD = "method";
    public static final String TAG_RULE = "rule";
    public static final String TAG_RESULT_DATA = "result_data";
    public static final String TAG_BRACKET_ORG = "bracket_org";
    public static final String TAG_BRACKET_FILTER = "filter";
    public static final String TAG_BRACKET_ODD_RULE = "odd_rule";
    public static final String TAG_JUDGE_PAIRING = "judge_pairing";

    public static final class RulesetTag {
        public static final String NAME = "name";
        public static final String APPLICATION = "application";
        private RulesetTag() {throw new AssertionError();}
    }

    public static final class RuleTag {
        public static final String PROP_OPERATION = "operation";
        public static final String PROP_VALUE = "value";
        public static final String PROP_PRIORITY = "priority";
        private RuleTag() {throw new AssertionError();}
    }

    public static final class RoundPairingTag {
        public static final String PROP_REQUIRE_RESULT_HISTORY = "requires_result_history";
        private RoundPairingTag() {throw new AssertionError();}
    }

    public static final class MethodTag {
        public static final String VAR_TYPE = "type";
        public static final String VAR_NAME = "name";
        public static final String VAR_PRIORITY = "priority";
        private MethodTag() {throw new AssertionError();}
    }

    public static final class BracketOrgTag {
        public static final String VAR_METHOD = "method";
        private BracketOrgTag() {throw new AssertionError();}
    }

    public static final class RoundTag {
        public static final String VAR_NAME = "name";
        private RoundTag() {throw new AssertionError();}
    }

    public static final class BracaketTag {
        public static final String VAR_LEVEL = "level";
        public static final String VAR_NAME = "name";
        private BracaketTag() {throw new AssertionError();}
    }

    public static final class FilterTag {
        public static final String VAR_TYPE = "type";
        public static final String VAR_VALUE = "value";
        private FilterTag() {new AssertionError();}
    }


    private RulesetSymbols() {throw new AssertionError();}
}
