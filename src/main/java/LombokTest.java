import lombok.Data;

@Data
public class LombokTest {
    public String name;
    public Boolean Enabled;
    public int count;

    public static void main(String[] args) {
        LombokTest lombok = new LombokTest();
        lombok.setName("张三");
        System.out.println(lombok.toString());

    }
}
