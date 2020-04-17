/**
 * @author pangy
 * @version 1.0
 * @date 2020/4/18 0:02
 */
public class NoteTest {

    public int count;

    public NoteTest() {
    }

    public NoteTest(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @param
     * @return int
     * @Description
     * @author pangy
     * @date 2020/4/18 0:59
     */
    public int getCount(int count) {
        return count;
    }

    /**
     * @param userName
     * @param countName
     * @param pyName
     * @return java.lang.String
     * @Description 获取名称
     * @author pangy
     * @date 2020/4/18 1:01
     */
    public String getName(String userName, String countName, String pyName) {
        return userName + countName + pyName;
    }

    public void outValue() {
        System.out.println("测速");
    }

    public static void main(String[] args) {
        NoteTest note = new NoteTest(3);
        System.out.println(note.toString());
    }
}
