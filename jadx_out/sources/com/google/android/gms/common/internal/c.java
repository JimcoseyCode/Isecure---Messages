package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.api.Scope;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.Executor;
import o4.C3008a;
import o4.f;
import p4.InterfaceC3056c;
import p4.InterfaceC3061h;
import r4.AbstractC3268i;
import r4.C3262c;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class c extends b implements C3008a.f {

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    private final C3262c f21229F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    private final Set f21230G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    private final Account f21231H;

    protected c(Context context, Looper looper, int i10, C3262c c3262c, f.a aVar, f.b bVar) {
        this(context, looper, i10, c3262c, (InterfaceC3056c) aVar, (InterfaceC3061h) bVar);
    }

    private final Set i0(Set set) {
        Set setH0 = h0(set);
        Iterator it = setH0.iterator();
        while (it.hasNext()) {
            if (!set.contains((Scope) it.next())) {
                throw new IllegalStateException("Expanding scopes is not permitted, use implied scopes instead");
            }
        }
        return setH0;
    }

    @Override // com.google.android.gms.common.internal.b
    protected final Set B() {
        return this.f21230G;
    }

    @Override // o4.C3008a.f
    public Set a() {
        return o() ? this.f21230G : Collections.EMPTY_SET;
    }

    @Override // com.google.android.gms.common.internal.b
    public final Account t() {
        return this.f21231H;
    }

    @Override // com.google.android.gms.common.internal.b
    protected Executor v() {
        return null;
    }

    protected c(Context context, Looper looper, int i10, C3262c c3262c, InterfaceC3056c interfaceC3056c, InterfaceC3061h interfaceC3061h) {
        this(context, looper, d.a(context), com.google.android.gms.common.a.m(), i10, c3262c, (InterfaceC3056c) AbstractC3268i.k(interfaceC3056c), (InterfaceC3061h) AbstractC3268i.k(interfaceC3061h));
    }

    protected c(Context context, Looper looper, d dVar, com.google.android.gms.common.a aVar, int i10, C3262c c3262c, InterfaceC3056c interfaceC3056c, InterfaceC3061h interfaceC3061h) {
        super(context, looper, dVar, aVar, i10, interfaceC3056c == null ? null : new f(interfaceC3056c), interfaceC3061h != null ? new g(interfaceC3061h) : null, c3262c.h());
        this.f21229F = c3262c;
        this.f21231H = c3262c.a();
        this.f21230G = i0(c3262c.c());
    }

    protected Set h0(Set set) {
        return set;
    }
}
