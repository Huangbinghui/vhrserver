package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.OpLog;
import org.apache.ibatis.annotations.*;

@Mapper
public interface OpLogMapper {
    @Select("select * from opLog where id = #{id}")
    OpLog findById(Integer id);
    @Insert("insert into opLog values (#{id},#{addDate},#{operate},#{hrid})")
    int insert(OpLog record);

    int insertSelective(OpLog record);
    @Delete("delete from opLog where id = #{id}")
    int deleteById(Integer id);
    @Update("update opLog set addDate = #{addDate},operate=#{operate},hrid=#{hrid}")
    int updateById(OpLog record);

    int updateByIdSelective(OpLog record);
}
