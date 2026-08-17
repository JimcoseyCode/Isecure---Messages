package androidx.activity;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class U {

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends L {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1 f13812a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(boolean z10, Function1 function1) {
            super(z10);
            this.f13812a = function1;
        }

        @Override // androidx.activity.L
        public void handleOnBackPressed() {
            this.f13812a.invoke(this);
        }
    }

    public static final L a(T t10, androidx.lifecycle.r rVar, boolean z10, Function1 onBackPressed) {
        AbstractC2855l.g(t10, "<this>");
        AbstractC2855l.g(onBackPressed, "onBackPressed");
        a aVar = new a(z10, onBackPressed);
        if (rVar != null) {
            t10.p(rVar, aVar);
            return aVar;
        }
        t10.o(aVar);
        return aVar;
    }

    public static /* synthetic */ L b(T t10, androidx.lifecycle.r rVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            rVar = null;
        }
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return a(t10, rVar, z10, function1);
    }
}
