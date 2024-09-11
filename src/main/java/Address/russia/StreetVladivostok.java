package Address.russia;

public class StreetVladivostok extends Vladivostok {

    private String Street = "ул.Колесникова д.7";

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