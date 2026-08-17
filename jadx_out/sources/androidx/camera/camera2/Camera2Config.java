package androidx.camera.camera2;

import F.AbstractC0476d0;
import F.E1;
import F.J;
import F.K;
import K.m;
import android.content.Context;
import androidx.camera.camera2.Camera2Config;
import java.util.Set;
import r.C3141A;
import r.M0;
import r.S0;
import y.C3559D;
import y.C3579f0;
import y.C3598s;
import y.C3600u;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class Camera2Config {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class DefaultProvider implements C3559D.b {
        @Override // y.C3559D.b
        public C3559D getCameraXConfig() {
            return Camera2Config.c();
        }
    }

    public static /* synthetic */ E1 a(Context context) {
        return new S0(context);
    }

    public static /* synthetic */ J b(Context context, Object obj, Set set) throws C3579f0 {
        try {
            return new M0(context, obj, set);
        } catch (C3600u e10) {
            throw new C3579f0(e10);
        }
    }

    public static C3559D c() {
        K.a aVar = new K.a() { // from class: p.a
            @Override // F.K.a
            public final K a(Context context, AbstractC0476d0 abstractC0476d0, C3598s c3598s, long j10, C3559D c3559d, m mVar) {
                return new C3141A(context, abstractC0476d0, c3598s, j10, c3559d, mVar);
            }
        };
        J.a aVar2 = new J.a() { // from class: p.b
            @Override // F.J.a
            public final J a(Context context, Object obj, Set set) {
                return Camera2Config.b(context, obj, set);
            }
        };
        return new C3559D.a().c(aVar).e(aVar2).i(new E1.c() { // from class: p.c
            @Override // F.E1.c
            public final E1 a(Context context) {
                return Camera2Config.a(context);
            }
        }).d(0).f(true).a();
    }
}
