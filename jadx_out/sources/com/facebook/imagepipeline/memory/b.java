package com.facebook.imagepipeline.memory;

import c2.k;
import d2.AbstractC2325a;
import java.util.LinkedList;
import java.util.Queue;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f19879a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f19880b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final Queue f19881c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f19882d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f19883e;

    public b(int i10, int i11, int i12, boolean z10) {
        k.i(i10 > 0);
        k.i(i11 >= 0);
        k.i(i12 >= 0);
        this.f19879a = i10;
        this.f19880b = i11;
        this.f19881c = new LinkedList();
        this.f19883e = i12;
        this.f19882d = z10;
    }

    void a(Object obj) {
        this.f19881c.add(obj);
    }

    public void b() {
        k.i(this.f19883e > 0);
        this.f19883e--;
    }

    public Object c() {
        Object objG = g();
        if (objG != null) {
            this.f19883e++;
        }
        return objG;
    }

    int d() {
        return this.f19881c.size();
    }

    public void e() {
        this.f19883e++;
    }

    public boolean f() {
        return this.f19883e + d() > this.f19880b;
    }

    public Object g() {
        return this.f19881c.poll();
    }

    public void h(Object obj) {
        k.g(obj);
        if (this.f19882d) {
            k.i(this.f19883e > 0);
            this.f19883e--;
            a(obj);
        } else {
            int i10 = this.f19883e;
            if (i10 <= 0) {
                AbstractC2325a.o("BUCKET", "Tried to release value %s from an empty bucket!", obj);
            } else {
                this.f19883e = i10 - 1;
                a(obj);
            }
        }
    }
}
