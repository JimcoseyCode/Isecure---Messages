package com.google.android.material.datepicker;

import androidx.fragment.app.Fragment;
import java.util.LinkedHashSet;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
abstract class s extends Fragment {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final LinkedHashSet f23324g = new LinkedHashSet();

    s() {
    }

    boolean w(r rVar) {
        return this.f23324g.add(rVar);
    }

    void x() {
        this.f23324g.clear();
    }
}
