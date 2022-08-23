import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class abc {
    public static void main(String[] args) {

        List<String> rockGenre = new ArrayList<>();
        rockGenre.add("progressive rock");
        rockGenre.add("symphonic rock");
        rockGenre.add(1,"art rock");
        for (String s: rockGenre) {
            System.out.println(s);
        }


        
        Map<String, String> guitarist = new HashMap<>();
        guitarist.put("ジミ・ヘンドリックス", "音");
        guitarist.put("スティーブ・ハウ", "マルチ");
        guitarist.put("スティーブ・ハケット", "クラシックギター");
        guitarist.put("ブライアン・メイ", "七色");

        System.out.println(guitarist.get("スティーブ・ハウ"));

        String[] iroha = {"a", "b", "c", "d"};
        try {
            System.out.println(iroha[4]);
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("例外が発生");
        }
        finally {
            System.out.println("最終処理");
        }
    }
}