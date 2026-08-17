package expo.modules.notifications;

import android.os.Bundle;
import android.os.Handler;
import android.os.ResultReceiver;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.types.JSTypeConverterProvider;
import expo.modules.notifications.notifications.presentation.builders.ExpoNotificationBuilder;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC2855l;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\u001a9\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u001e\u0010\u0007\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0002j\u0002`\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\f\u0010\r\u001a/\u0010\f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00042\u0016\u0010\u0011\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u0010H\u0000¢\u0006\u0004\b\f\u0010\u0012\u001a\u0019\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0004\b\u0015\u0010\u0016\"*\u0010\u0017\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000ej\u0002`\u00108\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0017\u0010\u0019*2\u0010\u001a\"\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0012\u0004\u0012\u00020\u00050\u0002*\"\u0010\u001b\"\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e2\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000e¨\u0006\u001c"}, d2 = {"Landroid/os/Handler;", "handler", "Lkotlin/Function2;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Landroid/os/Bundle;", "Li7/B;", "Lexpo/modules/notifications/ResultReceiverBody;", ExpoNotificationBuilder.EXTRAS_BODY_KEY, "Landroid/os/ResultReceiver;", "createDefaultResultReceiver", "(Landroid/os/Handler;Lkotlin/jvm/functions/Function2;)Landroid/os/ResultReceiver;", "bundle", "filteredBundleForJSTypeConverter", "(Landroid/os/Bundle;)Landroid/os/Bundle;", "Lkotlin/Function1;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lexpo/modules/notifications/BundleConversionTester;", "testBundle", "(Landroid/os/Bundle;Lkotlin/jvm/functions/Function1;)Landroid/os/Bundle;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "test", "isValidJSONString", "(Ljava/lang/String;)Z", "isBundleConvertibleToJSValue", "Lkotlin/jvm/functions/Function1;", "()Lkotlin/jvm/functions/Function1;", "ResultReceiverBody", "BundleConversionTester", "expo-notifications_release"}, k = 2, mv = {2, 1, 0}, xi = 48)
public final class UtilsKt {
    private static final Function1 isBundleConvertibleToJSValue = new Function1() { // from class: expo.modules.notifications.a
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return Boolean.valueOf(UtilsKt.isBundleConvertibleToJSValue$lambda$4((Bundle) obj));
        }
    };

    public static final ResultReceiver createDefaultResultReceiver(Handler handler, final Function2 body) {
        AbstractC2855l.g(body, "body");
        return new ResultReceiver(handler) { // from class: expo.modules.notifications.UtilsKt.createDefaultResultReceiver.1
            @Override // android.os.ResultReceiver
            protected void onReceiveResult(int resultCode, Bundle resultData) {
                super.onReceiveResult(resultCode, resultData);
                body.invoke(Integer.valueOf(resultCode), resultData);
            }
        };
    }

    public static final Bundle filteredBundleForJSTypeConverter(Bundle bundle) {
        AbstractC2855l.g(bundle, "bundle");
        return filteredBundleForJSTypeConverter(bundle, isBundleConvertibleToJSValue);
    }

    public static final Function1 isBundleConvertibleToJSValue() {
        return isBundleConvertibleToJSValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean isBundleConvertibleToJSValue$lambda$4(Bundle bundle) {
        AbstractC2855l.g(bundle, "bundle");
        try {
            JSTypeConverterProvider.convertToJSValue$default(JSTypeConverterProvider.INSTANCE, bundle, null, false, 6, null);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static final boolean isValidJSONString(String str) {
        if (str != null) {
            try {
                try {
                    new JSONObject(str);
                    return true;
                } catch (JSONException unused) {
                    new JSONArray(str);
                    return true;
                }
            } catch (JSONException unused2) {
            }
        }
        return false;
    }

    public static final Bundle filteredBundleForJSTypeConverter(Bundle bundle, Function1 testBundle) {
        AbstractC2855l.g(bundle, "bundle");
        AbstractC2855l.g(testBundle, "testBundle");
        if (((Boolean) testBundle.invoke(bundle)).booleanValue()) {
            return bundle;
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Set<String> setKeySet = bundle.keySet();
        AbstractC2855l.f(setKeySet, "keySet(...)");
        for (String str : setKeySet) {
            Object obj = bundle.get(str);
            if (obj instanceof Bundle) {
                bundle.putBundle(str, filteredBundleForJSTypeConverter((Bundle) obj, testBundle));
                linkedHashSet.add(str);
            }
        }
        Set<String> setKeySet2 = bundle.keySet();
        AbstractC2855l.f(setKeySet2, "keySet(...)");
        for (String str2 : setKeySet2) {
            if (!linkedHashSet.contains(str2)) {
                Bundle bundle2 = new Bundle();
                bundle2.putAll(bundle);
                Set<String> setKeySet3 = bundle.keySet();
                AbstractC2855l.f(setKeySet3, "keySet(...)");
                for (String str3 : setKeySet3) {
                    if (!str3.equals(str2)) {
                        bundle2.remove(str3);
                    }
                }
                if (((Boolean) testBundle.invoke(bundle2)).booleanValue()) {
                    linkedHashSet.add(str2);
                }
            }
        }
        Bundle bundle3 = new Bundle();
        bundle3.putAll(bundle);
        Set<String> setKeySet4 = bundle.keySet();
        AbstractC2855l.f(setKeySet4, "keySet(...)");
        for (String str4 : setKeySet4) {
            if (!linkedHashSet.contains(str4)) {
                bundle3.remove(str4);
            }
        }
        return bundle3;
    }
}
