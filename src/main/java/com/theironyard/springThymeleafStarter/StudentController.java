package com.theironyard.springThymeleafStarter;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class StudentController {


    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String index() {
        return "index";
    }

    @RequestMapping(path = "/new_student", method = RequestMethod.GET)
    public String newStudent(Model model) {
        model.addAttribute("grades", Grade.values());
        return "new_student";
    }

    @RequestMapping(path = "/create_student", method = RequestMethod.POST)
    public String createStudent(@RequestParam(value = "first_name") String firstName,
                                @RequestParam(value = "last_name") String lastName,
                                @RequestParam(value = "grade") Grade grade,
                                RedirectAttributes redirectAttributes) {
        Student student = new Student();
        student.setFirstName(firstName);
        student.setLastName(lastName);
        student.setGrade(grade);
        redirectAttributes.addFlashAttribute(student);
        return "redirect:/view_student";
    }

    @RequestMapping(path = "/view_student", method = RequestMethod.GET)
    public String viewStudent(Model model) {
        return "/view_student";
    }

}
