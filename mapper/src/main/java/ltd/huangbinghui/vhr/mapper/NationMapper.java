package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.Nation;
import org.apache.ibatis.annotations.*;

@Mapper
public interface NationMapper {
    @Select("select * from Nation where id = #{id}")
    Nation findById(Integer id);
    @Insert("insert into Nation values (#{id},#{name})")
    int insert(Nation record);
    @Delete("delete from Nation where id  = #{id}")
    int deleteById(Integer id);
    @Update("update Nation set name = #{name}")
    int updateById(Nation record);
}
