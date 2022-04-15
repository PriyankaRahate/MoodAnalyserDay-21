package moodAnalysisTest;

import org.junit.Test;

import moodAnalyserDay21.MoodAnalyser;

import org.junit.Assert;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();

    @Test
    public void givenMessage_WhenSad_ShouldReturnSad() {
        String mood = moodAnalyser.analyseMood("I am in sad mood");
        Assert.assertEquals("Sad", mood);
    }
}
