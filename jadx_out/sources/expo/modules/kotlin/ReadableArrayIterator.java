package expo.modules.kotlin;

import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\r\u001a\u00020\u000eH\u0096\u0002J\t\u0010\u000f\u001a\u00020\u0002H\u0096\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0010"}, d2 = {"Lexpo/modules/kotlin/ReadableArrayIterator;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/Dynamic;", "array", "Lcom/facebook/react/bridge/ReadableArray;", "<init>", "(Lcom/facebook/react/bridge/ReadableArray;)V", "current", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCurrent", "()I", "setCurrent", "(I)V", "hasNext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "next", "expo-modules-core_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReadableArrayIterator implements Iterator<Dynamic>, InterfaceC3550a {
    private final ReadableArray array;
    private int current;

    public ReadableArrayIterator(ReadableArray array) {
        AbstractC2855l.g(array, "array");
        this.array = array;
    }

    public final int getCurrent() {
        return this.current;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current < this.array.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i10) {
        this.current = i10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Dynamic next() {
        ReadableArray readableArray = this.array;
        int i10 = this.current;
        this.current = i10 + 1;
        return readableArray.getDynamic(i10);
    }
}
