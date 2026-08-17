package com.bumptech.glide;

import Q1.f;
import android.content.Context;
import android.content.ContextWrapper;
import com.bumptech.glide.b;
import java.util.List;
import java.util.Map;
import x1.C3527k;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class d extends ContextWrapper {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    static final l f19065k = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final y1.b f19066a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.b f19067b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final N1.b f19068c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final b.a f19069d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final List f19070e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final Map f19071f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final C3527k f19072g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final e f19073h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int f19074i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private M1.f f19075j;

    public d(Context context, y1.b bVar, f.b bVar2, N1.b bVar3, b.a aVar, Map map, List list, C3527k c3527k, e eVar, int i10) {
        super(context.getApplicationContext());
        this.f19066a = bVar;
        this.f19068c = bVar3;
        this.f19069d = aVar;
        this.f19070e = list;
        this.f19071f = map;
        this.f19072g = c3527k;
        this.f19073h = eVar;
        this.f19074i = i10;
        this.f19067b = Q1.f.a(bVar2);
    }

    public y1.b a() {
        return this.f19066a;
    }

    public List b() {
        return this.f19070e;
    }

    public synchronized M1.f c() {
        try {
            if (this.f19075j == null) {
                this.f19075j = (M1.f) this.f19069d.build().N();
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f19075j;
    }

    public l d(Class cls) {
        l lVar = (l) this.f19071f.get(cls);
        if (lVar == null) {
            for (Map.Entry entry : this.f19071f.entrySet()) {
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    lVar = (l) entry.getValue();
                }
            }
        }
        return lVar == null ? f19065k : lVar;
    }

    public C3527k e() {
        return this.f19072g;
    }

    public e f() {
        return this.f19073h;
    }

    public int g() {
        return this.f19074i;
    }

    public h h() {
        return (h) this.f19067b.get();
    }
}
