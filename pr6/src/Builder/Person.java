package Builder;

import java.util.Set;

public class Person {

    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private Set<Person> parents;


//    Person (String name, String surname){
//        this.name = name;
//        this.surname = surname;
//    }
//
//    Person (String name, String surname, int age){
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//    }
//
//    Person (String name, String surname, int age, int height){
//        this.name = name;
//        this.surname = surname;
//        this.age = age;
//        this.height = height;
//    }

//паттерн Builder используется, если нам необходимо большое число всевозможных контсрукторов,
    //которые трудно предугадать
    public static class Builder {
        private Person newPerson;

        public Builder() {
            newPerson = new Person();
        }

        public Builder withName(String name){
            newPerson.name = name;
            return this;
        }

        public Builder withSurname(String surname){
            newPerson.surname = surname;
            return this;
        }

        public Builder withAge(int age){
            newPerson.age = age;
            return this;
        }

        public Builder withHeight(int height){
            newPerson.height = height;
            return this;
        }

        public Builder withWeight(int weight){
            newPerson.weight = weight;
            return this;
        }

        public Builder withParents(Set<Person> parents){
            newPerson.parents = parents;
            return this;
        }

        public Person build(){
            return newPerson;
        }

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                ", parents=" + parents +
                '}';
    }
}
