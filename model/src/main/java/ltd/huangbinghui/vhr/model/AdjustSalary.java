package ltd.huangbinghui.vhr.model;

import lombok.Data;

import java.util.Date;

@Data
public class AdjustSalary {
    private Integer id;
    private Integer eid;
    private Date asDate;
    private Integer afterSalary;
    private String reason;
    private String remark;
}
