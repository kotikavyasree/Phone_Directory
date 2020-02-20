
package phone_directory;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
/*
 *
 * @author kotik
 */
public class Phone_Directory {
    static HashMap<Integer, String> map;
    static long phone_number;
    static String user_name;
    public static void store(String name, long phnumber)
    {
        HashMap<Long, String> map = new HashMap<>();
        map.put(phnumber,name);
        System.out.println(map);
       
    }
    
    public static void search(String name)
    {
        System.out.println(name);
        if(map.containsKey(name))
            {
                 System.out.println(map.containsKey(name));    
            }
        else{
                System.out.println("Not found!");
            }
        }
    public static void delete(long phnumber)
    {
        if(map.containsValue(phnumber))
        {
            map.remove(phnumber);
        }else
        {
            System.out.println("Phone Number not found!");
            System.exit(0);
        }
    }
    
    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        
        while(true){
            System.out.println("Type: 1.store  2.search  3.delete  4.exit");
          int type = scan.nextInt();
        if(type ==4){
            System.exit(0);
        }else if(type == 1){
            System.out.println("Enter user name");
            user_name= scan.next();
            System.out.println("Enter Ph number");
            phone_number= scan.nextLong();
            store(user_name, phone_number);
        }
        else if(type == 2){
            System.out.println("Enter user name");
            user_name= scan.next();
            search(user_name);
        }else if(type == 3){
            System.out.println("Enter Ph number");
            phone_number= scan.nextLong();
            delete(phone_number);
        }else{
            System.out.println("enter valid number");
        }
        }
        
    }
}
    

