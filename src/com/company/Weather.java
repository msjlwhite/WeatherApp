package com.company;

public class Weather {
    
    //class variables
    private int high;
    private int low;
    private String city;
    private String state;
    
    //constructor -- initializes the input (default constructor)
    public Weather() {
        high = 0;
        low = 0;
        city = "Kansas City";
        state = "MO";
    }

    // overloaded constructor -- overrides default amount
    public Weather(int high, int low, String city, String state) {
        this.high = high;
        this.low = low;
        this.city = city;
        this.state = state;
    }

    //setters and getters
    public int getHigh() {
        return high;
    }

    public void setHigh(int high) {
        high = high;
    }

    public int getLow() {
        return low;
    }

    public void setLow(int low) {
        low = low;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        city = city;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        state = state;
    }

    // Prints out user or default weather information
    public String toString(){

//        return "In, " + getCity() + ", " + getState() + " today's High is " + getHigh() + "." + "\n" + "Today's Low is "
//                + getLow() + ".";
      return "\n" + "Current Weather Conditions: " + "\n" + "Location: " + getCity() + ", " + getState() + "\n" + "Today's High is " +
              getHigh() + "." + "\n" + "Today's Low is " + getLow() + ".";

    } // end of toString Method
}
