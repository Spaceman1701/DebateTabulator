package ethan.tabulator.ruleset;

import ethan.tabulator.ruleset.method.Method;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Ethan on 3/4/2017.
 */
public class PairingGenerator {
    private final Set<Integer> rounds;
    private final List<Method> methods;
    private final Set<Integer> requiredRounds;

    private final boolean needsResults;

    private PairingGenerator(Set<Integer> rounds, List<Method> methods, boolean needsResults, Set<Integer> requiredRounds) {
        this.rounds = rounds;
        this.methods = methods;
        this.needsResults = needsResults;
        this.requiredRounds = requiredRounds;
    }


    public static class PairingGeneratorBuilder {
        private boolean requiresResults;
        private Set<Integer> rounds;
        private List<Method> methods;
        private Set<Integer> requiredRounds;

        public PairingGeneratorBuilder(boolean requiresResults) {
            this.requiresResults = requiresResults;
            rounds = new HashSet<>();
            methods = new ArrayList<>();
            requiredRounds = new HashSet<>();
        }

        public void addRound(int round) {
            rounds.add(round);
        }

        public void addMethod(Method method) {
            methods.add(method);
        }

        public void addRequiredRound(int round) {
            requiredRounds.add(round);
        }

        public PairingGenerator build() {
            return new PairingGenerator(rounds, methods, requiresResults, requiredRounds);
        }
    }
}
