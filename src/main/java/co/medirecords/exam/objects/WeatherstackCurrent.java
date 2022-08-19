package co.medirecords.exam.objects;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class WeatherstackCurrent {

    private int temperature;

    @JsonProperty("weather_icons")
    private List<String> weatherIcons;

    @JsonProperty("weather_descriptions")
    private List<String> weatherDescriptions;

    @JsonProperty("wind_speed")
    private int windSpeed;

    private int pressure;
    private double precip;

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public List<String> getWeatherIcons() {
        return weatherIcons;
    }

    public void setWeatherIcons(List<String> weatherIcons) {
        this.weatherIcons = weatherIcons;
    }

    public List<String> getWeatherDescriptions() {
        return weatherDescriptions;
    }

    public void setWeatherDescriptions(List<String> weatherDescriptions) {
        this.weatherDescriptions = weatherDescriptions;
    }

    public int getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(int windSpeed) {
        this.windSpeed = windSpeed;
    }

    public int getPressure() {
        return pressure;
    }

    public void setPressure(int pressure) {
        this.pressure = pressure;
    }

    public double getPrecip() {
        return precip;
    }

    public void setPrecip(double precip) {
        this.precip = precip;
    }
}
