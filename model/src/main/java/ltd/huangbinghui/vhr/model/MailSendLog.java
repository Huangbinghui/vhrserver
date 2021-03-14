package ltd.huangbinghui.vhr.model;

import lombok.Data;

import java.util.Date;

@Data
public class MailSendLog {
    private String msgId;
    private Integer empId;
    private Integer status;
    private String routeKey;
    private String exchange;
    private Integer count;
    private Date tryTime;
    private Date createTime;
    private Date updateTime;
}
