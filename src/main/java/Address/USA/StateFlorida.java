package Address.USA;

public class StateFlorida extends USA{

    private String Region = "state Florida";

    public String getRegion() {
        return String.format("\nРегион: %s",Region);
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public String address() {
        return String.format("%s%s",getCountry(),getRegion());
    }
}

