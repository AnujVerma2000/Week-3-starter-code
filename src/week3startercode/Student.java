/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package week3startercode;

/**
 *
 * @author mehta
 */
public class Student {
    private String FirstName;
    private int ID;
    private boolean PartTime;

    /**
     * @return the FirstName
     */
    public String getFirstName() {
        return FirstName;
    }

    /**
     * @param FirstName the FirstName to set
     */
    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    /**
     * @return the ID
     */
    public int getID() {
        return ID;
    }

    /**
     * @param ID the ID to set
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * @return the PartTime
     */
    public boolean isPartTime() {
        return PartTime;
    }

    /**
     * @param PartTime the PartTime to set
     */
    public void setPartTime(boolean PartTime) {
        this.PartTime = PartTime;
    }
    
}
