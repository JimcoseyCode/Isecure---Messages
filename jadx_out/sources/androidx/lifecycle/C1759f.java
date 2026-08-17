package androidx.lifecycle;

import androidx.lifecycle.AbstractC1764k;
import i7.C2750m;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: renamed from: androidx.lifecycle.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public final class C1759f implements InterfaceC1768o {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final InterfaceC1758e f17581g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final InterfaceC1768o f17582h;

    /* JADX INFO: renamed from: androidx.lifecycle.f$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17583a;

        static {
            int[] iArr = new int[AbstractC1764k.a.values().length];
            try {
                iArr[AbstractC1764k.a.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC1764k.a.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AbstractC1764k.a.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AbstractC1764k.a.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AbstractC1764k.a.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[AbstractC1764k.a.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[AbstractC1764k.a.ON_ANY.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f17583a = iArr;
        }
    }

    public C1759f(InterfaceC1758e defaultLifecycleObserver, InterfaceC1768o interfaceC1768o) {
        AbstractC2855l.g(defaultLifecycleObserver, "defaultLifecycleObserver");
        this.f17581g = defaultLifecycleObserver;
        this.f17582h = interfaceC1768o;
    }

    @Override // androidx.lifecycle.InterfaceC1768o
    public void k(r source, AbstractC1764k.a event) {
        AbstractC2855l.g(source, "source");
        AbstractC2855l.g(event, "event");
        switch (a.f17583a[event.ordinal()]) {
            case 1:
                this.f17581g.e(source);
                break;
            case 2:
                this.f17581g.onStart(source);
                break;
            case 3:
                this.f17581g.onResume(source);
                break;
            case 4:
                this.f17581g.onPause(source);
                break;
            case 5:
                this.f17581g.onStop(source);
                break;
            case 6:
                this.f17581g.onDestroy(source);
                break;
            case 7:
                throw new IllegalArgumentException("ON_ANY must not been send by anybody");
            default:
                throw new C2750m();
        }
        InterfaceC1768o interfaceC1768o = this.f17582h;
        if (interfaceC1768o != null) {
            interfaceC1768o.k(source, event);
        }
    }
}
