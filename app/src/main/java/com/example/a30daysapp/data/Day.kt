
/*package com.example.a30daysapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysapp.R

/**
 * A data class to represent the information presented in the Day card
 */
/*data class Day(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val subtitle: Int,
    @StringRes val hobbies: Int
)

val days = listOf(
    Day(R.drawable.koda, R.string.day_1, 2, R.string.day_1_description_1),
    Day(R.drawable.lola, R.string.day_2, 16, R.string.day_1_description_2),
    Day(R.drawable.frankie, R.string.day_3, 2, R.string.day_1_description_3),
    Day(R.drawable.nox, R.string.day_4, 8, R.string.day_1_description_4),
    Day(R.drawable.faye, R.string.day_5, 8, R.string.day_1_description_5),
    Day(R.drawable.bella, R.string.day_6, 14, R.string.day_1_description_6),
    Day(R.drawable.moana, R.string.day_7, 2, R.string.day_1_description_7),
    Day(R.drawable.tzeitel, R.string.day_8, 7, R.string.day_1_description_8),
    Day(R.drawable.leroy, R.string.day_9, 4, R.string.day_1_description_9),
    Day(R.drawable.koda, R.string.day_10, 4, R.string.day_1_description_9)
)*/
data class Day(
    @DrawableRes val imageResourceId: Int,
    @StringRes val description: Int,
    val subtitle: Int
)

val days = listOf(
    Day(R.drawable.koda, R.string.day_1, R.string.day_1_description),
    Day(R.drawable.lola, R.string.day_2, R.string.day_2_description),
    Day(R.drawable.frankie, R.string.day_3, R.string.day_3_description),
    Day(R.drawable.nox, R.string.day_4, R.string.day_4_description),
    Day(R.drawable.faye, R.string.day_5, R.string.day_5_description),
    Day(R.drawable.bella, R.string.day_6, R.string.day_7_description),
    Day(R.drawable.moana, R.string.day_7, R.string.day_8_description),
    Day(R.drawable.tzeitel, R.string.day_8, R.string.day_9_description),
    Day(R.drawable.leroy, R.string.day_9, R.string.day_10_description),
    Day(R.drawable.koda, R.string.day_10, R.string.day_11_description),
    Day(R.drawable.day11_image, R.string.day_11, R.string.day_11_subtitle, R.string.day_11_description),
    Day(R.drawable.day12_image, R.string.day_12, R.string.day_12_subtitle, R.string.day_12_description),
    Day(R.drawable.day13_image, R.string.day_13, R.string.day_13_subtitle, R.string.day_13_description),
    Day(R.drawable.day14_image, R.string.day_14, R.string.day_14_subtitle, R.string.day_14_description),
    Day(R.drawable.day15_image, R.string.day_15, R.string.day_15_subtitle, R.string.day_15_description),
    Day(R.drawable.day16_image, R.string.day_16, R.string.day_16_subtitle, R.string.day_16_description),
    Day(R.drawable.day17_image, R.string.day_17, R.string.day_17_subtitle, R.string.day_17_description),
    Day(R.drawable.day18_image, R.string.day_18, R.string.day_18_subtitle, R.string.day_18_description),
    Day(R.drawable.day19_image, R.string.day_19, R.string.day_19_subtitle, R.string.day_19_description),
    Day(R.drawable.day20_image, R.string.day_20, R.string.day_20_subtitle, R.string.day_20_description),
    Day(R.drawable.day21_image, R.string.day_21, R.string.day_21_subtitle, R.string.day_21_description),
    Day(R.drawable.day22_image, R.string.day_22, R.string.day_22_subtitle, R.string.day_22_description),
    Day(R.drawable.day23_image, R.string.day_23, R.string.day_23_subtitle, R.string.day_23_description),
    Day(R.drawable.day24_image, R.string.day_24, R.string.day_24_subtitle, R.string.day_24_description),
    Day(R.drawable.day25_image, R.string.day_25, R.string.day_25_subtitle, R.string.day_25_description),
    Day(R.drawable.day26_image, R.string.day_26, R.string.day_26_subtitle, R.string.day_26_description),
    Day(R.drawable.day27_image, R.string.day_27, R.string.day_27_subtitle, R.string.day_27_description),
    Day(R.drawable.day28_image, R.string.day_28, R.string.day_28_subtitle, R.string.day_28_description),
    Day(R.drawable.day29_image, R.string.day_29, R.string.day_29_subtitle, R.string.day_29_description),
    Day(R.drawable.day30_image, R.string.day_30, R.string.day_30_subtitle, R.string
    .day_30_description)
)*/


package com.example.a30daysapp

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.a30daysapp.R

/**
 * A data class to represent the information presented in the Day card
 */
data class Day(
    @DrawableRes val imageResourceId: Int,
    @StringRes val dayNumber: Int,
    @StringRes val description: Int,
    @StringRes val goal: Int,
    @StringRes val tip: Int
)

