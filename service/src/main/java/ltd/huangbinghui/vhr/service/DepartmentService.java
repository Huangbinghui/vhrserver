package ltd.huangbinghui.vhr.service;

import ltd.huangbinghui.vhr.mapper.DepartmentMapper;
import ltd.huangbinghui.vhr.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    private DepartmentMapper departmentMapper;
    @Autowired
    public DepartmentService(DepartmentMapper depMapper){
        this.departmentMapper=depMapper;
    }

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
