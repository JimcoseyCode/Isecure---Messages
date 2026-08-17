package com.facebook.drawee.view;

import android.content.Context;
import android.util.AttributeSet;
import j3.C2768b;
import z2.AbstractC3671c;
import z2.C3669a;
import z2.C3670b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class d extends c {
    public d(Context context, C3669a c3669a) {
        super(context);
        setHierarchy(c3669a);
    }

    protected void inflateHierarchy(Context context, AttributeSet attributeSet) throws Throwable {
        if (C2768b.d()) {
            C2768b.a("GenericDraweeView#inflateHierarchy");
        }
        C3670b c3670bD = AbstractC3671c.d(context, attributeSet);
        setAspectRatio(c3670bD.f());
        setHierarchy(c3670bD.a());
        if (C2768b.d()) {
            C2768b.b();
        }
    }
}
