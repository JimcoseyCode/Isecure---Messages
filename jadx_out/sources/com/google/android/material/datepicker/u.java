package com.google.android.material.datepicker;

import java.util.Calendar;
import java.util.TimeZone;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final u f23326c = new u(null, null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Long f23327a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final TimeZone f23328b;

    private u(Long l10, TimeZone timeZone) {
        this.f23327a = l10;
        this.f23328b = timeZone;
    }

    static u c() {
        return f23326c;
    }

    Calendar a() {
        return b(this.f23328b);
    }

    Calendar b(TimeZone timeZone) {
        Calendar calendar = timeZone == null ? Calendar.getInstance() : Calendar.getInstance(timeZone);
        Long l10 = this.f23327a;
        if (l10 != null) {
            calendar.setTimeInMillis(l10.longValue());
        }
        return calendar;
    }
}
