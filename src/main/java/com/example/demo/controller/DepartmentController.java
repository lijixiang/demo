package com.example.demo.controller;

//import com.example.demo.mapper.DepartmentMapper;
import com.example.demo.model.Department;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class DepartmentController {

//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    @Autowired
//    DepartmentMapper departmentMapper;

//    @ResponseBody
//    @GetMapping("/query")
//    public Map<String,Object> map(){
//        List<Map<String,Object>> list = jdbcTemplate.queryForList("select * from department");
//        return list.get(0);
//    }
//
//    /**根据部门ID查询部门**/
//    @ResponseBody
//    @GetMapping("/department/{id}")
//    public ModelMap findDeptById(@PathVariable int id){
//        ModelMap mv = new ModelMap();
//        Department department = departmentMapper.getDeptById(id);
//        mv.addAttribute("dept",department);
//        return mv;
//    }
//
//    /**查询所有部门信息**/
//    @ResponseBody
//    @GetMapping("/findAll")
//    public Map<String,Object> findAll(){
//        List<Department> list = departmentMapper.getAllDept();
//        Map<String,Object> map = new HashMap<>();
//        map.put("findAll",list);
//        return map;
//    }

    @GetMapping("hello")
    @ResponseBody
    public String helloJenkins(){
        return "Hello Jenkins";
    }
}
