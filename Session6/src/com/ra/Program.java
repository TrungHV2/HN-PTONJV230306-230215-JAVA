package com.ra;

public class Program {
    public static void main(String[] args) {
        Person st = new Student();
        st.input();

        Person perA = new Person() {
            @Override
            public void input() {

            }
        };

        PersonManager pm = new PersonManagerImp();
        pm.getAllPersons();

        PersonManager pmA = new PersonManager() {
            @Override
            public Person[] getAllPersons() {
                return new Person[0];
            }

            @Override
            public void addPerson(Person p) {

            }
        };
    }
}
