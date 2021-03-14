package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.AdjustSalary;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface AdjustSalaryMapper {

    AdjustSalary findById(Integer id);

    int insert(AdjustSalary record);

    int insertSelective(AdjustSalary record);

    int deleteById(Integer id);

    int updateById(AdjustSalary record);

    int updateByIdSelective(AdjustSalary record);
}
