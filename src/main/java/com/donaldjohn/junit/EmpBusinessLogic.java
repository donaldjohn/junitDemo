package com.donaldjohn.junit;

/**
 * Created by donaldjohn on 2/4/18.
 */
public class EmpBusinessLogic
{
    public double calculateYearSalary(EmployeeDetails employeeDetails)
    {
        double yearlySalary = 0;
        yearlySalary = employeeDetails.getMonthlySalary() * 12;
        return  yearlySalary;
    }

    public double calculateAppraisal(EmployeeDetails employeeDetails)
    {
        double appraisal = 0;

        if (employeeDetails.getMonthlySalary() < 10000)
        {
            appraisal = 500;
        }
        else
        {
            appraisal = 1000;
        }

        return appraisal;
    }
}
