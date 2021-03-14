package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.PoliticsStatus;
import org.apache.ibatis.annotations.*;

@Mapper
public interface PoliticsStatusMapper {
    @Select("select * from PoliticsStatus where id = #{id}")
    PoliticsStatus findById(Integer id);
    @Insert("insert into PoliticsStatus values (#{id},#{name})")
    int insert(PoliticsStatus record);
    @Delete("delete from PoliticsStatus where id = #{id}")
    int deleteById(Integer id);
    @Update("update PoliticsStatus set name = #{name}")
    int updateById(PoliticsStatus record);
}
