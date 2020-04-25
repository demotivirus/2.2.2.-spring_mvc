package web.model;

public class Car {
    private String name;

    private String series;

    public Car(){}

    public Car(String name, String series) {
        this.name = name;
        this.series = series;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", series='" + series + '\'' +
                '}';
    }
}
