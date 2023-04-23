import java.util.Comparator;

public class Family_memberComparatorByName implements Comparator<Family_member> {

    @Override
    public int compare(Family_member o1, Family_member o2) {
        return o1.getName().compareTo(o2.getName());
    
    }


}
    



