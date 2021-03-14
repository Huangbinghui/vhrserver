package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.Employee;
import org.apache.ibatis.annotations.*;

@Mapper
public interface EmployeeMapper {
    @Select("select * from employee where id = #{id}")
    Employee findById(Integer id);
    @Insert("insert into Employee values (" +
            "#{id},#{name},#{gender},#{birthday},#{idCard},#{wedLock},#{nationId},#{nativePlace},#{politicId},#{email},#{phone},#{address},#{departmentId}," +
            "#{jobLevelId},#{posId},#{engageForm},#{titopDegree},#{specialty},#{school},#{beginDate},#{workState},#{workId},#{contractTerm},#{conversionTime}," +
            "#{notWorkDate},#{beginContract},#{endContract},#{workAge})")
    int insert(Employee record);

    int insertSelective(Employee record);
    @Delete("delete from Employee where id = #{id}")
    int deleteById(Integer id);
    @Update("update from Employee set id = #{id},name = #{name},gender = #{gender},birthday = #{birthday},idCard = #{idCard}," +
            "wedLock = #{wedLock},nationId = #{nationId},nativePlace = #{nativePlace},politicId = #{politicId},email = #{email}," +
            "phone = #{phone},address = #{address},departmentId = #{departmentId},jobLevelId = #{jobLevelId},posId = #{posId},engageForm = #{engageForm}," +
            "engageForm = #{titopDegree},specialty = #{specialty},school = #{school},beginDate = #{beginDate},workState = #{workState},workId = #{workId},contractTerm = #{contractTerm}," +
            "conversionTime = #{conversionTime},notWorkDate = #{notWorkDate},beginContract = #{beginContract},endContract = #{endContract},workAge = #{workAge}")
    int updateById(Employee record);

    int updateByIdSelective(Employee record);
}
