abstract class Employee {

    abstract void setGrade(String grade);
    abstract String getGrade();

    abstract int getSalary();
    abstract void setSalary(int salary);

    private void label() {
        System.out.println("Employee's data:\n");
    }
}

class Engineer extends Employee {
    private int salary;
    private String grade;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}

class Manager extends Employee {
    private int salary;
    private String grade;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}




