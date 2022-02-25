package ru.mirea.Pract_14;

import java.util.ArrayList;
import java.util.Objects;

public class Service {
    public static ArrayList<University> universities = new ArrayList<>();

    public static boolean delete(String name){
        if (universities == null)
            return false;
        for (University uni : universities){
            if (Objects.equals(uni.getUniversityName(), name)){
                universities.remove(uni);
                return true;
            }
        }
        return false;
    }

    public static boolean add(University temp){
        if (universities == null){
            universities.add(temp);
            return true;
        }
        for (University group : universities){
            if (Objects.equals(group.getUniversityName(), temp.getUniversityName())){
                return false;
            }
        }
        universities.add(temp);
        return true;
    }

    public static University find(String name){
        if (universities == null)
            return null;
        for (University group : universities){
            if (Objects.equals(group.getUniversityName(), name)){
                return group;
            }
        }
        return null;
    }
}
