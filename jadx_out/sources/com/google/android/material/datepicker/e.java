package com.google.android.material.datepicker;

import android.content.Context;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.google.android.material.textfield.TextInputLayout;
import java.text.DateFormat;
import java.text.ParseException;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class e extends com.google.android.material.internal.k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final TextInputLayout f23206g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f23207h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final DateFormat f23208i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final CalendarConstraints f23209j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final String f23210k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final Runnable f23211l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private Runnable f23212m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f23213n = 0;

    e(final String str, DateFormat dateFormat, TextInputLayout textInputLayout, CalendarConstraints calendarConstraints) {
        this.f23207h = str;
        this.f23208i = dateFormat;
        this.f23206g = textInputLayout;
        this.f23209j = calendarConstraints;
        this.f23210k = textInputLayout.getContext().getString(Q4.i.f9355D);
        this.f23211l = new Runnable() { // from class: com.google.android.material.datepicker.c
            @Override // java.lang.Runnable
            public final void run() {
                e.b(this.f23202g, str);
            }
        };
    }

    public static /* synthetic */ void a(e eVar, long j10) {
        eVar.getClass();
        eVar.f23206g.setError(String.format(eVar.f23210k, eVar.g(h.c(j10))));
        eVar.d();
    }

    public static /* synthetic */ void b(e eVar, String str) {
        TextInputLayout textInputLayout = eVar.f23206g;
        DateFormat dateFormat = eVar.f23208i;
        Context context = textInputLayout.getContext();
        textInputLayout.setError(context.getString(Q4.i.f9396x) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + String.format(context.getString(Q4.i.f9398z), eVar.g(str)) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + String.format(context.getString(Q4.i.f9397y), eVar.g(dateFormat.format(new Date(v.k().getTimeInMillis())))));
        eVar.d();
    }

    private Runnable c(final long j10) {
        return new Runnable() { // from class: com.google.android.material.datepicker.d
            @Override // java.lang.Runnable
            public final void run() {
                e.a(this.f23204g, j10);
            }
        };
    }

    private String g(String str) {
        return str.replace(' ', (char) 160);
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
        if (!Locale.getDefault().getLanguage().equals(Locale.KOREAN.getLanguage()) && editable.length() != 0 && editable.length() < this.f23207h.length() && editable.length() >= this.f23213n) {
            char cCharAt = this.f23207h.charAt(editable.length());
            if (Character.isLetterOrDigit(cCharAt)) {
                return;
            }
            editable.append(cCharAt);
        }
    }

    @Override // com.google.android.material.internal.k, android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f23213n = charSequence.length();
    }

    abstract void d();

    abstract void e(Long l10);

    public void f(View view, Runnable runnable) {
        view.post(runnable);
    }

    @Override // com.google.android.material.internal.k, android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i10, int i11, int i12) {
        this.f23206g.removeCallbacks(this.f23211l);
        this.f23206g.removeCallbacks(this.f23212m);
        this.f23206g.setError(null);
        e(null);
        if (TextUtils.isEmpty(charSequence) || charSequence.length() < this.f23207h.length()) {
            return;
        }
        try {
            Date date = this.f23208i.parse(charSequence.toString());
            this.f23206g.setError(null);
            long time = date.getTime();
            if (this.f23209j.g().W(time) && this.f23209j.p(time)) {
                e(Long.valueOf(date.getTime()));
                return;
            }
            Runnable runnableC = c(time);
            this.f23212m = runnableC;
            f(this.f23206g, runnableC);
        } catch (ParseException unused) {
            f(this.f23206g, this.f23211l);
        }
    }
}
