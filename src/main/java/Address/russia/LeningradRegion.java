package Address.Russia;

public class LeningradRegion extends Russia{

    private String Region = "Ленинградская область";

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

