package ethan.tabulator.round;

/**
 * Created by Ethan on 2/20/2017.
 */
public class Code {
    private String value;

    private int schoolCode;

    public Code(String value, int schoolCode) {
        this.value = value;
        this.schoolCode = schoolCode;
    }

    public String getCode() {
        return value;
    }

    public int getSchoolCode() {
        return schoolCode;
    }
}
