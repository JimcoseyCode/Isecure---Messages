package com.facebook.react.defaults;

import com.facebook.react.fabric.ComponentFactory;
import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0087 ¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/defaults/DefaultComponentsRegistry;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Lcom/facebook/react/fabric/ComponentFactory;", "componentFactory", "Li7/B;", "register", "(Lcom/facebook/react/fabric/ComponentFactory;)V", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class DefaultComponentsRegistry {
    public static final DefaultComponentsRegistry INSTANCE = new DefaultComponentsRegistry();

    static {
        DefaultSoLoader.maybeLoadSoLibrary();
    }

    private DefaultComponentsRegistry() {
    }

    public static final native void register(ComponentFactory componentFactory);
}
