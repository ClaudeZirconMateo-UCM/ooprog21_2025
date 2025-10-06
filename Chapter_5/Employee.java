    
    class Employee {
    private static final int MAX_EMPLOYEES = 9999;
    private static final double MAX_RATE = 60.00;
    private static final double OVERTIME_RATE = 1.5;
    private int empNumber;
    private double payRate;

    public Employee(int employeeNumber, double payRate) {
        if (empNumber > MAX_EMPLOYEES) {
            this.empNumber = MAX_EMPLOYEES;
        } else {
            this.empNumber = employeeNumber;
        }

        if (payRate > MAX_RATE) {
            this.payRate = MAX_RATE;
        } else {
            this.payRate = payRate;
        }
    }

    public double getRegularPay(double hoursWorked) {
        double regularHours = Math.min(hoursWorked, 40);
        return regularHours * payRate;
    }

    public double getOvertimePay(double hoursWorked) {
        if (hoursWorked > 40) {
            double overtimeHours = hoursWorked - 40;
            return overtimeHours * (payRate * OVERTIME_RATE);
        } else {
            return 0;
        }
    }

    public int getEmployeeNumber() {
        return empNumber;
    }

    public double getPayRate() {
        return payRate;
    }
}