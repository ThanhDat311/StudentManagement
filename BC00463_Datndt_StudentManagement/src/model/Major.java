package model;

import java.util.Scanner;

/**
 * Interface Major định nghĩa cách nhập điểm, tính điểm trung bình và lấy tất cả các điểm.
 */
public interface Major {
    void inputMarks(Scanner sc);
    double calculateAverageMark();
    double[] getAllMarks();
}
