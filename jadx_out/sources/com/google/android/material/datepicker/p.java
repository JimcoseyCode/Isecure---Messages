package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import java.util.Collection;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class p extends BaseAdapter {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    static final int f23307m = v.m().getMaximum(4);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f23308n = (v.m().getMaximum(5) + v.m().getMaximum(7)) - 1;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    final Month f23309g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final DateSelector f23310h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Collection f23311i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    b f23312j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    final CalendarConstraints f23313k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    final DayViewDecorator f23314l;

    p(Month month, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator) {
        this.f23309g = month;
        this.f23310h = dateSelector;
        this.f23313k = calendarConstraints;
        this.f23314l = dayViewDecorator;
        this.f23311i = dateSelector.g0();
    }

    private String c(Context context, long j10) {
        return h.e(context, j10, l(j10), k(j10), g(j10));
    }

    private void f(Context context) {
        if (this.f23312j == null) {
            this.f23312j = new b(context);
        }
    }

    private boolean j(long j10) {
        Iterator it = this.f23310h.g0().iterator();
        while (it.hasNext()) {
            if (v.a(j10) == v.a(((Long) it.next()).longValue())) {
                return true;
            }
        }
        return false;
    }

    private boolean l(long j10) {
        return v.k().getTimeInMillis() == j10;
    }

    private void o(TextView textView, long j10, int i10) {
        boolean zJ;
        a aVar;
        if (textView == null) {
            return;
        }
        Context context = textView.getContext();
        String strC = c(context, j10);
        textView.setContentDescription(strC);
        boolean zW = this.f23313k.g().W(j10);
        if (zW) {
            textView.setEnabled(true);
            zJ = j(j10);
            textView.setSelected(zJ);
            aVar = zJ ? this.f23312j.f23195b : l(j10) ? this.f23312j.f23196c : this.f23312j.f23194a;
        } else {
            zJ = false;
            textView.setEnabled(false);
            aVar = this.f23312j.f23200g;
        }
        boolean z10 = zJ;
        DayViewDecorator dayViewDecorator = this.f23314l;
        if (dayViewDecorator == null || i10 == -1) {
            aVar.d(textView);
            return;
        }
        Month month = this.f23309g;
        int i11 = month.f23161i;
        int i12 = month.f23160h;
        aVar.e(textView, dayViewDecorator.a(context, i11, i12, i10, zW, z10), this.f23314l.g(context, i11, i12, i10, zW, z10));
        textView.setCompoundDrawables(this.f23314l.c(context, i11, i12, i10, zW, z10), this.f23314l.e(context, i11, i12, i10, zW, z10), this.f23314l.d(context, i11, i12, i10, zW, z10), this.f23314l.b(context, i11, i12, i10, zW, z10));
        textView.setContentDescription(this.f23314l.f(context, i11, i12, i10, zW, z10, strC));
    }

    private void p(MaterialCalendarGridView materialCalendarGridView, long j10) {
        if (Month.p(j10).equals(this.f23309g)) {
            int iU = this.f23309g.u(j10);
            o((TextView) materialCalendarGridView.getChildAt(materialCalendarGridView.getAdapter().a(iU) - materialCalendarGridView.getFirstVisiblePosition()), j10, iU);
        }
    }

    int a(int i10) {
        return b() + (i10 - 1);
    }

    int b() {
        return this.f23309g.s(this.f23313k.i());
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public Long getItem(int i10) {
        if (i10 < b() || i10 > m()) {
            return null;
        }
        return Long.valueOf(this.f23309g.t(n(i10)));
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054  */
    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public TextView getView(int i10, View view, ViewGroup viewGroup) {
        int i11;
        f(viewGroup.getContext());
        TextView textView = (TextView) view;
        if (view == null) {
            textView = (TextView) LayoutInflater.from(viewGroup.getContext()).inflate(Q4.g.f9341n, viewGroup, false);
        }
        int iB = i10 - b();
        if (iB >= 0) {
            Month month = this.f23309g;
            if (iB >= month.f23163k) {
                textView.setVisibility(8);
                textView.setEnabled(false);
                i11 = -1;
            } else {
                i11 = iB + 1;
                textView.setTag(month);
                textView.setText(String.format(textView.getResources().getConfiguration().locale, "%d", Integer.valueOf(i11)));
                textView.setVisibility(0);
                textView.setEnabled(true);
            }
        }
        Long item = getItem(i10);
        if (item == null) {
            return textView;
        }
        o(textView, item.longValue(), i11);
        return textView;
    }

    boolean g(long j10) {
        Iterator it = this.f23310h.m().iterator();
        while (it.hasNext()) {
            Object obj = ((H0.d) it.next()).f3635b;
            if (obj != null && ((Long) obj).longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.Adapter
    public int getCount() {
        return f23308n;
    }

    @Override // android.widget.Adapter
    public long getItemId(int i10) {
        return i10 / this.f23309g.f23162j;
    }

    boolean h(int i10) {
        return i10 % this.f23309g.f23162j == 0;
    }

    @Override // android.widget.BaseAdapter, android.widget.Adapter
    public boolean hasStableIds() {
        return true;
    }

    boolean i(int i10) {
        return (i10 + 1) % this.f23309g.f23162j == 0;
    }

    boolean k(long j10) {
        Iterator it = this.f23310h.m().iterator();
        while (it.hasNext()) {
            Object obj = ((H0.d) it.next()).f3634a;
            if (obj != null && ((Long) obj).longValue() == j10) {
                return true;
            }
        }
        return false;
    }

    int m() {
        return (b() + this.f23309g.f23163k) - 1;
    }

    int n(int i10) {
        return (i10 - b()) + 1;
    }

    public void q(MaterialCalendarGridView materialCalendarGridView) {
        Iterator it = this.f23311i.iterator();
        while (it.hasNext()) {
            p(materialCalendarGridView, ((Long) it.next()).longValue());
        }
        DateSelector dateSelector = this.f23310h;
        if (dateSelector != null) {
            Iterator it2 = dateSelector.g0().iterator();
            while (it2.hasNext()) {
                p(materialCalendarGridView, ((Long) it2.next()).longValue());
            }
            this.f23311i = this.f23310h.g0();
        }
    }

    boolean r(int i10) {
        return i10 >= b() && i10 <= m();
    }
}
