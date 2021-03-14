package ltd.huangbinghui.vhr.model;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeEc {
    private Integer id;
    private Integer eid;
    private Date ecDate;
    private String ecReason;
    private Integer ecPoint;
    private Integer ecType;
    private String remark;
}
