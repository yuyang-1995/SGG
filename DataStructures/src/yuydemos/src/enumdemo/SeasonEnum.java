package yuydemos.src.enumdemo;

/**
 * Coder: yuyang
 * Date: 2019/11/15
 * Description:
 * Version:
 */
public enum SeasonEnum {

    SPRING("春天", "春风"),
    SUMMER("夏天", "夏河"),
    ;

    private final String seasonName;
    private final String seasonDesc;


    private SeasonEnum(String seasonName, String seasonDesc) {
        this.seasonName = seasonName;
        this.seasonDesc = seasonDesc;
    }



}
