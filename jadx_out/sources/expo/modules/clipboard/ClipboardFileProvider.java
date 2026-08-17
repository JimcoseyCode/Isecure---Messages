package expo.modules.clipboard;

import P8.q;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.XmlResourceParser;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import android.os.Environment;
import android.os.ParcelFileDescriptor;
import android.text.TextUtils;
import android.webkit.MimeTypeMap;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.fabric.mounting.mountitems.IntBufferBatchMountItem;
import com.facebook.react.uimanager.events.PointerEventHelper;
import i7.C2735B;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC2855l;
import kotlin.jvm.internal.C;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 -2\u00020\u0001:\u0003-./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\f\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012JO\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020\u000e2\u0010\u0010\u0014\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u00132\b\u0010\u0017\u001a\u0004\u0018\u00010\u0010H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ!\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ=\u0010 \u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u0013H\u0016¢\u0006\u0004\b \u0010!J3\u0010\"\u001a\u00020\u001f2\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0015\u001a\u0004\u0018\u00010\u00102\u0010\u0010\u0016\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0010\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\"\u0010#J!\u0010&\u001a\u0004\u0018\u00010%2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010$\u001a\u00020\u0010H\u0016¢\u0006\u0004\b&\u0010'R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00100\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0016\u0010+\u001a\u00020*8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b+\u0010,¨\u00060"}, d2 = {"Lexpo/modules/clipboard/ClipboardFileProvider;", "Landroid/content/ContentProvider;", "<init>", "()V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "onCreate", "()Z", "Landroid/content/Context;", "context", "Landroid/content/pm/ProviderInfo;", "info", "Li7/B;", "attachInfo", "(Landroid/content/Context;Landroid/content/pm/ProviderInfo;)V", "Landroid/net/Uri;", "uri", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getType", "(Landroid/net/Uri;)Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "projection", "selection", "selectionArgs", "sortOrder", "Landroid/database/Cursor;", "query", "(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor;", "Landroid/content/ContentValues;", "values", "insert", "(Landroid/net/Uri;Landroid/content/ContentValues;)Landroid/net/Uri;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "update", "(Landroid/net/Uri;Landroid/content/ContentValues;Ljava/lang/String;[Ljava/lang/String;)I", "delete", "(Landroid/net/Uri;Ljava/lang/String;[Ljava/lang/String;)I", "mode", "Landroid/os/ParcelFileDescriptor;", "openFile", "(Landroid/net/Uri;Ljava/lang/String;)Landroid/os/ParcelFileDescriptor;", "defaultProjectionColumns", "[Ljava/lang/String;", "Lexpo/modules/clipboard/ClipboardFileProvider$PathStrategy;", "strategy", "Lexpo/modules/clipboard/ClipboardFileProvider$PathStrategy;", "Companion", "PathStrategy", "SimplePathStrategy", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class ClipboardFileProvider extends ContentProvider {
    private static final String ATTR_NAME = "name";
    private static final String ATTR_PATH = "path";
    private static final String META_DATA_FILE_PROVIDER_PATHS = "expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS";
    private static final String TAG_CACHE_PATH = "cache-path";
    private static final String TAG_EXTERNAL = "external-path";
    private static final String TAG_EXTERNAL_CACHE = "external-cache-path";
    private static final String TAG_EXTERNAL_FILES = "external-files-path";
    private static final String TAG_FILES_PATH = "files-path";
    private static final String TAG_ROOT_PATH = "root-path";
    private final String[] defaultProjectionColumns = {"_display_name", "_size"};
    private PathStrategy strategy;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final File DEVICE_ROOT = new File("/");
    private static final HashMap<String, PathStrategy> cache = new HashMap<>();

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u000fJ\u001d\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0000¢\u0006\u0002\b\u001bJ\u0018\u0010\u001c\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0005H\u0002J\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0017H\u0002J-\u0010\u001f\u001a\u00020\u000f2\u0006\u0010 \u001a\u00020\u000f2\u0016\u0010!\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00050\"\"\u0004\u0018\u00010\u0005H\u0002¢\u0006\u0002\u0010#R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R*\u0010\u0010\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0011j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lexpo/modules/clipboard/ClipboardFileProvider$Companion;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "<init>", "()V", "META_DATA_FILE_PROVIDER_PATHS", PointerEventHelper.POINTER_TYPE_UNKNOWN, "TAG_ROOT_PATH", "TAG_FILES_PATH", "TAG_CACHE_PATH", "TAG_EXTERNAL", "TAG_EXTERNAL_FILES", "TAG_EXTERNAL_CACHE", "ATTR_NAME", "ATTR_PATH", "DEVICE_ROOT", "Ljava/io/File;", "cache", "Ljava/util/HashMap;", "Lexpo/modules/clipboard/ClipboardFileProvider$PathStrategy;", "Lkotlin/collections/HashMap;", "getUriForFile", "Landroid/net/Uri;", "context", "Landroid/content/Context;", "authority", "file", "getPathStrategy", "getPathStrategy$expo_clipboard_release", "parsePathStrategy", "targetFileFromTag", "tag", "buildPath", Constants.SENSITIVITY_BASE, "segments", PointerEventHelper.POINTER_TYPE_UNKNOWN, "(Ljava/io/File;[Ljava/lang/String;)Ljava/io/File;", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final File buildPath(File base, String... segments) {
            for (String str : segments) {
                if (str != null) {
                    base = new File(base, str);
                }
            }
            return base;
        }

        private final PathStrategy parsePathStrategy(Context context, String authority) throws XmlPullParserException, IOException {
            SimplePathStrategy simplePathStrategy = new SimplePathStrategy(authority);
            PackageManager packageManager = context.getPackageManager();
            ProviderInfo providerInfoResolveContentProvider = packageManager.resolveContentProvider(authority, IntBufferBatchMountItem.INSTRUCTION_UPDATE_LAYOUT);
            if (providerInfoResolveContentProvider == null) {
                throw new IllegalArgumentException("Couldn't find meta-data for provider with authority " + authority);
            }
            XmlResourceParser xmlResourceParserLoadXmlMetaData = providerInfoResolveContentProvider.loadXmlMetaData(packageManager, ClipboardFileProvider.META_DATA_FILE_PROVIDER_PATHS);
            if (xmlResourceParserLoadXmlMetaData == null) {
                throw new IllegalArgumentException("Missing expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS meta-data");
            }
            while (true) {
                int next = xmlResourceParserLoadXmlMetaData.next();
                if (next == 1) {
                    return simplePathStrategy;
                }
                if (next == 2) {
                    String name = xmlResourceParserLoadXmlMetaData.getName();
                    AbstractC2855l.d(name);
                    File fileTargetFileFromTag = targetFileFromTag(name, context);
                    if (fileTargetFileFromTag != null) {
                        simplePathStrategy.addRoot(xmlResourceParserLoadXmlMetaData.getAttributeValue(null, "name"), ClipboardFileProvider.INSTANCE.buildPath(fileTargetFileFromTag, xmlResourceParserLoadXmlMetaData.getAttributeValue(null, ClipboardFileProvider.ATTR_PATH)));
                    }
                }
            }
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
        private final File targetFileFromTag(String tag, Context context) {
            switch (tag.hashCode()) {
                case -1642807877:
                    if (tag.equals(ClipboardFileProvider.TAG_FILES_PATH)) {
                        return context.getFilesDir();
                    }
                    return null;
                case -1360690478:
                    if (tag.equals(ClipboardFileProvider.TAG_EXTERNAL_CACHE)) {
                        File[] externalCacheDirs = context.getExternalCacheDirs();
                        AbstractC2855l.f(externalCacheDirs, "getExternalCacheDirs(...)");
                        if (externalCacheDirs.length == 0) {
                            externalCacheDirs = null;
                        }
                        if (externalCacheDirs != null) {
                            return externalCacheDirs[0];
                        }
                        return null;
                    }
                    return null;
                case -913292752:
                    if (tag.equals(ClipboardFileProvider.TAG_ROOT_PATH)) {
                        return ClipboardFileProvider.DEVICE_ROOT;
                    }
                    return null;
                case -50149145:
                    if (tag.equals(ClipboardFileProvider.TAG_EXTERNAL)) {
                        return Environment.getExternalStorageDirectory();
                    }
                    return null;
                case -17221744:
                    if (tag.equals(ClipboardFileProvider.TAG_CACHE_PATH)) {
                        return context.getCacheDir();
                    }
                    return null;
                case 1308690685:
                    if (tag.equals(ClipboardFileProvider.TAG_EXTERNAL_FILES)) {
                        File[] externalFilesDirs = context.getExternalFilesDirs(null);
                        AbstractC2855l.f(externalFilesDirs, "getExternalFilesDirs(...)");
                        if (externalFilesDirs.length == 0) {
                            externalFilesDirs = null;
                        }
                        if (externalFilesDirs != null) {
                            return externalFilesDirs[0];
                        }
                        return null;
                    }
                    return null;
                default:
                    return null;
            }
        }

        public final PathStrategy getPathStrategy$expo_clipboard_release(Context context, String authority) {
            PathStrategy pathStrategy;
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(authority, "authority");
            C c10 = new C();
            synchronized (ClipboardFileProvider.cache) {
                try {
                    pathStrategy = (PathStrategy) ClipboardFileProvider.cache.get(authority);
                    if (pathStrategy == null) {
                        try {
                            c10.f29371g = ClipboardFileProvider.INSTANCE.parsePathStrategy(context, authority);
                            ClipboardFileProvider.cache.put(authority, c10.f29371g);
                            pathStrategy = (PathStrategy) c10.f29371g;
                        } catch (IOException e10) {
                            throw new IllegalArgumentException("Failed to parse expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS meta-data", e10);
                        } catch (XmlPullParserException e11) {
                            throw new IllegalArgumentException("Failed to parse expo.modules.clipboard.CLIPBOARD_FILE_PROVIDER_PATHS meta-data", e11);
                        }
                    }
                    c10.f29371g = pathStrategy;
                    C2735B c2735b = C2735B.f28704a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return pathStrategy;
        }

        public final Uri getUriForFile(Context context, String authority, File file) {
            AbstractC2855l.g(context, "context");
            AbstractC2855l.g(authority, "authority");
            AbstractC2855l.g(file, "file");
            return getPathStrategy$expo_clipboard_release(context, authority).getUriForFile(file);
        }

        private Companion() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, d2 = {"Lexpo/modules/clipboard/ClipboardFileProvider$PathStrategy;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getUriForFile", "Landroid/net/Uri;", "file", "Ljava/io/File;", "getFileForUri", "uri", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public interface PathStrategy {
        File getFileForUri(Uri uri);

        Uri getUriForFile(File file);
    }

    /* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001f\u0010\n\u001a\u00020\t2\b\u0010\u0006\u001a\u0004\u0018\u00010\u00022\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0010\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R0\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0014j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0007`\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lexpo/modules/clipboard/ClipboardFileProvider$SimplePathStrategy;", "Lexpo/modules/clipboard/ClipboardFileProvider$PathStrategy;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "authority", "<init>", "(Ljava/lang/String;)V", "name", "Ljava/io/File;", "root", "Li7/B;", "addRoot", "(Ljava/lang/String;Ljava/io/File;)V", "file", "Landroid/net/Uri;", "getUriForFile", "(Ljava/io/File;)Landroid/net/Uri;", "uri", "getFileForUri", "(Landroid/net/Uri;)Ljava/io/File;", "Ljava/lang/String;", "Ljava/util/HashMap;", "Lkotlin/collections/HashMap;", "roots", "Ljava/util/HashMap;", "expo-clipboard_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class SimplePathStrategy implements PathStrategy {
        private final String authority;
        private final HashMap<String, File> roots;

        public SimplePathStrategy(String authority) {
            AbstractC2855l.g(authority, "authority");
            this.authority = authority;
            this.roots = new HashMap<>();
        }

        public final void addRoot(String name, File root) {
            AbstractC2855l.g(root, "root");
            if (name == null || TextUtils.isEmpty(name)) {
                throw new IllegalArgumentException("Name must not be empty");
            }
            try {
                this.roots.put(name, root.getCanonicalFile());
            } catch (IOException e10) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + root, e10);
            }
        }

        @Override // expo.modules.clipboard.ClipboardFileProvider.PathStrategy
        public File getFileForUri(Uri uri) {
            AbstractC2855l.g(uri, "uri");
            String encodedPath = uri.getEncodedPath();
            AbstractC2855l.d(encodedPath);
            int iC0 = q.c0(encodedPath, '/', 1, false, 4, null);
            String strSubstring = encodedPath.substring(1, iC0);
            AbstractC2855l.f(strSubstring, "substring(...)");
            String strDecode = Uri.decode(strSubstring);
            String strSubstring2 = encodedPath.substring(iC0 + 1);
            AbstractC2855l.f(strSubstring2, "substring(...)");
            String strDecode2 = Uri.decode(strSubstring2);
            AbstractC2855l.f(strDecode2, "decode(...)");
            File file = this.roots.get(strDecode);
            if (file == null) {
                throw new IllegalArgumentException("Unable to find configured root for " + uri);
            }
            File file2 = new File(file, strDecode2);
            try {
                File canonicalFile = file2.getCanonicalFile();
                AbstractC2855l.d(canonicalFile);
                if (t7.j.C(canonicalFile, file)) {
                    return canonicalFile;
                }
                throw new SecurityException("Resolved path jumped beyond configured root");
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file2);
            }
        }

        @Override // expo.modules.clipboard.ClipboardFileProvider.PathStrategy
        public Uri getUriForFile(File file) {
            String strSubstring;
            AbstractC2855l.g(file, "file");
            try {
                String canonicalPath = file.getCanonicalPath();
                AbstractC2855l.d(canonicalPath);
                Map.Entry<String, File> entry = null;
                for (Map.Entry<String, File> entry2 : this.roots.entrySet()) {
                    AbstractC2855l.f(entry2, "next(...)");
                    Map.Entry<String, File> entry3 = entry2;
                    String path = entry3.getValue().getPath();
                    AbstractC2855l.d(path);
                    if (q.K(canonicalPath, path, false, 2, null) && (entry == null || path.length() > entry.getValue().getPath().length())) {
                        entry = entry3;
                    }
                }
                if (entry == null) {
                    throw new IllegalArgumentException(("Failed to find configured root that contains " + ((Object) canonicalPath)).toString());
                }
                String path2 = entry.getValue().getPath();
                AbstractC2855l.d(path2);
                if (q.w(path2, "/", false, 2, null)) {
                    strSubstring = canonicalPath.substring(path2.length());
                    AbstractC2855l.f(strSubstring, "substring(...)");
                } else {
                    strSubstring = canonicalPath.substring(path2.length() + 1);
                    AbstractC2855l.f(strSubstring, "substring(...)");
                }
                return new Uri.Builder().scheme("content").authority(this.authority).encodedPath(Uri.encode(entry.getKey()) + "/" + Uri.encode(strSubstring, "/")).build();
            } catch (IOException unused) {
                throw new IllegalArgumentException("Failed to resolve canonical path for " + file);
            }
        }
    }

    @Override // android.content.ContentProvider
    public void attachInfo(Context context, ProviderInfo info) {
        AbstractC2855l.g(context, "context");
        AbstractC2855l.g(info, "info");
        super.attachInfo(context, info);
        if (!info.exported) {
            throw new AssertionError("ClipboardFileProvider must be exported");
        }
        Companion companion = INSTANCE;
        String authority = info.authority;
        AbstractC2855l.f(authority, "authority");
        this.strategy = companion.getPathStrategy$expo_clipboard_release(context, authority);
    }

    @Override // android.content.ContentProvider
    public int delete(Uri uri, String selection, String[] selectionArgs) {
        AbstractC2855l.g(uri, "uri");
        throw new UnsupportedOperationException("This is a read-only provider");
    }

    @Override // android.content.ContentProvider
    public String getType(Uri uri) {
        AbstractC2855l.g(uri, "uri");
        PathStrategy pathStrategy = this.strategy;
        if (pathStrategy == null) {
            AbstractC2855l.y("strategy");
            pathStrategy = null;
        }
        File fileForUri = pathStrategy.getFileForUri(uri);
        String name = fileForUri.getName();
        AbstractC2855l.f(name, "getName(...)");
        int iI0 = q.i0(name, '.', 0, false, 6, null);
        if (iI0 < 0) {
            return "application/octet-stream";
        }
        String name2 = fileForUri.getName();
        AbstractC2855l.f(name2, "getName(...)");
        String strSubstring = name2.substring(iI0 + 1);
        AbstractC2855l.f(strSubstring, "substring(...)");
        String mimeTypeFromExtension = MimeTypeMap.getSingleton().getMimeTypeFromExtension(strSubstring);
        return mimeTypeFromExtension != null ? mimeTypeFromExtension : "application/octet-stream";
    }

    @Override // android.content.ContentProvider
    public Uri insert(Uri uri, ContentValues values) {
        AbstractC2855l.g(uri, "uri");
        throw new UnsupportedOperationException("This is a read-only provider");
    }

    @Override // android.content.ContentProvider
    public boolean onCreate() {
        return true;
    }

    @Override // android.content.ContentProvider
    public ParcelFileDescriptor openFile(Uri uri, String mode) throws FileNotFoundException {
        AbstractC2855l.g(uri, "uri");
        AbstractC2855l.g(mode, "mode");
        if (!AbstractC2855l.b("r", mode)) {
            throw new IllegalArgumentException("mode must be \"r\"");
        }
        PathStrategy pathStrategy = this.strategy;
        if (pathStrategy == null) {
            AbstractC2855l.y("strategy");
            pathStrategy = null;
        }
        return ParcelFileDescriptor.open(pathStrategy.getFileForUri(uri), 268435456);
    }

    @Override // android.content.ContentProvider
    public Cursor query(Uri uri, String[] projection, String selection, String[] selectionArgs, String sortOrder) {
        int i10;
        AbstractC2855l.g(uri, "uri");
        if (projection == null) {
            projection = this.defaultProjectionColumns;
        }
        PathStrategy pathStrategy = this.strategy;
        if (pathStrategy == null) {
            AbstractC2855l.y("strategy");
            pathStrategy = null;
        }
        File fileForUri = pathStrategy.getFileForUri(uri);
        String[] strArr = new String[projection.length];
        Object[] objArr = new Object[projection.length];
        int i11 = 0;
        for (String str : projection) {
            if (AbstractC2855l.b(str, "_display_name")) {
                strArr[i11] = "_display_name";
                i10 = i11 + 1;
                objArr[i11] = fileForUri.getName();
            } else if (AbstractC2855l.b(str, "_size")) {
                strArr[i11] = "_size";
                i10 = i11 + 1;
                objArr[i11] = Long.valueOf(fileForUri.length());
            }
            i11 = i10;
        }
        Object[] objArrCopyOf = Arrays.copyOf(strArr, i11);
        AbstractC2855l.f(objArrCopyOf, "copyOf(...)");
        Object[] objArrCopyOf2 = Arrays.copyOf(objArr, i11);
        AbstractC2855l.f(objArrCopyOf2, "copyOf(...)");
        MatrixCursor matrixCursor = new MatrixCursor((String[]) objArrCopyOf, 1);
        matrixCursor.addRow(objArrCopyOf2);
        return matrixCursor;
    }

    @Override // android.content.ContentProvider
    public int update(Uri uri, ContentValues values, String selection, String[] selectionArgs) {
        AbstractC2855l.g(uri, "uri");
        throw new UnsupportedOperationException("This is a read-only provider");
    }
}
