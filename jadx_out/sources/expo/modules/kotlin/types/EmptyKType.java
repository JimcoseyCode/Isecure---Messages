package expo.modules.kotlin.types;

import C7.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import j7.AbstractC2800q;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001d\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00042\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\r\u0010\u000eR\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0005\u0010\u0013R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00190\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017¨\u0006\u001c"}, d2 = {"Lexpo/modules/kotlin/types/EmptyKType;", "LC7/o;", "LC7/d;", "classifier", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isMarkedNullable", "<init>", "(LC7/d;Z)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "equals", "(Ljava/lang/Object;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", "LC7/d;", "getClassifier", "()LC7/d;", "Z", "()Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAnnotations", "()Ljava/util/List;", "annotations", "LC7/q;", "getArguments", "arguments", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class EmptyKType implements C7.o {
    private final C7.d classifier;
    private final boolean isMarkedNullable;

    public EmptyKType(C7.d classifier, boolean z10) {
        AbstractC2855l.g(classifier, "classifier");
        this.classifier = classifier;
        this.isMarkedNullable = z10;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyKType)) {
            return false;
        }
        EmptyKType emptyKType = (EmptyKType) other;
        return AbstractC2855l.b(getClassifier(), emptyKType.getClassifier()) && getIsMarkedNullable() == emptyKType.getIsMarkedNullable();
    }

    @Override // C7.b
    public List<Annotation> getAnnotations() {
        return AbstractC2800q.j();
    }

    @Override // C7.o
    public List<q> getArguments() {
        return AbstractC2800q.j();
    }

    public int hashCode() {
        return (getClassifier().hashCode() * 31) + Boolean.hashCode(getIsMarkedNullable());
    }

    @Override // C7.o
    /* JADX INFO: renamed from: isMarkedNullable, reason: from getter */
    public boolean getIsMarkedNullable() {
        return this.isMarkedNullable;
    }

    @Override // C7.o
    public C7.d getClassifier() {
        return this.classifier;
    }

    public /* synthetic */ EmptyKType(C7.d dVar, boolean z10, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? false : z10);
    }
}
