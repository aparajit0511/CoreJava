package equalsAndhashcode;

import java.util.Objects;

public class EqualsAndHashcode {
    public static void main(String[] args) {
        Person person1 = new Person("John",19);
        Person person2 = new Person("John",19);
        Person person3 = new Person("Adam",19);

        boolean result1 = person1.equals(person2);
        boolean result2 = person2.equals(person3);

        System.out.println("Result1 is " + result1 + " and Result2 is " + result2);

        int hashcode1 = person1.hashcode(person1);
        int hashcode2 = person2.hashcode(person2);
        int hashcode3 = person3.hashcode(person3);
        System.out.println(hashcode1);
        System.out.println(hashcode2);
        System.out.println(hashcode1 == hashcode2);
        System.out.println(hashcode1 == hashcode3);
    }

    public static  class Person{
        private String name;
        private int age;

        public Person(String name,int age){
            this.name = name;
            this.age = age;
        }

        public String getName(){
            return this.name;
        }

        public void setName(String name){
            this.name = name;
        }

        public int getAge(){
            return this.age;
        }

        public void setAge(int age){
            this.age = age;
        }

        public boolean equals(Object obj){
            if(obj == null || getClass() != obj.getClass()){
                return false;
            }

            if(this == obj){
                return true;
            }

            Person person = (Person)obj;

            return person.name == name && person.age == age;

        }

        public int hashcode(Object obj){
            return Objects.hash(age,name);
        }

    } // Person class

}



