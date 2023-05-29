import java.util.*;
public class MinDist 
{
    List<List<Integer>> minDist(List<List<Integer>> listOfList)
    {
        List<List<Integer>> ans = new ArrayList<>();
      
        int min =100000;
        for(int i=0;i<listOfList.size()-1;i++)
        {
            for(int j=i+1;j<listOfList.size();j++)
            {
                List<Integer> innerList1 = new ArrayList<>();
                List<Integer> innerList2 = new ArrayList<>();
                List<Integer> points = listOfList.get(i);
                System.out.println(points);
                List<Integer> points1 = listOfList.get(j);
                System.out.println(points1);
                int x=Math.abs(points.get(0)-points1.get(0));
                System.out.println(x);
                int y=Math.abs(points.get(1)-points1.get(1));
                System.out.println(y);
                int dist = (int) Math.sqrt(Math.pow(x, 2)+ Math.pow(y, 2));
                System.out.println(dist);
                if(dist<min)
                {
                    ans.clear();
                    min=dist;
                    innerList1.add(points.get(0));
                    innerList1.add(points.get(1));
                    innerList2.add(points1.get(0));
                    innerList2.add(points1.get(1));
                    ans.add(innerList1);
                    ans.add(innerList2);
                    
                }                
            }
        }
        return ans;
    }
    public static void main(String[] args)  //[[0,1],[0,2],[0,3],[0,4]];
    {
        List<List<Integer>> listOflist = new ArrayList<>();
        List<Integer> innerList = new ArrayList<>();
        innerList.add(5);
        innerList.add(1);
        listOflist.add(innerList);
       
        List<Integer> innerList1 = new ArrayList<>();
        innerList1.add(12);
        innerList1.add(10);
        listOflist.add(innerList1);

        List<Integer> innerList2 = new ArrayList<>();
        innerList2.add(2);
        innerList2.add(3);
        listOflist.add(innerList2);
       
        List<Integer> innerList3= new ArrayList<>();
        innerList3.add(3);
        innerList3.add(4);
        listOflist.add(innerList3);
        System.out.println(listOflist);
        MinDist min= new MinDist();
        System.out.println(min.minDist(listOflist));
    }
}
