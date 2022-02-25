package ru.mirea.Pract_14;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/show")
public class ShowingController {
    @GetMapping("/all")
    public String addUniversity(){
        System.out.println("All universities show");
        return Service.universities.toString();
    }

    @GetMapping("/{nameU}")
    public String addStudent(@PathVariable String nameU){
        University group = Service.find(nameU);
        if (group == null){
            System.out.println("University " + nameU + " not found");
            return "University" + nameU + " not found";
        }
        System.out.println("University " + group.getUniversityName() + " show");
        return group.toString();
    }
}
