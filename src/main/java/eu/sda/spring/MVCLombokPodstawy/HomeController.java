package eu.sda.spring.MVCLombokPodstawy;

import eu.sda.spring.MVCLombokPodstawy.model.Project;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller

public class HomeController {
    @Autowired
    ProjectRepository projectRepository;

    @GetMapping("/")
    @ResponseBody
    public String home(){
        return "Simple test";
    }


    @GetMapping("/home")
    public String  homeExampleJspFile(Model model){

        model.addAttribute("name", "Junor Software Developer");
        model.addAttribute("projects", projectRepository.getProjects());
        model.addAttribute("project",
                Project.builder().name("nowy").startDate(new Date()).team(2).build()
        );
        return "home";
    }


}
