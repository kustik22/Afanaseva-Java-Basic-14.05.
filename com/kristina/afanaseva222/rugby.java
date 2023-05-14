package com.kristina.afanaseva222;

import java.util.concurrent.ThreadLocalRandom;

public class rugby {
    public static void main(String[] args) {
        new rugby().execute();
    }

    private void execute() {
        Team aviator = new Team("авіатор");
        Team RK_Tech_A_S = new Team("РК_Тех_А_С");
        double aviatorAverageAge = aviator.averageAge();
        double RK_Tech_A_SAverageAge = RK_Tech_A_S.averageAge();
        System.out.println(aviator);
        System.out.println(aviatorAverageAge);
        System.out.println(RK_Tech_A_S);
        System.out.println(RK_Tech_A_SAverageAge);
        if (aviatorAverageAge > RK_Tech_A_SAverageAge)
            System.out.println("Середній вік гравців" + aviator.getName() + "більше");
        else if (aviatorAverageAge < RK_Tech_A_SAverageAge)
            System.out.println("Середній вік гравців команди" + RK_Tech_A_S.getName() + "більше");
        else System.out.println("Середній вік команди рівний");
    }

    class Team {
        private Person[] people;
        private String name;

        public Team(String name) {
            this.people = new Person[25];
            this.name = name;
            ThreadLocalRandom random = ThreadLocalRandom.current();
            for (int i = 0; i < 25; i++) {
                Person person = new Person(random.nextInt(18, 40));
                people[i] = person;
            }
        }

        public String getName() {
            return name;

        }

        @Override
        public String toString() {
            StringBuilder builder = new StringBuilder();
            for (Person person : people) {
                builder.append(person.getAge());
                builder.append("");
            }
            return "Вік гравців команди" + name + ": " + builder.toString();
        }

        public double averageAge() {
            double res = 0;
            for (Person person : people) res += person.getAge();
            return res / 25.0;
        }
    }

    class Person {
        private int age;

        public int getAge() {
            return age;
        }

        public Person(int age) {
            this.age = age;
        }
    }
}