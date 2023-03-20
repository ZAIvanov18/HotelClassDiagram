public class Rooms {
    private int id;
    public String details;
    public String requirements;
    public String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public String getRequirements() {
        return requirements;
    }

    public void setRequirements(String requirements) {
        this.requirements = requirements;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Rooms(int id, String details, String requirements, String date) {
        this.id = id;
        this.details = details;
        this.requirements = requirements;
        this.date = date;
    }

    public Rooms(){

    }

    public void update(){

    }
}
