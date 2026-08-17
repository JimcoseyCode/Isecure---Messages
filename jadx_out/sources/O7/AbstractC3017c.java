package o7;

import i7.AbstractC2753p;
import kotlin.coroutines.jvm.internal.h;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.I;
import n7.f;
import n7.k;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX INFO: renamed from: o7.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC3017c {

    /* JADX INFO: renamed from: o7.c$a */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class a extends j {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f30504g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2 f30505h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f30506i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(f fVar, Function2 function2, Object obj) {
            super(fVar);
            this.f30505h = function2;
            this.f30506i = obj;
            AbstractC2855l.e(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f30504g;
            if (i10 == 0) {
                this.f30504g = 1;
                AbstractC2753p.b(obj);
                AbstractC2855l.e(this.f30505h, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) I.e(this.f30505h, 2)).invoke(this.f30506i, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f30504g = 2;
            AbstractC2753p.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: o7.c$b */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f30507g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ Function2 f30508h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ Object f30509i;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(f fVar, n7.j jVar, Function2 function2, Object obj) {
            super(fVar, jVar);
            this.f30508h = function2;
            this.f30509i = obj;
            AbstractC2855l.e(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            int i10 = this.f30507g;
            if (i10 == 0) {
                this.f30507g = 1;
                AbstractC2753p.b(obj);
                AbstractC2855l.e(this.f30508h, "null cannot be cast to non-null type kotlin.Function2<R of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted, kotlin.coroutines.Continuation<T of kotlin.coroutines.intrinsics.IntrinsicsKt__IntrinsicsJvmKt.createCoroutineUnintercepted>, kotlin.Any?>");
                return ((Function2) I.e(this.f30508h, 2)).invoke(this.f30509i, this);
            }
            if (i10 != 1) {
                throw new IllegalStateException("This coroutine had already completed");
            }
            this.f30507g = 2;
            AbstractC2753p.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: o7.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class C0338c extends j {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0338c(f fVar) {
            super(fVar);
            AbstractC2855l.e(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            AbstractC2753p.b(obj);
            return obj;
        }
    }

    /* JADX INFO: renamed from: o7.c$d */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    public static final class d extends kotlin.coroutines.jvm.internal.d {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(f fVar, n7.j jVar) {
            super(fVar, jVar);
            AbstractC2855l.e(fVar, "null cannot be cast to non-null type kotlin.coroutines.Continuation<kotlin.Any?>");
        }

        @Override // kotlin.coroutines.jvm.internal.a
        protected Object invokeSuspend(Object obj) {
            AbstractC2753p.b(obj);
            return obj;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static f a(Function2 function2, Object obj, f completion) {
        AbstractC2855l.g(function2, "<this>");
        AbstractC2855l.g(completion, "completion");
        f fVarA = h.a(completion);
        if (function2 instanceof kotlin.coroutines.jvm.internal.a) {
            return ((kotlin.coroutines.jvm.internal.a) function2).create(obj, fVarA);
        }
        n7.j context = fVarA.getContext();
        return context == k.f30068g ? new a(fVarA, function2, obj) : new b(fVarA, context, function2, obj);
    }

    private static final f b(f fVar) {
        n7.j context = fVar.getContext();
        return context == k.f30068g ? new C0338c(fVar) : new d(fVar, context);
    }

    public static f c(f fVar) {
        f fVarIntercepted;
        AbstractC2855l.g(fVar, "<this>");
        kotlin.coroutines.jvm.internal.d dVar = fVar instanceof kotlin.coroutines.jvm.internal.d ? (kotlin.coroutines.jvm.internal.d) fVar : null;
        return (dVar == null || (fVarIntercepted = dVar.intercepted()) == null) ? fVar : fVarIntercepted;
    }

    public static Object d(Function2 function2, Object obj, f completion) {
        AbstractC2855l.g(function2, "<this>");
        AbstractC2855l.g(completion, "completion");
        return ((Function2) I.e(function2, 2)).invoke(obj, b(h.a(completion)));
    }
}
