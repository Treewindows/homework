package Address.Russia;

public class Russia {


    private String Country = "Российская Федерация";

    public String getCountry() {
        return String.format("\nСтрана: %s", Country);
    }

    public String address(){
        return String.format("%s",getCountry());
    }
}
