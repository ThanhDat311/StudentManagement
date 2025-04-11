package model;

import java.util.Scanner;
import util.InputHelper;

/**
 * Lớp Biz đại diện cho sinh viên ngành Kinh doanh.
 */
public class Biz extends Person implements Major {
    private double sale;
    private double marketing;
    
    public Biz(String studentId, String fullName, double sale, double marketing) {
        super(studentId, fullName);
        this.sale = sale;
        this.marketing = marketing;
    }
    
    // Getters và Setters
    public double getSale() { return sale; }
    public void setSale(double sale) { this.sale = sale; }
    public double getMarketing() { return marketing; }
    public void setMarketing(double marketing) { this.marketing = marketing; }
    
    // Tính điểm trung bình: (sale * 2 + marketing) / 3
    @Override
    public double calculateAverageMark() {
        return (sale * 2 + marketing) / 3;
    }
    
    // Trả về mảng điểm
    @Override
    public double[] getAllMarks() {
        return new double[] { sale, marketing };
    }
    
    // Nhập điểm bằng cách sử dụng InputHelper
    @Override
    public void inputMarks(Scanner sc) {
        this.sale = InputHelper.inputSingleMark(sc, "Enter Sale mark: ");
        this.marketing = InputHelper.inputSingleMark(sc, "Enter Marketing mark: ");
    }
    
    // Hiển thị thông tin sinh viên Biz
    @Override
    public void displayInfo() {
        displayBasicInfo();
        System.out.println(", Major: Biz, Sale: " + sale + ", Marketing: " + marketing +
                           ", Avg Mark: " + String.format("%.2f", calculateAverageMark()));
    }
}
