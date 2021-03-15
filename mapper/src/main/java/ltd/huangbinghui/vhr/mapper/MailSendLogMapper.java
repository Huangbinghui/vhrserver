package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.MailSendLog;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface MailSendLogMapper {
    @Select("select * from MailSendLog where MsgId = #{MsgId}")
    MailSendLog findByMsgId(Integer MsgId);
    @Select("select * from MailSendLog where empId = #{empId}")
    List<MailSendLog> findByEmpId(Integer empId);
    @Insert("insert into MailSendLog values (#{msgId},#{empId},#{status},#{routeKey},#{exchange},#{count},#{tryTime},#{createTime},#{updateTime})")
    int insert(MailSendLog record);

    int insertSelective(MailSendLog record);
    @Delete("delete from MailSendLog where MsgId = #{MsgId}")
    int deleteByMsgId(Integer MsgId);
    @Update("update MailSendLog set empId=#{empId},status=#{status},routeKey=#{routeKey},exchange=#{exchange},count=#{count},tryTime=#{tryTime},createTime=#{createTime},updateTime=#{updateTime} where msgId=#{msgId}")
    int updateByMsgId(MailSendLog record);

    int updateByMsgIdSelective(MailSendLog record);
}
