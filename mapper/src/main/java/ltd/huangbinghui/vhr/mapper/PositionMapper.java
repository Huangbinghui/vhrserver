package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.Position;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PositionMapper {
    @Select("select * from Position where id = #{id}")
    Position findById(Integer id);
    @Insert("insert into Position values (#{id},#{name},#{createDate},#{enabled})")
    int insert(Position record);

    int insertSelective(Position record);
    @Delete("delete from Position where id = #{id} ")
    int deleteById(Integer id);
    @Update("update Position set name = #{name},createDate={createDate},enabled=#{enabled} ")
    int updateById(Position record);

    int updateByIdSelective(Position record);
}
