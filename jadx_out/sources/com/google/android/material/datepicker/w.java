package com.google.android.material.datepicker;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.datepicker.j;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
class w extends RecyclerView.h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f23330d;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ int f23331g;

        a(int i10) {
            this.f23331g = i10;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            w.this.f23330d.T(w.this.f23330d.J().f(Month.j(this.f23331g, w.this.f23330d.L().f23160h)));
            w.this.f23330d.U(j.l.DAY);
            w.this.f23330d.S();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class b extends RecyclerView.E {

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        final TextView f23333u;

        b(TextView textView) {
            super(textView);
            this.f23333u = textView;
        }
    }

    w(j jVar) {
        this.f23330d = jVar;
    }

    private View.OnClickListener z(int i10) {
        return new a(i10);
    }

    int A(int i10) {
        return i10 - this.f23330d.J().n().f23161i;
    }

    int B(int i10) {
        return this.f23330d.J().n().f23161i + i10;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: C, reason: merged with bridge method [inline-methods] */
    public void n(b bVar, int i10) {
        int iB = B(i10);
        bVar.f23333u.setText(String.format(Locale.getDefault(), "%d", Integer.valueOf(iB)));
        TextView textView = bVar.f23333u;
        textView.setContentDescription(h.k(textView.getContext(), iB));
        com.google.android.material.datepicker.b bVarK = this.f23330d.K();
        Calendar calendarK = v.k();
        com.google.android.material.datepicker.a aVar = calendarK.get(1) == iB ? bVarK.f23199f : bVarK.f23197d;
        Iterator it = this.f23330d.M().g0().iterator();
        while (it.hasNext()) {
            calendarK.setTimeInMillis(((Long) it.next()).longValue());
            if (calendarK.get(1) == iB) {
                aVar = bVarK.f23198e;
            }
        }
        aVar.d(bVar.f23333u);
        bVar.f23333u.setSelected(aVar == bVarK.f23198e);
        bVar.f23333u.setOnClickListener(z(iB));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    /* JADX INFO: renamed from: D, reason: merged with bridge method [inline-methods] */
    public b p(ViewGroup viewGroup, int i10) {
        return new b((TextView) LayoutInflater.from(viewGroup.getContext()).inflate(Q4.g.f9346s, viewGroup, false));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.h
    public int d() {
        return this.f23330d.J().o();
    }
}
