package expo.modules.filesystem.unifiedfile;

import O8.i;
import O8.l;
import Q8.a;
import Q8.c;
import android.net.Uri;
import android.os.Build;
import android.webkit.MimeTypeMap;
import androidx.core.content.FileProvider;
import com.facebook.react.uimanager.events.PointerEventHelper;
import com.reactnativecommunity.asyncstorage.d;
import expo.modules.kotlin.AppContext;
import expo.modules.notifications.service.NotificationsService;
import j7.AbstractC2800q;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URI;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;
import t7.j;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J!\u0010\n\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0019\u0010\f\u001a\u0004\u0018\u00010\u00012\u0006\u0010\t\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00010\u0015H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00000\u001fH\u0016¢\u0006\u0004\b \u0010!R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\"\u001a\u0004\b#\u0010$R\u0016\u0010'\u001a\u0004\u0018\u00010\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b%\u0010&R\u0016\u0010*\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0016\u0010,\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u0016\u00100\u001a\u0004\u0018\u00010-8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/¨\u00061"}, d2 = {"Lexpo/modules/filesystem/unifiedfile/JavaFile;", "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "Ljava/io/File;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mimeType", "displayName", "createFile", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "createDirectory", "(Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "deleteRecursively", "()Z", "Lexpo/modules/kotlin/AppContext;", "appContext", "getContentUri", "(Lexpo/modules/kotlin/AppContext;)Landroid/net/Uri;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "listFilesAsUnified", "()Ljava/util/List;", "append", "Ljava/io/OutputStream;", "outputStream", "(Z)Ljava/io/OutputStream;", "Ljava/io/InputStream;", "inputStream", "()Ljava/io/InputStream;", "LO8/i;", "walkTopDown", "()LO8/i;", "Landroid/net/Uri;", "getUri", "()Landroid/net/Uri;", "getParentFile", "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;", "parentFile", "getType", "()Ljava/lang/String;", NotificationsService.EVENT_TYPE_KEY, "getFileName", "fileName", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getCreationTime", "()Ljava/lang/Long;", "creationTime", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class JavaFile extends File implements UnifiedFileInterface {
    private final Uri uri;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaFile(Uri uri) {
        super(URI.create(uri.toString()));
        AbstractC2855l.g(uri, "uri");
        this.uri = uri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final JavaFile walkTopDown$lambda$4(File it) {
        AbstractC2855l.g(it, "it");
        return new JavaFile(Uri.fromFile(it));
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createDirectory(String displayName) {
        AbstractC2855l.g(displayName, "displayName");
        File file = new File(super.getParentFile(), displayName);
        file.mkdir();
        return new JavaFile(Uri.fromFile(file));
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface createFile(String mimeType, String displayName) throws IOException {
        AbstractC2855l.g(mimeType, "mimeType");
        AbstractC2855l.g(displayName, "displayName");
        File file = new File(super.getParentFile(), displayName);
        file.createNewFile();
        return new JavaFile(Uri.fromFile(file));
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public boolean deleteRecursively() {
        File[] fileArrListFiles;
        if (isDirectory() && (fileArrListFiles = listFiles()) != null) {
            for (File file : fileArrListFiles) {
                AbstractC2855l.d(file);
                j.x(file);
            }
        }
        return super.delete();
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getContentUri(AppContext appContext) {
        AbstractC2855l.g(appContext, "appContext");
        Uri uriForFile = FileProvider.getUriForFile(appContext.getThrowingActivity().getApplication(), appContext.getThrowingActivity().getApplication().getPackageName() + ".FileSystemFileProvider", this);
        AbstractC2855l.f(uriForFile, "getUriForFile(...)");
        return uriForFile;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Long getCreationTime() throws IOException {
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        String path = getPath();
        AbstractC2855l.f(path, "getPath(...)");
        Path path2 = Paths.get(path, new String[0]);
        AbstractC2855l.f(path2, "get(...)");
        BasicFileAttributes attributes = Files.readAttributes(path2, (Class<BasicFileAttributes>) d.a(), (LinkOption[]) Arrays.copyOf(new LinkOption[0], 0));
        AbstractC2855l.f(attributes, "readAttributes(...)");
        a.C0100a c0100a = Q8.a.f9879h;
        return Long.valueOf(Q8.a.v(c.j(attributes.creationTime().toMillis(), Q8.d.f9888j)));
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getFileName() {
        return super.getName();
    }

    @Override // java.io.File, expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public UnifiedFileInterface getParentFile() {
        Uri uriFromFile;
        File parentFile = super.getParentFile();
        if (parentFile == null || (uriFromFile = Uri.fromFile(parentFile)) == null) {
            return null;
        }
        return new JavaFile(uriFromFile);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public String getType() {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(getPath());
        if (fileExtensionFromUrl == null) {
            return null;
        }
        MimeTypeMap singleton = MimeTypeMap.getSingleton();
        String lowerCase = fileExtensionFromUrl.toLowerCase(Locale.ROOT);
        AbstractC2855l.f(lowerCase, "toLowerCase(...)");
        return singleton.getMimeTypeFromExtension(lowerCase);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public Uri getUri() {
        return this.uri;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public InputStream inputStream() {
        return new FileInputStream(this);
    }

    @Override // java.io.File, expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public /* bridge */ /* synthetic */ Long lastModified() {
        return Long.valueOf(lastModified());
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public List<UnifiedFileInterface> listFilesAsUnified() {
        File[] fileArrListFiles = super.listFiles();
        if (fileArrListFiles == null) {
            return AbstractC2800q.j();
        }
        ArrayList arrayList = new ArrayList(fileArrListFiles.length);
        for (File file : fileArrListFiles) {
            AbstractC2855l.d(file);
            arrayList.add(new JavaFile(Uri.fromFile(file)));
        }
        return arrayList;
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public OutputStream outputStream(boolean append) {
        return new FileOutputStream(this, append);
    }

    @Override // expo.modules.filesystem.unifiedfile.UnifiedFileInterface
    public i walkTopDown() {
        return l.J(j.o(this, t7.i.f32509g), new Function1() { // from class: expo.modules.filesystem.unifiedfile.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return JavaFile.walkTopDown$lambda$4((File) obj);
            }
        });
    }
}
