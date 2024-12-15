package org.example.proxypattern;

public class DataToday {
    private Integer number;
    private String mounth;

    /**
     * Функция получает число месяца
     *
     * @return число месяца
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * Функиця получает месяц
     *
     * @return месяц
     */
    public String getMounth() {
        return mounth;
    }

    public DataToday(Integer number, String mounth) {
        this.number = number;
        this.mounth = mounth;
    }

    public String fullDataToday() {
        return String.format("%d %s", getNumber(), getMounth());
    }

}
