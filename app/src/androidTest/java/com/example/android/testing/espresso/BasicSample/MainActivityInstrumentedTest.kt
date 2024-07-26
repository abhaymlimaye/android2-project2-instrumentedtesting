package com.example.android.testing.espresso.BasicSample

import androidx.test.core.app.ActivityScenario
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.matcher.ViewMatchers.*
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class MainActivityInstrumentedTest {
    @Test
    fun validateTextView() {
        ActivityScenario.launch(MainActivity::class.java)
        onView(withId(R.id.textToBeChanged))
            .check(matches(withText("Hello World!")))
    }
}
