package com.cardvalidator;

public class CardValidator {

    public static boolean isValidVisa(String cardNumber) {
        return cardNumber.startsWith("4");
    }

    public static boolean isValidMasterCard(String cardNumber) {
        int prefix = Integer.parseInt(cardNumber.substring(0, 2));
        int prefix4 = Integer.parseInt(cardNumber.substring(0, 4));
        return (prefix >= 51 && prefix <= 55) || (prefix4 >= 2221 && prefix4 <= 2720);
    }

    public static boolean isValidElo(String cardNumber) {
        return cardNumber.startsWith("4011") || cardNumber.startsWith("4312") || cardNumber.startsWith("2389");
    }

    public static boolean isValidAmericanExpress(String cardNumber) {
        return cardNumber.startsWith("34") || cardNumber.startsWith("37");
    }

    public static boolean isValidDiscover(String cardNumber) {
        int prefix3 = Integer.parseInt(cardNumber.substring(0, 3));
        return cardNumber.startsWith("6011") || cardNumber.startsWith("65") || (prefix3 >= 644 && prefix3 <= 649);
    }

    public static boolean isValidHipercard(String cardNumber) {
        return cardNumber.startsWith("6062");
    }

    public static String validateCard(String cardNumber) {
        if (isValidVisa(cardNumber)) {
            return "Visa";
        } else if (isValidMasterCard(cardNumber)) {
            return "MasterCard";
        } else if (isValidElo(cardNumber)) {
            return "Elo";
        } else if (isValidAmericanExpress(cardNumber)) {
            return "American Express";
        } else if (isValidDiscover(cardNumber)) {
            return "Discover";
        } else if (isValidHipercard(cardNumber)) {
            return "Hipercard";
        } else {
            return "Unknown";
        }
    }
}