val days = listOf(
    Day(
        R.drawable.day1_image,
        R.string.day_1,
        R.string.day_1_description,
        R.string.day_1_goal,
        R.string.day_1_tip
    ),
    Day(
        R.drawable.day2_image,
        R.string.day_2,
        R.string.day_2_description,
        R.string.day_2_goal,
        R.string.day_2_tip
    ),
    Day(
        R.drawable.day3_image,
        R.string.day_3,
        R.string.day_3_description,
        R.string.day_3_goal,
        R.string.day_3_tip
    ),
    Day(
        R.drawable.day4_image,
        R.string.day_4,
        R.string.day_4_description,
        R.string.day_4_goal,
        R.string.day_4_tip
    ),
    Day(
        R.drawable.day5_image,
        R.string.day_5,
        R.string.day_5_description,
        R.string.day_5_goal,
        R.string.day_5_tip
    ),
    Day(
        R.drawable.day6_image,
        R.string.day_6,
        R.string.day_6_description,
        R.string.day_6_goal,
        R.string.day_6_tip
    ),
    Day(
        R.drawable.day7_image,
        R.string.day_7,
        R.string.day_7_description,
        R.string.day_7_goal,
        R.string.day_7_tip
    ),
    Day(
        R.drawable.day8_image,
        R.string.day_8,
        R.string.day_8_description,
        R.string.day_8_goal,
        R.string.day_8_tip
    ),
    Day(
        R.drawable.day9_image,
        R.string.day_9,
        R.string.day_9_description,
        R.string.day_9_goal,
        R.string.day_9_tip
    ),
    Day(
        R.drawable.day10_image,
        R.string.day_10,
        R.string.day_10_description,
        R.string.day_10_goal,
        R.string.day_10_tip
    ),
    Day(
        R.drawable.day11_image,
        R.string.day_11,
        R.string.day_11_description,
        R.string.day_11_goal,
        R.string.day_11_tip
    ),
    Day(
        R.drawable.day12_image,
        R.string.day_12,
        R.string.day_12_description,
        R.string.day_12_goal,
        R.string.day_12_tip
    ),
    Day(
        R.drawable.day13_image,
        R.string.day_13,
        R.string.day_13_description,
        R.string.day_13_goal,
        R.string.day_13_tip
    ),
    Day(
        R.drawable.day14_image,
        R.string.day_14,
        R.string.day_14_description,
        R.string.day_14_goal,
        R.string.day_14_tip
    ),
    Day(
        R.drawable.day15_image,
        R.string.day_15,
        R.string.day_15_description,
        R.string.day_15_goal,
        R.string.day_15_tip
    ),
    Day(
        R.drawable.day16_image,
        R.string.day_16,
        R.string.day_16_description,
        R.string.day_16_goal,
        R.string.day_16_tip
    ),
    Day(
        R.drawable.day17_image,
        R.string.day_17,
        R.string.day_17_description,
        R.string.day_17_goal,
        R.string.day_17_tip
    ),
    Day(
        R.drawable.day18_image,
        R.string.day_18,
        R.string.day_18_description,
        R.string.day_18_goal,
        R.string.day_18_tip
    ),
    Day(
        R.drawable.day19_image,
        R.string.day_19,
        R.string.day_19_description,
        R.string.day_19_goal,
        R.string.day_19_tip
    ),
    Day(
        R.drawable.day20_image,
        R.string.day_20,
        R.string.day_20_description,
        R.string.day_20_goal,
        R.string.day_20_tip
    ),
    Day(
        R.drawable.day21_image,
        R.string.day_21,
        R.string.day_21_description,
        R.string.day_21_goal,
        R.string.day_21_tip
    ),
    Day(
        R.drawable.day22_image,
        R.string.day_22,
        R.string.day_22_description,
        R.string.day_22_goal,
        R.string.day_22_tip
    ),
    Day(
        R.drawable.day23_image,
        R.string.day_23,
        R.string.day_23_description,
        R.string.day_23_goal,
        R.string.day_23_tip
    ),
    Day(
        R.drawable.day24_image,
        R.string.day_24,
        R.string.day_24_description,
        R.string.day_24_goal,
        R.string.day_24_tip
    ),
    Day(
        R.drawable.day25_image,
        R.string.day_25,
        R.string.day_25_description,
        R.string.day_25_goal,
        R.string.day_25_tip
    ),
    Day(
        R.drawable.day26_image,
        R.string.day_26,
        R.string.day_26_description,
        R.string.day_26_goal,
        R.string.day_26_tip
    ),
    Day(
        R.drawable.day27_image,
        R.string.day_27,
        R.string.day_27_description,
        R.string.day_27_goal,
        R.string.day_27_tip
    ),
    Day(
        R.drawable.day28_image,
        R.string.day_28,
        R.string.day_28_description,
        R.string.day_28_goal,
        R.string.day_28_tip
    ),
    Day(
        R.drawable.day29_image,
        R.string.day_29,
        R.string.day_29_description,
        R.string.day_29_goal,
        R.string.day_29_tip
    ),
    Day(
        R.drawable.day30_image,
        R.string.day_30,
        R.string.day_30_description,
        R.string.day_30_goal,
        R.string.day_30_tip
    )
)

