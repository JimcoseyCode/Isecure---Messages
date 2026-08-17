package expo.modules.core.logging;

import R8.A0;
import R8.AbstractC1415j;
import R8.AbstractC1417k;
import R8.C1435t0;
import R8.N;
import T8.g;
import T8.j;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import i7.AbstractC2753p;
import i7.C2735B;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00052\u0010\u0010\u0007\u001a\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\n\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u0003R$\u0010\f\u001a\u0012\u0012\u000e\u0012\f\u0012\u0004\u0012\u00020\u00050\u0004j\u0002`\u00060\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u0012\u0004\b\u0011\u0010\u0003¨\u0006\u0012"}, d2 = {"Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueue;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lkotlin/Function0;", "Li7/B;", "Lexpo/modules/core/logging/PersistentFileLogSerialDispatchQueueBlock;", "block", "add", "(Lw7/a;)V", "stop", "LT8/g;", "channel", "LT8/g;", "LR8/A0;", "queueRunner", "LR8/A0;", "getQueueRunner$annotations", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class PersistentFileLogSerialDispatchQueue {
    private final g channel = j.b(-2, null, null, 6, null);
    private final A0 queueRunner = AbstractC1417k.d(C1435t0.f10219g, null, null, new PersistentFileLogSerialDispatchQueue$queueRunner$1(this, null), 3, null);

    /* JADX INFO: renamed from: expo.modules.core.logging.PersistentFileLogSerialDispatchQueue$add$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.core.logging.PersistentFileLogSerialDispatchQueue$add$1", f = "PersistentFileLogSerialDispatchQueue.kt", l = {TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LR8/N;", "Li7/B;", "<anonymous>", "(LR8/N;)V"}, k = 3, mv = {2, 1, 0})
    static final class AnonymousClass1 extends l implements Function2 {
        final /* synthetic */ InterfaceC3487a $block;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(InterfaceC3487a interfaceC3487a, n7.f fVar) {
            super(2, fVar);
            this.$block = interfaceC3487a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final n7.f create(Object obj, n7.f fVar) {
            return PersistentFileLogSerialDispatchQueue.this.new AnonymousClass1(this.$block, fVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(N n10, n7.f fVar) {
            return ((AnonymousClass1) create(n10, fVar)).invokeSuspend(C2735B.f28704a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = AbstractC3016b.e();
            int i10 = this.label;
            if (i10 == 0) {
                AbstractC2753p.b(obj);
                g gVar = PersistentFileLogSerialDispatchQueue.this.channel;
                InterfaceC3487a interfaceC3487a = this.$block;
                this.label = 1;
                if (gVar.b(interfaceC3487a, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
            }
            return C2735B.f28704a;
        }
    }

    public final void add(InterfaceC3487a block) {
        AbstractC2855l.g(block, "block");
        AbstractC1415j.b(null, new AnonymousClass1(block, null), 1, null);
    }

    public final void stop() {
        A0.a.a(this.queueRunner, null, 1, null);
    }

    private static /* synthetic */ void getQueueRunner$annotations() {
    }
}
