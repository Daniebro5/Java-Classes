/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ObjetosYClases;

/**
 *
 * @author dannibrito
 */
public class House {
    int people;
    String address;
    double constructionMeters;

    public House() {
    }

    @Override
    public String toString() {
        return "House{" + "people=" + people + ", address=" + address + ", constructionMeters=" + constructionMeters + '}';
    }

    public House(int people, String address, double constructionMeters) {
        this.people = people;
        this.address = address;
        this.constructionMeters = constructionMeters;
    }

    public int getPeople() {
        return people;
    }

    public void setPeople(int people) {
        this.people = people;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getConstructionMeters() {
        return constructionMeters;
    }

    public void setConstructionMeters(double constructionMeters) {
        this.constructionMeters = constructionMeters;
    }

    
    
    
}
