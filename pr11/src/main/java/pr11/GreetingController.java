package pr11;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class GreetingController {
    @GetMapping("/greeting")
    public @ResponseBody String greeting(@RequestParam(name = "Nikita",required = false,defaultValue = "Hi") String name, Model model){
        model.addAttribute("name",name);
        return "greeting to Artem";
    }
}
