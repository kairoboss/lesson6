package com.example.lesson6;

import android.content.Context;

import androidx.annotation.ContentView;
import androidx.test.core.app.ActivityScenario;
import androidx.test.ext.junit.rules.ActivityScenarioRule;
import androidx.test.platform.app.InstrumentationRegistry;
import androidx.test.ext.junit.runners.AndroidJUnit4;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import static androidx.test.espresso.Espresso.onView;
import static androidx.test.espresso.action.ViewActions.click;
import static androidx.test.espresso.action.ViewActions.typeText;
import static androidx.test.espresso.assertion.ViewAssertions.matches;
import static androidx.test.espresso.matcher.ViewMatchers.withId;
import static androidx.test.espresso.matcher.ViewMatchers.withText;
import static org.junit.Assert.*;

/**
 * Instrumented test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {

    @Rule
    public ActivityScenarioRule<MainActivity> activityRule =
            new ActivityScenarioRule<>(MainActivity.class);

    @Test
    public void addTest(){
        onView(withId(R.id.et_1st_num)).perform(typeText("2"));
        onView(withId(R.id.et_2nd_num)).perform(typeText("2"));
        onView(withId(R.id.btn_addition)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("4")));
    }

    @Test
    public void subTest(){
        onView(withId(R.id.et_1st_num)).perform(typeText("8"));
        onView(withId(R.id.et_2nd_num)).perform(typeText("4"));
        onView(withId(R.id.btn_addition)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("4")));
    }

    @Test
    public void multTest(){
        onView(withId(R.id.et_1st_num)).perform(typeText("2"));
        onView(withId(R.id.et_2nd_num)).perform(typeText("2"));
        onView(withId(R.id.btn_addition)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("4")));
    }

    @Test
    public void divTest(){
        onView(withId(R.id.et_1st_num)).perform(typeText("16"));
        onView(withId(R.id.et_2nd_num)).perform(typeText("4"));
        onView(withId(R.id.btn_addition)).perform(click());
        onView(withId(R.id.tv_result)).check(matches(withText("4")));
    }
}