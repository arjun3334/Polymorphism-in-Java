package com.company;

public class BasePlusCommission extends CommissionEmployee {
    private double baseSalery;

    public BasePlusCommission(){

    }
public BasePlusCommission(String name,
                          int EmpId,
                          String PhoneNo,
                          int sales,
                          double salesRate,
                          double baseSalary,
                          Type type){
        super(name, EmpId, PhoneNo, sales, salesRate,type);
        setBaseSalery(baseSalary);
}

    public double getBaseSalery() {
        return baseSalery;
    }

    public void setBaseSalery(double baseSalery) {
        this.baseSalery = baseSalery;
    }

    @Override
    public String toString(){
        return (super.toString()+ "Total Salary::"+totalSalary());
    }



    public double totalSalary(){
        return (getEarning()+getBaseSalery());
    }
}
