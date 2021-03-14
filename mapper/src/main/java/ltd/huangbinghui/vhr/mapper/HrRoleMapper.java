package ltd.huangbinghui.vhr.mapper;


import ltd.huangbinghui.vhr.model.HrRole;
import org.apache.ibatis.annotations.*;

@Mapper
public interface HrRoleMapper {
    @Select("select * from hrRole where id = #{id}")
    HrRole findById(Integer id);
    @Insert("insert into hrRole values (id,hrid,rid)")
    int insert(HrRole record);

    int insertSelective(HrRole record);
    @Delete("delete from hrRole where id = #{id}")
    int deleteById(Integer id);
    @Update("update hrRole set hrid=#{hrid},rid=#{rid}")
    int updateById(HrRole record);

    int updateByIdSelective(HrRole record);
}
