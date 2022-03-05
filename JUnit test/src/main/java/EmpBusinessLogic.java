/**
 * 项目名:  untitled
 * 开发者:  Administrator
 * 创建于:  2022 三月 04 星期五 23:04
 * 描述:
 */
public class EmpBusinessLogic {
	// Calculate the yearly salary of employee
	public double calculateYearlySalary(EmployeeDetails employeeDetails) {
		double yearlySalary = 0;
		yearlySalary = employeeDetails.getMonthlySalary() * 12;
		return yearlySalary;
	}

	// Calculate the appraisal amount of employee
	public double calculateAppraisal(EmployeeDetails employeeDetails) {
		double appraisal = 0;
		if (employeeDetails.getMonthlySalary() < 10000) {
			appraisal = 500;
		} else {
			appraisal = 1000;
		}
		return appraisal;
	}
}