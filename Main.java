package Main_Assign;

import java.util.*;

class Employee {
    String empID;
    private String name;
    private double basic;
    private double hra;
    private double lta;
    private double pf;
    private double sodexo;
    private double specialAllowance;
    private double vpf;

    public Employee(String empID, String name, double basic, double hra, double lta, double pf, double sodexo) {
        this.empID = empID;
        this.name = name;
        this.basic = basic;
        this.hra = hra;
        this.lta = lta;
        this.pf = pf;
        this.sodexo = sodexo;
        this.specialAllowance = calculateSpecialAllowance();
        this.vpf = 0;
    }

    private double calculateSpecialAllowance() {
        return basic - (hra + lta + pf + sodexo);
    }

    public void updateBasic(double newBasic) {
        double percentageChange = (newBasic - basic) / basic;
        basic = newBasic;
        hra = basic * 0.5;
        lta = (basic + specialAllowance) * 0.2;
        specialAllowance = calculateSpecialAllowance();
    }

    public void updateVPF(double vpfPercentage) {
        vpf = basic * (vpfPercentage / 100.0);
        specialAllowance = calculateSpecialAllowance();
    }

    public void updateSodexo(boolean optedIn) {
        if (optedIn) {
            sodexo = 2200;
        } else {
            sodexo = 0;
        }
        specialAllowance = calculateSpecialAllowance();
    }

    public double getMonthlyInHandSalary() {
        return basic + hra + lta + specialAllowance - pf - vpf;
    }

    public String toString() {
        return empID + "\t" + name + "\t" + basic + "\t" + hra + "\t" + lta + "\t" + sodexo + "\t" + specialAllowance + "\t" + vpf;
    }

    public Object getEmpID() {
        return empID;
    }

    public void setEmpID(Object empID) {
        this.empID = (String) empID;
    }
}

class Admin {
    private List<Employee> employees;

    public Admin() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void updateEmployeeBasic(double newBasic) {
        for (Employee employee : employees) {
            employee.updateBasic(newBasic);
        }
    }

    public List<Employee> getEmployees() {
        return employees;
    }
}

class Main_Assign {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Admin admin = new Admin();

        admin.addEmployee(new Employee("E001", "Kisha Kumara", 100000, 47500, 23750, 20000, 2200));
        admin.addEmployee(new Employee("E002", "Anurag sharma", 90000, 42750, 21375, 18000, 2000));


        System.out.println("****** Welcome to ESS ******");
        boolean exit = false;

        while (!exit) {
            System.out.println("1. Admin login");
            System.out.println("2. Employee login");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    // Admin login
                    System.out.println("Admin Login");
                    System.out.print("LoginID: ");
                    String adminID = scanner.nextLine();
                    System.out.print("Password: ");
                    String adminPassword = scanner.nextLine();
                    break;
                case 2:
                    // Employee login
                    System.out.println("Employee Login");
                    System.out.print("Enter your Employee ID: ");
                    String empID = scanner.nextLine();
                    System.out.print("Enter your password: ");
                    String password = scanner.nextLine();


                    Employee employee = null;
                    for (Employee emp : admin.getEmployees()) {
                        if (emp.getEmpID().equals(empID)) {
                            employee = emp;
                            break;
                        }
                    }

                    if (employee == null) {
                        System.out.println("Employee not found!");
                        break;
                    }

                    boolean loggedIn = true;
                    while (loggedIn) {
                        System.out.println("a. My current CTC");
                        System.out.println("b. Modify details");
                        System.out.println("c. Logout");

                        String option = scanner.nextLine();

                        switch (option) {
                            case "a":
                                System.out.println("TOTAL\tBasic\tHRA\tLTA\tSODEXO\tPF\tSpecial Allowance\tVPF");
                                System.out.println(employee);
                                System.out.println("Monthly In Hand Salary: " + employee.getMonthlyInHandSalary());
                                break;
                            case "b":
                                System.out.println("1. VPF");
                                System.out.println("2. Sodexo");
                                String modifyOption = scanner.nextLine();
                                switch (modifyOption) {
                                    case "1":
                                        System.out.print("Enter VPF percentage: ");
                                        double vpfPercentage = scanner.nextDouble();
                                        employee.updateVPF(vpfPercentage);
                                        System.out.println("VPF updated successfully.");
                                        break;
                                    case "2":
                                        System.out.println("Do you want to opt-in for Sodexo (Y/N)?");
                                        String choiceSodexo = scanner.nextLine();
                                        if (choiceSodexo.equalsIgnoreCase("Y")) {
                                            employee.updateSodexo(true);
                                        } else if (choiceSodexo.equalsIgnoreCase("N")) {
                                            employee.updateSodexo(false);
                                        } else {
                                            System.out.println("Invalid option. Sodexo remains unchanged.");
                                        }
                                        System.out.println("Sodexo updated successfully.");
                                        break;
                                    default:
                                        System.out.println("Invalid option.");
                                        break;
                                }
                                break;
                            case "c":
                                loggedIn = false;
                                break;
                            default:
                                System.out.println("Invalid option.");
                                break;
                        }
                    }
                    break;
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }

        System.out.println("Thank you for using ESS!");
        scanner.close();
    }
}

