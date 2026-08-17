package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.jvm.functions.Function2;
import o7.AbstractC3016b;

/* JADX INFO: renamed from: androidx.core.view.h0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1672h0 {

    /* JADX INFO: renamed from: androidx.core.view.h0$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    static final class a extends kotlin.coroutines.jvm.internal.k implements Function2 {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f16558g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private /* synthetic */ Object f16559h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ View f16560i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, n7.f fVar) {
            super(2, fVar);
            this.f16560i = view;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            a aVar = new a(this.f16560i, fVar);
            aVar.f16559h = obj;
            return aVar;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O8.k kVar, n7.f fVar) {
            return ((a) create(kVar, fVar)).invokeSuspend(C2735B.f28704a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004c, code lost:
        
            if (r1.e(r5, r4) == r0) goto L17;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            O8.k kVar;
            Object objE = AbstractC3016b.e();
            int i10 = this.f16558g;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                kVar = (O8.k) this.f16559h;
                View view = this.f16560i;
                this.f16559h = kVar;
                this.f16558g = 1;
                if (kVar.c(view, this) != objE) {
                }
                return objE;
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return C2735B.f28704a;
            }
            kVar = (O8.k) this.f16559h;
            AbstractC2753p.b(obj);
            View view2 = this.f16560i;
            if (view2 instanceof ViewGroup) {
                O8.i iVarB = AbstractC1670g0.b((ViewGroup) view2);
                this.f16559h = null;
                this.f16558g = 2;
            }
            return C2735B.f28704a;
        }
    }

    public static final O8.i a(View view) {
        return O8.l.b(new a(view, null));
    }
}
