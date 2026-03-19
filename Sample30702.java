package jump2java;
import java.util.ArrayList;

public class Sample30702 {
    public static void main(String[] args) {
        ArrayList pitches = new ArrayList();
        pitches.add("138");
        pitches.add("129");
        pitches.add("142");
        System.out.println(pitches.get(1));
        System.out.println(pitches.size());
        System.out.println(pitches.contains("142"));
        System.out.println(pitches.indexOf("129"));  // 129의 인덱스인 1을 반환
        System.out.println(pitches.remove("129"));  // 129를 리스트에서 삭제하고, true를 반환한다.
        System.out.println(pitches.remove(0));  // pitches의 첫 번째 항목이 138이므로, 138을 삭제한 뒤 138을 반환한다.
    }
}