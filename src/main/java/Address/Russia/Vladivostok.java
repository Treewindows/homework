package Address.Russia;

public class Vladivostok extends PrimorskyKrai {

    private String Town = "Владивосток";
    /**
     * Функция возвращает название города
     *
     * @return возвращает название города
     */
    public String getTown() {
        return String.format("\nГород: %s", Town);
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
     * Функция возвращает название страны
     *
     * @return возвращает название страны из родительского класса
     */
    @Override
    public String getCountry() {
        return super.getCountry();
    }
    /**
     * Функция возвращает адрес
     *
     * @return адрес
     */
    @Override
    public String address() {
        return String.format("%s%s%s", getCountry(), getRegion(), getTown());
    }
}