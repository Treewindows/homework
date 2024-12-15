package org.example;

import org.example.observer.Person;
import org.example.observer.Publisher;

public class Wather {
    private Integer temperature;
    private Integer atmosphericPressure;
    private Double speedWind;
    private Integer airHumidity;
    private Integer cloudCover;

    Publisher publisher = new Publisher();
    Person person = new Person("Артур");
    Person person1 = new Person("Андрей");
    Person person2 = new Person("Анвар");
    Person person3 = new Person("Сабина");
    Person person4 = new Person("Николай");

    public Wather(Integer temperature, Integer atmosphericPressure, Double speedWind, Integer airHumidity, Integer cloudCover) {
        this.temperature = temperature;
        this.atmosphericPressure = atmosphericPressure;
        this.speedWind = speedWind;
        this.airHumidity = airHumidity;
        this.cloudCover = cloudCover;

        publisher.subscribe(person);
        publisher.subscribe(person1);
        publisher.subscribe(person2);
        publisher.subscribe(person3);
        publisher.subscribe(person4);
        publisher.unsubscribe(person4);
    }

    public Integer getTemperature() {
        return temperature;
    }

    public void setTemperature(Integer temperature) {
        this.temperature = temperature;
        publisher.notificationAllow("Температуры изменилась " + getTemperature() + " °C");
    }

    public Integer getAtmosphericPressure() {
        return atmosphericPressure;
    }

    public void setAtmosphericPressure(Integer atmosphericPressure) {
        this.atmosphericPressure = atmosphericPressure;
        publisher.notificationAllow("Атмосферное давление изменилось " + getAtmosphericPressure() + " мм рт. ст.");
    }

    public Double getSpeedWind() {
        return speedWind;
    }

    public void setSpeedWind(Double speedWind) {
        this.speedWind = speedWind;
        publisher.notificationAllow("Скорость ветра изменилась " + getSpeedWind() + " м/с");
    }

    public Integer getAirHumidity() {
        return airHumidity;
    }

    public void setAirHumidity(Integer airHumidity) {
        this.airHumidity = airHumidity;
        publisher.notificationAllow("Влажность воздуха изменилась " + getAirHumidity() + " процент(-ов)");
    }

    public Integer getCloudCover() {
        return cloudCover;
    }

    public void setCloudCover(Integer cloudCover) {
        this.cloudCover = cloudCover;
        publisher.notificationAllow("Облачность изменилась " + getCloudCover() + " балл(-ов)");
    }


    public String toString() {
        return String.format("Прогноз погоды: Температура %d °C,Атмосферное давление %d мм рт. ст., " + "Скорость ветра %f м/с,Влажность воздуха %d процентов, Облачность %d балл(-ов)", temperature, atmosphericPressure, speedWind, airHumidity, cloudCover);
    }
    /** @Override public String toString() {
    return "Wather{" +
    "temperature=" + temperature +
    ", atmosphericPressure=" + atmosphericPressure +
    ", speedWind=" + speedWind +
    ", airHumidity=" + airHumidity +
    ", cloudCover=" + cloudCover +
    ", atmosphericPrecipitation='" + atmosphericPrecipitation + '\'' +
    '}';*/

}
