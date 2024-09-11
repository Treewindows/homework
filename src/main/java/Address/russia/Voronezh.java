package Address.Russia;

public class Voronezh extends Voronezhregion{

    private String Town = "Воронеж";

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

