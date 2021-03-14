package ltd.huangbinghui.vhr.model;

import lombok.Data;

import java.util.Date;

@Data
public class EmployeeRemove {
    private Integer id;
    private Integer eid;
    private Integer afterDepId;
    private Integer afterJobId;
    private Date removeDate;
    private String reason;
    private String remark;
}
