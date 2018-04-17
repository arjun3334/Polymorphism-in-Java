package com.company;

public abstract class Employee {
    private String name;
    private int EmpId;
    private String PhoneNo;
    private Type type;


    public Employee(String name,
                    int EmpId,
                    String PhoneNo,
                    Type type){
        setName(name);
        setEmpId(EmpId);
        setPhoneNo(PhoneNo);
        setType(type);
    }

    public Employee(){

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEmpId() {
        return EmpId;
    }

    public void setEmpId(int empId) {
        EmpId = empId;
    }

    public String getPhoneNo() {
        return PhoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        PhoneNo = phoneNo;
    }
    public String toString(){
        //System.out.println("Name"+Constants.SPACE+"Emp_ID"+Constants.SPACE+"PhoneNo");
        return (getName()+Constants.SPACE+getEmpId()+Constants.SPACE+getPhoneNo()+Constants.SPACE+getType()+Constants.SPACE);



    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }
}
