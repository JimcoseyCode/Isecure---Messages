package q8;

import C8.S;
import L7.H;
import java.util.List;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class z extends C3137b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final S f30895c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(List value, S type) {
        super(value, new y(type));
        AbstractC2855l.g(value, "value");
        AbstractC2855l.g(type, "type");
        this.f30895c = type;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final S c(S s10, H it) {
        AbstractC2855l.g(it, "it");
        return s10;
    }

    public final S e() {
        return this.f30895c;
    }
}
