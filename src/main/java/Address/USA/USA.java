package Address.USA;

public class USA {
    private String Country = "USA";
    /**
     * Функция возвращает название страны
     *
     * @return возвращает название страны из родительского класса
     */
    public String getCountry() {
        return String.format("\nСтрана: %s", Country);
    }
    /**
     * Функция возвращает адрес
     *
     * @return адрес
     */
    public String address() {
        return String.format("%s", getCountry());
    }
}