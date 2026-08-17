package com.google.android.material.datepicker;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.view.AbstractC1658a0;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class q extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final CalendarConstraints f23315d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final DateSelector f23316e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final DayViewDecorator f23317f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j.m f23318g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final int f23319h;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements AdapterView.OnItemClickListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ MaterialCalendarGridView f23320g;

        a(MaterialCalendarGridView materialCalendarGridView) {
            this.f23320g = materialCalendarGridView;
        }

        @Override // android.widget.AdapterView.OnItemClickListener
        public void onItemClick(AdapterView adapterView, View view, int i10, long j10) {
            if (this.f23320g.getAdapter().r(i10)) {
                q.this.f23318g.a(this.f23320g.getAdapter().getItem(i10).longValue());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b extends RecyclerView.E {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final TextView f23322u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        final MaterialCalendarGridView f23323v;

        b(LinearLayout linearLayout, boolean z10) {
            super(linearLayout);
            TextView textView = (TextView) linearLayout.findViewById(Q4.e.f9319u);
            this.f23322u = textView;
            AbstractC1658a0.l0(textView, true);
            this.f23323v = (MaterialCalendarGridView) linearLayout.findViewById(Q4.e.f9315q);
            if (z10) {
                return;
            }
            textView.setVisibility(8);
        }
    }

    q(Context context, DateSelector dateSelector, CalendarConstraints calendarConstraints, DayViewDecorator dayViewDecorator, j.m mVar) {
        Month monthN = calendarConstraints.n();
        Month monthH = calendarConstraints.h();
        Month monthL = calendarConstraints.l();
        if (monthN.compareTo(monthL) > 0) {
            throw new IllegalArgumentException("firstPage cannot be after currentPage");
        }
        if (monthL.compareTo(monthH) > 0) {
            throw new IllegalArgumentException("currentPage cannot be after lastPage");
        }
        this.f23319h = (p.f23307m * j.N(context)) + (n.L(context) ? j.N(context) : 0);
        this.f23315d = calendarConstraints;
        this.f23316e = dateSelector;
        this.f23317f = dayViewDecorator;
        this.f23318g = mVar;
        w(true);
    }

    CharSequence A(int i10) {
        return z(i10).v();
    }

    int B(Month month) {
        return this.f23315d.n().y(month);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void n(b bVar, int i10) {
        Month monthX = this.f23315d.n().x(i10);
        bVar.f23322u.setText(monthX.v());
        MaterialCalendarGridView materialCalendarGridView = (MaterialCalendarGridView) bVar.f23323v.findViewById(Q4.e.f9315q);
        if (materialCalendarGridView.getAdapter() == null || !monthX.equals(materialCalendarGridView.getAdapter().f23309g)) {
            p pVar = new p(monthX, this.f23316e, this.f23315d, this.f23317f);
            materialCalendarGridView.setNumColumns(monthX.f23162j);
            materialCalendarGridView.setAdapter((ListAdapter) pVar);
        } else {
            materialCalendarGridView.invalidate();
            materialCalendarGridView.getAdapter().q(materialCalendarGridView);
        }
        materialCalendarGridView.setOnItemClickListener(new a(materialCalendarGridView));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b p(ViewGroup viewGroup, int i10) {
        LinearLayout linearLayout = (LinearLayout) LayoutInflater.from(viewGroup.getContext()).inflate(Q4.g.f9344q, viewGroup, false);
        if (!n.L(viewGroup.getContext())) {
            return new b(linearLayout, false);
        }
        linearLayout.setLayoutParams(new RecyclerView.q(-1, this.f23319h));
        return new b(linearLayout, true);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int d() {
        return this.f23315d.j();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public long e(int i10) {
        return this.f23315d.n().x(i10).w();
    }

    Month z(int i10) {
        return this.f23315d.n().x(i10);
    }
}
