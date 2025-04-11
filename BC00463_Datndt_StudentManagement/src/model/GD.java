package model;

import java.util.Scanner;
import util.InputHelper;

/**
 * Lớp GD đại diện cho sinh viên ngành Thiết kế đồ họa.
 */
public class GD extends Person implements Major {
    private double color;
    private double pts;
    private double ai;
    
    public GD(String studentId, String fullName, double color, double pts, double ai) {
        super(studentId, fullName);
        this.color = color;
        this.pts = pts;
        this.ai = ai;
    }
    
    // Getters và Setters
    public double getColor() { return color; }
    public void setColor(double color) { this.color = color; }
    public double getPts() { return pts; }
    public void setPts(double pts) { this.pts = pts; }
    public double getAi() { return ai; }
    public void setAi(double ai) { this.ai = ai; }
    
    // Tính điểm trung bình: (color + pts * 2 + ai) / 4
    @Override
    public double calculateAverageMark() {
        return (color + pts * 2 + ai) / 4;
    }
    
    // Trả về mảng điểm
    @Override
    public double[] getAllMarks() {
        return new double[] { color, pts, ai };
    }
    
    // Nhập điểm sử dụng InputHelper
    @Override
    public void inputMarks(Scanner sc) {
        this.color = InputHelper.inputSingleMark(sc, "Enter Color mark: ");
        this.pts = InputHelper.inputSingleMark(sc, "Enter PTS mark: ");
        this.ai = InputHelper.inputSingleMark(sc, "Enter AI mark: ");
    }
    
    // Hiển thị thông tin sinh viên GD
    @Override
    public void displayInfo() {
        displayBasicInfo();
        System.out.println(", Major: GD, Color: " + color + ", PTS: " + pts + ", AI: " + ai +
                           ", Avg Mark: " + String.format("%.2f", calculateAverageMark()));
    }
}
