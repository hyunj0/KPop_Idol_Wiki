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

    public static final KPopIdol[] CUBE_ARTISTS = {
            new KPopIdol(R.drawable.jihyun, "Jihyun", "4Minute"),
            new KPopIdol(R.drawable.gayoon, "Gayoon", "4Minute"),
            new KPopIdol(R.drawable.jiyoon, "Jiyoon", "4Minute"),
            new KPopIdol(R.drawable.hyuna, "Hyuna", "4Minute"),
            new KPopIdol(R.drawable.sohyun, "Sohyun", "4Minute"),
            new KPopIdol(R.drawable.doojoon, "Doojoon", "B2ST"),
            new KPopIdol(R.drawable.hyunseung, "Hyunseung", "B2ST"),
            new KPopIdol(R.drawable.junhyung, "Junhyung", "B2ST"),
            new KPopIdol(R.drawable.yoseob, "Yoseob", "B2ST"),
            new KPopIdol(R.drawable.kikwang, "Kikwang", "B2ST"),
            new KPopIdol(R.drawable.dongwoon, "Dongwoon", "B2ST"),
            new KPopIdol(R.drawable.gna, "G.Na", "Solo Artist"),
            new KPopIdol(R.drawable.eunkwang, "Eunkwang", "BTOB"),
            new KPopIdol(R.drawable.minhyuk, "Minhyuk", "BTOB"),
            new KPopIdol(R.drawable.changsub, "Changsub", "BTOB"),
            new KPopIdol(R.drawable.hyunsik, "Hyunsik", "BTOB"),
            new KPopIdol(R.drawable.peniel, "Peniel", "BTOB"),
            new KPopIdol(R.drawable.ilhoon, "Ilhoon", "BTOB"),
            new KPopIdol(R.drawable.sungjae, "Sungjae", "BTOB"),
    };

    public static final KPopIdol[] FNC_ARTISTS = {
            new KPopIdol(R.drawable.jonghun, "Jonghun", "FT Island"),
            new KPopIdol(R.drawable.hongki, "Hongki", "FT Island"),
            new KPopIdol(R.drawable.jaejin, "Jaejin", "FT Island"),
            new KPopIdol(R.drawable.seunghyun, "Seunghyun", "FT Island"),
            new KPopIdol(R.drawable.minhwan, "Minhwan", "FT Island"),
            new KPopIdol(R.drawable.yonghwa, "Yonghwa", "CNBlue"),
            new KPopIdol(R.drawable.shinee_jonghyun, "Jonghyun", "CNBlue"),
            new KPopIdol(R.drawable.minhyuk, "Minhyuk", "CNBlue"),
            new KPopIdol(R.drawable.jungshin, "Jungshin", "CNBlue"),
            new KPopIdol(R.drawable.choa, "Choa", "AOA"),
            new KPopIdol(R.drawable.jimin, "Jimin", "AOA"),
            new KPopIdol(R.drawable.yuna, "Yuna", "AOA"),
            new KPopIdol(R.drawable.youkyoung, "Youkyoung", "AOA"),
            new KPopIdol(R.drawable.hyejeong, "Hyejeong", "AOA"),
            new KPopIdol(R.drawable.mina, "Mina", "AOA"),
            new KPopIdol(R.drawable.seolhyun, "Seolhyun", "AOA"),
            new KPopIdol(R.drawable.chanmi, "Chanmi", "AOA"),
    };

    public static final KPopIdol[] JYP_ARTISTS = {
            new KPopIdol(R.drawable.yubin, "Yubin", "Wonder Girls"),
            new KPopIdol(R.drawable.yeeun, "Yeeun", "Wonder Girls"),
            new KPopIdol(R.drawable.sunmi, "Sunmi", "Wonder Girls"),
            new KPopIdol(R.drawable.hyelim, "Hyelim", "Wonder Girls"),
            new KPopIdol(R.drawable.junk, "Jun.K", "2PM"),
            new KPopIdol(R.drawable.nichkhun, "Nichkhun", "2PM"),
            new KPopIdol(R.drawable.taecyeon, "Taecyeon", "2PM"),
            new KPopIdol(R.drawable.wooyoung, "Wooyoung", "2PM"),
            new KPopIdol(R.drawable.junho, "Junho", "2PM"),
            new KPopIdol(R.drawable.chansung, "Chansung", "2PM"),
            new KPopIdol(R.drawable.fei, "Fei", "Miss A"),
            new KPopIdol(R.drawable.jia, "Jia", "Miss A"),
            new KPopIdol(R.drawable.min, "Min", "Miss A"),
            new KPopIdol(R.drawable.suzy, "Suzy", "Miss A"),
            new KPopIdol(R.drawable.changmin, "Changmin", "2AM"),
            new KPopIdol(R.drawable.seulong, "Seulong", "2AM"),
            new KPopIdol(R.drawable.jokwon, "Jokwon", "2AM"),
            new KPopIdol(R.drawable.jinwoon, "Jinwoon", "2AM"),
            new KPopIdol(R.drawable.mark, "Mark", "GOT7"),
            new KPopIdol(R.drawable.jb, "JB", "GOT7"),
            new KPopIdol(R.drawable.jackson, "Jackson", "GOT7"),
            new KPopIdol(R.drawable.jr, "Jr", "GOT7"),
            new KPopIdol(R.drawable.youngjae, "Youngjae", "GOT7"),
            new KPopIdol(R.drawable.bambam, "BamBam", "GOT7"),
            new KPopIdol(R.drawable.yugyeom, "Yugyeom", "GOT7"),
    };

    public static final KPopIdol[] LOEN_ARTISTS = {

    };


    public static final KPopIdol[] PLEDIS_ARTISTS = {
            new KPopIdol(R.drawable.jungah, "Jungah", "After School"),
            new KPopIdol(R.drawable.uee, "UEE", "After School"),
            new KPopIdol(R.drawable.raina, "Raina", "After School"),
            new KPopIdol(R.drawable.nana, "Nana", "After School"),
            new KPopIdol(R.drawable.lizzy, "Lizzy", "After School"),
            new KPopIdol(R.drawable.e_young, "E-Young", "After School"),
            new KPopIdol(R.drawable.kaeun, "Kaeun", "After School"),
    };

    public static final KPopIdol[] SM_ARTISTS = {

    };

    public static final KPopIdol[] TS_ARTISTS = {

    };

    public static final KPopIdol[] WOOLLIM_ARTISTS = {

    };

    public static final KPopIdol[] YG_ARTISTS = {

    };

    public static final KPopIdol[] NO_ARTISTS = {

    };
}