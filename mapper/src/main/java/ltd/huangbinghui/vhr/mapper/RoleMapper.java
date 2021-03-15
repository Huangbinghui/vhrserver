package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.Role;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface RoleMapper {
    @Select("select * from role")
    List<Role> findAll();
    @Select("select * from role where name like '%' || #{name} || '%'")
    List<Role> findByName(String name);
    @Select("select * from role where id = #{id}")
    Role findById(Integer id);
    @Insert("insert into role values (#{id},#{name},#{nameZh})")
    int insert(Role record);

    int insertSelective(Role record);
    @Delete("delete from role where id = #{id}")
    int deleteById(Integer id);
    @Update("update role set name=#{name},nameZh=#{nameZh}")
    int updateById(Role record);

    int updateByIdSelective(Role record);
}
