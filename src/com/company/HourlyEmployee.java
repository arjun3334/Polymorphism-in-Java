package com.company;

public class HourlyEmployee extends Employee {
    private double hourlyRate;
    private int hourlyWorked;

    public HourlyEmployee(){

    }

    public HourlyEmployee(String name,
                          int EmpId,
                          String PhoneNo,
                          double hourlyRate,
                        int hourlyWorked,
                          Type type){
        super(name,EmpId,PhoneNo,type);
        setHourlyRate(hourlyRate);
        setHourlyWorked(hourlyWorked);
    }
    public double getHourlyRate() {
        return hourlyRate;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyWorked() {
        return hourlyWorked;
    }

    public void setHourlyWorked(int hourlyWorked) {
        this.hourlyWorked = hourlyWorked;
    }

    public double hourlyEarning(){
        return (hourlyRate*hourlyWorked);
    }

    @Override
    public String toString(){
        return (super.toString())+"       Salary"+ hourlyEarning();
    }




}


