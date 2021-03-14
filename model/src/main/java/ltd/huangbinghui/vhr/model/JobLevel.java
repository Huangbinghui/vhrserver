package ltd.huangbinghui.vhr.model;

import lombok.Data;

import java.util.Date;

@Data
public class JobLevel {
    private Integer id;
    private String name;
    private String titleLevel;
    private Date createDate;
    private boolean enabled;
}
