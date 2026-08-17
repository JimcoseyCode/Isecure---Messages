package com.google.android.material.datepicker;

import android.os.Build;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Calendar;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class i extends BaseAdapter {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f23216j;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final Calendar f23217g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23218h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f23219i;

    static {
        f23216j = Build.VERSION.SDK_INT >= 26 ? 4 : 1;
    }

    public i() {
        Calendar calendarM = v.m();
        this.f23217g = calendarM;
        this.f23218h = calendarM.getMaximum(7);
        this.f23219i = calendarM.getFirstDayOfWeek();
    }

    private int b(int i10) {
        int i11 = i10 + this.f23219i;
        int i12 = this.f23218h;
        return i11 > i12 ? i11 - i12 : i11;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Integer getItem(int i10) {
        if (i10 >= this.f23218h) {
            return null;
        }
        return Integer.valueOf(b(i10));
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return this.f23218h;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i10, View view, ViewGroup viewGroup) {
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(Q4.g.f9342o, viewGroup, false);
        }
        this.f23217g.set(7, b(i10));
        textView.setText(this.f23217g.getDisplayName(7, f23216j, textView.getResources().getConfiguration().locale));
        textView.setContentDescription(String.format(viewGroup.getContext().getString(Q4.i.f9394v), this.f23217g.getDisplayName(7, 2, Locale.getDefault())));
        return textView;
    }

    public i(int i10) {
        Calendar calendarM = v.m();
        this.f23217g = calendarM;
        this.f23218h = calendarM.getMaximum(7);
        this.f23219i = i10;
    }
}
