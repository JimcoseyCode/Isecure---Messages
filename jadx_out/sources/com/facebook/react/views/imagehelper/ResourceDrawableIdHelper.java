package com.facebook.react.views.imagehelper;

import P8.q;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import w0.AbstractC3461h;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0005\u0010\u0003J!\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ#\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0010\u0010\u0011J!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0007¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0017\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001e\u001a\u00020\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001d\u0010\u0003\u001a\u0004\b\u0017\u0010\u0016¨\u0006\u001f"}, d2 = {"Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "Li7/B;", "clear", "Landroid/content/Context;", "context", PointerEventHelper.POINTER_TYPE_UNKNOWN, "name", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getResourceDrawableId", "(Landroid/content/Context;Ljava/lang/String;)I", "normalizedName", "addDrawableId", "Landroid/graphics/drawable/Drawable;", "getResourceDrawable", "(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;", "Landroid/net/Uri;", "getResourceDrawableUri", "(Landroid/content/Context;Ljava/lang/String;)Landroid/net/Uri;", "DEPRECATED$getInstance", "()Lcom/facebook/react/views/imagehelper/ResourceDrawableIdHelper;", "getInstance", PointerEventHelper.POINTER_TYPE_UNKNOWN, "resourceDrawableIdMap", "Ljava/util/Map;", "LOCAL_RESOURCE_SCHEME", "Ljava/lang/String;", "getInstance$annotations", "instance", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ResourceDrawableIdHelper {
    private static final String LOCAL_RESOURCE_SCHEME = "res";
    public static final ResourceDrawableIdHelper INSTANCE = new ResourceDrawableIdHelper();
    private static final Map<String, Integer> resourceDrawableIdMap = new HashMap();

    private ResourceDrawableIdHelper() {
    }

    private final int addDrawableId(Context context, String normalizedName) {
        int identifier = context.getResources().getIdentifier(normalizedName, "drawable", context.getPackageName());
        resourceDrawableIdMap.put(normalizedName, Integer.valueOf(identifier));
        return identifier;
    }

    public static final synchronized void clear() {
        resourceDrawableIdMap.clear();
    }

    public static final ResourceDrawableIdHelper getInstance() {
        return INSTANCE;
    }

    public static final Drawable getResourceDrawable(Context context, String name) {
        AbstractC2855l.g(context, "context");
        int resourceDrawableId = getResourceDrawableId(context, name);
        if (resourceDrawableId > 0) {
            return AbstractC3461h.f(context.getResources(), resourceDrawableId, null);
        }
        return null;
    }

    public static final int getResourceDrawableId(Context context, String name) {
        AbstractC2855l.g(context, "context");
        if (name == null || name.length() == 0) {
            return 0;
        }
        String lowerCase = name.toLowerCase(Locale.ROOT);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        String strE = q.E(lowerCase, "-", "_", false, 4, null);
        try {
            return Integer.parseInt(strE);
        } catch (NumberFormatException unused) {
            synchronized (INSTANCE) {
                try {
                    Integer num = resourceDrawableIdMap.get(strE);
                    return num != null ? num.intValue() : INSTANCE.addDrawableId(context, strE);
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static final Uri getResourceDrawableUri(Context context, String name) {
        AbstractC2855l.g(context, "context");
        int resourceDrawableId = getResourceDrawableId(context, name);
        if (resourceDrawableId > 0) {
            Uri uriBuild = new Uri.Builder().scheme(LOCAL_RESOURCE_SCHEME).path(String.valueOf(resourceDrawableId)).build();
            AbstractC2855l.d(uriBuild);
            return uriBuild;
        }
        Uri uri = Uri.EMPTY;
        AbstractC2855l.d(uri);
        return uri;
    }

    public static /* synthetic */ void getInstance$annotations() {
    }

    public final ResourceDrawableIdHelper DEPRECATED$getInstance() {
        return this;
    }
}
