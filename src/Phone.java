public class Phone {
    public String name;
    public String phoneNumber;
    void viewInfor(){
        System.out.println("Name: "+name);
        System.out.println("Phone: "+phoneNumber);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Phone() {
    }

    public Phone(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }


}
