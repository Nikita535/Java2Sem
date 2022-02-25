package ru.mirea.Pract_14;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;

@RestController
@RequestMapping("/remove")
public class RemovingController {
    @GetMapping("/all")
    public String addGroup(){
        Service.universities = new ArrayList<>();
        System.out.println("All universities removed");
        return "All universities removed";
    }

    @GetMapping("/{nameU}")
    public String addStudent(@PathVariable String nameU){
        boolean check = Service.delete(nameU);
        if (check){
            System.out.println("University " + nameU + " has been removed");
            return "University " + nameU + " has been removed";
        } else {
            System.out.println("University with name " + nameU + " not found");
            return "University with name " + nameU + " not found";
        }
    }
}
