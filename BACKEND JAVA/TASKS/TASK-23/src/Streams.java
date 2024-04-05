import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Streams {
        List<String> list = List.of("Fia -f", "Radagon -m", "Godfrey -m", "Godwyn -m", "Melina -f");
        static Map<String, String> nameMap = new HashMap<>();


        //LAMBDA EXPRESSION to FEMALE LIST
        static List<String> femaleList = nameMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals("f"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());


        //LAMBDA EXPRESSION to MALE LIST
        static List<String> maleList = nameMap.entrySet().stream()
                .filter(entry -> entry.getValue().equals("m"))
                .map(Map.Entry::getKey)
                .collect(Collectors.toList());

        public static List<String> getFemaleList(){
            return femaleList;
        }

        public static List<String> getMaleList(){
        return maleList;
        }

}