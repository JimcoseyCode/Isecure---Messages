package C8;

import java.util.Set;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final I0 f562a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Set f563b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final AbstractC0407d0 f564c;

    public G(I0 howThisTypeIsUsed, Set set, AbstractC0407d0 abstractC0407d0) {
        AbstractC2855l.g(howThisTypeIsUsed, "howThisTypeIsUsed");
        this.f562a = howThisTypeIsUsed;
        this.f563b = set;
        this.f564c = abstractC0407d0;
    }

    public abstract AbstractC0407d0 a();

    public abstract I0 b();

    public abstract Set c();

    public abstract G d(L7.m0 m0Var);

    public abstract int hashCode();
}
