package ltd.huangbinghui.vhr.model;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeTrain {
    private Integer id;
    private Integer eid;
    private Date trainDate;
    private String trainContent;
    private String remark;
}
