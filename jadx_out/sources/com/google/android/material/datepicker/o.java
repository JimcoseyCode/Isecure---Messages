package com.google.android.material.datepicker;

import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class o<S> extends s {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f23303h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private DateSelector f23304i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CalendarConstraints f23305j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    class a extends r {
        a() {
        }

        @Override // com.google.android.material.datepicker.r
        public void a() {
            Iterator it = o.this.f23324g.iterator();
            while (it.hasNext()) {
                ((r) it.next()).a();
            }
        }

        @Override // com.google.android.material.datepicker.r
        public void b(Object obj) {
            Iterator it = o.this.f23324g.iterator();
            while (it.hasNext()) {
                ((r) it.next()).b(obj);
            }
        }
    }

    static o y(DateSelector dateSelector, int i10, CalendarConstraints calendarConstraints) {
        o oVar = new o();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i10);
        bundle.putParcelable("DATE_SELECTOR_KEY", dateSelector);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", calendarConstraints);
        oVar.setArguments(bundle);
        return oVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f23303h = bundle.getInt("THEME_RES_ID_KEY");
        this.f23304i = (DateSelector) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f23305j = (CalendarConstraints) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return this.f23304i.A(layoutInflater.cloneInContext(new ContextThemeWrapper(getContext(), this.f23303h)), viewGroup, bundle, this.f23305j, new a());
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f23303h);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f23304i);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f23305j);
    }
}
