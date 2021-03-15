package ltd.huangbinghui.vhr.service.service;

import ltd.huangbinghui.vhr.mapper.DepartmentMapper;
import ltd.huangbinghui.vhr.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {
    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> getAllDep(){
        return departmentMapper.findAll();
    }

    public void addDep(Department department){
        department.setEnabled(true);
        departmentMapper.insert(department);
    }

    public void deleteById(Integer id){
        departmentMapper.deleteById(id);
    }

    public List<Department> getAllDepWithNoParent(){
        return departmentMapper.findAllWithNoParent();
    }

}
