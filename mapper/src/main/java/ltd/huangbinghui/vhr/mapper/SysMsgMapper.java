package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.SysMsg;
import org.apache.ibatis.annotations.*;

@Mapper
public interface SysMsgMapper {
    @Select("select * from sysMsg where id = #{id}")
    SysMsg findById(Integer id);
    @Insert("insert into sysMsg values (#{id},#{mid},#{type},#{hrid},#{state})")
    int insert(SysMsg record);

    int insertSelective(SysMsg record);
    @Delete("delete from sysMsg where id = #{id}")
    int deleteById(Integer id);
    @Update("update sysMsg set mid = #{mid},type = #{type},hrid = #{hrid},state=#{state}")
    int updateById(SysMsg record);

    int updateByIdSelective(SysMsg record);
}
