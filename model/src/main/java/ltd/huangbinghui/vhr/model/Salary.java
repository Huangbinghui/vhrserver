package ltd.huangbinghui.vhr.model;

import lombok.Data;

import java.util.Date;

@Data
public class Salary {
    private Integer id;
    private Integer basicSalary;
    private Integer bonus;
    private Integer trafficSalary;
    private Integer allSalary;
    private Integer pensionBase;
    private Float pensionPer;
    private Date createDate;
    private Integer medicalBase;
    private Float medicalPer;
    private Integer accumulationfundBase;
    private Float accumulationfundPer;
    private String name;
}
