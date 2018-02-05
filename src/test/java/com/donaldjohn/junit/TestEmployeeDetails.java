package com.donaldjohn.junit;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by donaldjohn on 2/4/18.
 */
public class TestEmployeeDetails
{
    EmpBusinessLogic empBusinessLogic = new EmpBusinessLogic();
    EmployeeDetails employeeDetails = new EmployeeDetails();

    @Test
    public void testCalculateAppraisal()
    {
        employeeDetails.setAge(25);
        employeeDetails.setName("Donaldjohn");
        employeeDetails.setMonthlySalary(8000);


        double appraisal = empBusinessLogic.calculateAppraisal(employeeDetails);
        assertEquals(500, appraisal, 0.0);
    }

    @Test
    public void testCalculateYearlySalary()
    {
        employeeDetails.setName("John");
        employeeDetails.setAge(25);
        employeeDetails.setMonthlySalary(8000);


        double salary = empBusinessLogic.calculateYearSalary(employeeDetails);
        assertEquals(96000, salary,0.0);
    }




}
