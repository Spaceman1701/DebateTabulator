package ethan.tabulator.ruleset.rule;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by Ethan on 2/21/2017.
 */
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
public @interface RuleData {
    int SIDED_DEBATE = 1;
    int UNSIDED_DEBATE = 2;
    int SPEECH = 4;
    int ALL = SIDED_DEBATE | UNSIDED_DEBATE | SPEECH;

    int target() default ALL;

    String name();
}
