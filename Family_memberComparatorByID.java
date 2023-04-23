import java.util.Comparator;

public class Family_memberComparatorByID implements Comparator<Family_member> {
    
    @Override

    public int compare(Family_member o1, Family_member o2) {
        return Integer.compare(o1.getId(), o2.getId());
    }
    
}
