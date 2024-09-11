package Address.USA;

public class StreetM extends Miami{

    private String Street = "1st Northwest Road";

    public String getStreet() {
        return String.format("\nУлица: %s",Street);
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public String getRegion() {
        return super.getRegion();
    }

    @Override
    public String getTown() {
        return super.getTown();
    }

    @Override
    public String address() {
        return String.format("%s%s%s%s",getCountry(),getRegion(),getTown(),getStreet());
    }
}
