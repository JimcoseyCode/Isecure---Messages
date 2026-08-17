package com.facebook.imagepipeline.producers;

import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final InterfaceC1978n f19920a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final e0 f19921b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private long f19922c = 0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f19923d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private X2.b f19924e;

    public C(InterfaceC1978n interfaceC1978n, e0 e0Var) {
        this.f19920a = interfaceC1978n;
        this.f19921b = e0Var;
    }

    public InterfaceC1978n a() {
        return this.f19920a;
    }

    public e0 b() {
        return this.f19921b;
    }

    public long c() {
        return this.f19922c;
    }

    public g0 d() {
        return this.f19921b.W();
    }

    public int e() {
        return this.f19923d;
    }

    public X2.b f() {
        return this.f19924e;
    }

    public Uri g() {
        return this.f19921b.e().getSourceUri();
    }

    public void h(long j10) {
        this.f19922c = j10;
    }

    public void i(int i10) {
        this.f19923d = i10;
    }

    public void j(X2.b bVar) {
        this.f19924e = bVar;
    }
}
