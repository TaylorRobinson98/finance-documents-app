
public class Payment {
    private int paymentId;
    private int statementId;
    private double amount;
    private String date;
    private String method;

    public Payment(int paymentId, int statementId, double amount, String date, String method) {
        this.paymentId = paymentId;
        this.statementId = statementId;
        this.amount = amount;
        this.date = date;
        this.method = method;
    }

    public int getPaymentId() { return paymentId; }
    public int getStatementId() { return statementId; }
    public double getAmount() { return amount; }
    public String getDate() { return date; }
    public String getMethod() { return method; }

    public void setPaymentId(int paymentId) { this.paymentId = paymentId; }
    public void setStatementId(int statementId) { this.statementId = statementId; }
    public void setAmount(double amount) { this.amount = amount; }
    public void setDate(String date) { this.date = date; }
    public void setMethod(String method) { this.method = method; }

    public String toString() {
        return "Payment{id=" + paymentId + ", amount=" + amount + ", method='" + method + "'}";
    }
}
