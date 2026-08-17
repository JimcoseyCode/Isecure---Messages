package com.google.android.gms.common.api.internal;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import p4.C3053C;
import p4.C3057d;
import p4.FragmentC3051A;
import p4.InterfaceC3058e;
import r4.AbstractC3268i;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class LifecycleCallback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final InterfaceC3058e f21025g;

    protected LifecycleCallback(InterfaceC3058e interfaceC3058e) {
        this.f21025g = interfaceC3058e;
    }

    public static InterfaceC3058e c(Activity activity) {
        return d(new C3057d(activity));
    }

    protected static InterfaceC3058e d(C3057d c3057d) {
        if (c3057d.d()) {
            return C3053C.y(c3057d.b());
        }
        if (c3057d.c()) {
            return FragmentC3051A.d(c3057d.a());
        }
        throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
    }

    private static InterfaceC3058e getChimeraLifecycleFragmentImpl(C3057d c3057d) {
        throw new IllegalStateException("Method not available in SDK.");
    }

    public Activity b() {
        Activity activityH = this.f21025g.h();
        AbstractC3268i.k(activityH);
        return activityH;
    }

    public void g() {
    }

    public void h() {
    }

    public void j() {
    }

    public void k() {
    }

    public void f(Bundle bundle) {
    }

    public void i(Bundle bundle) {
    }

    public void e(int i10, int i11, Intent intent) {
    }

    public void a(String str, FileDescriptor fileDescriptor, PrintWriter printWriter, String[] strArr) {
    }
}
