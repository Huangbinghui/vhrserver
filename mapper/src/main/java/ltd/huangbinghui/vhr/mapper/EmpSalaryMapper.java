package ltd.huangbinghui.vhr.mapper;


import ltd.huangbinghui.vhr.model.EmpSalary;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmpSalaryMapper {
    @Select("select * from EmpSalary where id = #{id}")
    EmpSalary findById(Integer id);
    @Select("select * from empSalary where eid = #{eid}")
    EmpSalary findByEid(Integer eid);
    @Insert("insert into EmpSalary values(id,eid,sid)")
    int insert(EmpSalary record);

    int insertSelective(EmpSalary record);
    @Delete("delete from EmpSalary where id = #{id}")
    int deleteById(Integer id);
    @Update("update EmpSalary set eid = #{eid},sid=#{sid}")
    int updateById(EmpSalary record);

    int updateByIdSelective(EmpSalary record);
}
