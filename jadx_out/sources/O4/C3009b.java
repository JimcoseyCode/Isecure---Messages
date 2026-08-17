package o4;

import com.facebook.react.uimanager.events.PointerEventHelper;
import com.google.android.gms.common.api.Status;

/* JADX INFO: renamed from: o4.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3009b extends Exception {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final Status f30481g;

    public C3009b(Status status) {
        super(status.s() + ": " + (status.X() != null ? status.X() : PointerEventHelper.POINTER_TYPE_UNKNOWN));
        this.f30481g = status;
    }

    public Status a() {
        return this.f30481g;
    }
}
