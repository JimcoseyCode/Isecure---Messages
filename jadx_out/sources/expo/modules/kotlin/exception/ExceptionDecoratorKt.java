package expo.modules.kotlin.exception;

import R8.N;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.views.text.TextAttributeProps;
import i7.AbstractC2753p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.d;
import kotlin.coroutines.jvm.internal.f;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import o7.AbstractC3016b;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u001a?\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u000e\b\u0004\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005H\u0080\bø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aV\u0010\u0007\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\t2\u0014\b\u0004\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012$\b\u0004\u0010\u0006\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u000b\u0012\u0006\u0012\u0004\u0018\u00010\f0\nH\u0080H¢\u0006\u0004\b\u0007\u0010\r\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u000e"}, d2 = {"T", "Lkotlin/Function1;", "Lexpo/modules/kotlin/exception/CodedException;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "decoratorBlock", "Lkotlin/Function0;", "block", "exceptionDecorator", "(Lkotlin/jvm/functions/Function1;Lw7/a;)Ljava/lang/Object;", "LR8/N;", "Lkotlin/Function2;", "Ln7/f;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(LR8/N;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Ln7/f;)Ljava/lang/Object;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ExceptionDecoratorKt {

    /* JADX INFO: renamed from: expo.modules.kotlin.exception.ExceptionDecoratorKt$exceptionDecorator$1, reason: invalid class name */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @f(c = "expo.modules.kotlin.exception.ExceptionDecoratorKt", f = "ExceptionDecorator.kt", l = {TextAttributeProps.TA_KEY_LAYOUT_DIRECTION}, m = "exceptionDecorator")
    @Metadata(k = 3, mv = {2, 1, 0}, xi = 176)
    static final class AnonymousClass1<T> extends d {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        AnonymousClass1(n7.f fVar) {
            super(fVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= androidx.customview.widget.a.INVALID_ID;
            return ExceptionDecoratorKt.exceptionDecorator(null, null, null, this);
        }
    }

    public static final <T> T exceptionDecorator(Function1 decoratorBlock, InterfaceC3487a block) throws Throwable {
        Object unexpectedException;
        AbstractC2855l.g(decoratorBlock, "decoratorBlock");
        AbstractC2855l.g(block, "block");
        try {
            return (T) block.invoke();
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                String code = codedException.getCode();
                AbstractC2855l.f(code, "getCode(...)");
                unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            throw ((Throwable) decoratorBlock.invoke(unexpectedException));
        }
    }

    private static final <T> Object exceptionDecorator$$forInline(N n10, Function1 function1, Function2 function2, n7.f fVar) throws Throwable {
        Object unexpectedException;
        try {
            return function2.invoke(n10, fVar);
        } catch (Throwable th) {
            if (th instanceof CodedException) {
                unexpectedException = (CodedException) th;
            } else if (th instanceof expo.modules.core.errors.CodedException) {
                expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                String code = codedException.getCode();
                AbstractC2855l.f(code, "getCode(...)");
                unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
            } else {
                unexpectedException = new UnexpectedException(th);
            }
            throw ((Throwable) function1.invoke(unexpectedException));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <T> Object exceptionDecorator(N n10, Function1 function1, Function2 function2, n7.f fVar) throws Throwable {
        AnonymousClass1 anonymousClass1;
        Object unexpectedException;
        if (fVar instanceof AnonymousClass1) {
            anonymousClass1 = (AnonymousClass1) fVar;
            int i10 = anonymousClass1.label;
            if ((i10 & androidx.customview.widget.a.INVALID_ID) != 0) {
                anonymousClass1.label = i10 - androidx.customview.widget.a.INVALID_ID;
            } else {
                anonymousClass1 = new AnonymousClass1(fVar);
            }
        }
        Object obj = anonymousClass1.result;
        Object objE = AbstractC3016b.e();
        int i11 = anonymousClass1.label;
        try {
            if (i11 != 0) {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC2753p.b(obj);
                return obj;
            }
            AbstractC2753p.b(obj);
            anonymousClass1.L$0 = function1;
            anonymousClass1.label = 1;
            Object objInvoke = function2.invoke(n10, anonymousClass1);
            return objInvoke == objE ? objE : objInvoke;
        } catch (Throwable th) {
            if (!(th instanceof CodedException)) {
                if (th instanceof expo.modules.core.errors.CodedException) {
                    expo.modules.core.errors.CodedException codedException = (expo.modules.core.errors.CodedException) th;
                    String code = codedException.getCode();
                    AbstractC2855l.f(code, "getCode(...)");
                    unexpectedException = new CodedException(code, codedException.getMessage(), codedException.getCause());
                } else {
                    unexpectedException = new UnexpectedException(th);
                }
            } else {
                unexpectedException = (CodedException) th;
            }
            throw ((Throwable) function1.invoke(unexpectedException));
        }
    }
}
