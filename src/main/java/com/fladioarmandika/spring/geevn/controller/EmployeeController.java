package com.fladioarmandika.spring.geevn.controller;

import com.fladioarmandika.spring.geevn.model.Employee;
import com.fladioarmandika.spring.geevn.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employee", method = RequestMethod.GET)
    public ModelAndView getEmployeePage(ModelAndView model) {
        model.addObject("employees",employeeService.getAllEmployee());
        model.addObject("page","employeesPage");
        model.setViewName("main");
        return model;
    }

    @RequestMapping(value = "/employee/add",method = RequestMethod.GET)
    public ModelAndView getEmployeeAddPage(ModelAndView model) {
        model.addObject("page","employeesPage_add");
        model.setViewName("main");
        return model;
    }

    @RequestMapping(value = "/employee/add",method = RequestMethod.POST)
    public ModelAndView addEmployee(ModelAndView model, @ModelAttribute Employee employee) {
        employeeService.addEmployee(employee);
        model.setViewName("redirect:/employee");
        return model;
    }

    @RequestMapping(value = "/employee/{id}",method = RequestMethod.GET)
    public ModelAndView getEmployeeViewPage(ModelAndView model, @PathVariable String id) {
        model.addObject("employee",employeeService.getEmployee(Integer.parseInt(id)));
        model.addObject("page","employeesPage_view");
//        System.out.println(employeeService.getEmployee(Integer.parseInt(id))
//                .getEmployeeName());
        model.setViewName("main");
        return model;
    }





}
