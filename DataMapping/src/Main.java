import java.util.*;
public class Main {
    public static void main(String[] args) {
            //Array List
            System.out.println("---------------------Array List----------------------");
            ArrayList<String> Data = new ArrayList<String>();
            Data.add("sqdqs");
            Data.add("myName");
            Data.add("Ayman");
            Iterator<String> it = Data.iterator();
            System.out.println(Data);
            while (it.hasNext()){
                String now = it.next();
                if (now.equals("myName")){
                    System.out.println(now+" removed");
                    it.remove();
                }
            }
            System.out.println(Data);
            //Mapp
            System.out.println("---------------------Mapp----------------------");
            Map<Integer,String> map = new HashMap<Integer,String>();
            map.put(1,"dsqdq");
            map.put(2,"Aymanee");
            map.put(3,"othmane");
            Set<Integer> setInt = map.keySet();
            Iterator<Integer> TT = setInt.iterator();
            while (TT.hasNext()){
                int key = TT.next();;
                System.out.println(key + " : " + map.get(key));
            }
            //TreeSet
            System.out.println("---------------------TreeSet(tri)----------------------");
            Set<String> tree = new TreeSet<String>();
            tree.add("name1");
            tree.add("name1");
            tree.add("name2");
            tree.add("name3");
            Iterator<String> iter = tree.iterator();
            while (iter.hasNext()){
                System.out.println(iter.next());
            }





    }
}