package com.sky.service;

import com.sky.dto.EmployeeDTO;
import com.sky.dto.EmployeeLoginDTO;
import com.sky.dto.EmployeePageQueryDTO;
import com.sky.entity.Employee;
import com.sky.result.PageResult;

public interface EmployeeService {

    /**
     * 员工登录
     * @param employeeLoginDTO
     * @return
     */
    Employee login(EmployeeLoginDTO employeeLoginDTO);

    /**
     * 新增员工
     * @Param employeeDTO
     *
     */
    void save(EmployeeDTO employeeDTO);

    /**
     * 员工分页查询
     * @Param employeePageQueryDTO
     * @Return PageResult
     */
    PageResult pageQuery(EmployeePageQueryDTO employeePageQueryDTO);

    /**
     * 启用禁用员工
     * @Param status,id
     */
    void startOrStop(Integer status,Long id);


    /**
     * 根据Id查询员工
     * @param id
     */
    Employee getById(Long id);

    /**
     * 编辑员工信息
     * @param
     */
    void update(EmployeeDTO employeeDTO);
}
