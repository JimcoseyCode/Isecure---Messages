package expo.modules.contacts.next.extensions;

import O8.i;
import O8.l;
import android.database.Cursor;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.k;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroid/database/Cursor;", "LO8/i;", "asSequence", "(Landroid/database/Cursor;)LO8/i;", "expo-contacts_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class CursorExtensionsKt {

    /* JADX INFO: renamed from: expo.modules.contacts.next.extensions.CursorExtensionsKt$asSequence$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.contacts.next.extensions.CursorExtensionsKt$asSequence$1", f = "CursorExtensions.kt", l = {7}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LO8/k;", "Landroid/database/Cursor;", "Li7/B;", "<anonymous>", "(LO8/k;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends k implements Function2 {
        final /* synthetic */ Cursor $this_asSequence;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(Cursor cursor, n7.f fVar) {
            super(2, fVar);
            this.$this_asSequence = cursor;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$this_asSequence, fVar);
            anonymousClass1.L$0 = obj;
            return anonymousClass1;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(O8.k kVar, n7.f fVar) {
            return ((AnonymousClass1) create(kVar, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            O8.k kVar;
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                kVar = (O8.k) this.L$0;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kVar = (O8.k) this.L$0;
                AbstractC2753p.b(obj);
            }
            while (this.$this_asSequence.moveToNext()) {
                Cursor cursor = this.$this_asSequence;
                this.L$0 = kVar;
                this.label = 1;
                if (kVar.c(cursor, this) == objE) {
                    return objE;
                }
            }
            return C2735B.f28704a;
        }
    }

    public static final i asSequence(Cursor cursor) {
        AbstractC2855l.g(cursor, "<this>");
        return l.b(new AnonymousClass1(cursor, null));
    }
}
