package expo.modules.kotlin.functions;

import C7.o;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.functions.AsyncFunctionBuilder;
import expo.modules.kotlin.types.AnyType;
import expo.modules.kotlin.types.AnyTypeProvider;
import expo.modules.kotlin.types.LazyKType;
import expo.modules.kotlin.types.TypeConverterProvider;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.D;
import w7.InterfaceC3487a;
import w7.p;
import w7.q;
import w7.r;
import w7.s;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000`\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a?\u0010\u0007\u001a\u00020\u0006\"\u0006\b\u0000\u0010\u0000\u0018\u0001*\u00020\u00012\u001e\b\u0004\u0010\u0005\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0002H\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\b\u001aM\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001*\u00020\u00012$\b\u0004\u0010\u0005\u001a\u001e\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\nH\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\f\u001a[\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001*\u00020\u00012*\b\u0004\u0010\u0005\u001a$\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u000eH\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u000f\u001ai\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001*\u00020\u000120\b\u0004\u0010\u0005\u001a*\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0011H\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0012\u001aw\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001*\u00020\u000126\b\u0004\u0010\u0005\u001a0\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014H\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0015\u001a\u0085\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001*\u00020\u00012<\b\u0004\u0010\u0005\u001a6\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0017H\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u0018\u001a\u0093\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u0001*\u00020\u00012B\b\u0004\u0010\u0005\u001a<\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001aH\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u001b\u001a¡\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u0001\"\u0006\b\u0007\u0010\u001c\u0018\u0001*\u00020\u00012H\b\u0004\u0010\u0005\u001aB\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u001dH\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\u001e\u001a¯\u0001\u0010\u0007\u001a\u00020\u000b\"\u0006\b\u0000\u0010\u0000\u0018\u0001\"\u0006\b\u0001\u0010\t\u0018\u0001\"\u0006\b\u0002\u0010\r\u0018\u0001\"\u0006\b\u0003\u0010\u0010\u0018\u0001\"\u0006\b\u0004\u0010\u0013\u0018\u0001\"\u0006\b\u0005\u0010\u0016\u0018\u0001\"\u0006\b\u0006\u0010\u0019\u0018\u0001\"\u0006\b\u0007\u0010\u001c\u0018\u0001\"\u0006\b\b\u0010\u001f\u0018\u0001*\u00020\u00012N\b\u0004\u0010\u0005\u001aH\b\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\u0004\u0012\u00028\u0003\u0012\u0004\u0012\u00028\u0004\u0012\u0004\u0012\u00028\u0005\u0012\u0004\u0012\u00028\u0006\u0012\u0004\u0012\u00028\u0007\u0012\u0004\u0012\u00028\b\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00040 H\u0086\fø\u0001\u0000¢\u0006\u0004\b\u0007\u0010!\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\""}, d2 = {"R", "Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;", "Lkotlin/Function1;", "Ln7/f;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "block", "Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "Coroutine", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lkotlin/jvm/functions/Function1;)Lexpo/modules/kotlin/functions/BaseAsyncFunctionComponent;", "P0", "Lkotlin/Function2;", "Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lkotlin/jvm/functions/Function2;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P1", "Lkotlin/Function3;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/o;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P2", "Lkotlin/Function4;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/p;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P3", "Lkotlin/Function5;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/q;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P4", "Lkotlin/Function6;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/r;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P5", "Lkotlin/Function7;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/s;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P6", "Lkotlin/Function8;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/t;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "P7", "Lkotlin/Function9;", "(Lexpo/modules/kotlin/functions/AsyncFunctionBuilder;Lw7/u;)Lexpo/modules/kotlin/functions/SuspendFunctionComponent;", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class AsyncFunctionBuilderKt {
    public static final /* synthetic */ <R> BaseAsyncFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, Function1 block) {
        AbstractC2855l.g(asyncFunctionBuilder, "<this>");
        AbstractC2855l.g(block, "block");
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(asyncFunctionBuilder.getName(), new AnyType[0], new AsyncFunctionBuilder.C24901(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, Function2 block) {
        AbstractC2855l.g(asyncFunctionBuilder, "<this>");
        AbstractC2855l.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
        AbstractC2855l.m(4, "P0");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$1 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$1 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$1
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$1), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType}, new AsyncFunctionBuilder.C24913(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, w7.o block) {
        AbstractC2855l.g(asyncFunctionBuilder, "<this>");
        AbstractC2855l.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$2 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$2 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$2
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$2), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$3), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2}, new AsyncFunctionBuilder.C24925(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1, P2> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, p block) {
        AbstractC2855l.g(asyncFunctionBuilder, "<this>");
        AbstractC2855l.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AnyTypeProvider anyTypeProvider = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$4 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$4 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$4
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$4), converters);
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(3, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$5 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$5 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$5
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$5), converters);
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(3, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$6 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$6 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$6
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$6), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3}, new AsyncFunctionBuilder.AnonymousClass7(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, q block) {
        AnyTypeProvider anyTypeProvider;
        int i10;
        int i11;
        int i12;
        AbstractC2855l.g(asyncFunctionBuilder, "<this>");
        AbstractC2855l.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$7 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$7 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$7
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$7), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            i10 = 3;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(Object.class);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$8 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$8 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$8
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(Object.class);
            i11 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$8), converters);
        } else {
            i11 = 3;
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(Object.class);
        AbstractC2855l.m(i11, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(Object.class);
            i12 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$9), converters);
        } else {
            i12 = 3;
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(Object.class);
        AbstractC2855l.m(i12, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$10 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$10 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$10
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(Object.class);
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$10), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4}, new AsyncFunctionBuilder.AnonymousClass9(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, r block) {
        AnyTypeProvider anyTypeProvider;
        Class cls;
        int i10;
        int i11;
        int i12;
        int i13;
        AbstractC2855l.g(asyncFunctionBuilder, "<this>");
        AbstractC2855l.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$11 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$11 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$11
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(Object.class);
            cls = Object.class;
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$11), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType2 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType2 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$12 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$12 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$12
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i11 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$12), converters);
        } else {
            i11 = 3;
        }
        AbstractC2855l.m(4, "P2");
        C7.d dVarB5 = D.b(cls);
        AbstractC2855l.m(i11, "P2");
        AnyType anyType3 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType3 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$13 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$13 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$13
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$13), converters);
        } else {
            i12 = 3;
        }
        AbstractC2855l.m(4, "P3");
        C7.d dVarB7 = D.b(cls);
        AbstractC2855l.m(i12, "P3");
        AnyType anyType4 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType4 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$14 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$14 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$14
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i13 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$14), converters);
        } else {
            i13 = 3;
        }
        AbstractC2855l.m(4, "P4");
        C7.d dVarB9 = D.b(cls);
        AbstractC2855l.m(i13, "P4");
        AnyType anyType5 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType5 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$15 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$15 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$15
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$15), converters);
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5}, new AsyncFunctionBuilder.AnonymousClass11(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5> SuspendFunctionComponent Coroutine(AsyncFunctionBuilder asyncFunctionBuilder, s block) {
        AnyTypeProvider anyTypeProvider;
        Class cls;
        int i10;
        AnyType anyType;
        int i11;
        int i12;
        AnyType anyType2;
        int i13;
        int i14;
        AnyType anyType3;
        int i15;
        int i16;
        AnyType anyType4;
        int i17;
        int i18;
        AnyType anyType5;
        AnyType anyType6;
        AbstractC2855l.g(asyncFunctionBuilder, "<this>");
        AbstractC2855l.g(block, "block");
        String name = asyncFunctionBuilder.getName();
        TypeConverterProvider converters = asyncFunctionBuilder.getConverters();
        AbstractC2855l.m(4, "P0");
        AbstractC2855l.m(4, "P1");
        AbstractC2855l.m(4, "P2");
        AbstractC2855l.m(4, "P3");
        AbstractC2855l.m(4, "P4");
        AbstractC2855l.m(4, "P5");
        AnyTypeProvider anyTypeProvider2 = AnyTypeProvider.INSTANCE;
        AbstractC2855l.m(4, "P0");
        C7.d dVarB = D.b(Object.class);
        AbstractC2855l.m(3, "P0");
        AnyType anyType7 = anyTypeProvider2.getTypesMap().get(new Pair(dVarB, false));
        if (anyType7 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$16 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$16 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$16
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P0");
                    return null;
                }
            };
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            AbstractC2855l.m(4, "P0");
            C7.d dVarB2 = D.b(cls);
            i10 = 3;
            AbstractC2855l.m(3, "P0");
            anyType = new AnyType(new LazyKType(dVarB2, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$16), converters);
        } else {
            anyTypeProvider = anyTypeProvider2;
            cls = Object.class;
            i10 = 3;
            anyType = anyType7;
        }
        AbstractC2855l.m(4, "P1");
        C7.d dVarB3 = D.b(cls);
        AbstractC2855l.m(i10, "P1");
        AnyType anyType8 = anyTypeProvider.getTypesMap().get(new Pair(dVarB3, false));
        if (anyType8 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$17 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$17 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$17
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P1");
                    return null;
                }
            };
            i11 = 4;
            AbstractC2855l.m(4, "P1");
            C7.d dVarB4 = D.b(cls);
            i12 = 3;
            AbstractC2855l.m(3, "P1");
            anyType2 = new AnyType(new LazyKType(dVarB4, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$17), converters);
        } else {
            i11 = 4;
            i12 = 3;
            anyType2 = anyType8;
        }
        AbstractC2855l.m(i11, "P2");
        C7.d dVarB5 = D.b(cls);
        AbstractC2855l.m(i12, "P2");
        AnyType anyType9 = anyTypeProvider.getTypesMap().get(new Pair(dVarB5, false));
        if (anyType9 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$18 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$18 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$18
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P2");
                    return null;
                }
            };
            i13 = 4;
            AbstractC2855l.m(4, "P2");
            C7.d dVarB6 = D.b(cls);
            i14 = 3;
            AbstractC2855l.m(3, "P2");
            anyType3 = new AnyType(new LazyKType(dVarB6, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$18), converters);
        } else {
            i13 = 4;
            i14 = 3;
            anyType3 = anyType9;
        }
        AbstractC2855l.m(i13, "P3");
        C7.d dVarB7 = D.b(cls);
        AbstractC2855l.m(i14, "P3");
        AnyType anyType10 = anyTypeProvider.getTypesMap().get(new Pair(dVarB7, false));
        if (anyType10 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$19 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$19 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$19
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P3");
                    return null;
                }
            };
            i15 = 4;
            AbstractC2855l.m(4, "P3");
            C7.d dVarB8 = D.b(cls);
            i16 = 3;
            AbstractC2855l.m(3, "P3");
            anyType4 = new AnyType(new LazyKType(dVarB8, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$19), converters);
        } else {
            i15 = 4;
            i16 = 3;
            anyType4 = anyType10;
        }
        AbstractC2855l.m(i15, "P4");
        C7.d dVarB9 = D.b(cls);
        AbstractC2855l.m(i16, "P4");
        AnyType anyType11 = anyTypeProvider.getTypesMap().get(new Pair(dVarB9, false));
        if (anyType11 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$20 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$20 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$20
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P4");
                    return null;
                }
            };
            i17 = 4;
            AbstractC2855l.m(4, "P4");
            C7.d dVarB10 = D.b(cls);
            i18 = 3;
            AbstractC2855l.m(3, "P4");
            anyType5 = new AnyType(new LazyKType(dVarB10, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$20), converters);
        } else {
            i17 = 4;
            i18 = 3;
            anyType5 = anyType11;
        }
        AbstractC2855l.m(i17, "P5");
        C7.d dVarB11 = D.b(cls);
        AbstractC2855l.m(i18, "P5");
        AnyType anyType12 = anyTypeProvider.getTypesMap().get(new Pair(dVarB11, false));
        if (anyType12 == null) {
            AbstractC2855l.l();
            AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$21 asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$21 = new InterfaceC3487a() { // from class: expo.modules.kotlin.functions.AsyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$21
                @Override // w7.InterfaceC3487a
                public final o invoke() {
                    AbstractC2855l.m(6, "P5");
                    return null;
                }
            };
            AbstractC2855l.m(4, "P5");
            C7.d dVarB12 = D.b(cls);
            AbstractC2855l.m(3, "P5");
            anyType6 = new AnyType(new LazyKType(dVarB12, false, asyncFunctionBuilderKt$Coroutine$$inlined$SuspendBody$21), converters);
        } else {
            anyType6 = anyType12;
        }
        SuspendFunctionComponent suspendFunctionComponent = new SuspendFunctionComponent(name, new AnyType[]{anyType, anyType2, anyType3, anyType4, anyType5, anyType6}, new AsyncFunctionBuilder.AnonymousClass13(block, null));
        asyncFunctionBuilder.setAsyncFunctionComponent(suspendFunctionComponent);
        return suspendFunctionComponent;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 expo.modules.kotlin.functions.SuspendFunctionComponent, still in use, count: 2, list:
          (r2v2 expo.modules.kotlin.functions.SuspendFunctionComponent) from 0x0088: MOVE (r19v0 expo.modules.kotlin.functions.SuspendFunctionComponent) = (r2v2 expo.modules.kotlin.functions.SuspendFunctionComponent)
          (r2v2 expo.modules.kotlin.functions.SuspendFunctionComponent) from 0x0077: MOVE (r19v2 expo.modules.kotlin.functions.SuspendFunctionComponent) = (r2v2 expo.modules.kotlin.functions.SuspendFunctionComponent)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6> expo.modules.kotlin.functions.SuspendFunctionComponent Coroutine(expo.modules.kotlin.functions.AsyncFunctionBuilder r27, w7.t r28) {
        /*
            Method dump skipped, instruction units count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilderKt.Coroutine(expo.modules.kotlin.functions.AsyncFunctionBuilder, w7.t):expo.modules.kotlin.functions.SuspendFunctionComponent");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v2 expo.modules.kotlin.functions.SuspendFunctionComponent, still in use, count: 2, list:
          (r2v2 expo.modules.kotlin.functions.SuspendFunctionComponent) from 0x008d: MOVE (r19v0 expo.modules.kotlin.functions.SuspendFunctionComponent) = (r2v2 expo.modules.kotlin.functions.SuspendFunctionComponent)
          (r2v2 expo.modules.kotlin.functions.SuspendFunctionComponent) from 0x0072: MOVE (r19v2 expo.modules.kotlin.functions.SuspendFunctionComponent) = (r2v2 expo.modules.kotlin.functions.SuspendFunctionComponent)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:463)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:97)
        */
    public static final /* synthetic */ <R, P0, P1, P2, P3, P4, P5, P6, P7> expo.modules.kotlin.functions.SuspendFunctionComponent Coroutine(expo.modules.kotlin.functions.AsyncFunctionBuilder r29, w7.u r30) {
        /*
            Method dump skipped, instruction units count: 604
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: expo.modules.kotlin.functions.AsyncFunctionBuilderKt.Coroutine(expo.modules.kotlin.functions.AsyncFunctionBuilder, w7.u):expo.modules.kotlin.functions.SuspendFunctionComponent");
    }
}
