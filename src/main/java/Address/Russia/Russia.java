package Address.Russia;

public class Russia {


    private String Country = "Российская Федерация";
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
