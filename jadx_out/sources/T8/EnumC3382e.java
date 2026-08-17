package t8;

import I7.l;
import com.facebook.react.views.text.TextAttributeProps;
import expo.modules.notifications.service.NotificationsService;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* JADX INFO: renamed from: t8.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
public enum EnumC3382e {
    BOOLEAN(l.f5080m, "boolean", "Z", "java.lang.Boolean"),
    CHAR(l.f5081n, "char", "C", "java.lang.Character"),
    BYTE(l.f5082o, "byte", "B", "java.lang.Byte"),
    SHORT(l.f5083p, "short", "S", "java.lang.Short"),
    INT(l.f5084q, "int", "I", "java.lang.Integer"),
    FLOAT(l.f5085r, "float", "F", "java.lang.Float"),
    LONG(l.f5086s, "long", "J", "java.lang.Long"),
    DOUBLE(l.f5087t, "double", "D", "java.lang.Double");


    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final Map f32537s = new HashMap();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final Map f32538t = new EnumMap(l.class);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final Map f32539u = new HashMap();

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final Set f32540v = new HashSet();

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final Map f32541w = new HashMap();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final l f32543g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final String f32544h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final String f32545i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final k8.c f32546j;

    static {
        for (EnumC3382e enumC3382e : values()) {
            f32537s.put(enumC3382e.p(), enumC3382e);
            f32538t.put(enumC3382e.q(), enumC3382e);
            f32539u.put(enumC3382e.m(), enumC3382e);
            String strReplace = enumC3382e.f32546j.b().replace('.', '/');
            f32540v.add(strReplace);
            f32541w.put(strReplace, "(" + enumC3382e.f32545i + ")L" + strReplace + ";");
        }
    }

    EnumC3382e(l lVar, String str, String str2, String str3) {
        if (lVar == null) {
            h(8);
        }
        if (str == null) {
            h(9);
        }
        if (str2 == null) {
            h(10);
        }
        if (str3 == null) {
            h(11);
        }
        this.f32543g = lVar;
        this.f32544h = str;
        this.f32545i = str2;
        this.f32546j = new k8.c(str3);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x000c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static /* synthetic */ void h(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    break;
                default:
                    str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                    break;
            }
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    i11 = 2;
                    break;
                default:
                    i11 = 3;
                    break;
            }
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "methodDescriptor";
                break;
            case 3:
            case 9:
                objArr[0] = "name";
                break;
            case 4:
            case 6:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                break;
            case 5:
                objArr[0] = NotificationsService.EVENT_TYPE_KEY;
                break;
            case 7:
            case 10:
                objArr[0] = "desc";
                break;
            case 8:
                objArr[0] = "primitiveType";
                break;
            case 11:
                objArr[0] = "wrapperClassName";
                break;
            default:
                objArr[0] = "internalName";
                break;
        }
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                    objArr[1] = "getPrimitiveType";
                    break;
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                    objArr[1] = "getJavaKeywordName";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                    objArr[1] = "getDesc";
                    break;
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    objArr[1] = "getWrapperFqName";
                    break;
                default:
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/jvm/JvmPrimitiveType";
                    break;
            }
        } else {
            objArr[1] = "get";
        }
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "isBoxingMethodDescriptor";
                break;
            case 3:
            case 5:
                objArr[2] = "get";
                break;
            case 4:
            case 6:
            case 12:
            case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
            case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                break;
            case 7:
                objArr[2] = "getByDesc";
                break;
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[2] = "<init>";
                break;
            default:
                objArr[2] = "isWrapperClassInternalName";
                break;
        }
        String str2 = String.format(str, objArr);
        if (i10 != 4 && i10 != 6) {
            switch (i10) {
                case 12:
                case TextAttributeProps.TA_KEY_BEST_WRITING_DIRECTION /* 13 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_COLOR /* 14 */:
                case TextAttributeProps.TA_KEY_TEXT_DECORATION_LINE /* 15 */:
                    break;
                default:
                    throw new IllegalArgumentException(str2);
            }
        }
        throw new IllegalStateException(str2);
    }

    public static EnumC3382e j(l lVar) {
        if (lVar == null) {
            h(5);
        }
        EnumC3382e enumC3382e = (EnumC3382e) f32538t.get(lVar);
        if (enumC3382e == null) {
            h(6);
        }
        return enumC3382e;
    }

    public static EnumC3382e k(String str) {
        if (str == null) {
            h(3);
        }
        EnumC3382e enumC3382e = (EnumC3382e) f32537s.get(str);
        if (enumC3382e != null) {
            return enumC3382e;
        }
        throw new AssertionError("Non-primitive type name passed: " + str);
    }

    public String m() {
        String str = this.f32545i;
        if (str == null) {
            h(14);
        }
        return str;
    }

    public String p() {
        String str = this.f32544h;
        if (str == null) {
            h(13);
        }
        return str;
    }

    public l q() {
        l lVar = this.f32543g;
        if (lVar == null) {
            h(12);
        }
        return lVar;
    }

    public k8.c r() {
        k8.c cVar = this.f32546j;
        if (cVar == null) {
            h(15);
        }
        return cVar;
    }
}
