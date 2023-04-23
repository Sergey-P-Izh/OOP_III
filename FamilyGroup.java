import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public class FamilyGroup implements Iterable <Family_member>{

   private List<Family_member> family_memberList;
   
   

   public FamilyGroup() {
    family_memberList = new ArrayList<>();
   }

   public void addFamily_member(Family_member family_member){
    family_memberList.add(family_member);

   }


   public void sortByName(){
    Collections.sort(family_memberList, new Family_memberComparatorByName());
   }

   public void sortByID(){
      family_memberList.sort(new Family_memberComparatorByID());

   }

   public void sortByAge(){
      family_memberList.sort(new Family_memberComparatorByAge());

   }

   @Override
   public Iterator<Family_member> iterator(){
    return new Family_memberIterator(family_memberList);
   }

   public Family_member[] getFamily_memberList() {
      return null;
   }

   



}

