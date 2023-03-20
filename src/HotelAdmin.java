public class HotelAdmin {
    private int id;
    public String age;
    public String contactnum;
    protected String username;
    protected String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getContactnum() {
        return contactnum;
    }

    public void setContactnum(String contactnum) {
        this.contactnum = contactnum;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public HotelAdmin(int id, String age, String contactnum, String username, String password) {
        this.id = id;
        this.age = age;
        this.contactnum = contactnum;
        this.username = username;
        this.password = password;
    }
}
