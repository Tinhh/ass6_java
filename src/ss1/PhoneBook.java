package ss1;

import java.util.ArrayList;

public class PhoneBook extends Phone {
    public ArrayList<PhoneNumber> Phonelist = new ArrayList<>();
    public static void main(String args[]) {
        PhoneNumber phoneNumber = new PhoneNumber("aa","029933");

        PhoneNumber.Telephone telephone = new PhoneNumber("aaa","343").new Telephone();
        PhoneNumber.Telephone telephone1 = phoneNumber.new Telephone();

        telephone.call();

        phoneNumber.new Telephone().call();

        //phoneNumber.new Cost().billing();
        PhoneNumber.Cost cost =  new PhoneNumber.Cost();
        cost.billing();






        IPhone iPhone = new IPhone() {
            @Override
            public void calling() {
                System.out.println("Calling..");
            }
            public void ring(){

            }
        };
        iPhone.calling();
        iPhone.ring();
    }

    @Override
    public void insertPhone(String name, String phone) {
        for (PhoneNumber pN : Phonelist){
            if(pN.getName().equals(name)){
                if(pN.getPhone().equals(phone)){
                    System.out.println("So dien thoai da ton tai");
                }else {
                    //pN.setPhone(pN.getName()+":"+phone);
                    String x = pN.getPhone();
                    x+= ":"+phone;
                    pN.setPhone(x);

                    System.out.println("da them vao so cu");
                }
                return;
            }
        }
        PhoneNumber px = new PhoneNumber(name,phone);
        Phonelist.add(px);
    }

    @Override
    public void removePhone(String name) {
//        for (PhoneNumber pN : PhoneList){
//            if(pN.getName().equals(name)){
//                PhoneList.remove(pN);
//                return;
//            }
//        }
        for (int i=0;i<Phonelist.size();i++){
            if(Phonelist.get(i).getName().equals(name)){
                Phonelist.remove(i);
            }
        }
    }

    @Override
    public void updatePhone(String name, String newphone) {
        for (PhoneNumber phoneNumber:Phonelist){
            if(phoneNumber.getName().equals(name)){
                phoneNumber.setPhone(newphone);
            }
        }
    }

    @Override
    public void searchPhone(String name) {
        for (PhoneNumber phoneNumber:Phonelist){
            if(phoneNumber.getName().equals(name)){
                System.out.println(phoneNumber.getName()+": "+phoneNumber.getPhone());
            }
        }
    }

//    @Override
//    public void sort() {
//        // Collections.sort ..
////        Collections.sort(PhoneList, new Comparator<PhoneNumber>() {
////            @Override
////            public int compare(PhoneNumber o1, PhoneNumber o2) {
////                return o1.getName().compareTo(o2.getName());
////            }
////        });
//        Collections.sort(Phonelist);
//    }
}

