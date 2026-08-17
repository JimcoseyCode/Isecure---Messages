package expo.modules.kotlin;

import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import v7.AbstractC3430a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a!\u0010\u0004\u001a\u00020\u0003*\u0006\u0012\u0002\b\u00030\u00002\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0001¢\u0006\u0004\b\u0004\u0010\u0005\"-\u0010\u000b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\b\"\b\b\u0000\u0010\u0007*\u00020\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00008F¢\u0006\u0006\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"LC7/d;", "Ljava/lang/Class;", "jClass", PointerEventHelper.POINTER_TYPE_UNKNOWN, "fastIsSupperClassOf", "(LC7/d;Ljava/lang/Class;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "T", "LC7/g;", "getFastPrimaryConstructor", "(LC7/d;)LC7/g;", "fastPrimaryConstructor", "expo-modules-core_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class KClassExtensionsKt {
    public static final boolean fastIsSupperClassOf(C7.d dVar, Class<?> jClass) {
        AbstractC2855l.g(dVar, "<this>");
        AbstractC2855l.g(jClass, "jClass");
        return AbstractC3430a.c(dVar).isAssignableFrom(jClass) || AbstractC3430a.b(dVar).isAssignableFrom(jClass);
    }

    public static final <T> C7.g getFastPrimaryConstructor(C7.d dVar) {
        AbstractC2855l.g(dVar, "<this>");
        C7.g gVar = (C7.g) AbstractC2800q.D0(dVar.f());
        return gVar == null ? D7.c.c(dVar) : gVar;
    }
}
