package Address.russia;

public class PrimorskyKrai extends Russia{

    private String Region = "Приморский край";

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
