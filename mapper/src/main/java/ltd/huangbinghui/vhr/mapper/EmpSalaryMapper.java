package ltd.huangbinghui.vhr.mapper;


import ltd.huangbinghui.vhr.model.EmpSalary;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmpSalaryMapper {
    @Select("select * from EmpSalary where id = #{id}")
    EmpSalary findById(Integer id);
    @Insert("insert into EmpSalary values(id,eid,sid)")
    int insert(EmpSalary record);

    int insertSelective(EmpSalary record);
    @Delete("")
    int deleteById(Integer id);
    @Update("")
    int updateById(EmpSalary record);

    int updateByIdSelective(EmpSalary record);
}
