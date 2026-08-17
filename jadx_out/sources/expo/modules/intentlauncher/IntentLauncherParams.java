package expo.modules.intentlauncher;

import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.kotlin.records.Field;
import expo.modules.kotlin.records.Record;
import expo.modules.notifications.service.NotificationsService;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b!\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BY\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010&\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u001cJ\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003Jn\u0010)\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010.\u001a\u00020\nHÖ\u0001J\t\u0010/\u001a\u00020\u0003HÖ\u0001R\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0010\u001a\u0004\b\u0014\u0010\u0012R*\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0015\u0010\u0010\u001a\u0004\b\u0016\u0010\u0017R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0010\u001a\u0004\b\u0019\u0010\u0012R \u0010\t\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\u0010\n\u0002\u0010\u001d\u0012\u0004\b\u001a\u0010\u0010\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0010\u001a\u0004\b\u001f\u0010\u0012R\u001e\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0010\u001a\u0004\b!\u0010\u0012¨\u00060"}, d2 = {"Lexpo/modules/intentlauncher/IntentLauncherParams;", "Lexpo/modules/kotlin/records/Record;", NotificationsService.EVENT_TYPE_KEY, PointerEventHelper.POINTER_TYPE_UNKNOWN, "category", "extra", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "data", "flags", PointerEventHelper.POINTER_TYPE_UNKNOWN, "packageName", "className", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)V", "getType$annotations", "()V", "getType", "()Ljava/lang/String;", "getCategory$annotations", "getCategory", "getExtra$annotations", "getExtra", "()Ljava/util/Map;", "getData$annotations", "getData", "getFlags$annotations", "getFlags", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getPackageName$annotations", "getPackageName", "getClassName$annotations", "getClassName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/intentlauncher/IntentLauncherParams;", "equals", PointerEventHelper.POINTER_TYPE_UNKNOWN, "other", "hashCode", "toString", "expo-intent-launcher_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final /* data */ class IntentLauncherParams implements Record {
    private final String category;
    private final String className;
    private final String data;
    private final Map<String, Object> extra;
    private final Integer flags;
    private final String packageName;
    private final String type;

    public IntentLauncherParams(String str, String str2, Map<String, ? extends Object> map, String str3, Integer num, String str4, String str5) {
        this.type = str;
        this.category = str2;
        this.extra = map;
        this.data = str3;
        this.flags = num;
        this.packageName = str4;
        this.className = str5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ IntentLauncherParams copy$default(IntentLauncherParams intentLauncherParams, String str, String str2, Map map, String str3, Integer num, String str4, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = intentLauncherParams.type;
        }
        if ((i10 & 2) != 0) {
            str2 = intentLauncherParams.category;
        }
        if ((i10 & 4) != 0) {
            map = intentLauncherParams.extra;
        }
        if ((i10 & 8) != 0) {
            str3 = intentLauncherParams.data;
        }
        if ((i10 & 16) != 0) {
            num = intentLauncherParams.flags;
        }
        if ((i10 & 32) != 0) {
            str4 = intentLauncherParams.packageName;
        }
        if ((i10 & 64) != 0) {
            str5 = intentLauncherParams.className;
        }
        String str6 = str4;
        String str7 = str5;
        Integer num2 = num;
        Map map2 = map;
        return intentLauncherParams.copy(str, str2, map2, str3, num2, str6, str7);
    }

    /* JADX INFO: renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* JADX INFO: renamed from: component2, reason: from getter */
    public final String getCategory() {
        return this.category;
    }

    public final Map<String, Object> component3() {
        return this.extra;
    }

    /* JADX INFO: renamed from: component4, reason: from getter */
    public final String getData() {
        return this.data;
    }

    /* JADX INFO: renamed from: component5, reason: from getter */
    public final Integer getFlags() {
        return this.flags;
    }

    /* JADX INFO: renamed from: component6, reason: from getter */
    public final String getPackageName() {
        return this.packageName;
    }

    /* JADX INFO: renamed from: component7, reason: from getter */
    public final String getClassName() {
        return this.className;
    }

    public final IntentLauncherParams copy(String type, String category, Map<String, ? extends Object> extra, String data, Integer flags, String packageName, String className) {
        return new IntentLauncherParams(type, category, extra, data, flags, packageName, className);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IntentLauncherParams)) {
            return false;
        }
        IntentLauncherParams intentLauncherParams = (IntentLauncherParams) other;
        return AbstractC2855l.b(this.type, intentLauncherParams.type) && AbstractC2855l.b(this.category, intentLauncherParams.category) && AbstractC2855l.b(this.extra, intentLauncherParams.extra) && AbstractC2855l.b(this.data, intentLauncherParams.data) && AbstractC2855l.b(this.flags, intentLauncherParams.flags) && AbstractC2855l.b(this.packageName, intentLauncherParams.packageName) && AbstractC2855l.b(this.className, intentLauncherParams.className);
    }

    public final String getCategory() {
        return this.category;
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getData() {
        return this.data;
    }

    public final Map<String, Object> getExtra() {
        return this.extra;
    }

    public final Integer getFlags() {
        return this.flags;
    }

    public final String getPackageName() {
        return this.packageName;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.category;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Map<String, Object> map = this.extra;
        int iHashCode3 = (iHashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.data;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.flags;
        int iHashCode5 = (iHashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        String str4 = this.packageName;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.className;
        return iHashCode6 + (str5 != null ? str5.hashCode() : 0);
    }

    public String toString() {
        return "IntentLauncherParams(type=" + this.type + ", category=" + this.category + ", extra=" + this.extra + ", data=" + this.data + ", flags=" + this.flags + ", packageName=" + this.packageName + ", className=" + this.className + ")";
    }

    @Field
    public static /* synthetic */ void getCategory$annotations() {
    }

    @Field
    public static /* synthetic */ void getClassName$annotations() {
    }

    @Field
    public static /* synthetic */ void getData$annotations() {
    }

    @Field
    public static /* synthetic */ void getExtra$annotations() {
    }

    @Field
    public static /* synthetic */ void getFlags$annotations() {
    }

    @Field
    public static /* synthetic */ void getPackageName$annotations() {
    }

    @Field
    public static /* synthetic */ void getType$annotations() {
    }
}
