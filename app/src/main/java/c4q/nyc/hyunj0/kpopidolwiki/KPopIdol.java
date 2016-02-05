package c4q.nyc.hyunj0.kpopidolwiki;

public class KPopIdol {

    private int idolPic;
    private String idolName;
    private String idolGroup;
    private String entertainmentCompany;

    public KPopIdol(int idolPic, String idolName, String idolGroup) {
        this.idolPic = idolPic;
        this.idolName = idolName;
        this.idolGroup = idolGroup;
    }

    public KPopIdol(int idolPic, String idolName, String idolGroup, String entertainmentCompany) {
        this.idolPic = idolPic;
        this.idolName = idolName;
        this.idolGroup = idolGroup;
        this.entertainmentCompany = entertainmentCompany;
    }

    public int getIdolPic() {
        return idolPic;
    }

    public void setIdolPic(int idolPic) {
        this.idolPic = idolPic;
    }

    public String getIdolName() {
        return idolName;
    }

    public void setIdolName(String idolName) {
        this.idolName = idolName;
    }

    public String getIdolGroup() {
        return this.idolGroup;
    }

    public void setIdolGroup(String idolGroup) {
        this.idolGroup = idolGroup;
    }

    public String getEntertainmentCompany() {
        return this.entertainmentCompany;
    }

    public void setEntertainmentCompany(String entertainmentCompany) {
        this.entertainmentCompany = entertainmentCompany;
    }
}