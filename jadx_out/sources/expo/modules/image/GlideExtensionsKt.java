package expo.modules.image;

import M1.f;
import com.bumptech.glide.j;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import w7.o;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001aK\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0003\u001a\u00020\u00022\u001e\u0010\u0005\u001a\u001a\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007\u001a_\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\b*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\t\u001a\u0004\u0018\u00018\u00012$\u0010\u0005\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u000b\u001au\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\f\"\u0004\b\u0002\u0010\r*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u000e\u001a\u0004\u0018\u00018\u00012\b\u0010\u000f\u001a\u0004\u0018\u00018\u00022*\u0010\u0005\u001a&\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u0001\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00010\u0010H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0011\u001a3\u0010\u0006\u001a\u00020\u0012*\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0004H\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0013\u001aA\u0010\u0006\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u0000*\u00020\u00122\b\u0010\t\u001a\u0004\u0018\u00018\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00120\nH\u0086\bø\u0001\u0000¢\u0006\u0004\b\u0006\u0010\u0014\u001a-\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0016\u0010\u0017\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0018"}, d2 = {"T", "Lcom/bumptech/glide/j;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "when", "Lkotlin/Function1;", "block", "customize", "(Lcom/bumptech/glide/j;ZLkotlin/jvm/functions/Function1;)Lcom/bumptech/glide/j;", "P", "value", "Lkotlin/Function2;", "(Lcom/bumptech/glide/j;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)Lcom/bumptech/glide/j;", "P1", "P2", "first", "second", "Lkotlin/Function3;", "(Lcom/bumptech/glide/j;Ljava/lang/Object;Ljava/lang/Object;Lw7/o;)Lcom/bumptech/glide/j;", "LM1/f;", "(LM1/f;ZLkotlin/jvm/functions/Function1;)LM1/f;", "(LM1/f;Ljava/lang/Object;Lkotlin/jvm/functions/Function2;)LM1/f;", "options", "apply", "(Lcom/bumptech/glide/j;LM1/f;)Lcom/bumptech/glide/j;", "expo-image_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class GlideExtensionsKt {
    public static final <T> j apply(j jVar, f fVar) {
        AbstractC2855l.g(jVar, "<this>");
        if (fVar == null) {
            return jVar;
        }
        j jVarA = jVar.a(fVar);
        AbstractC2855l.f(jVarA, "apply(...)");
        return jVarA;
    }

    public static final <T> j customize(j jVar, boolean z10, Function1 block) {
        AbstractC2855l.g(jVar, "<this>");
        AbstractC2855l.g(block, "block");
        return !z10 ? jVar : (j) block.invoke(jVar);
    }

    public static final <T, P> j customize(j jVar, P p10, Function2 block) {
        AbstractC2855l.g(jVar, "<this>");
        AbstractC2855l.g(block, "block");
        return p10 == null ? jVar : (j) block.invoke(jVar, p10);
    }

    public static final <T, P1, P2> j customize(j jVar, P1 p12, P2 p22, o block) {
        AbstractC2855l.g(jVar, "<this>");
        AbstractC2855l.g(block, "block");
        return (p12 == null || p22 == null) ? jVar : (j) block.invoke(jVar, p12, p22);
    }

    public static final f customize(f fVar, boolean z10, Function1 block) {
        AbstractC2855l.g(fVar, "<this>");
        AbstractC2855l.g(block, "block");
        return !z10 ? fVar : (f) block.invoke(fVar);
    }

    public static final <T> f customize(f fVar, T t10, Function2 block) {
        AbstractC2855l.g(fVar, "<this>");
        AbstractC2855l.g(block, "block");
        return t10 == null ? fVar : (f) block.invoke(fVar, t10);
    }
}
