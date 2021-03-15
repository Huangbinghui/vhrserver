package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.JobLevel;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface JobLevelMapper {
    @Select("select * from jobLevel where id = #{id}")
    JobLevel findById(Integer id);
    @Select("select * from jobLevel")
    List<JobLevel> findAll();
    @Insert("insert into jobLevel values (#{id},#{name},#{titleLevel},#{createDate},#{enabled})")
    int insert(JobLevel record);

    int insertSelective(JobLevel record);
    @Delete("delete from jobLevel where id = #{id}")
    int deleteById(Integer id);
    @Update("update jobLevel set name=#{name},titleLevel=#{titleLevel},createDate=#{createDate},enabled=#{enabled} where id = #{id}")
    int updateById(JobLevel record);

    int updateByIdSelective(JobLevel record);
}
