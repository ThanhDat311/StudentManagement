package model;

import java.util.Scanner;
import util.InputHelper;
/**
 * Lớp IT đại diện cho sinh viên ngành Công nghệ Thông tin.
 */
public class IT extends Person implements Major {
    private double html;
    private double css;
    private double math;
    
    public IT(String studentId, String fullName, double html, double css, double math) {
        super(studentId, fullName);
        this.html = html;
        this.css = css;
        this.math = math;
    }
    
    // Getters và Setters
    public double getHtml() { return html; }
    public void setHtml(double html) { this.html = html; }
    public double getCss() { return css; }
    public void setCss(double css) { this.css = css; }
    public double getMath() { return math; }
    public void setMath(double math) { this.math = math; }
    
    // Tính điểm trung bình: (html + css * 2 + math) / 4
    @Override
    public double calculateAverageMark() {
        return (html + css * 2 + math) / 4;
    }
    
    // Trả về mảng điểm
    @Override
    public double[] getAllMarks() {
        return new double[] { html, css, math };
    }
    
    // Nhập điểm từ người dùng sử dụng InputHelper
    
    @Override
    public void inputMarks(Scanner sc) {
        this.html = InputHelper.inputSingleMark(sc, "Enter HTML mark: ");
        this.css = InputHelper.inputSingleMark(sc, "Enter CSS mark: ");
        this.math = InputHelper.inputSingleMark(sc, "Enter Math mark: ");
    }
    
    // Hiển thị thông tin sinh viên IT
    @Override
    public void displayInfo() {
        displayBasicInfo();
        System.out.println(", Major: IT, HTML: " + html + ", CSS: " + css + ", Math: " + math +
                           ", Avg Mark: " + String.format("%.2f", calculateAverageMark()));
    }
}



