
public class User {
    private int userId;
    private String name;
    private String email;
    private String deliveryPreference;

    public User(int userId, String name, String email, String deliveryPreference) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.deliveryPreference = deliveryPreference;
    }

    public int getUserId() { return userId; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public String getDeliveryPreference() { return deliveryPreference; }

    public void setUserId(int userId) { this.userId = userId; }
    public void setName(String name) { this.name = name; }
    public void setEmail(String email) { this.email = email; }
    public void setDeliveryPreference(String deliveryPreference) { this.deliveryPreference = deliveryPreference; }

    public String toString() {
        return "User{id=" + userId + ", name='" + name + "', email='" + email + "', delivery='" + deliveryPreference + "'}";
    }
}
