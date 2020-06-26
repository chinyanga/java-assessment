package service;

public class Conversions implements ConversionInterface{

    public double kelvinToCelcius(double tempInKelvins) {
        return tempInKelvins-273.15;
    }

    public double poundsToKilogram(double pounds) {
        return pounds * 0.453592;
    }

    public double milesToKilometre(double miles) {
        return miles * 1.60934;
    }
}
