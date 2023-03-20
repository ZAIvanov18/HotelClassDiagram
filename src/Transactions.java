public class Transactions {
    private int id;
    public int number;
    public String date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Transactions(int id, int number, String date) {
        this.id = id;
        this.number = number;
        this.date = date;
    }

    public Transactions(){

    }

    public void processDebit(){

    }
}
