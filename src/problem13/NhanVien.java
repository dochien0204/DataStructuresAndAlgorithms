package problem13;

public class NhanVien {

    private int id;
    private String name;
    private String birthday;
    private String DEV;

    public NhanVien() {

    }

    public NhanVien(int id, String name, String birthday, String DEV) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.DEV = DEV;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getDEV() {
        return DEV;
    }

    public void setDEV(String DEV) {
        this.DEV = DEV;
    }
}
