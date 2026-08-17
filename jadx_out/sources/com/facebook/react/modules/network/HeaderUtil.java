package com.facebook.react.modules.network;

import com.facebook.react.uimanager.events.PointerEventHelper;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/facebook/react/modules/network/HeaderUtil;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class HeaderUtil {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"Lcom/facebook/react/modules/network/HeaderUtil$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "stripHeaderName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String stripHeaderName(String name) {
            AbstractC2855l.g(name, "name");
            StringBuilder sb = new StringBuilder(name.length());
            int length = name.length();
            boolean z10 = false;
            for (int i10 = 0; i10 < length; i10++) {
                char cCharAt = name.charAt(i10);
                if (AbstractC2855l.i(cCharAt, 32) <= 0 || AbstractC2855l.i(cCharAt, 127) >= 0) {
                    z10 = true;
                } else {
                    sb.append(cCharAt);
                }
            }
            if (!z10) {
                return name;
            }
            String string = sb.toString();
            AbstractC2855l.f(string, "toString(...)");
            return string;
        }

        private Companion() {
        }
    }

    public static final String stripHeaderName(String str) {
        return INSTANCE.stripHeaderName(str);
    }
}
