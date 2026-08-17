package expo.modules.kotlin.tracing;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2854k;
import kotlin.jvm.internal.AbstractC2855l;
import l1.AbstractC2861a;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0005\u001a1\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0081\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a9\u0010\u0005\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u000e\b\u0004\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0005\u0010\b\u001a \u0010\n\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\u0086\b¢\u0006\u0004\b\n\u0010\u000b\u001a\u0010\u0010\f\u001a\u00020\tH\u0086\b¢\u0006\u0004\b\f\u0010\r\u001a*\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011\u001a*\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0007\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\b\b\u0002\u0010\u000f\u001a\u00020\u000eH\u0086\b¢\u0006\u0004\b\u0012\u0010\u0011\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"T", PointerEventHelper.POINTER_TYPE_UNKNOWN, "blockName", "Lkotlin/Function0;", "block", "trace", "(Ljava/lang/String;Lw7/a;)Ljava/lang/Object;", "tag", "(Ljava/lang/String;Ljava/lang/String;Lw7/a;)Ljava/lang/Object;", "Li7/B;", "beginTraceBlock", "(Ljava/lang/String;Ljava/lang/String;)V", "endTraceBlock", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "cookie", "beginAsyncTraceBlock", "(Ljava/lang/String;Ljava/lang/String;I)V", "endAsyncTraceBlock", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class ExpoTraceKt {
    public static final void beginAsyncTraceBlock(String tag, String blockName, int i10) {
        AbstractC2855l.g(tag, "tag");
        AbstractC2855l.g(blockName, "blockName");
        AbstractC2861a.a("[" + tag + "] " + blockName, i10);
    }

    public static /* synthetic */ void beginAsyncTraceBlock$default(String tag, String blockName, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        AbstractC2855l.g(tag, "tag");
        AbstractC2855l.g(blockName, "blockName");
        AbstractC2861a.a("[" + tag + "] " + blockName, i10);
    }

    public static final void beginTraceBlock(String tag, String blockName) {
        AbstractC2855l.g(tag, "tag");
        AbstractC2855l.g(blockName, "blockName");
        AbstractC2861a.c("[" + tag + "] " + blockName);
    }

    public static final void endAsyncTraceBlock(String tag, String blockName, int i10) {
        AbstractC2855l.g(tag, "tag");
        AbstractC2855l.g(blockName, "blockName");
        AbstractC2861a.d("[" + tag + "] " + blockName, i10);
    }

    public static /* synthetic */ void endAsyncTraceBlock$default(String tag, String blockName, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i10 = 0;
        }
        AbstractC2855l.g(tag, "tag");
        AbstractC2855l.g(blockName, "blockName");
        AbstractC2861a.d("[" + tag + "] " + blockName, i10);
    }

    public static final void endTraceBlock() {
        AbstractC2861a.f();
    }

    public static final <T> T trace(String tag, String blockName, InterfaceC3487a block) {
        AbstractC2855l.g(tag, "tag");
        AbstractC2855l.g(blockName, "blockName");
        AbstractC2855l.g(block, "block");
        AbstractC2861a.c("[" + tag + "] " + blockName);
        try {
            return (T) block.invoke();
        } finally {
            AbstractC2854k.b(1);
            AbstractC2861a.f();
            AbstractC2854k.a(1);
        }
    }

    public static final <T> T trace(String blockName, InterfaceC3487a block) {
        AbstractC2855l.g(blockName, "blockName");
        AbstractC2855l.g(block, "block");
        AbstractC2861a.c("[ExpoModulesCore] " + blockName);
        try {
            return (T) block.invoke();
        } finally {
            AbstractC2854k.b(1);
            AbstractC2861a.f();
            AbstractC2854k.a(1);
        }
    }
}
