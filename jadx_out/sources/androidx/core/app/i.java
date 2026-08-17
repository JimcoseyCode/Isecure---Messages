package androidx.core.app;

import android.content.res.Configuration;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f16297a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Configuration f16298b;

    public i(boolean z10) {
        this.f16297a = z10;
    }

    public final boolean a() {
        return this.f16297a;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(boolean z10, Configuration newConfig) {
        this(z10);
        AbstractC2855l.g(newConfig, "newConfig");
        this.f16298b = newConfig;
    }
}
