package ltd.huangbinghui.vhr.mapper;


import ltd.huangbinghui.vhr.model.EmployeeRemove;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface EmployeeRemoveMapper {
    @Select("select * from employeeRemove where eid = #{eid}")
    List<EmployeeRemove> findByEid(Integer eid);
    @Select("select * from employeeRemove where id = #{id}")
    EmployeeRemove findById(Integer id);
    @Insert("insert into employeeRemove values (#id,#{eid},#{afterDepId},#{afterJobId},#{removeDate},#{reason},#{remark});")
    int insert(EmployeeRemove record);

    int insertSelective(EmployeeRemove record);
    @Delete("delete from employeeRemove where id = #{id}")
    int deleteById(Integer id);
    @Update("update employeeRemove set eid = #{eid},,afterDepId = #{afterDepId},afterJobId = #{afterJobId},removeDate = #{removeDate},reason = #{reason},remark = #{remark}")
    int updateById(EmployeeRemove record);

    int updateByIdSelective(EmployeeRemove record);
}
