package com.example.stateart

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performTextInput
import com.example.stateart.ui.compose.TipCalculatorScreen
import com.example.stateart.ui.theme.StateArtTheme
import org.junit.Rule
import org.junit.Test
import java.text.NumberFormat

class TipUITests {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun calculate_20_percent_tip() {
        composeTestRule.setContent {
            StateArtTheme {
                TipCalculatorScreen(onBack = {})
            }
        }

        composeTestRule.onNodeWithText("Счёт").performTextInput("10")
        composeTestRule.onNodeWithText("Процент чаевых").performTextInput("20")

        val expectedTip = NumberFormat.getCurrencyInstance().format(2)
        composeTestRule.onNodeWithText("Сумма чаевых: $expectedTip")
            .assertExists("Рассчитанная сумма чаевых не найдена")
    }
}
