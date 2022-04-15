package moodAnalyserDay21;

public class MoodAnalyser {
    public String analyseMood(String msg) {
        if(msg.contains("sad")){
            return "Sad";
        }
        return "Happy";
    }

    public static void main(String[] args) {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        System.out.println(moodAnalyser.analyseMood("I am sad today"));
        System.out.println(moodAnalyser.analyseMood("I am any mood today"));
    }
}