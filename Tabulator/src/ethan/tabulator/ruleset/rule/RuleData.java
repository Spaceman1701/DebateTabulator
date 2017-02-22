package ethan.tabulator.ruleset.rule;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.EnumSet;

/**
 * Created by Ethan on 2/21/2017.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RuleData {
    int SIDED_DEBATE_T = 1;
    int UNSIDED_DEBATE_T = 2;
    int SPEECH_T = 4;
    int ALL_T = SIDED_DEBATE_T | UNSIDED_DEBATE_T | SPEECH_T;

    int target() default ALL_T;

    String name();
}
