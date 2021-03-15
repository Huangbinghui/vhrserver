package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.Department;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface DepartmentMapper {
    @Select("select * from department")
    List<Department> findAll();
    @Select("select * from department where id = #{id}")
    Department findById(Integer id);
    @Insert("insert into department values (#{id},#{name},#{parentId},#{depPath},#{enabled},#{isParent})")
    int insert(Department record);

    int insertSelective(Department record);
    @Delete("delete from department where id = #{id}")
    int deleteById(Integer id);
    @Update("update Department set name=#{name},parentId=#{parentId},depPath=#{depPath},enabled=#{enabled},isParent=#{isParent} where id = #{id}")
    int updateById(Department record);

    int updateByIdSelective(Department record);
    @Select("select * from department where parentId is null")
    List<Department> findAllWithNoParent();
}
