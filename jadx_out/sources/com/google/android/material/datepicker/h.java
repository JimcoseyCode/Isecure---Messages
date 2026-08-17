package com.google.android.material.datepicker;

import android.content.Context;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class h {
    static H0.d a(Long l10, Long l11) {
        return b(l10, l11, null);
    }

    static H0.d b(Long l10, Long l11, SimpleDateFormat simpleDateFormat) {
        if (l10 == null && l11 == null) {
            return H0.d.a(null, null);
        }
        if (l10 == null) {
            return H0.d.a(null, d(l11.longValue(), simpleDateFormat));
        }
        if (l11 == null) {
            return H0.d.a(d(l10.longValue(), simpleDateFormat), null);
        }
        Calendar calendarK = v.k();
        Calendar calendarM = v.m();
        calendarM.setTimeInMillis(l10.longValue());
        Calendar calendarM2 = v.m();
        calendarM2.setTimeInMillis(l11.longValue());
        if (simpleDateFormat != null) {
            return H0.d.a(simpleDateFormat.format(new Date(l10.longValue())), simpleDateFormat.format(new Date(l11.longValue())));
        }
        return calendarM.get(1) == calendarM2.get(1) ? calendarM.get(1) == calendarK.get(1) ? H0.d.a(g(l10.longValue(), Locale.getDefault()), g(l11.longValue(), Locale.getDefault())) : H0.d.a(g(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault())) : H0.d.a(n(l10.longValue(), Locale.getDefault()), n(l11.longValue(), Locale.getDefault()));
    }

    static String c(long j10) {
        return d(j10, null);
    }

    static String d(long j10, SimpleDateFormat simpleDateFormat) {
        return simpleDateFormat != null ? simpleDateFormat.format(new Date(j10)) : q(j10) ? f(j10) : m(j10);
    }

    static String e(Context context, long j10, boolean z10, boolean z11, boolean z12) {
        String strJ = j(j10);
        if (z10) {
            strJ = String.format(context.getString(Q4.i.f9364M), strJ);
        }
        return z11 ? String.format(context.getString(Q4.i.f9360I), strJ) : z12 ? String.format(context.getString(Q4.i.f9395w), strJ) : strJ;
    }

    static String f(long j10) {
        return g(j10, Locale.getDefault());
    }

    static String g(long j10, Locale locale) {
        return v.b(locale).format(new Date(j10));
    }

    static String h(long j10) {
        return i(j10, Locale.getDefault());
    }

    static String i(long j10, Locale locale) {
        return v.h(locale).format(new Date(j10));
    }

    static String j(long j10) {
        return q(j10) ? h(j10) : o(j10);
    }

    static String k(Context context, int i10) {
        return v.k().get(1) == i10 ? String.format(context.getString(Q4.i.f9353B), Integer.valueOf(i10)) : String.format(context.getString(Q4.i.f9354C), Integer.valueOf(i10));
    }

    static String l(long j10) {
        return v.p(Locale.getDefault()).format(new Date(j10));
    }

    static String m(long j10) {
        return n(j10, Locale.getDefault());
    }

    static String n(long j10, Locale locale) {
        return v.o(locale).format(new Date(j10));
    }

    static String o(long j10) {
        return p(j10, Locale.getDefault());
    }

    static String p(long j10, Locale locale) {
        return v.q(locale).format(new Date(j10));
    }

    private static boolean q(long j10) {
        Calendar calendarK = v.k();
        Calendar calendarM = v.m();
        calendarM.setTimeInMillis(j10);
        return calendarK.get(1) == calendarM.get(1);
    }
}
