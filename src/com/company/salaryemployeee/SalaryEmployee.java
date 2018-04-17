package com.company.salaryemployeee;

import com.company.Constants;

import com.company.Employee;

import com.company.Type;

import com.company.shared.MyUtil;
import com.company.*;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class SalaryEmployee extends Employee implements payable{
private double salary;

public SalaryEmployee(){
    super();

}

    @Override
    public double payment() {
        double payment=(getSalary()-((10/100.0)*getSalary()));
        return payment;
    }

    public SalaryEmployee(String name,
                          int EmpId,
                          String PhoneNo,
                          double salary,
                          Type type){
    super(name, EmpId, PhoneNo, type);
    setSalary(salary);
}
    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }



    @Override
    public String toString(){
        System.out.println("Name"+ Constants.SPACE+"Emp_ID"+Constants.SPACE+"Phone Number"+
                Constants.SPACE+"Type"+Constants.SPACE+"Salary"+Constants.SPACE+"Payment");
        return (super.toString())+Constants.SPACE+getSalary()+Constants.SPACE+this.payment();
    }
    public void insertingintotable(){
    try {
        Class.forName(Constants.Class_name);

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/userreg","root","root");
        Statement stmt=connection.createStatement();

        List<SalaryEmployeeDetails> list=new ArrayList<>();
        stmt.executeUpdate("INSERT INTO `Polymerphism`.`Emp_Details` (\n\" +\n" +
                "                    \"  `name`,\\n\" +\n" +
                "                    \"  `emp_id`,\\n\" +\n" +
                "                    \"  `phone_no`,\\n\" +\n" +
                "                    \"  `salary`,\\n\" +\n" +
                "                    \"  `gross_sale`,\\n\" +\n" +
                "                    \"  `sales_rate`,\\n\" +\n" +
                "                    \"  `hour`,\\n\" +\n" +
                "                    \"  `rate`,\\n\" +\n" +
                "                    \"  `base_salary`,\\n\" +\n" +
                "                    \"  `type`\\n\" +\n" +
                "                    \") \\n\" +\n" +
                "                    \"VALUES\\n\" +\n" +
                "                    \"  (\\n\" +\n" +
                "                    \"    '"+getName()+"',\\n\" +\n" +
                "                    \"    "+getEmpId()+",\\n\" +\n" +
                "                    \"    "+getPhoneNo()+",\\n\" +\n" +
                "                    \"    "+getSalary()+",\\n\" +\n" +
                        "                            "+getType().ordinal()+"\n"+
                "                    \"    "+null+",\\n\" +\n" +
                "                    \"    "+null+",\\n\" +\n" +
                "                    \"    "+null+",\\n\" +\n" +
                "                    \"    "+null+",\\n\" +\n" +
                "                    \"    "+null+",\\n\" +\n" +
                "                    \"    "+null+"\\n\" +\n" +
                "                    \"  ) ;");

        System.out.println("Inserted into Table......");
    }
    catch (Exception e){
        System.out.println(e.getMessage());
    }
    }

    public List<SalaryEmployeeDetails> dataFetch(){
    try{
        Class.forName(Constants.Class_name);

        Connection connection= DriverManager.getConnection("jdbc:mysql://localhost:3306/new_database","root","root");
        Statement stmt=connection.createStatement();
        List<SalaryEmployeeDetails> list=new ArrayList<>();
        ResultSet resultSet=stmt.executeQuery("SELECT \n" +
        " 'name',\n" +
        " 'PhoneNo',\n" +
                "'salary',\n" +
                "'type'\n" +
                "FROM\n" +
                " 'new_database'.'Employee' WHERE type="+Type.SALARY_EMPLOYEE.ordinal()+"");

        while (resultSet.next()){
            SalaryEmployeeDetails salaryEmployeeDetails=new SalaryEmployeeDetails();
            salaryEmployeeDetails.setName(resultSet.getString("name"));
            salaryEmployeeDetails.setEmpId(resultSet.getInt("EmpId"));
            salaryEmployeeDetails.setPhoneNo(resultSet.getString("PhoneNo"));
            salaryEmployeeDetails.setSalary(resultSet.getDouble("Salary"));
            salaryEmployeeDetails.setType(MyUtil.getMyType(resultSet.getInt("type")));




             }
            return list;

    }
    catch (Exception e){
        System.out.println(e.getMessage());

    }


        return null;
    }


    public void getMyDetail(List<SalaryEmployeeDetails> list) {
        System.out.println("Name::"+Constants.SPACE+"EmpId::"+Constants.SPACE+"PhoneNo"+Constants.SPACE
        +"Salary::"+Constants.SPACE);
        for(SalaryEmployeeDetails salaryEmployeeDetails:list){
            System.out.println(salaryEmployeeDetails.getName()+Constants.SPACE+salaryEmployeeDetails.getEmpId()
            +Constants.SPACE+salaryEmployeeDetails.getPhoneNo()+Constants.SPACE+salaryEmployeeDetails.getSalary()
            +Constants.SPACE+salaryEmployeeDetails.getType());
        }
    }
}
