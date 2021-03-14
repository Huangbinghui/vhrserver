package ltd.huangbinghui.vhr.model;

import lombok.Data;

import java.util.Date;

@Data
public class Employee {
    private Integer id;
    private String name;
    private String gender;
    private Date birthday;
    private String idCard;
    private String wedLock;
    private Integer nationId;
    private String nativePlace;
    private Integer politicId;
    private String email;
    private String phone;
    private String address;
    private Integer departmentId;
    private Integer jobLevelId;
    private Integer posId;
    private String engageForm;
    private String titopDegree;
    private String specialty;
    private String school;
    private Date beginDate;
    private String workState;
    private String workId;
    private short contractTerm;
    private Date conversionTime;
    private Date notWorkDate;
    private Date beginContract;
    private Date endContract;
    private short workAge;
}
