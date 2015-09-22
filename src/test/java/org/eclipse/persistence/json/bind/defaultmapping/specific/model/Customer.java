package org.eclipse.persistence.json.bind.defaultmapping.specific.model;

import java.util.List;
import java.util.Map;

/**
 * @author Roman Grigoriadi
 */
public class Customer {

    private List<Address> addresses;

    private List<String> strings;

    private List<Integer> integers;

    private List<List<Integer>> listOfListsOfIntegers;

    private Map<String, Integer> stringIntegerMap;

    private Map<String, Customer> friends;

    private Integer age;

    private String name;

    public Customer() {
    }

    public Customer(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public List<Address> getAddresses() {
        return addresses;
    }

    public void setAddresses(List<Address> addresses) {
        this.addresses = addresses;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getStrings() {
        return strings;
    }

    public void setStrings(List<String> strings) {
        this.strings = strings;
    }

    public List<Integer> getIntegers() {
        return integers;
    }

    public void setIntegers(List<Integer> integers) {
        this.integers = integers;
    }

    public Map<String, Integer> getStringIntegerMap() {
        return stringIntegerMap;
    }

    public void setStringIntegerMap(Map<String, Integer> stringIntegerMap) {
        this.stringIntegerMap = stringIntegerMap;
    }

    public Map<String, Customer> getFriends() {
        return friends;
    }

    public void setFriends(Map<String, Customer> friends) {
        this.friends = friends;
    }

    public List<List<Integer>> getListOfListsOfIntegers() {
        return listOfListsOfIntegers;
    }

    public void setListOfListsOfIntegers(List<List<Integer>> listOfListsOfIntegers) {
        this.listOfListsOfIntegers = listOfListsOfIntegers;
    }
}