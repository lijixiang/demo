package com.example.demo.mapper;

import com.example.demo.model.Department;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper // 此注解标记的接口会自动生成实现类
@Repository
public interface DepartmentMapper {

    @Select("select * from department where id = #{id}")
    Department getDeptById(Integer id);

    @Select("delete department where id = #{id}")
    int deleteDeptById(Integer id);

    /**
     * useGeneratedKeys mybatis使用JDBC的getGeneratedKeys方法来取出由数据库内部
     * 生成的主键，例如,MySQL和SQLServer自动递增字段，Oracle的序列等。使用必须要给
     * keyProperty或者keyColumn赋值。
     * keyProperty表示以哪个列作为属性的主键，不能和keyProperty同时使用。
     * keyColumn指明第几列是主键，不能和keyProperty同时使用，只接受整型参数
     **/
    @Options(useGeneratedKeys = true, keyProperty = "id")
    @Insert("insert into department(departmentName) values (#{departmentName})")
    int insertDept(Department department);

    @Update("update department set departmentName = #{departmentName} where id = #{id}")
    int updateDept(Department department);

    @Select("select * from department")
    List<Department> getAllDept();
}
