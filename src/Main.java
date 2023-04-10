public class Main {
    public static Employee[] employees = {
            new Employee("Иванов Иван Иванович", 1000, 1),
            new Employee("Михайлов Михаил Михайлович", 2000, 2),
            new Employee("Семенов Семен Семенович", 3000, 3),
            new Employee("Петров Петр Иванович", 4000, 4),
            new Employee("Смирнов Александр Александрович", 5000, 5)
    };

    public static void main(String[] args) {
        printEmployees();
        System.out.println();
        printEmployeesOfDepartment(2);
        System.out.println();
        calculateTotalSalaryOfDepartment(3);
        System.out.println();
        printEmployeesWithSalary(3000);


    }

    public static void printEmployees() {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculateTotalSalary() {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        return sum;
    }

    public static Employee findEployeeWithMinSalary() {
        Employee result = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() < result.getSalary()) {
                result = employee;
            }
        }
        return result;
    }

    public static Employee findEployeeWithMaxSalary() {
        Employee resultMax = employees[0];
        for (Employee employee : employees) {
            if (employee.getSalary() > resultMax.getSalary()) {
                resultMax = employee;
            }
        }

        return resultMax;
    }

    public static float calculateAverageSalary() {
        return calculateTotalSalary() / (float) employees.length;
    }

    public static void increaseSalary(int percent) {
        for (Employee employee : employees) {
            int currentSalary = employee.getSalary();
            employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
        }
    }

    public static Employee findEployeeWithMinSalaryByDepartmentId(int departmentId) {
        int minSalary = Integer.MAX_VALUE;
        Employee result = null;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() != departmentId) {
                continue;
            }

            if (employee.getSalary() < minSalary) {
                minSalary = employee.getSalary();
                result = employee;
            }
        }

        return result;
    }

    public static Employee findEployeeWithMaxSalaryByDepartmentId(int departmentId) {
        int maxSalary = Integer.MIN_VALUE;
        Employee resultMax = null;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() != departmentId) {
                continue;
            }

            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                resultMax = employee;
            }
        }

        return resultMax;
    }

    public static int calculateTotalSalaryOfDepartment(int departmentId) {
        int sum = 0;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() != departmentId) {
                sum += employee.getSalary();
            }
        }
        return sum;
    }

    public static float calculateAverageSalaryOfDepartment(int departmentId) {
        int sum = 0;
        int memberCount = 0;
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                sum += employee.getSalary();
                memberCount++;
            }
        }

        return sum / (float) memberCount;
    }

    public static void increaseSalary(int departmentId, int percent) {
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                int currentSalary = employee.getSalary();
                employee.setSalary((int) (currentSalary * (percent / 100f + 1)));
            }
        }
    }

    public static void printEmployeesOfDepartment(int departmentId) {
        for (Employee employee : employees) {
            if (employee.getDepartmentId() == departmentId) {
                System.out.println(employee);
            }
        }
    }

    public static void printEmployeesWithSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() < salary) {
                System.out.println(employee);
            }
        }
    }
    public static void printEmployeesWithMaxSalary(int salary) {
        for (Employee employee : employees) {
            if (employee.getSalary() > salary) {
                System.out.println(employee);
            }
        }
    }
}


