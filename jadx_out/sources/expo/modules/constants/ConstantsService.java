package expo.modules.constants;

import P8.C1385d;
import android.content.Context;
import android.os.Build;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.interfaces.constants.ConstantsInterface;
import expo.modules.kotlin.services.ServiceInterface;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p7.AbstractC3083a;
import t7.AbstractC3376c;
import t7.u;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@ServiceInterface(clazz = ConstantsInterface.class)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\f\n\u0002\u0010 \n\u0002\b\u0007\b\u0017\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0004\u0018\u00010\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\tR\u0014\u0010\u001a\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0016\u0010 \u001a\u0004\u0018\u00010\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b!\u0010\u0015¨\u0006$"}, d2 = {"Lexpo/modules/constants/ConstantsService;", "Lexpo/modules/interfaces/constants/ConstantsInterface;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "statusBarHeightInternal", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getStatusBarHeightInternal", "()I", "setStatusBarHeightInternal", "(I)V", "sessionId", PointerEventHelper.POINTER_TYPE_UNKNOWN, "constants", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "getConstants", "()Ljava/util/Map;", "appScopeKey", "getAppScopeKey", "()Ljava/lang/String;", "deviceName", "getDeviceName", "statusBarHeight", "getStatusBarHeight", "systemVersion", "getSystemVersion", "systemFonts", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getSystemFonts", "()Ljava/util/List;", "appConfig", "getAppConfig", "ExecutionEnvironment", "Companion", "expo-constants_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public class ConstantsService implements ConstantsInterface {

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final Context context;
    private final String sessionId;
    private int statusBarHeightInternal;

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\n"}, d2 = {"Lexpo/modules/constants/ConstantsService$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "convertPixelsToDp", PointerEventHelper.POINTER_TYPE_UNKNOWN, "px", PointerEventHelper.POINTER_TYPE_UNKNOWN, "context", "Landroid/content/Context;", "expo-constants_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int convertPixelsToDp(float px, Context context) {
            return (int) (px / (context.getResources().getDisplayMetrics().densityDpi / 160.0f));
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lexpo/modules/constants/ConstantsService$ExecutionEnvironment;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "string", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "getString", "()Ljava/lang/String;", "BARE", "STANDALONE", "STORE_CLIENT", "expo-constants_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class ExecutionEnvironment {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ExecutionEnvironment[] $VALUES;
        public static final ExecutionEnvironment BARE = new ExecutionEnvironment("BARE", 0, "bare");
        public static final ExecutionEnvironment STANDALONE = new ExecutionEnvironment("STANDALONE", 1, "standalone");
        public static final ExecutionEnvironment STORE_CLIENT = new ExecutionEnvironment("STORE_CLIENT", 2, "storeClient");
        private final String string;

        private static final /* synthetic */ ExecutionEnvironment[] $values() {
            return new ExecutionEnvironment[]{BARE, STANDALONE, STORE_CLIENT};
        }

        static {
            ExecutionEnvironment[] executionEnvironmentArr$values = $values();
            $VALUES = executionEnvironmentArr$values;
            $ENTRIES = AbstractC3083a.a(executionEnvironmentArr$values);
        }

        private ExecutionEnvironment(String str, int i10, String str2) {
            this.string = str2;
        }

        public static EnumEntries getEntries() {
            return $ENTRIES;
        }

        public static ExecutionEnvironment valueOf(String str) {
            return (ExecutionEnvironment) Enum.valueOf(ExecutionEnvironment.class, str);
        }

        public static ExecutionEnvironment[] values() {
            return (ExecutionEnvironment[]) $VALUES.clone();
        }

        public final String getString() {
            return this.string;
        }
    }

    public ConstantsService(Context context) {
        AbstractC2855l.g(context, "context");
        this.context = context;
        Integer numValueOf = Integer.valueOf(context.getResources().getIdentifier("status_bar_height", "dimen", "android"));
        this.statusBarHeightInternal = (numValueOf.intValue() <= 0 ? null : numValueOf) != null ? INSTANCE.convertPixelsToDp(context.getResources().getDimensionPixelSize(r0.intValue()), context) : 0;
        String string = UUID.randomUUID().toString();
        AbstractC2855l.f(string, "toString(...)");
        this.sessionId = string;
    }

    private final String getAppConfig() {
        try {
            InputStream inputStreamOpen = this.context.getAssets().open("app.config");
            try {
                AbstractC2855l.d(inputStreamOpen);
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStreamOpen, C1385d.f8858b), 8192);
                try {
                    String strE = u.e(bufferedReader);
                    AbstractC3376c.a(bufferedReader, null);
                    AbstractC3376c.a(inputStreamOpen, null);
                    return strE;
                } finally {
                }
            } finally {
            }
        } catch (FileNotFoundException unused) {
            return null;
        } catch (Exception unused2) {
            String unused3 = ConstantsServiceKt.TAG;
            return null;
        }
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public String getAppScopeKey() {
        return this.context.getPackageName();
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public Map<String, Object> getConstants() {
        return K.l(t.a("sessionId", this.sessionId), t.a("executionEnvironment", ExecutionEnvironment.BARE.getString()), t.a("statusBarHeight", Integer.valueOf(this.statusBarHeightInternal)), t.a("deviceName", getDeviceName()), t.a("systemFonts", getSystemFonts()), t.a("systemVersion", getSystemVersion()), t.a("manifest", getAppConfig()), t.a("platform", K.f(t.a("android", K.i()))));
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public String getDeviceName() {
        String MODEL = Build.MODEL;
        AbstractC2855l.f(MODEL, "MODEL");
        return MODEL;
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    /* JADX INFO: renamed from: getStatusBarHeight, reason: from getter */
    public int getStatusBarHeightInternal() {
        return this.statusBarHeightInternal;
    }

    public final int getStatusBarHeightInternal() {
        return this.statusBarHeightInternal;
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public List<String> getSystemFonts() {
        return AbstractC2800q.m("normal", "notoserif", "sans-serif", "sans-serif-light", "sans-serif-thin", "sans-serif-condensed", "sans-serif-medium", "serif", "Roboto", "monospace");
    }

    @Override // expo.modules.interfaces.constants.ConstantsInterface
    public String getSystemVersion() {
        String RELEASE = Build.VERSION.RELEASE;
        AbstractC2855l.f(RELEASE, "RELEASE");
        return RELEASE;
    }

    public final void setStatusBarHeightInternal(int i10) {
        this.statusBarHeightInternal = i10;
    }
}
