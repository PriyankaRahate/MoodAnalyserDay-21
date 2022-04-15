package moodAnalysisTest;

import org.junit.Test;

import moodAnalyserDay21.MoodAnalyser;
import moodAnalyserDay21.MoodAnalysisException;

import org.junit.Assert;

public class MoodAnalyserTest {

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in sad mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Sad", mood);
    }

    @Test
    public void givenMessage_WhenHappy_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any mood");
        String mood = moodAnalyser.analyseMood();
        Assert.assertEquals("Happy",mood);
    }

    @Test
    public void givenNullMood_ShouldReturnHappy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        try{
            String mood = moodAnalyser.analyseMood();
            Assert.assertEquals("Happy ",mood);
        }
        catch (MoodAnalysisException e){
            System.out.println(e);
        }
    }
}
