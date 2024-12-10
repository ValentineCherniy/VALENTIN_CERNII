package homework_nr_9;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainToDo {
    public static void main(String[] args) {
        List<String> toDo = new ArrayList<>();
        Set<String> uniqueToDo = new HashSet<>();

        toDo.add("wake up!");
        toDo.add("wake up!");
        toDo.add("wake up!");
        toDo.add("feed your cat");
        toDo.add("do exercises");
        toDo.add("take eating");
        toDo.add("do your job");
        toDo.add("feed your cat");
        toDo.add("take eating");
        toDo.add("try to complete Java course's homework");
        toDo.add("rewatch the video of actual lesson");
        toDo.add("rewatch the video of actual lesson");
        toDo.add("try to complete Java course's homework");
        toDo.add("rewatch the video of actual lesson");
        toDo.add("try to complete Java course's homework");
        toDo.add("feed your cat");
        toDo.add("check if somebody is wrong in Internet, and tell him about it");

        System.out.println(toDo);

        for (int i=0; i !=toDo.size(); i++){
            uniqueToDo.addAll(toDo);
        };

        System.out.println(uniqueToDo);




    }
}
