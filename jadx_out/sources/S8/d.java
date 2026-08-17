package S8;

import R8.C1404d0;
import R8.D0;
import R8.InterfaceC1408f0;
import R8.N0;
import R8.X;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import n7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public final class d extends e implements X {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final Handler f10316i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final String f10317j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final boolean f10318k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final d f10319l;

    private d(Handler handler, String str, boolean z10) {
        super(null);
        this.f10316i = handler;
        this.f10317j = str;
        this.f10318k = z10;
        this.f10319l = z10 ? this : new d(handler, str, true);
    }

    private final void R0(j jVar, Runnable runnable) {
        D0.c(jVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C1404d0.b().J0(jVar, runnable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void T0(d dVar, Runnable runnable) {
        dVar.f10316i.removeCallbacks(runnable);
    }

    @Override // R8.X
    public InterfaceC1408f0 D0(long j10, final Runnable runnable, j jVar) {
        if (this.f10316i.postDelayed(runnable, B7.d.i(j10, 4611686018427387903L))) {
            return new InterfaceC1408f0() { // from class: S8.c
                @Override // R8.InterfaceC1408f0
                public final void dispose() {
                    d.T0(this.f10314g, runnable);
                }
            };
        }
        R0(jVar, runnable);
        return N0.f10147g;
    }

    @Override // R8.J
    public void J0(j jVar, Runnable runnable) {
        if (this.f10316i.post(runnable)) {
            return;
        }
        R0(jVar, runnable);
    }

    @Override // R8.J
    public boolean L0(j jVar) {
        return (this.f10318k && AbstractC2855l.b(Looper.myLooper(), this.f10316i.getLooper())) ? false : true;
    }

    @Override // R8.K0
    /* JADX INFO: renamed from: S0, reason: merged with bridge method [inline-methods] */
    public d O0() {
        return this.f10319l;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return dVar.f10316i == this.f10316i && dVar.f10318k == this.f10318k;
    }

    public int hashCode() {
        return System.identityHashCode(this.f10316i) ^ (this.f10318k ? 1231 : 1237);
    }

    @Override // R8.J
    public String toString() {
        String strP0 = P0();
        if (strP0 != null) {
            return strP0;
        }
        String string = this.f10317j;
        if (string == null) {
            string = this.f10316i.toString();
        }
        if (!this.f10318k) {
            return string;
        }
        return string + ".immediate";
    }

    public /* synthetic */ d(Handler handler, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(handler, (i10 & 2) != 0 ? null : str);
    }

    public d(Handler handler, String str) {
        this(handler, str, false);
    }
}
