package com.company.shared;

import com.company.Type;

public class MyUtil {

    public static String getMyType(int type) {
        switch (type) {
            case 0:
                return Type.SALARY_EMPLOYEE.toString();
            case 1:
                return Type.HOURLY_EMPLOYEE.toString();
            case 2:
                return Type.COMMISSION_EMPLOYEE.toString();
            case 3:
                return Type.BASE_PLUS_COMMISSION.toString();
            default:
                return "not Found";
        }
    }

}
