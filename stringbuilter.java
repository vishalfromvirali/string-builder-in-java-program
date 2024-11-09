import java.util.*;
class stringbuilter{
    public static void main(String[]args){
        StringBuilder name =new StringBuilder();
        name.append("hello");
        name.append("  ");
        name.append("vishal");
        name.reverse();
        name.append(10);
        name.reverse();
        name.delete(0,8);
        name.insert(0,"v");
        System.out.println(name);
    }
}