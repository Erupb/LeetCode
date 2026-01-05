package string;

public class t1108 {
    public String defangIPaddr(String address) {
        return address.replaceAll("\\.", "[.]"); // Можно подробнее - "\\[\\.\\]"
    }
}
