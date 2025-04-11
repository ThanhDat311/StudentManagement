package model;

/**
 * Abstract class Person chứa thông tin cơ bản của một sinh viên.
 */
public abstract class Person {
    protected String studentId;
    protected String fullName;
    
    public Person(String studentId, String fullName) {
        this.studentId = studentId;
        this.fullName = fullName;
    }
    
    // Getters và Setters
    public String getStudentId() {
        return studentId;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    
    // Phương thức trừu tượng hiển thị thông tin
    public abstract void displayInfo();
    
    // Phương thức hiển thị thông tin cơ bản
    public void displayBasicInfo() {
        System.out.print("ID: " + studentId + ", Full Name: " + fullName);
    }
}
