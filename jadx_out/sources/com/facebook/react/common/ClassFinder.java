package com.facebook.react.common;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0004\u001a\u00020\u0005H\u0007J\u0016\u0010\u0006\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tH\u0007¨\u0006\n"}, d2 = {"Lcom/facebook/react/common/ClassFinder;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "canLoadClassesFromAnnotationProcessors", PointerEventHelper.POINTER_TYPE_UNKNOWN, "findClass", "Ljava/lang/Class;", "className", PointerEventHelper.POINTER_TYPE_UNKNOWN, "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClassFinder {
    public static final ClassFinder INSTANCE = new ClassFinder();

    private ClassFinder() {
    }

    public static final boolean canLoadClassesFromAnnotationProcessors() {
        return false;
    }

    public static final Class<?> findClass(String className) throws ClassNotFoundException {
        AbstractC2855l.g(className, "className");
        if (canLoadClassesFromAnnotationProcessors()) {
            return Class.forName(className);
        }
        return null;
    }
}
