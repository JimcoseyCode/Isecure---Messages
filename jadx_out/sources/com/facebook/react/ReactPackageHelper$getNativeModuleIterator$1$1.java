package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0010(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\t\u001a\u00020\u0002H\u0096\u0002J\t\u0010\n\u001a\u00020\u000bH\u0096\u0002R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\f"}, d2 = {"com/facebook/react/ReactPackageHelper$getNativeModuleIterator$1$1", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/bridge/ModuleHolder;", ViewProps.POSITION, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getPosition", "()I", "setPosition", "(I)V", "next", "hasNext", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactPackageHelper$getNativeModuleIterator$1$1 implements Iterator<ModuleHolder>, InterfaceC3550a {
    final /* synthetic */ List<NativeModule> $nativeModules;
    private int position;

    /* JADX WARN: Multi-variable type inference failed */
    ReactPackageHelper$getNativeModuleIterator$1$1(List<? extends NativeModule> list) {
        this.$nativeModules = list;
    }

    public final int getPosition() {
        return this.position;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.position < this.$nativeModules.size();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setPosition(int i10) {
        this.position = i10;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public ModuleHolder next() {
        List<NativeModule> list = this.$nativeModules;
        int i10 = this.position;
        this.position = i10 + 1;
        return new ModuleHolder(list.get(i10));
    }
}
