package com.astrology;

import java.time.LocalDate;

public class PredictionService {

    public static String getZodiacSign(LocalDate dob) {
        int day = dob.getDayOfMonth();
        int month = dob.getMonthValue();

        if ((month == 3 && day >= 21) || (month == 4 && day <= 19)) return "Aries";
        if ((month == 4 && day >= 20) || (month == 5 && day <= 20)) return "Taurus";
        if ((month == 5 && day >= 21) || (month == 6 && day <= 20)) return "Gemini";
        if ((month == 6 && day >= 21) || (month == 7 && day <= 22)) return "Cancer";
        if ((month == 7 && day >= 23) || (month == 8 && day <= 22)) return "Leo";
        if ((month == 8 && day >= 23) || (month == 9 && day <= 22)) return "Virgo";
        if ((month == 9 && day >= 23) || (month == 10 && day <= 22)) return "Libra";
        if ((month == 10 && day >= 23) || (month == 11 && day <= 21)) return "Scorpio";
        if ((month == 11 && day >= 22) || (month == 12 && day <= 21)) return "Sagittarius";
        if ((month == 12 && day >= 22) || (month == 1 && day <= 19)) return "Capricorn";
        if ((month == 1 && day >= 20) || (month == 2 && day <= 18)) return "Aquarius";
        return "Pisces";
    }

    public static String getPrediction(String zodiac) {
        return switch (zodiac) {
            case "Aries" -> "Today may be a good day for starting new activities.";
            case "Taurus" -> "Focus on consistency and practical decisions today.";
            case "Gemini" -> "Communication and learning may be important today.";
            case "Cancer" -> "Spend some time focusing on personal goals.";
            case "Leo" -> "You may find opportunities to demonstrate your creativity.";
            case "Virgo" -> "Planning and organization can help with your goals.";
            case "Libra" -> "Balance and communication may help you handle situations.";
            case "Scorpio" -> "Focus on important tasks and avoid unnecessary distractions.";
            case "Sagittarius" -> "Learning and exploring new ideas may be beneficial.";
            case "Capricorn" -> "Consistent effort can help you move toward your goals.";
            case "Aquarius" -> "Creative thinking may help you approach problems differently.";
            default -> "Take some time to reflect and plan your next steps.";
        };
    }
}
