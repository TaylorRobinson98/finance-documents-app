
public class Statement {
    private int statementId;
    private int userId;
    private String date;
    private String type;
    private String deliveryStatus;

    public Statement(int statementId, int userId, String date, String type, String deliveryStatus) {
        this.statementId = statementId;
        this.userId = userId;
        this.date = date;
        this.type = type;
        this.deliveryStatus = deliveryStatus;
    }

    public int getStatementId() { return statementId; }
    public int getUserId() { return userId; }
    public String getDate() { return date; }
    public String getType() { return type; }
    public String getDeliveryStatus() { return deliveryStatus; }

    public void setStatementId(int statementId) { this.statementId = statementId; }
    public void setUserId(int userId) { this.userId = userId; }
    public void setDate(String date) { this.date = date; }
    public void setType(String type) { this.type = type; }
    public void setDeliveryStatus(String deliveryStatus) { this.deliveryStatus = deliveryStatus; }

    public String toString() {
        return "Statement{id=" + statementId + ", type='" + type + "', status='" + deliveryStatus + "'}";
    }
}
