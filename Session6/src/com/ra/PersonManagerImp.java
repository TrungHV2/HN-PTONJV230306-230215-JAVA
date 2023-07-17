package com.ra;

public class PersonManagerImp implements PersonManager{
    @Override
    public Person[] getAllPersons() {
        System.out.println(ADDRESS);
        System.out.println("PersonManagerImp implements interface PersonManager::getAllPersons");
        return new Person[0];
    }

    @Override
    public void addPerson(Person p) {
        System.out.println("PersonManagerImp implements interface PersonManager::addPerson");
    }
}
