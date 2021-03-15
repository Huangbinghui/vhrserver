package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.AdjustSalary;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface AdjustSalaryMapper {

    @Select("select * from adjustSalary where eid = #{eid}")
    List<AdjustSalary> findByEid(Integer eid);

    AdjustSalary findById(Integer id);

    int insert(AdjustSalary record);

    int insertSelective(AdjustSalary record);

    int deleteById(Integer id);

    int updateById(AdjustSalary record);

    int updateByIdSelective(AdjustSalary record);
}
