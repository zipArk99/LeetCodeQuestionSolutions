package Arrays;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PascalTriangle {
    static public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> array=new ArrayList<List<Integer>>();
        List<Integer> list=new ArrayList<>();
        list.add(1);
        array.add(0,list);

        for(int i=1; i<numRows; i++){
            list=new ArrayList<>();
            list.add(1);
            for(int j=1; j<=i-1; j++){
                list.add(j,array.get((i-1)).get((j-1))+array.get((i-1)).get(j));
            }
            list.add(1);
            array.add(i,list);
        }
        return array;
    }
    public static void main(String[] args) {
        generate(5);

    }
}
