package hacking;


import lombok.Getter;

/**
 * @author Igor Hnes on 9/11/17.
 */
public class MyClass {

    @Getter
    private String name = "Bob1";
    private String surname;

    private String getHand() {
        return "handy";
    }
}
