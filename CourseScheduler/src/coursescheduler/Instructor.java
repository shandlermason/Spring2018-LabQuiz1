
package coursescheduler;

public class Instructor {
    private String firstname;
    private String lastname;
    private String officeBuilding;
    private String roomNumber;
    
    Instructor(){
    firstname = "Albert";
    lastname = "Einstein";
    officeBuilding = "Mcnair";
    roomNumber = "420";
    }
    
    Instructor(String firstname, String lastname, String officeBuilding, String roomNumber){
        this.firstname=firstname;
        this.lastname=lastname;
        this.officeBuilding=officeBuilding;
        this.roomNumber=roomNumber;
    }
    public String toString (){
    return firstname + " * "+ lastname +" * "+ officeBuilding +" * "+ roomNumber;
    }

    /**
     * @return the firstname
     */
    public String getFirstname() {
        return firstname;
    }

    /**
     * @param firstname the firstname to set
     */
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    /**
     * @return the lastname
     */
    public String getLastname() {
        return lastname;
    }

    /**
     * @param lastname the lastname to set
     */
    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    /**
     * @return the officeBuilding
     */
    public String getOfficeBuilding() {
        return officeBuilding;
    }

    /**
     * @param officeBuilding the officeBuilding to set
     */
    public void setOfficeBuilding(String officeBuilding) {
        this.officeBuilding = officeBuilding;
    }

    /**
     * @return the roomNumber
     */
    public String getRoomNumber() {
        return roomNumber;
    }

    /**
     * @param roomNumber the roomNumber to set
     */
    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }
    
    
}
