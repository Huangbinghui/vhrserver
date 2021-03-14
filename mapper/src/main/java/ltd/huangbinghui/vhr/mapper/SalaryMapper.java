package ltd.huangbinghui.vhr.mapper;

import ltd.huangbinghui.vhr.model.Salary;
import java.util.List;

public interface SalaryMapper {
    int deleteById(Integer id);

    int insert(Salary record);

    int insertSelective(Salary record);

    Salary selectById(Integer id);

    int updateByIdSelective(Salary record);

    int updateById(Salary record);

    List<Salary> getAllSalaries();
}
