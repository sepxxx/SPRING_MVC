package com.spring.mvc;

import com.spring.mvc.validation.CheckEmail;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

import java.util.HashMap;
import java.util.Map;

public class Employee {

    @Size(min = 2,message = "must be min 2 chars long")
    private String name;
    @NotBlank(message = "field can not be blank")
    private String surname;
    private int salary;

    private String department;

    private String carBrand;

    private String[] languages;

    private Map<String, String> departmentsMap;

    @CheckEmail
    private String email;
    public Employee() {
        departmentsMap = new HashMap<>();
        departmentsMap.put("IT", "IT");
        departmentsMap.put("CRYPTO", "CRYPTO");
        departmentsMap.put("POLICE", "POLICE");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartmentsMap() {
        return departmentsMap;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public String[] getLanguages() {
        return languages;
    }

    public void setLanguages(String[] languages) {
        this.languages = languages;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
