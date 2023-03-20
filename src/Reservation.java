public class Reservation {
    private int id;
    public String amount;
    public String date;
    public String receipt;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public Reservation(int id, String amount, String date, String receipt) {
        this.id = id;
        this.amount = amount;
        this.date = date;
        this.receipt = receipt;
    }

    public Reservation(){

    }

    public void update(){

    }
}
