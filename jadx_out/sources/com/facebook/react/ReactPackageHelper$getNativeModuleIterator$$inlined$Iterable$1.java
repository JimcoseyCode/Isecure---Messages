package com.facebook.react;

import com.facebook.react.bridge.ModuleHolder;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import x7.InterfaceC3550a;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"com/facebook/react/ReactPackageHelper$getNativeModuleIterator$$inlined$Iterable$1", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "iterator", "()Ljava/util/Iterator;", "kotlin-stdlib"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ReactPackageHelper$getNativeModuleIterator$$inlined$Iterable$1 implements Iterable<ModuleHolder>, InterfaceC3550a {
    final /* synthetic */ List $nativeModules$inlined;

    public ReactPackageHelper$getNativeModuleIterator$$inlined$Iterable$1(List list) {
        this.$nativeModules$inlined = list;
    }

    @Override // java.lang.Iterable
    public Iterator<ModuleHolder> iterator() {
        return new ReactPackageHelper$getNativeModuleIterator$1$1(this.$nativeModules$inlined);
    }
}
