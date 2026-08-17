package expo.modules.kotlin.types;

import C7.q;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import w7.InterfaceC3487a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B+\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00042\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u001e\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020\u00018BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\"0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020&0!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010$¨\u0006)"}, d2 = {"Lexpo/modules/kotlin/types/LazyKType;", "LC7/o;", "LC7/d;", "classifier", PointerEventHelper.POINTER_TYPE_UNKNOWN, "isMarkedNullable", "Lkotlin/Function0;", "kTypeProvider", "<init>", "(LC7/d;ZLw7/a;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "equals", "(Ljava/lang/Object;)Z", PointerEventHelper.POINTER_TYPE_UNKNOWN, "hashCode", "()I", PointerEventHelper.POINTER_TYPE_UNKNOWN, "toString", "()Ljava/lang/String;", "LC7/d;", "getClassifier", "()LC7/d;", "Z", "()Z", "Lw7/a;", "getKTypeProvider", "()Lw7/a;", "_kType", "LC7/o;", "getKType", "()LC7/o;", "kType", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getAnnotations", "()Ljava/util/List;", "annotations", "LC7/q;", "getArguments", "arguments", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class LazyKType implements C7.o {
    private C7.o _kType;
    private final C7.d classifier;
    private final boolean isMarkedNullable;
    private final InterfaceC3487a kTypeProvider;

    public LazyKType(C7.d classifier, boolean z10, InterfaceC3487a kTypeProvider) {
        AbstractC2855l.g(classifier, "classifier");
        AbstractC2855l.g(kTypeProvider, "kTypeProvider");
        this.classifier = classifier;
        this.isMarkedNullable = z10;
        this.kTypeProvider = kTypeProvider;
    }

    private final C7.o getKType() {
        if (this._kType == null) {
            this._kType = (C7.o) this.kTypeProvider.invoke();
        }
        C7.o oVar = this._kType;
        AbstractC2855l.d(oVar);
        return oVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LazyKType)) {
            return AbstractC2855l.b(getKType(), other);
        }
        LazyKType lazyKType = (LazyKType) other;
        return AbstractC2855l.b(getClassifier(), lazyKType.getClassifier()) && getIsMarkedNullable() == lazyKType.getIsMarkedNullable();
    }

    @Override // C7.b
    public List<Annotation> getAnnotations() {
        return getKType().getAnnotations();
    }

    @Override // C7.o
    public List<q> getArguments() {
        return getKType().getArguments();
    }

    public final InterfaceC3487a getKTypeProvider() {
        return this.kTypeProvider;
    }

    public int hashCode() {
        return (getClassifier().hashCode() * 31) + Boolean.hashCode(getIsMarkedNullable());
    }

    @Override // C7.o
    /* JADX INFO: renamed from: isMarkedNullable, reason: from getter */
    public boolean getIsMarkedNullable() {
        return this.isMarkedNullable;
    }

    public String toString() {
        return getKType().toString();
    }

    @Override // C7.o
    public C7.d getClassifier() {
        return this.classifier;
    }

    public /* synthetic */ LazyKType(C7.d dVar, boolean z10, InterfaceC3487a interfaceC3487a, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(dVar, (i10 & 2) != 0 ? false : z10, interfaceC3487a);
    }
}
