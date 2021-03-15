package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.EmployeeTrain;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeTrainMapper {
    @Select("select * from EmployeeTrain where id = #{id}")
    EmployeeTrain findById(Integer id);
    @Select("select * from employeeTrain where eid = #{eid}")
    List<EmployeeTrain> findByEid(Integer eid);
    @Insert("insert into EmployeeTrain values(#{id},#{eid},#{trainDate},#{trainContent},#{remark}")
    int insert(EmployeeTrain record);

    int insertSelective(EmployeeTrain record);
    @Delete("delete from EmployeeTrain where id = #{id}")
    int deleteById(Integer id);
    @Update("update EmployeeTrain set eid=#{eid},trainDate=#{trainDate},trainContent=#{trainContent},remark=#{remark} where id = #{id}")
    int updateById(EmployeeTrain record);

    int updateByIdSelective(EmployeeTrain record);
}
