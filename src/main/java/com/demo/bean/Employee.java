package com.demo.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author zhf
 * @ClassName Employee
 * @Description TODO
 * @Date 2021/11/2 21:39
 **/

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer empId;

    private String empName;

    private String gender;

    private String email;

    private Integer dId;

}
