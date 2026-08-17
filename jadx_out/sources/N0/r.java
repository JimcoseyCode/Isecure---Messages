package N0;

import com.facebook.react.uimanager.ViewDefaults;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class r extends D {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f7941b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(Throwable finalException) {
        super(ViewDefaults.NUMBER_OF_LINES, null);
        AbstractC2855l.g(finalException, "finalException");
        this.f7941b = finalException;
    }

    public final Throwable b() {
        return this.f7941b;
    }
}
