package Address.Russia;

public class Vladivostok extends PrimorskyKrai{

    private String Town = "Владивосток";

    public String getTown() {
        return String.format("\nГород: %s",Town);
    }

    @Override
    public String getRegion() {
        return super.getRegion();
    }

    @Override
    public String getCountry() {
        return super.getCountry();
    }

    @Override
    public String address() {
        return String.format("%s%s%s",getCountry(),getRegion(),getTown());
    }
}