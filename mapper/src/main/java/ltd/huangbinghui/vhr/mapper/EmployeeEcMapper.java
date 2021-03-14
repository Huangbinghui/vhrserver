package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.EmployeeEc;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeEcMapper {
    @Select("select * from employeeEc where id = #{id}")
    EmployeeEc findById(Integer id);
    @Insert("insert into EmployeeEc values(#{id},#{eid},#{ecDate},#{ecReason},#{ecPoint},#{ecType},#{remark})")
    int insert(EmployeeEc record);

    int insertSelective(EmployeeEc record);
    @Delete("delete from EmployeeEc where id = #{id}")
    int deleteById(Integer id);
    @Update("update EmployeeEc set eid=#{eid},ecDate = #{ecDate},ecReason = #{ecReason},ecPoint = #{ecPoint},ecType = #{ecType},remark = #{remark}")
    int updateById(EmployeeEc record);

    int updateByIdSelective(EmployeeEc record);
}
