package com.bridgelabz.employeepayroll;

import java.util.Arrays;

import org.junit.Test;

import com.bridgelabz.employeepayroll.EmployeePayrollService.IOService;

public class EmployeePayrollServiceTest {

	@Test
	public void Given3Employee_WhenWrittenToFile_ShouldMatchEmployeeEntries() {
		EmployeePayrollData[] arrayOfEmps = { new EmployeePayrollData(1, "Jeff Bezos", 100000.0),
				new EmployeePayrollData(2, "Bill Gates", 200000.0),
				new EmployeePayrollData(3, "Mark Zuckerberg", 300000.0) };
		EmployeePayrollService employeePayrollService;
		employeePayrollService = new EmployeePayrollService(Arrays.asList(arrayOfEmps));
		employeePayrollService.writeEmployeePayrollData(IOService.FILE_IO);
	}
}
