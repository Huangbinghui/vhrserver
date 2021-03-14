package ltd.huangbinghui.vhr.model;

import lombok.Data;

import java.util.Date;

@Data
public class Appraise {
    private Integer id;
    private Integer eid;
    private Date appDate;
    private String appResult;
    private String appContent;
    private String remark;
}
