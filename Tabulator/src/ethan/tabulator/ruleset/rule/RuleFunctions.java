package ethan.tabulator.ruleset.rule;

import ethan.tabulator.round.DebateRound;
import ethan.tabulator.round.Round;
import ethan.tabulator.round.Side;
import ethan.tabulator.round.TournamentRound;
import ethan.tabulator.tournament.RoundHistory;
import ethan.tabulator.tournament.Tournament;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Map;
import java.util.Set;

import static ethan.tabulator.ruleset.rule.RuleFunctions.BALANCE_SIDES;
import static javafx.scene.input.KeyCode.T;

/**
 * Created by Ethan on 2/21/2017.
 */
@SuppressWarnings("unchecked")
public final class RuleFunctions {
    public static final String MEETING_SWITCH_SIDES = "MEETING_SWITCH_SIDES";
    public static final String BALANCE_SIDES = "BALANCE_SIDES";
    public static final String TEAMS_FROM_SAME_SCHOOL = "TEAMS_FROM_SAME_SCHOOL";
    public static final String TEAMS_MET_BEFORE = "TEAMS_MET_BEFORE";
    public static final String TEAM_MET_SCHOOL_BEFORE = "TEAM_MET_SCHOOL_BEFORE";

    public static final String SAME_BRACKET = "SAME_BRACKET";


    private RuleFunctions() {}

    public static String targetTypeToString(int targetType) {
        switch (targetType) {
            case RuleData.SIDED_DEBATE:
                return "Sided Debate";
            case RuleData.UNSIDED_DEBATE:
                return "Unsided Debate";
            case RuleData.SPEECH:
                return "Speech";
            case RuleData.ALL:
                return "All";
            default:
                return "Combination";
        }
    }

    public static Rule getRule(String name, int targetType) {
        Class[] rules = RuleFunctions.class.getDeclaredClasses();

        for (Class rule : rules) {
            RuleData ruleData = (RuleData)rule.getDeclaredAnnotation(RuleData.class);
            if (ruleData.name().equals(name) && ((targetType & ruleData.target()) == targetType)) {
                try {
                    return (Rule)rule.newInstance();
                } catch (Exception e) {
                    e.printStackTrace();
                    System.exit(-1); //this would be bad
                }
            }
        }

        throw new RuleNotFoundException("Searched for: " + name + ", targeting: " + targetTypeToString(targetType));
    }

    @RuleData(name = MEETING_SWITCH_SIDES, target = RuleData.SIDED_DEBATE)
    public class MeetingSwitchSides implements Rule {
        @Override
        public boolean testRound(Round round, RoundHistory history) {
            List<TournamentRound<DebateRound>> allRounds = (List)history.getAllRounds(); //I don't really like this.. but It seems like the best way to do it
            DebateRound debateRound = (DebateRound)round;

            if (allRounds.size() > 0) {
                TournamentRound<DebateRound> previousRound = allRounds.get(allRounds.size() - 1);

                for (DebateRound rd : previousRound.getRounds()) {
                    if (rd.getCompetitors().containsAll(round.getCompetitors())) {
                        return !rd.getAff().equals(debateRound.getAff());
                    }
                }
            }
            return true;
        }
    }

    @RuleData(name = BALANCE_SIDES, target = RuleData.SIDED_DEBATE)
    public class BalanceSides implements Rule {
        @Override
        public boolean testRound(Round round, RoundHistory history) {
            DebateRound debateRound = (DebateRound) round;

            List<Round> affHistory = history.getTeamHistory(debateRound.getAff());
            int affNumAff = 0, affNumNeg = 0;
            for (Round r : affHistory) {
                DebateRound dr = (DebateRound) r;
                if (dr.getTeamSide(debateRound.getAff()) == Side.AFF) {
                    affNumAff++;
                } else {
                    affNumNeg++;
                }
            }

            List<Round> negHistory = history.getTeamHistory(debateRound.getNeg());
            int negNumAff = 0, negNumNeg = 0;
            for (Round r : negHistory) {
                DebateRound dr = (DebateRound) r;
                if (dr.getTeamSide(debateRound.getNeg()) == Side.AFF) {
                    negNumAff++;
                } else {
                    negNumNeg++;
                }
            }
            return (affNumAff <= affNumNeg) && (negNumNeg <= negNumAff);
        }
    }

}
