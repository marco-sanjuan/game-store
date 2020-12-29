package com.marco.gamestore.shared.domain.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public final class Date {
    public static String dateToString(LocalDateTime dateTime) {
        return dateTime.format(DateTimeFormatter.ISO_LOCAL_DATE);
    }
}
