package int101.names;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Naming {
    private static final int INIT_SIZE = 10;

    private static final int NOT_FOUND = -1;
    private final String title;
    private String[] names;
    private int count;


    public static boolean isValidNameString(String s){
        return  s != null &&  !s.isBlank() && !s.contains(" ");
    }

    public Naming(String title) {
       if(!isValidNameString(title)) title = "NO_NAME" ;
        this.title = title;
        this.names = new String[INIT_SIZE];
    }

    public boolean addName(String name){
        if(!isValidNameString(name)) return false;
        if(findName(name)) return false;
        if(count == names.length) grow();
        names[count++] = name;
        return true;
    }

    public boolean removeName(String name){
        int i = position(name);
            if(i == NOT_FOUND){
                  names[i] = names[--count];
                  names[count] = null;
                  return true;
            }
            return false;
       }

    public  boolean findName(String name){
          return position(name) != NOT_FOUND;
    }

    private int position(String name){
        if(!isValidNameString(name)) return NOT_FOUND;
        for (int i = 0 ; i < count ; i++){
            if(names[i].equals(name)) return i;
        }
        return  NOT_FOUND;
    }

    private void grow(){
        names = Arrays.copyOf(names , count *2 ) ;
    }

    @Override
    public String toString() {
        return "Naming{" + "title='" + title + '\'' + nameList() + '}';
    }

    private String nameList(){
        if(count == 0) return "" ;
        StringBuilder sb = new StringBuilder();
        sb.append(" , name = [ ") ;
        for(int i = 0 ; i< count ; i++ ){
            sb.append(" ");
            sb.append(names[i]);
        }
        sb.append(" ] ");
        return sb.toString();

    }

}

=======================================================================

package int101.retrain;

import int101.names.Naming;

public class Int101retrain {

    public static void main(String[] args) {
        Naming n = new Naming("A");
        System.out.println(n);
        System.out.println(" add XYZ : " + n.addName("XYZ"));
        System.out.println(" add Zipe : " + n.addName("Zipe"));
        System.out.println(" add WWW : " + n.addName("WWW"));
        System.out.println(" add URL : " + n.addName("URL"));
        System.out.println(" add WWW : " + n.addName("WWW"));
        System.out.println("Show : " + n);
        System.out.println("find Yale : " + n.findName("Yale"));
        System.out.println("find WWW : " + n.findName("WWW"));
        System.out.println("remove MMM : " + n.removeName("MMM"));
        System.out.println("Show : " + n);

    }
}
