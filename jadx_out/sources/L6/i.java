package L6;

import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ReactPointerEventsView;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements ReactPointerEventsView {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private h f7251g;

    public i(h hVar) {
        this.f7251g = hVar;
    }

    public final void a(h hVar) {
        this.f7251g = hVar;
    }

    @Override // com.facebook.react.uimanager.ReactPointerEventsView
    public PointerEvents getPointerEvents() {
        PointerEvents pointerEvents;
        h hVar = this.f7251g;
        return (hVar == null || (pointerEvents = hVar.getPointerEvents()) == null) ? PointerEvents.NONE : pointerEvents;
    }
}
