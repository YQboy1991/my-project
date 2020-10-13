package com.lbl.myproject.demo;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: BaoLei Li
 * @date: 2019/2/19
 **/
public enum K12SubjectEnum {

    /**
     * 小学语文
     */
    XIAOXUE_CHINESE(2501, "语文", 1),
    /**
     * 小学数学
     */
    XIAOXUE_MATH(2502, "数学",  2),
    /**
     * 小学英语
     */
    XIAOXUE_ENGLISH(2503, "英语",  3),
    /**
     * 小学奥数
     */
    XIAOXUE_MATH_OLYMPIAD(2504, "奥数",  4),

    /**
     * 小学剑桥英语
     */
    JIANQIAO_ENGLISH(7561,"剑桥英语",5),

    /**
     * 初中语文
     */
    CHUZHONG_CHINESE(101, "语文", 1),
    /**
     * 初中数学
     */
    CHUZHONG_MATH(102, "数学", 2),
    /**
     * 初中英语
     */
    CHUZHONG_ENGLISH(103, "英语", 3),
    /**
     * 初中化学
     */
    CHUZHONG_CHEMISTRY(104, "化学", 4),
    /**
     * 初中物理
     */
    CHUZHONG_PHYSICS(105, "物理", 5),
    /**
     * 初中生物
     */
    CHUZHONG_BIOLOGY(106, "生物", 6),
    /**
     * 初中历史
     */
    CHUZHONG_HISTORY(107, "历史", 7),
    /**
     * 初中政治
     */
    CHUZHONG_POLITICS(108, "政治", 8),
    /**
     * 初中地理
     */
    CHUZHONG_GEOGRAPHY(109, "地理", 9),
    /**
     * 初中科学
     */
    CHUZHONG_SCIENCE(110, "科学", 10),
    /**
     * 高中语文
     */
    GAOZHONG_CHINESE(2401, "语文",  1),
    /**
     * 高中数学(理)
     */
    GAOZHONG_MATH_LI(2411, "数学（理）", 2),
    /**
     * 高中数学(文)
     */
    GAOZHONG_MATH_WEN(2410, "数学（文）", 3),
    /**
     * 高中数学
     */
    GAOZHONG_MATH(2402, "数学", 4),
    /**
     * 高中英语
     */
    GAOZHONG_ENGLISH(2403, "英语", 5),
    /**
     * 高中物理
     */
    GAOZHONG_PHYSICS(2404, "物理", 6),
    /**
     * 高中化学
     */
    GAOZHONG_CHEMISTRY(2405, "化学", 7),
    /**
     * 高中生物
     */
    GAOZHONG_BIOLOGY(2406, "生物", 8),
    /**
     * 高中历史
     */
    GAOZHONG_HISTORY(2407, "历史", 9),
    /**
     * 高中地理
     */
    GAOZHONG_GEOGRAPHY(2408, "地理", 10),
    /**
     * 高中政治
     */
    GAOZHONG_POLITICS(2409, "政治", 11);

    /**
     * 科目ID
     */
    private int subjectId;

    /**
     * 科目名称
     */
    private String name;

    /**
     * 产品线内排序
     */
    private int rank;

    private K12SubjectEnum(int subjectId, String name, int rank) {
        this.subjectId = subjectId;
        this.name = name;
        this.rank = rank;
    }

    public int getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(int subjectId) {
        this.subjectId = subjectId;
    }

    public String getName() {
        return name;
    }

    public int getRank() {return rank;}

}
