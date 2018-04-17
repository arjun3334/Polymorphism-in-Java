package com.company;

public class CommissionEmployee extends Employee{
    private int sales;
    private double salesRate;
    public CommissionEmployee(){

    }

public CommissionEmployee(
        String name,
        int EmpId,
        String PhoneNo,
        int sales,
        double salesRate,
        Type type){
        super(name,EmpId,PhoneNo,type);
        setSales(sales);
        setSalesRate(salesRate);
}

    public int getSales() {
        return sales;
    }

    public void setSales(int sales) {
        this.sales = sales;
    }

    public double getSalesRate() {
        return salesRate;
    }

    public void setSalesRate(double salesRate) {
        this.salesRate = salesRate;

    }

    @Override
    public String toString(){

        System.out.println("Name"+Constants.SPACE+"Emp_ID"+Constants.SPACE+"Phone Number"+Constants.SPACE+"Sales"+Constants.SPACE+"Sales Rate"+Constants.SPACE+"Commission Earned");
        return (super.toString())+Constants.SPACE+
                getSales()+Constants.SPACE+getSalesRate()+Constants.SPACE+getEarning();
    }






    public double getEarning()
{
    return (sales*salesRate);
}

}
