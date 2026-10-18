package com.example.thirtydays

import androidx.annotation.DrawableRes

data class Day(
    val number: Int,
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val days = listOf(
    Day(1, "Do 20 push-ups", "Start strong. Do 20 push-ups, rest when you need to, and keep your back straight.", R.drawable.day01),
    Day(2, "Walk 30 minutes", "Put on your shoes and walk at a brisk pace. Fresh air counts as training too.", R.drawable.day02),
    Day(3, "Do 30 squats", "Feet shoulder-width apart, go down slowly and push through your heels.", R.drawable.day03),
    Day(4, "Hold a 45s plank", "Keep your body in one straight line and breathe. Your core will thank you.", R.drawable.day04),
    Day(5, "Skip rope 5 minutes", "No rope? Pretend. Light jumps on the balls of your feet.", R.drawable.day05),
    Day(6, "Stretch for 15 minutes", "Hamstrings, shoulders, back. Slow and calm, no bouncing.", R.drawable.day06),
    Day(7, "Rest and hydrate", "Drink at least 2 liters of water today and sleep early.", R.drawable.day07),
    Day(8, "Do 25 lunges", "Alternate legs, keep your knee above your ankle.", R.drawable.day08),
    Day(9, "Run 20 minutes", "Easy pace. You should be able to talk while you run.", R.drawable.day09),
    Day(10, "Do 15 burpees", "Fast and explosive. Take a short break between sets.", R.drawable.day10),
    Day(11, "Climb stairs 10 minutes", "Skip the elevator. Up and down, steady rhythm.", R.drawable.day11),
    Day(12, "Do 30 sit-ups", "Hands crossed on your chest, do not pull on your neck.", R.drawable.day12),
    Day(13, "Try yoga 20 minutes", "Follow a simple flow. Focus on breathing and balance.", R.drawable.day13),
    Day(14, "Rest and stretch", "Light stretching only. Let your muscles recover.", R.drawable.day14),
    Day(15, "Do 30 push-ups", "Last week was 20. Today you go higher!", R.drawable.day15),
    Day(16, "Cycle 30 minutes", "Bike outside or imagine it on the floor. Keep a regular pace.", R.drawable.day16),
    Day(17, "Do 40 squats", "Add 10 reps from day 3. Go deep and stay controlled.", R.drawable.day17),
    Day(18, "Hold a 60s plank", "Beat your day 4 record by 15 seconds.", R.drawable.day18),
    Day(19, "Shadow boxing 10 minutes", "Jab, cross, hook. Move your feet and stay light.", R.drawable.day19),
    Day(20, "Dance 20 minutes", "Play your favorite songs and move. Yes, it is cardio.", R.drawable.day20),
    Day(21, "Rest and meal prep", "Prepare healthy meals for the week: protein, veggies, rice.", R.drawable.day21),
    Day(22, "Do 30 mountain climbers", "Drive your knees fast while the shoulders stay over your hands.", R.drawable.day22),
    Day(23, "Jog 25 minutes", "Slightly longer than day 9. Relax your shoulders.", R.drawable.day23),
    Day(24, "Do 20 diamond push-ups", "Hands close together to work your triceps.", R.drawable.day24),
    Day(25, "Do 50 jumping jacks", "Warm up fast, then repeat 3 times.", R.drawable.day25),
    Day(26, "Wall sit 60 seconds", "Back on the wall, thighs parallel to the floor. Hold on!", R.drawable.day26),
    Day(27, "Full body circuit", "5 push-ups, 10 squats, 10 sit-ups, 30s plank. Repeat 4 times.", R.drawable.day27),
    Day(28, "Long walk 45 minutes", "Go explore a new place near you.", R.drawable.day28),
    Day(29, "Rest and reflect", "Look at how far you have come and write down how you feel.", R.drawable.day29),
    Day(30, "Final challenge", "Push-ups, squats, plank, burpees. Give everything. You did it!", R.drawable.day30),
)
