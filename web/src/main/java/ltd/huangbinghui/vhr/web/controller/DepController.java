package ltd.huangbinghui.vhr.web.controller;

import ltd.huangbinghui.vhr.model.Department;
import ltd.huangbinghui.vhr.service.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dep")
public class DepController {

    private DepartmentService depService;
    @Autowired
    public DepController(DepartmentService depService){
        this.depService=depService;
    }

    @PostMapping("/")
    public void appDep(@RequestParam Department dep){
        depService.addDep(dep);
    }

    @GetMapping("/")
    public List<Department> getAll(){
        return depService.getAllDep();
    }
}
