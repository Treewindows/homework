package Address.Russia;

public class StreetVladivostok extends Vladivostok {

    private String Street = "ул.Колесникова д.7";

    public String getStreet() {
        return String.format("\nУлица: %s", Street);
    }
    /**
     * Функция возвращает название страны
     *
     * @return возвращает название страны из родительского класса
     */
    @Override
    public String getCountry() {
        return super.getCountry();
    }
    /**
     * Функция возвращает название региона
     *
     * @return название региона из родительского класса
     */
    @Override
    public String getRegion() {
        return super.getRegion();
    }
    /**
     * Функция возвращает название города
     *
     * @return возвращает название города
     */
    @Override
    public String getTown() {
        return super.getTown();
    }
    /**
     * Функция возвращает адрес
     *
     * @return адрес
     */
    @Override
    public String address() {
        return String.format("%s%s%s%s", getCountry(), getRegion(), getTown(), getStreet());
    }
}