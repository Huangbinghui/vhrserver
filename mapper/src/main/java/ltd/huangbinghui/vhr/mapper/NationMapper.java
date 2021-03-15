package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.Nation;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface NationMapper {
    @Select("select * from Nation where id = #{id}")
    Nation findById(Integer id);
    @Select("select * from nation where name like '%' || #{name}|| '%'")
    List<Nation> findByName(String name);
    @Insert("insert into Nation values (#{id},#{name})")
    int insert(Nation record);
    @Delete("delete from Nation where id  = #{id}")
    int deleteById(Integer id);
    @Update("update Nation set name = #{name}")
    int updateById(Nation record);
}
