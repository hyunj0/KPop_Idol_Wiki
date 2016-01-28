package c4q.nyc.hyunj0.kpopidolwiki;

public class KPopEntertainmentCompany {

    public static final String CUBE_ENTERTAINMENT = "Cube Entertainment";
    public static final String FNC_ENTERTAINMENT = "FNC Entertainment";
    public static final String JYP_ENTERTAINMENT = "JYP Entertainment";
    public static final String LOEN_ENTERTAINMENT = "Loen Entertainment";
    public static final String PLEDIS_ENTERTAINMENT = "Pledis Entertainment";
    public static final String SM_ENTERTAINMENT = "SM Entertainment";
    public static final String TS_ENTERTAINMENT = "TS Entertainment";
    public static final String WOOLLIM_ENTERTAINMENT = "Woollim Entertainment";
    public static final String YG_ENTERTAINMENT = "YG Entertainment";

    public static final String CUBE_ENTERTAINMENT_FOUNDER = "Hong Seung Sung";
    public static final String FNC_ENTERTAINMENT_FOUNDER = "Han Seong Ho";
    public static final String JYP_ENTERTAINMENT_FOUNDER = "Park Jin Young";
    public static final String LOEN_ENTERTAINMENT_FOUNDER = "Min Yeong Bin";
    public static final String PLEDIS_ENTERTAINMENT_FOUNDER = "Han Sung Soo";
    public static final String SM_ENTERTAINMENT_FOUNDER = "Lee Soo Man";
    public static final String TS_ENTERTAINMENT_FOUNDER = "Kim Tae Song";
    public static final String WOOLLIM_ENTERTAINMENT_FOUNDER = "Lee Jung Yeop";
    public static final String YG_ENTERTAINMENT_FOUNDER = "Yang Hyun Suk";

    private final String name;
    private final String founder;

    public KPopEntertainmentCompany(String name, String founder) {
        this.name = name;
        this.founder = founder;
    }

    public String getName() {
        return this.name;
    }

    public String getFounder() {
        return this.founder;
    }
}