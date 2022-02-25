package ru.mirea.Pract_14;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/add")
public class AddingController {
    @GetMapping("/university/{name}")
    public String addGroup(@PathVariable String name){
        University uni = new University(name);
        boolean check = Service.add(uni);
        if (check){
            System.out.println("University " + name + " created");
            return "University " + uni.getUniversityName() + " has been created";
        } else {
            System.out.println("University with this name already exists");
            return "University with this name already exists";
        }
    }

    @GetMapping("/{nameU}/{full}")
    public String addStudent(@PathVariable String nameU, @PathVariable String full){
        University uni = Service.find(nameU);
        if (uni == null){
            System.out.println("University " + nameU + " not found");
            return "University " + nameU + " not found";
        }
        String[] names = full.split("\\.");
        Student student = new Student(names[0], names[1], names[2]);
        uni.addStudent(student);
        System.out.println("Student enters university" + uni.getUniversityName());
        return "Student enters university" + uni.getUniversityName();
    }
}
