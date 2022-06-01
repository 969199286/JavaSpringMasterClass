package academy.learnprogramming.bbbms.controller;

import academy.learnprogramming.bbbms.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

@Controller
public class DemoController {

    private final DemoService demoService;

    public DemoController(DemoService demoService) {
        this.demoService = demoService;
    }

    public String demo(Model model) {
        model.addAttribute("message", demoService.getMessage());
        return  "demo/demo";
    }

}
