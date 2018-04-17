package com.company;

import com.company.salaryemployeee.SalaryEmployee;
import com.company.salaryemployeee.SalaryEmployeeDetails;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
/*
SalaryEmployee salaryEmployee=new SalaryEmployee("arjun",12,"989898989",10000,Type.SALARY_EMPLOYEE);
        CommissionEmployee commissionEmployee=new CommissionEmployee("arjun", 56, "983483", 1354, 3,Type.COMMISSION_EMPLOYEE);
        System.out.println("Commission Employee");
        System.out.println(commissionEmployee.toString());


HourlyEmployee hourlyEmployee=new HourlyEmployee("arjun",12,"989898933",223, 36,Type.HOURLY_EMPLOYEE);
        System.out.println("Hourly Working Salary Report");
        System.out.println(hourlyEmployee.toString());

        BasePlusCommission basePlusCommission= new BasePlusCommission("abba", 23, "3435353", 100, 23, 1000,Type.BASE_PLUS_COMMISSION);
        System.out.println("BPC");
        System.out.println(basePlusCommission.toString());
*/
//SalaryEmployee salaryEmployee1=new SalaryEmployee();
//salaryEmployee1.getSalary();


            Scanner scanner=new Scanner(System.in);
            SalaryEmployee salaryEmployee=new SalaryEmployee();
            System.out.println("Enter SalaryEmplouee::");
            System.out.println("enter name");
            salaryEmployee.setName(scanner.next());
            System.out.println("enter emp_id");
            salaryEmployee.setEmpId(scanner.nextInt());
            System.out.println("Phone number haal");
            salaryEmployee.setPhoneNo(scanner.next());
            salaryEmployee.setType(Type.SALARY_EMPLOYEE);
            System.out.println("enter salary");
            salaryEmployee.setSalary(scanner.nextDouble());
            salaryEmployee.toString();
            invoice invoice=new invoice();
            System.out.println("enter Quantity");
            invoice.setQuantity(scanner.nextInt());
            System.out.println("Enter PartNumber");
            invoice.setPartNumber(scanner.nextInt());
            System.out.println("Enter Part Name");
            invoice.setPartName(scanner.next());
            System.out.println("enter Price");
            invoice.setPricePerItem(scanner.nextDouble());
            System.out.println(invoice.toString());

            //salaryEmployee.insertingintotable();
            System.out.println(salaryEmployee.toString());
            //salaryEmployee.dataFetch();
            List<SalaryEmployeeDetails> list=salaryEmployee.dataFetch();
            //salaryEmployee.getMyDetail(list);
    }
}
