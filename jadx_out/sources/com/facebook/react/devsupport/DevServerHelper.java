package com.facebook.react.devsupport;

import android.content.Context;
import android.net.Uri;
import android.os.AsyncTask;
import android.provider.Settings;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.devsupport.BundleDownloader;
import com.facebook.react.devsupport.inspector.DevSupportHttpClient;
import com.facebook.react.devsupport.interfaces.DevBundleDownloadListener;
import com.facebook.react.devsupport.interfaces.PackagerStatusCallback;
import com.facebook.react.modules.debug.interfaces.DeveloperSettings;
import com.facebook.react.modules.systeminfo.AndroidInfoHelpers;
import com.facebook.react.packagerconnection.FileIoHandler;
import com.facebook.react.packagerconnection.JSPackagerClient;
import com.facebook.react.packagerconnection.NotificationOnlyHandler;
import com.facebook.react.packagerconnection.PackagerConnectionSettings;
import com.facebook.react.packagerconnection.ReconnectingWebSocket;
import com.facebook.react.packagerconnection.RequestHandler;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.facebook.react.util.RNLog;
import d2.AbstractC2325a;
import e9.B;
import e9.InterfaceC2437e;
import e9.InterfaceC2438f;
import expo.modules.notifications.service.NotificationsService;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;
import t7.AbstractC3376c;
import t9.AbstractC3386c;
import t9.C3385b;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0017\u0018\u0000 _2\u00020\u0001:\u0003`a_B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ=\u0010\u0014\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\f\u001a\u00020\n2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\b\b\u0002\u0010\u0013\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u001a\u001a\u00020\u00192\b\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0019¢\u0006\u0004\b\u001e\u0010\u001dJ\r\u0010\u001f\u001a\u00020\u0019¢\u0006\u0004\b\u001f\u0010\u001dJ\r\u0010 \u001a\u00020\u0019¢\u0006\u0004\b \u0010\u001dJ=\u0010*\u001a\u00020\u00192\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010\n2\b\u0010'\u001a\u0004\u0018\u00010&2\b\b\u0002\u0010)\u001a\u00020(H\u0007¢\u0006\u0004\b*\u0010+J\u0017\u0010-\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b-\u0010.J\u0017\u0010/\u001a\u00020\n2\u0006\u0010,\u001a\u00020\nH\u0016¢\u0006\u0004\b/\u0010.J\u0017\u00101\u001a\u00020\u00192\u0006\u0010\"\u001a\u000200H\u0016¢\u0006\u0004\b1\u00102J\u0017\u00104\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b4\u0010.J\u0017\u00105\u001a\u00020\n2\u0006\u00103\u001a\u00020\nH\u0016¢\u0006\u0004\b5\u0010.J\u001f\u00107\u001a\u0004\u0018\u00010#2\u0006\u00106\u001a\u00020\n2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b7\u00108J+\u0010=\u001a\u00020\u00192\b\u0010:\u001a\u0004\u0018\u0001092\b\u0010;\u001a\u0004\u0018\u00010\n2\b\u0010<\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b=\u0010>R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010?R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010@R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010AR\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010F\u001a\u00020E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR\u0014\u0010I\u001a\u00020H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0018\u0010N\u001a\u0004\u0018\u00010M8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010U\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bS\u0010TR\u0014\u0010W\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bV\u0010TR\u0014\u0010Z\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010\\\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b[\u0010YR\u0011\u0010^\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b]\u0010T¨\u0006b"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "settings", "Landroid/content/Context;", "applicationContext", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "packagerConnectionSettings", "<init>", "(Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;Landroid/content/Context;Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mainModuleID", "host", "createSplitBundleURL", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "Lcom/facebook/react/devsupport/DevServerHelper$BundleType;", NotificationsService.EVENT_TYPE_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "modulesOnly", "runModule", "createBundleURL", "(Ljava/lang/String;Lcom/facebook/react/devsupport/DevServerHelper$BundleType;Ljava/lang/String;ZZ)Ljava/lang/String;", "clientId", "Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;", "commandListener", "Li7/B;", "openPackagerConnection", "(Ljava/lang/String;Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;)V", "closePackagerConnection", "()V", "openInspectorConnection", "disableDebugger", "closeInspectorConnection", "Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;", "callback", "Ljava/io/File;", "outputFile", "bundleURL", "Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;", "bundleInfo", "Le9/B$a;", "requestBuilder", "downloadBundleFromURL", "(Lcom/facebook/react/devsupport/interfaces/DevBundleDownloadListener;Ljava/io/File;Ljava/lang/String;Lcom/facebook/react/devsupport/BundleDownloader$BundleInfo;Le9/B$a;)V", "jsModulePath", "getDevServerBundleURL", "(Ljava/lang/String;)Ljava/lang/String;", "getDevServerSplitBundleURL", "Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;", "isPackagerRunning", "(Lcom/facebook/react/devsupport/interfaces/PackagerStatusCallback;)V", "mainModuleName", "getSourceMapUrl", "getSourceUrl", "resourcePath", "downloadBundleResourceFromUrlSync", "(Ljava/lang/String;Ljava/io/File;)Ljava/io/File;", "Lcom/facebook/react/bridge/ReactContext;", "context", "errorMessage", "panel", "openDebugger", "(Lcom/facebook/react/bridge/ReactContext;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/facebook/react/modules/debug/interfaces/DeveloperSettings;", "Landroid/content/Context;", "Lcom/facebook/react/packagerconnection/PackagerConnectionSettings;", "Le9/z;", "client", "Le9/z;", "Lcom/facebook/react/devsupport/BundleDownloader;", "bundleDownloader", "Lcom/facebook/react/devsupport/BundleDownloader;", "Lcom/facebook/react/devsupport/PackagerStatusCheck;", "packagerStatusCheck", "Lcom/facebook/react/devsupport/PackagerStatusCheck;", "packageName", "Ljava/lang/String;", "Lcom/facebook/react/packagerconnection/JSPackagerClient;", "packagerClient", "Lcom/facebook/react/packagerconnection/JSPackagerClient;", "Lcom/facebook/react/devsupport/IInspectorPackagerConnection;", "inspectorPackagerConnection", "Lcom/facebook/react/devsupport/IInspectorPackagerConnection;", "getInspectorDeviceId", "()Ljava/lang/String;", "inspectorDeviceId", "getInspectorDeviceUrl", "inspectorDeviceUrl", "getDevMode", "()Z", "devMode", "getJSMinifyMode", "jSMinifyMode", "getWebsocketProxyURL", "websocketProxyURL", "Companion", "PackagerCommandListener", "BundleType", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class DevServerHelper {
    private static final Companion Companion = new Companion(null);
    private static final String DEBUGGER_MSG_DISABLE = "{ \"id\":1,\"method\":\"Debugger.disable\" }";
    private final Context applicationContext;
    private final BundleDownloader bundleDownloader;
    private final e9.z client;
    private IInspectorPackagerConnection inspectorPackagerConnection;
    private final String packageName;
    private JSPackagerClient packagerClient;
    private final PackagerConnectionSettings packagerConnectionSettings;
    private final PackagerStatusCheck packagerStatusCheck;
    private final DeveloperSettings settings;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$BundleType;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "typeID", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getTypeID", "()Ljava/lang/String;", "BUNDLE", "MAP", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class BundleType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ BundleType[] $VALUES;
        public static final BundleType BUNDLE = new BundleType("BUNDLE", 0, "bundle");
        public static final BundleType MAP = new BundleType("MAP", 1, "map");
        private final String typeID;

        private static final /* synthetic */ BundleType[] $values() {
            return new BundleType[]{BUNDLE, MAP};
        }

        static {
            BundleType[] bundleTypeArr$values = $values();
            $VALUES = bundleTypeArr$values;
            $ENTRIES = AbstractC3083a.a(bundleTypeArr$values);
        }

        private BundleType(String str, int i10, String str2) {
            this.typeID = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static BundleType valueOf(String str) {
            return (BundleType) Enum.valueOf(BundleType.class, str);
        }

        public static BundleType[] values() {
            return (BundleType[]) $VALUES.clone();
        }

        public final String getTypeID() {
            return this.typeID;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H\u0002J\u0018\u0010\b\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "DEBUGGER_MSG_DISABLE", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getSHA256", "string", "createResourceURL", "host", "resourcePathParam", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String createResourceURL(String host, String resourcePathParam) {
            if (P8.q.K(resourcePathParam, "/", false, 2, null)) {
                AbstractC2325a.I(ReactConstants.TAG, "Resource path should not begin with `/`, removing it.");
                resourcePathParam = resourcePathParam.substring(1);
                AbstractC2855l.f(resourcePathParam, "substring(...)");
            }
            kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f29375a;
            String str = String.format(Locale.US, "%s://%s/%s", Arrays.copyOf(new Object[]{DevSupportHttpClient.INSTANCE.httpScheme$ReactAndroid_release(host), host, resourcePathParam}, 3));
            AbstractC2855l.f(str, "format(...)");
            return str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final String getSHA256(String string) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                messageDigest.reset();
                try {
                    Charset charsetForName = Charset.forName("UTF-8");
                    AbstractC2855l.f(charsetForName, "forName(...)");
                    byte[] bytes = string.getBytes(charsetForName);
                    AbstractC2855l.f(bytes, "getBytes(...)");
                    byte[] bArrDigest = messageDigest.digest(bytes);
                    kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f29375a;
                    String str = String.format("%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x%02x", Arrays.copyOf(new Object[]{Byte.valueOf(bArrDigest[0]), Byte.valueOf(bArrDigest[1]), Byte.valueOf(bArrDigest[2]), Byte.valueOf(bArrDigest[3]), Byte.valueOf(bArrDigest[4]), Byte.valueOf(bArrDigest[5]), Byte.valueOf(bArrDigest[6]), Byte.valueOf(bArrDigest[7]), Byte.valueOf(bArrDigest[8]), Byte.valueOf(bArrDigest[9]), Byte.valueOf(bArrDigest[10]), Byte.valueOf(bArrDigest[11]), Byte.valueOf(bArrDigest[12]), Byte.valueOf(bArrDigest[13]), Byte.valueOf(bArrDigest[14]), Byte.valueOf(bArrDigest[15]), Byte.valueOf(bArrDigest[16]), Byte.valueOf(bArrDigest[17]), Byte.valueOf(bArrDigest[18]), Byte.valueOf(bArrDigest[19])}, 20));
                    AbstractC2855l.f(str, "format(...)");
                    return str;
                } catch (UnsupportedEncodingException e10) {
                    throw new AssertionError("This environment doesn't support UTF-8 encoding", e10);
                }
            } catch (NoSuchAlgorithmException e11) {
                throw new AssertionError("Could not get standard SHA-256 algorithm", e11);
            }
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&¢\u0006\u0004\b\u0006\u0010\u0004J\u000f\u0010\u0007\u001a\u00020\u0002H&¢\u0006\u0004\b\u0007\u0010\u0004J\u001d\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bH&¢\u0006\u0004\b\u000b\u0010\fø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\rÀ\u0006\u0001"}, d2 = {"Lcom/facebook/react/devsupport/DevServerHelper$PackagerCommandListener;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "Li7/B;", "onPackagerConnected", "()V", "onPackagerDisconnected", "onPackagerReloadCommand", "onPackagerDevMenuCommand", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "Lcom/facebook/react/packagerconnection/RequestHandler;", "customCommandHandlers", "()Ljava/util/Map;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PackagerCommandListener {
        Map<String, RequestHandler> customCommandHandlers();

        void onPackagerConnected();

        void onPackagerDevMenuCommand();

        void onPackagerDisconnected();

        void onPackagerReloadCommand();
    }

    public DevServerHelper(DeveloperSettings settings, Context applicationContext, PackagerConnectionSettings packagerConnectionSettings) {
        AbstractC2855l.g(settings, "settings");
        AbstractC2855l.g(applicationContext, "applicationContext");
        AbstractC2855l.g(packagerConnectionSettings, "packagerConnectionSettings");
        this.settings = settings;
        this.applicationContext = applicationContext;
        this.packagerConnectionSettings = packagerConnectionSettings;
        e9.z httpClient$ReactAndroid_release = DevSupportHttpClient.INSTANCE.getHttpClient$ReactAndroid_release();
        this.client = httpClient$ReactAndroid_release;
        this.bundleDownloader = new BundleDownloader(httpClient$ReactAndroid_release);
        this.packagerStatusCheck = new PackagerStatusCheck(httpClient$ReactAndroid_release);
        String packageName = applicationContext.getPackageName();
        AbstractC2855l.f(packageName, "getPackageName(...)");
        this.packageName = packageName;
    }

    private final String createBundleURL(String mainModuleID, BundleType type, String host, boolean modulesOnly, boolean runModule) {
        boolean devMode = getDevMode();
        StringBuilder sb = new StringBuilder();
        PackagerConnectionSettings packagerConnectionSettings = this.packagerConnectionSettings;
        for (Map.Entry<String, String> entry : packagerConnectionSettings.updatePackagerOptions(packagerConnectionSettings.getAdditionalOptionsForPackager()).entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            if (value.length() != 0) {
                sb.append("&" + key + "=" + Uri.encode(value));
            }
        }
        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f29375a;
        String str = String.format(Locale.US, "%s://%s/%s.%s?platform=android&dev=%s&lazy=%s&minify=%s&app=%s&modulesOnly=%s&runModule=%s", Arrays.copyOf(new Object[]{DevSupportHttpClient.INSTANCE.httpScheme$ReactAndroid_release(host), host, mainModuleID, type.getTypeID(), Boolean.valueOf(devMode), Boolean.valueOf(devMode), Boolean.valueOf(getJSMinifyMode()), this.packageName, modulesOnly ? "true" : Constants.CASEFIRST_FALSE, runModule ? "true" : Constants.CASEFIRST_FALSE}, 10));
        AbstractC2855l.f(str, "format(...)");
        return str + (InspectorFlags.getFuseboxEnabled() ? "&excludeSource=true&sourcePaths=url-server" : PointerEventHelper.POINTER_TYPE_UNKNOWN) + ((Object) sb);
    }

    static /* synthetic */ String createBundleURL$default(DevServerHelper devServerHelper, String str, BundleType bundleType, String str2, boolean z10, boolean z11, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createBundleURL");
        }
        if ((i10 & 4) != 0) {
            str2 = devServerHelper.packagerConnectionSettings.getDebugServerHost();
        }
        String str3 = str2;
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        boolean z12 = z10;
        if ((i10 & 16) != 0) {
            z11 = true;
        }
        return devServerHelper.createBundleURL(str, bundleType, str3, z12, z11);
    }

    private final String createSplitBundleURL(String mainModuleID, String host) {
        return createBundleURL(mainModuleID, BundleType.BUNDLE, host, true, false);
    }

    public static /* synthetic */ void downloadBundleFromURL$default(DevServerHelper devServerHelper, DevBundleDownloadListener devBundleDownloadListener, File file, String str, BundleDownloader.BundleInfo bundleInfo, B.a aVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: downloadBundleFromURL");
        }
        if ((i10 & 16) != 0) {
            aVar = new B.a();
        }
        devServerHelper.downloadBundleFromURL(devBundleDownloadListener, file, str, bundleInfo, aVar);
    }

    private final boolean getDevMode() {
        return this.settings.isJSDevModeEnabled();
    }

    private final String getInspectorDeviceId() {
        String str = this.packageName;
        String string = Settings.Secure.getString(this.applicationContext.getContentResolver(), "android_id");
        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f29375a;
        String str2 = String.format(Locale.US, "android-%s-%s-%s", Arrays.copyOf(new Object[]{str, string, InspectorFlags.getFuseboxEnabled() ? "fusebox" : "legacy"}, 3));
        AbstractC2855l.f(str2, "format(...)");
        return Companion.getSHA256(str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getInspectorDeviceUrl() {
        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f29375a;
        String str = String.format(Locale.US, "%s://%s/inspector/device?name=%s&app=%s&device=%s&profiling=%b", Arrays.copyOf(new Object[]{DevSupportHttpClient.INSTANCE.httpScheme$ReactAndroid_release(this.packagerConnectionSettings.getDebugServerHost()), this.packagerConnectionSettings.getDebugServerHost(), Uri.encode(AndroidInfoHelpers.getFriendlyDeviceName()), Uri.encode(this.packageName), Uri.encode(getInspectorDeviceId()), Boolean.valueOf(InspectorFlags.getIsProfilingBuild())}, 6));
        AbstractC2855l.f(str, "format(...)");
        return str;
    }

    private final boolean getJSMinifyMode() {
        return this.settings.isJSMinifyEnabled();
    }

    public final void closeInspectorConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.closeInspectorConnection.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... params) {
                AbstractC2855l.g(params, "params");
                IInspectorPackagerConnection iInspectorPackagerConnection = DevServerHelper.this.inspectorPackagerConnection;
                if (iInspectorPackagerConnection != null) {
                    iInspectorPackagerConnection.closeQuietly();
                }
                DevServerHelper.this.inspectorPackagerConnection = null;
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void closePackagerConnection() {
        new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.closePackagerConnection.1
            /* JADX INFO: Access modifiers changed from: protected */
            @Override // android.os.AsyncTask
            public Void doInBackground(Void... params) {
                AbstractC2855l.g(params, "params");
                JSPackagerClient jSPackagerClient = DevServerHelper.this.packagerClient;
                if (jSPackagerClient != null) {
                    jSPackagerClient.close();
                }
                DevServerHelper.this.packagerClient = null;
                return null;
            }
        }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
    }

    public final void disableDebugger() {
        IInspectorPackagerConnection iInspectorPackagerConnection = this.inspectorPackagerConnection;
        if (iInspectorPackagerConnection != null) {
            iInspectorPackagerConnection.sendEventToAllConnections(DEBUGGER_MSG_DISABLE);
        }
    }

    public final void downloadBundleFromURL(DevBundleDownloadListener callback, File outputFile, String str, BundleDownloader.BundleInfo bundleInfo) {
        AbstractC2855l.g(callback, "callback");
        AbstractC2855l.g(outputFile, "outputFile");
        downloadBundleFromURL$default(this, callback, outputFile, str, bundleInfo, null, 16, null);
    }

    public final File downloadBundleResourceFromUrlSync(String resourcePath, File outputFile) {
        AbstractC2855l.g(resourcePath, "resourcePath");
        AbstractC2855l.g(outputFile, "outputFile");
        try {
            e9.D dExecute = this.client.a(new B.a().m(Companion.createResourceURL(this.packagerConnectionSettings.getDebugServerHost(), resourcePath)).b()).execute();
            try {
                if (dExecute.k0() && dExecute.d() != null) {
                    t9.D dC = AbstractC3386c.a().c(outputFile);
                    try {
                        C3385b c3385bA = AbstractC3386c.a();
                        e9.E eD = dExecute.d();
                        t9.j jVarSource = eD != null ? eD.source() : null;
                        AbstractC2855l.d(jVarSource);
                        c3385bA.b(jVarSource).r0(dC);
                        AbstractC3376c.a(dC, null);
                        AbstractC3376c.a(dExecute, null);
                        return outputFile;
                    } finally {
                    }
                }
                AbstractC3376c.a(dExecute, null);
                return null;
            } finally {
            }
        } catch (Exception e10) {
            AbstractC2325a.o(ReactConstants.TAG, "Failed to fetch resource synchronously - resourcePath: \"%s\", outputFile: \"%s\"", resourcePath, outputFile.getAbsolutePath(), e10);
            return null;
        }
    }

    public String getDevServerBundleURL(String jsModulePath) {
        AbstractC2855l.g(jsModulePath, "jsModulePath");
        return createBundleURL$default(this, jsModulePath, BundleType.BUNDLE, this.packagerConnectionSettings.getDebugServerHost(), false, false, 24, null);
    }

    public String getDevServerSplitBundleURL(String jsModulePath) {
        AbstractC2855l.g(jsModulePath, "jsModulePath");
        return createSplitBundleURL(jsModulePath, this.packagerConnectionSettings.getDebugServerHost());
    }

    public String getSourceMapUrl(String mainModuleName) {
        AbstractC2855l.g(mainModuleName, "mainModuleName");
        return createBundleURL$default(this, mainModuleName, BundleType.MAP, null, false, false, 28, null);
    }

    public String getSourceUrl(String mainModuleName) {
        AbstractC2855l.g(mainModuleName, "mainModuleName");
        return createBundleURL$default(this, mainModuleName, BundleType.BUNDLE, null, false, false, 28, null);
    }

    public final String getWebsocketProxyURL() {
        return DevSupportHttpClient.INSTANCE.wsScheme$ReactAndroid_release(this.packagerConnectionSettings.getDebugServerHost()) + "://" + this.packagerConnectionSettings.getDebugServerHost() + "/debugger-proxy?role=client";
    }

    public void isPackagerRunning(PackagerStatusCallback callback) {
        AbstractC2855l.g(callback, "callback");
        this.packagerStatusCheck.run(this.packagerConnectionSettings.getDebugServerHost(), callback);
    }

    public final void openDebugger(final ReactContext context, final String errorMessage, String panel) {
        StringBuilder sb = new StringBuilder();
        kotlin.jvm.internal.H h10 = kotlin.jvm.internal.H.f29375a;
        String str = String.format(Locale.US, "%s://%s/open-debugger?device=%s", Arrays.copyOf(new Object[]{DevSupportHttpClient.INSTANCE.httpScheme$ReactAndroid_release(this.packagerConnectionSettings.getDebugServerHost()), this.packagerConnectionSettings.getDebugServerHost(), Uri.encode(getInspectorDeviceId())}, 3));
        AbstractC2855l.f(str, "format(...)");
        sb.append(str);
        if (panel != null) {
            sb.append("&panel=" + Uri.encode(panel));
        }
        B.a aVar = new B.a();
        String string = sb.toString();
        AbstractC2855l.f(string, "toString(...)");
        this.client.a(aVar.m(string).g("POST", e9.C.Companion.b(null, PointerEventHelper.POINTER_TYPE_UNKNOWN)).b()).t0(new InterfaceC2438f() { // from class: com.facebook.react.devsupport.DevServerHelper.openDebugger.1
            @Override // e9.InterfaceC2438f
            public void onFailure(InterfaceC2437e call, IOException e10) {
                AbstractC2855l.g(call, "call");
                AbstractC2855l.g(e10, "e");
                ReactContext reactContext = context;
                String str2 = errorMessage;
                if (str2 == null) {
                    str2 = "openDebugger error";
                }
                RNLog.w(reactContext, str2);
            }

            @Override // e9.InterfaceC2438f
            public void onResponse(InterfaceC2437e call, e9.D response) {
                AbstractC2855l.g(call, "call");
                AbstractC2855l.g(response, "response");
            }
        });
    }

    public final void openInspectorConnection() {
        if (this.inspectorPackagerConnection != null) {
            AbstractC2325a.I(ReactConstants.TAG, "Inspector connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.openInspectorConnection.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... params) {
                    AbstractC2855l.g(params, "params");
                    String str = AndroidInfoHelpers.getInspectorHostMetadata(DevServerHelper.this.applicationContext).get("deviceName");
                    if (str == null) {
                        AbstractC2325a.I(ReactConstants.TAG, "Could not get device name from Inspector Host Metadata.");
                        return null;
                    }
                    DevServerHelper devServerHelper = DevServerHelper.this;
                    CxxInspectorPackagerConnection cxxInspectorPackagerConnection = new CxxInspectorPackagerConnection(DevServerHelper.this.getInspectorDeviceUrl(), str, DevServerHelper.this.packageName);
                    cxxInspectorPackagerConnection.connect();
                    devServerHelper.inspectorPackagerConnection = cxxInspectorPackagerConnection;
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void openPackagerConnection(final String clientId, final PackagerCommandListener commandListener) {
        AbstractC2855l.g(commandListener, "commandListener");
        if (this.packagerClient != null) {
            AbstractC2325a.I(ReactConstants.TAG, "Packager connection already open, nooping.");
        } else {
            new AsyncTask<Void, Void, Void>() { // from class: com.facebook.react.devsupport.DevServerHelper.openPackagerConnection.1
                /* JADX INFO: Access modifiers changed from: protected */
                @Override // android.os.AsyncTask
                public Void doInBackground(Void... backgroundParams) {
                    AbstractC2855l.g(backgroundParams, "backgroundParams");
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    final PackagerCommandListener packagerCommandListener = commandListener;
                    linkedHashMap.put("reload", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$1
                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object params) {
                            packagerCommandListener.onPackagerReloadCommand();
                        }
                    });
                    final PackagerCommandListener packagerCommandListener2 = commandListener;
                    linkedHashMap.put("devMenu", new NotificationOnlyHandler() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$2
                        @Override // com.facebook.react.packagerconnection.NotificationOnlyHandler, com.facebook.react.packagerconnection.RequestHandler
                        public void onNotification(Object params) {
                            packagerCommandListener2.onPackagerDevMenuCommand();
                        }
                    });
                    Map<String, RequestHandler> mapCustomCommandHandlers = commandListener.customCommandHandlers();
                    if (mapCustomCommandHandlers != null) {
                        linkedHashMap.putAll(mapCustomCommandHandlers);
                    }
                    linkedHashMap.putAll(new FileIoHandler().handlers());
                    final PackagerCommandListener packagerCommandListener3 = commandListener;
                    ReconnectingWebSocket.ConnectionCallback connectionCallback = new ReconnectingWebSocket.ConnectionCallback() { // from class: com.facebook.react.devsupport.DevServerHelper$openPackagerConnection$1$doInBackground$onPackagerConnectedCallback$1
                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onConnected() {
                            packagerCommandListener3.onPackagerConnected();
                        }

                        @Override // com.facebook.react.packagerconnection.ReconnectingWebSocket.ConnectionCallback
                        public void onDisconnected() {
                            packagerCommandListener3.onPackagerDisconnected();
                        }
                    };
                    if (clientId == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    DevServerHelper devServerHelper = this;
                    JSPackagerClient jSPackagerClient = new JSPackagerClient(clientId, this.packagerConnectionSettings, linkedHashMap, connectionCallback);
                    jSPackagerClient.init();
                    devServerHelper.packagerClient = jSPackagerClient;
                    return null;
                }
            }.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Void[0]);
        }
    }

    public final void downloadBundleFromURL(DevBundleDownloadListener callback, File outputFile, String bundleURL, BundleDownloader.BundleInfo bundleInfo, B.a requestBuilder) {
        AbstractC2855l.g(callback, "callback");
        AbstractC2855l.g(outputFile, "outputFile");
        AbstractC2855l.g(requestBuilder, "requestBuilder");
        this.bundleDownloader.downloadBundleFromURL(callback, outputFile, bundleURL, bundleInfo, requestBuilder);
    }
}
