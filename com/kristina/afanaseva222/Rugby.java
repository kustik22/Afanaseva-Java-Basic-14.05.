package com.kristina.afanaseva222;

import java.util.concurrent.ThreadLocalRandom;

public class Rugby {
    public static void main(String[] args) {
        new Rugby().execute();
    }

    private void execute() {
        Team Aviator = new Team("Авіатор");
        Team Falcon = new Team("Сокіл");
        double AviatorAverageAge = Aviator.averageAge();
        double FalconAverageAge = Falcon.averageAge();
        System.out.println(Aviator);
        System.out.println(AviatorAverageAge);
        System.out.println(Falcon);
        System.out.println(FalconAverageAge);
        if (AviatorAverageAge > FalconAverageAge)
            System.out.println("Середній вік гравців" + Aviator.getName() + "більше");
        else if (AviatorAverageAge < FalconAverageAge)
            System.out.println("Середній вік гравців команди" + Falcon.getName() + "більше");
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
