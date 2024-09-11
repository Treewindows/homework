package Address.USA;

public class USA {
    private String Country = "USA";

    public String getCountry() {
        return String.format("\nСтрана: %s", Country);
    }

    public String address() {
        return String.format("%s", getCountry());
    }
}