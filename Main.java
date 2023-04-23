import java.util.jar.Attributes.Name;
import java.util.Iterator;

public class Main {
    public static void main(String[]args){
        FamilyGroup group = new FamilyGroup();
        Service service = new Service(group);
        service.addFamily_member("Василий", "37");
        service.addFamily_member("Анна", "35");
        service.addFamily_member("Антон", "8");

        for (Family_member family_member: group){
            System.out.println(family_member);
        }
    
        System.out.println();
        service.sortByName();
        for (Family_member family_member: group.getFamily_memberList()){
            System.out.println(family_member);
        }
    
        System.out.println();
        service.sortByID();
        for (Family_member family_member: group.getFamily_memberList()){
            System.out.println(family_member);
        }

        System.out.println();
        service.sortByAge();
        for (Family_member family_member: group.getFamily_memberList()){
            System.out.println(family_member);
        }
        

    }

}
    




    
    

    
    





   


    