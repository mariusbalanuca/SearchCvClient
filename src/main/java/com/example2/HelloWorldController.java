package com.example2;

import com.example.service.Cv;
import com.example.service.CvCatalogImpl;
import com.example.service.CvCatalogImplService;
import com.example.service.NoCvException_Exception;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

/**
 * @author MariusBalanuca
 * @since 09.12.2017
 **/
@Controller
@RequestMapping("/")
public class HelloWorldController {
    @RequestMapping(method = RequestMethod.GET)
    public String sayHello() {
        return "welcome";
    }

    @RequestMapping(value = "/cvAdded", method = RequestMethod.GET)
    public String addCv(String name, String job, Integer salary, Integer age, ModelMap model) {
        model.addAttribute("name", name);
        model.addAttribute("job", job);
        model.addAttribute("salary", salary);
        model.addAttribute("age", age);

        CvCatalogImplService cvCatalogImplService = new CvCatalogImplService();
        CvCatalogImpl cvCatalog = cvCatalogImplService.getCvCatalogImplPort();
        cvCatalog.addCv(name, job, salary, age);
        return "cvAdded";
    }

    @RequestMapping(value = "/viewCv", method = RequestMethod.GET)
    public String viewCv(String job, Model model) {
        CvCatalogImplService cvCatalogImplService = new CvCatalogImplService();
        CvCatalogImpl cvCatalog = cvCatalogImplService.getCvCatalogImplPort();
        List<Cv> cvList = null;
        try {
            cvList = cvCatalog.getCv(job);
        } catch (NoCvException_Exception e) {
            e.printStackTrace();
        }
        for (Cv cv : cvList) {
            model.addAttribute("name", cv.getName());
            model.addAttribute("job", cv.getJob());
            model.addAttribute("salary", cv.getSalary());
            model.addAttribute("age", cv.getAge());
        }
        return "viewCv";
    }
    @RequestMapping(value = "/viewAllCv", method = RequestMethod.GET)
    public String viewAllCv(Model model) {
        CvCatalogImplService cvCatalogImplService = new CvCatalogImplService();
        CvCatalogImpl cvCatalog = cvCatalogImplService.getCvCatalogImplPort();
        List<Cv> fullCvList = cvCatalog.showAll();
        model.addAttribute("cv", fullCvList);
        return "viewAllCv";
    }
}