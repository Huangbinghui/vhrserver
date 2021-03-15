package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.MenuRole;
import org.apache.ibatis.annotations.*;

@Mapper
public interface MenuRoleMapper {
    @Select("select * from MenuRole where id = #{id}")
    MenuRole findById(Integer id);
    @Select("select * from MenuRole where mid = #{mid}")
    MenuRole findByMid(Integer mid);
    @Select("select * from MenuRole where rid = #{rid}")
    MenuRole findByRid(Integer rid);
    @Insert("insert into MenuRole values (#{id},#{mid},#{rid})")
    int insert(MenuRole record);

    int insertSelective(MenuRole record);
    @Delete("delete from MenuRole where id = #{id}")
    int deleteById(Integer id);
    @Update("update MenuRole set mid = #{mid},rid=#{rid}")
    int updateById(MenuRole record);

    int updateByIdSelective(MenuRole record);
}
