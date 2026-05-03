package com.example.helloandroid

import org.junit.Assert.*
import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import com.example.helloandroid.ui.theme.HelloAndroidTheme
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.asAndroidBitmap
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.test.captureToImage
import org.junit.Rule
import org.junit.Test

class MainActivityTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun greeting_name() {
        composeTestRule.setContent {
            HelloAndroidTheme() {
                Greeting(name = "Jane")
            }
        }

        composeTestRule.onNodeWithText("Welcome to Android, Jane!").assertIsDisplayed()

    }

    @Test
    fun greeting_name_empty() {
        composeTestRule.setContent {
            HelloAndroidTheme() {
                Greeting(name = "")
            }
        }

        composeTestRule.onNodeWithText("Welcome to Android, !").assertIsDisplayed()
    }

    @Test
    fun greeting_color() {
        composeTestRule.setContent {
            Greeting(name = "Bob")
        }

        val bitmap = composeTestRule.onNodeWithText("Welcome to Android, Bob!").captureToImage().asAndroidBitmap()

        val centerX = bitmap.width / 2
        val centerY = bitmap.height / 2
        val pixel = bitmap.getPixel(centerX, centerY)

        assertEquals(Color.Blue.toArgb(), pixel)
    }

}