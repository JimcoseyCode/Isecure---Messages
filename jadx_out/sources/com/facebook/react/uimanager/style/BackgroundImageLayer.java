package com.facebook.react.uimanager.style;

import android.content.Context;
import android.graphics.Shader;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.notifications.service.NotificationsService;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0007¢\u0006\u0004\b\u0002\u0010\u0003B\u0011\b\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0002\u0010\u0006J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundImageLayer;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "gradient", "Lcom/facebook/react/uimanager/style/Gradient;", "(Lcom/facebook/react/uimanager/style/Gradient;)V", "getShader", "Landroid/graphics/Shader;", "width", PointerEventHelper.POINTER_TYPE_UNKNOWN, "height", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class BackgroundImageLayer {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private Gradient gradient;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\tJ\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\f"}, d2 = {"Lcom/facebook/react/uimanager/style/BackgroundImageLayer$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "parse", "Lcom/facebook/react/uimanager/style/BackgroundImageLayer;", "gradientMap", "Lcom/facebook/react/bridge/ReadableMap;", "context", "Landroid/content/Context;", "parseGradient", "Lcom/facebook/react/uimanager/style/Gradient;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final Gradient parseGradient(ReadableMap gradientMap, Context context) {
            if (gradientMap.hasKey(NotificationsService.EVENT_TYPE_KEY) && gradientMap.getType(NotificationsService.EVENT_TYPE_KEY) == ReadableType.String) {
                String string = gradientMap.getString(NotificationsService.EVENT_TYPE_KEY);
                if (AbstractC2855l.b(string, "linear-gradient")) {
                    return LinearGradient.INSTANCE.parse(gradientMap, context);
                }
                if (AbstractC2855l.b(string, "radial-gradient")) {
                    return RadialGradient.INSTANCE.parse(gradientMap, context);
                }
            }
            return null;
        }

        public final BackgroundImageLayer parse(ReadableMap gradientMap, Context context) {
            Gradient gradient;
            AbstractC2855l.g(context, "context");
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (gradientMap == null || (gradient = parseGradient(gradientMap, context)) == null) {
                return null;
            }
            return new BackgroundImageLayer(gradient, defaultConstructorMarker);
        }

        private Companion() {
        }
    }

    public /* synthetic */ BackgroundImageLayer(Gradient gradient, DefaultConstructorMarker defaultConstructorMarker) {
        this(gradient);
    }

    public final Shader getShader(float width, float height) {
        Gradient gradient = this.gradient;
        if (gradient == null) {
            AbstractC2855l.y("gradient");
            gradient = null;
        }
        return gradient.getShader(width, height);
    }

    public BackgroundImageLayer() {
    }

    private BackgroundImageLayer(Gradient gradient) {
        this();
        this.gradient = gradient;
    }
}
