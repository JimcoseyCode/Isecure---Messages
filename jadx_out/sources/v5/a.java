package V5;

import W5.b;
import X5.c;
import X5.d;
import X5.h;
import X5.i;
import X5.j;
import X5.l;
import X5.m;
import X5.n;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final a f11795i = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final b f11796a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final T5.b f11797b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final l f11798c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final h f11799d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final l f11800e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final m f11801f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l f11802g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final c f11803h;

    private a() {
        b bVarC = b.c();
        this.f11796a = bVarC;
        W5.a aVar = new W5.a();
        this.f11797b = aVar;
        j jVar = new j("/com/google/i18n/phonenumbers/data/PhoneNumberMetadataProto");
        this.f11798c = jVar;
        this.f11799d = new i(jVar, aVar, bVarC);
        j jVar2 = new j("/com/google/i18n/phonenumbers/data/ShortNumberMetadataProto");
        this.f11800e = jVar2;
        this.f11801f = new n(jVar2, aVar, bVarC);
        j jVar3 = new j("/com/google/i18n/phonenumbers/data/PhoneNumberAlternateFormatsProto");
        this.f11802g = jVar3;
        this.f11803h = new d(jVar3, aVar, bVarC);
    }

    public static a a() {
        return f11795i;
    }

    public T5.b b() {
        return this.f11797b;
    }

    public b c() {
        return this.f11796a;
    }

    public l d() {
        return this.f11798c;
    }
}
