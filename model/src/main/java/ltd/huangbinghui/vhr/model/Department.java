package ltd.huangbinghui.vhr.model;

import lombok.Data;

@Data
public class Department {
    private Integer id;
    private String name;
    private Integer parentId;
    private String depPath;
    private boolean enabled;
    private boolean isParent;
}
