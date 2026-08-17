package d8;

import d8.AbstractC2357e;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: d8.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class C2359g extends AbstractC2357e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Map f25728a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Map f25729b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Map f25730c;

    public C2359g(Map memberAnnotations, Map propertyConstants, Map annotationParametersDefaultValues) {
        AbstractC2855l.g(memberAnnotations, "memberAnnotations");
        AbstractC2855l.g(propertyConstants, "propertyConstants");
        AbstractC2855l.g(annotationParametersDefaultValues, "annotationParametersDefaultValues");
        this.f25728a = memberAnnotations;
        this.f25729b = propertyConstants;
        this.f25730c = annotationParametersDefaultValues;
    }

    @Override // d8.AbstractC2357e.a
    public Map a() {
        return this.f25728a;
    }

    public final Map b() {
        return this.f25730c;
    }

    public final Map c() {
        return this.f25729b;
    }
}
