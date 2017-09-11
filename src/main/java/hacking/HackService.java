package hacking;

import java.lang.reflect.Field;

/**
 * @author Igor Hnes on 9/11/17.
 */
public class HackService {

    public static void main(String[] args) throws NoSuchMethodException, NoSuchFieldException, IllegalAccessException {

        final MyClass myClass = new MyClass();
        Class<? extends MyClass> aClass = myClass.getClass();

        final Field []fields = aClass.getDeclaredFields();

        for(Field f:fields){
            System.out.println(f.toString());
        }
      final Field name= aClass.getDeclaredField("name");

        name.setAccessible(true);
        name.set(myClass,"Gala");

        //System.out.println(myClass.getName());
        Object o = name.get(myClass);

        String newName="";
        if(o instanceof String){
            newName=(String) o;
            System.out.println(newName);
        }else{
            newName="null";
            System.out.println(newName);
        }


        //final Field fields = clazz.getDeclaredField(“age”);
        //fields.setAccessible(true);

    }
}
