package Address.Russia;

public class Voronezhregion extends Russia {

    private String Region = "Воронежская область";
    /**
     * Функция возвращает название региона
     *
     * @return название региона
     */
    public String getRegion() {
        return String.format("\nРегион: %s", Region);
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
        return String.format("%s%s", getCountry(), getRegion());
    }
}