package com.google.gson;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class m {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final m f24373g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final m f24374h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ m[] f24375i;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    enum a extends m {
        a(String str, int i10) {
            super(str, i10, null);
        }
    }

    static {
        a aVar = new a("DEFAULT", 0);
        f24373g = aVar;
        m mVar = new m("STRING", 1) { // from class: com.google.gson.m.b
            {
                a aVar2 = null;
            }
        };
        f24374h = mVar;
        f24375i = new m[]{aVar, mVar};
    }

    private m(String str, int i10) {
    }

    public static m valueOf(String str) {
        return (m) Enum.valueOf(m.class, str);
    }

    public static m[] values() {
        return (m[]) f24375i.clone();
    }

    /* synthetic */ m(String str, int i10, a aVar) {
        this(str, i10);
    }
}
