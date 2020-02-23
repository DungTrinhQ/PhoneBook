import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class PhoneBook extends Phone implements PhoneFunction {
    ArrayList<Phone> PhoneList = new ArrayList<>(10);
    public void showPhoneBook(){
        for(Phone phone: PhoneList){
            System.out.println("Name: "+phone.getName() +"\n"+ "Phone number: "+phone.getPhoneNumber());
        }
    }

    @Override
    public void insertPhone(String name, String phoneNumber) {
        Phone newPhone = new Phone();
        boolean had = false;
        boolean find = false;
        if (PhoneList.size() > 0) {
            for (Phone ph : PhoneList) {
                if (ph.name.equals(name)) {
                    if (!ph.phoneNumber.contains(phoneNumber)) {
                        ph.phoneNumber = ph.phoneNumber + ":" + phoneNumber;
                        had = true;
                        find = true;
                        break;
                    }
                }
            }
            if (find == false) {
                newPhone.name = name;
                newPhone.phoneNumber = phoneNumber;
                PhoneList.add(newPhone);
                had = true;
            }
        } else {
            newPhone.name = name;
            newPhone.phoneNumber = phoneNumber;
            PhoneList.add(newPhone);
            had = true;
        }
        if (had)
            System.out.println("Thêm thành công!");
        else
            System.out.println("Tên người dùng và số điện thoại đã có sẵn");
    }


    @Override
    public void removePhone(String name) {
        boolean had = false;
        for (Phone ph : PhoneList) {
            if (ph.name.equals(name)) {
                PhoneList.remove(ph);
                had = true;
            }
        }
        if (had)
            System.out.println("Xóa thành công.");
        else
            System.out.println("Không tìm thấy.");
    }

    @Override
    public void updatePhone(String name, String newPhoneNumber) {
        boolean had = false;
        for (Phone ph : PhoneList) {
            if (ph.name.equals(name)) {
                ph.phoneNumber = newPhoneNumber;
                had = true;
            }
        }
        if (had)
            System.out.println("Sửa thành công.");
        else
            System.out.println("Không tìm thấy.");
    }

    @Override
    public void searchPhone(String name) {
        boolean had = false;
        for (Phone ph : PhoneList) {
            if (ph.name.equals(name)) {
                System.out.println("Số điện của người dùng '" + ph.name + "' là: " + ph.phoneNumber);
                had = true;
                break;
            }
        }
        if (!had)
            System.out.println("Không tìm thấy người dùng");
    }

    @Override
    public void sortPhone() {
        Collections.sort(PhoneList, new NameSortAscending());
        PhoneList.forEach((ph) -> {
            ph.viewInfor();
        });
    }
}

class NameSortAscending implements Comparator<Phone> {
    @Override
    public int compare(Phone ph1, Phone ph2) {
        if (ph1.name.compareToIgnoreCase(ph2.name) > 0)
            return 1;
        return 0;
    }
}
