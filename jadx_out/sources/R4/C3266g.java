package r4;

import com.facebook.react.uimanager.events.PointerEventHelper;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: r4.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes.dex */
public class C3266g {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C3263d f31925b = new C3263d("LibraryVersion", PointerEventHelper.POINTER_TYPE_UNKNOWN);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C3266g f31926c = new C3266g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f31927a = new ConcurrentHashMap();

    protected C3266g() {
    }

    public static C3266g a() {
        return f31926c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v7 */
    /* JADX WARN: Type inference failed for: r7v0 */
    public String b(String str) throws Throwable {
        ?? r42;
        InputStream resourceAsStream;
        AbstractC3268i.f(str, "Please provide a valid libraryName");
        if (this.f31927a.containsKey(str)) {
            return (String) this.f31927a.get(str);
        }
        Properties properties = new Properties();
        ?? r32 = 0;
        r32 = 0;
        r32 = 0;
        InputStream inputStream = null;
        try {
            try {
                resourceAsStream = C3266g.class.getResourceAsStream(String.format("/%s.properties", str));
            } catch (Throwable th) {
                th = th;
            }
        } catch (IOException e10) {
            e = e10;
            r42 = 0;
        }
        try {
            if (resourceAsStream != null) {
                properties.load(resourceAsStream);
                String property = properties.getProperty("version", null);
                f31925b.e("LibraryVersion", str + " version is " + property);
                r32 = property;
            } else {
                f31925b.f("LibraryVersion", "Failed to get app version for libraryName: " + str);
            }
        } catch (IOException e11) {
            e = e11;
            r42 = r32;
            inputStream = resourceAsStream;
            f31925b.d("LibraryVersion", "Failed to get app version for libraryName: " + str, e);
            ?? r72 = r42;
            resourceAsStream = inputStream;
            r32 = r72;
        } catch (Throwable th2) {
            th = th2;
            r32 = resourceAsStream;
            if (r32 != 0) {
                y4.i.a(r32);
            }
            throw th;
        }
        if (resourceAsStream != null) {
            y4.i.a(resourceAsStream);
        }
        if (r32 == 0) {
            f31925b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
            r32 = "UNKNOWN";
        }
        this.f31927a.put(str, r32);
        return r32;
    }
}
