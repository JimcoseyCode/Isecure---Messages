package com.bumptech.glide;

import B1.o;
import B1.p;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import x1.C3525i;
import x1.t;
import x1.v;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p f19088a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final L1.a f19089b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final L1.e f19090c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final L1.f f19091d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.bumptech.glide.load.data.f f19092e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final I1.f f19093f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final L1.b f19094g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final L1.d f19095h = new L1.d();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final L1.c f19096i = new L1.c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final H0.e f19097j;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class a extends RuntimeException {
        public a(String str) {
            super(str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends a {
        public b() {
            super("Failed to find image header parser.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class c extends a {
        public c(Object obj) {
            super("Failed to find any ModelLoaders registered for model class: " + obj.getClass());
        }

        public c(Object obj, List list) {
            super("Found ModelLoaders for model class: " + list + ", but none that handle this specific model instance: " + obj);
        }

        public c(Class cls, Class cls2) {
            super("Failed to find any ModelLoaders for model: " + cls + " and data: " + cls2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class d extends a {
        public d(Class cls) {
            super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static class e extends a {
        public e(Class cls) {
            super("Failed to find source encoder for data class: " + cls);
        }
    }

    public h() {
        H0.e eVarE = R1.a.e();
        this.f19097j = eVarE;
        this.f19088a = new p(eVarE);
        this.f19089b = new L1.a();
        this.f19090c = new L1.e();
        this.f19091d = new L1.f();
        this.f19092e = new com.bumptech.glide.load.data.f();
        this.f19093f = new I1.f();
        this.f19094g = new L1.b();
        v(Arrays.asList("Animation", "Bitmap", "BitmapDrawable"));
    }

    private List f(Class cls, Class cls2, Class cls3) {
        ArrayList arrayList = new ArrayList();
        for (Class cls4 : this.f19090c.d(cls, cls2)) {
            for (Class cls5 : this.f19093f.b(cls4, cls3)) {
                arrayList.add(new C3525i(cls, cls4, cls5, this.f19090c.b(cls, cls4), this.f19093f.a(cls4, cls5), this.f19097j));
            }
        }
        return arrayList;
    }

    public h a(Class cls, Class cls2, o oVar) {
        this.f19088a.a(cls, cls2, oVar);
        return this;
    }

    public h b(Class cls, Class cls2, v1.j jVar) {
        e("legacy_append", cls, cls2, jVar);
        return this;
    }

    public h c(Class cls, v1.d dVar) {
        this.f19089b.a(cls, dVar);
        return this;
    }

    public h d(Class cls, v1.k kVar) {
        this.f19091d.a(cls, kVar);
        return this;
    }

    public h e(String str, Class cls, Class cls2, v1.j jVar) {
        this.f19090c.a(str, jVar, cls, cls2);
        return this;
    }

    public List g() {
        List listB = this.f19094g.b();
        if (listB.isEmpty()) {
            throw new b();
        }
        return listB;
    }

    public t h(Class cls, Class cls2, Class cls3) {
        Class cls4;
        Class cls5;
        Class cls6;
        t tVarA = this.f19096i.a(cls, cls2, cls3);
        t tVar = null;
        if (this.f19096i.c(tVarA)) {
            return null;
        }
        if (tVarA != null) {
            return tVarA;
        }
        List listF = f(cls, cls2, cls3);
        if (listF.isEmpty()) {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
        } else {
            cls4 = cls;
            cls5 = cls2;
            cls6 = cls3;
            tVar = new t(cls4, cls5, cls6, listF, this.f19097j);
        }
        this.f19096i.d(cls4, cls5, cls6, tVar);
        return tVar;
    }

    public List i(Object obj) {
        return this.f19088a.d(obj);
    }

    public List j(Class cls, Class cls2, Class cls3) {
        List listA = this.f19095h.a(cls, cls2, cls3);
        if (listA == null) {
            listA = new ArrayList();
            Iterator it = this.f19088a.c(cls).iterator();
            while (it.hasNext()) {
                for (Class cls4 : this.f19090c.d((Class) it.next(), cls2)) {
                    if (!this.f19093f.b(cls4, cls3).isEmpty() && !listA.contains(cls4)) {
                        listA.add(cls4);
                    }
                }
            }
            this.f19095h.b(cls, cls2, cls3, Collections.unmodifiableList(listA));
        }
        return listA;
    }

    public v1.k k(v vVar) {
        v1.k kVarB = this.f19091d.b(vVar.a());
        if (kVarB != null) {
            return kVarB;
        }
        throw new d(vVar.a());
    }

    public com.bumptech.glide.load.data.e l(Object obj) {
        return this.f19092e.a(obj);
    }

    public v1.d m(Object obj) {
        v1.d dVarB = this.f19089b.b(obj.getClass());
        if (dVarB != null) {
            return dVarB;
        }
        throw new e(obj.getClass());
    }

    public boolean n(v vVar) {
        return this.f19091d.b(vVar.a()) != null;
    }

    public h o(Class cls, Class cls2, o oVar) {
        this.f19088a.f(cls, cls2, oVar);
        return this;
    }

    public h p(Class cls, Class cls2, v1.j jVar) {
        q("legacy_prepend_all", cls, cls2, jVar);
        return this;
    }

    public h q(String str, Class cls, Class cls2, v1.j jVar) {
        this.f19090c.e(str, jVar, cls, cls2);
        return this;
    }

    public h r(ImageHeaderParser imageHeaderParser) {
        this.f19094g.a(imageHeaderParser);
        return this;
    }

    public h s(e.a aVar) {
        this.f19092e.b(aVar);
        return this;
    }

    public h t(Class cls, Class cls2, I1.e eVar) {
        this.f19093f.c(cls, cls2, eVar);
        return this;
    }

    public h u(Class cls, Class cls2, o oVar) {
        this.f19088a.g(cls, cls2, oVar);
        return this;
    }

    public final h v(List list) {
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.add("legacy_prepend_all");
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add((String) it.next());
        }
        arrayList.add("legacy_append");
        this.f19090c.f(arrayList);
        return this;
    }
}
