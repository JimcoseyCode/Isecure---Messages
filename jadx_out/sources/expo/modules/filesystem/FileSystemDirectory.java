package expo.modules.filesystem;

import O8.l;
import P8.q;
import android.net.Uri;
import com.facebook.react.uimanager.events.PointerEventHelper;
import expo.modules.filesystem.unifiedfile.UnifiedFileInterface;
import expo.modules.kotlin.services.FilePermissionService;
import i7.t;
import j7.AbstractC2800q;
import j7.K;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC2855l;

/* JADX INFO: compiled from: r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\bJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u0017\u0010\u000f\u001a\u00020\u00062\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0015\u001a\u00020\u00142\b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0017\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u001f\u0010\u001c\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u001b0\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\r\u0010\u001e\u001a\u00020\u0011¢\u0006\u0004\b\u001e\u0010\u001fJ\u0015\u0010!\u001a\u00020 2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b!\u0010\"R\u0011\u0010%\u001a\u00020 8F¢\u0006\u0006\u001a\u0004\b#\u0010$R\u0011\u0010)\u001a\u00020&8F¢\u0006\u0006\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lexpo/modules/filesystem/FileSystemDirectory;", "Lexpo/modules/filesystem/FileSystemPath;", "Landroid/net/Uri;", "uri", "<init>", "(Landroid/net/Uri;)V", "Li7/B;", "validatePath", "()V", "validateType", "Lexpo/modules/filesystem/DirectoryInfo;", "info", "()Lexpo/modules/filesystem/DirectoryInfo;", "Lexpo/modules/filesystem/CreateOptions;", "options", "create", "(Lexpo/modules/filesystem/CreateOptions;)V", PointerEventHelper.POINTER_TYPE_UNKNOWN, "mimeType", "fileName", "Lexpo/modules/filesystem/FileSystemFile;", "createFile", "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/FileSystemFile;", "createDirectory", "(Ljava/lang/String;)Lexpo/modules/filesystem/FileSystemDirectory;", PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, PointerEventHelper.POINTER_TYPE_UNKNOWN, "listAsRecords", "()Ljava/util/List;", "asString", "()Ljava/lang/String;", PointerEventHelper.POINTER_TYPE_UNKNOWN, "needsCreation", "(Lexpo/modules/filesystem/CreateOptions;)Z", "getExists", "()Z", "exists", PointerEventHelper.POINTER_TYPE_UNKNOWN, "getSize", "()J", "size", "expo-file-system_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
public final class FileSystemDirectory extends FileSystemPath {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FileSystemDirectory(Uri uri) {
        super(uri);
        AbstractC2855l.g(uri, "uri");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean _get_size_$lambda$0(UnifiedFileInterface it) {
        AbstractC2855l.g(it, "it");
        return it.isFile();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long _get_size_$lambda$1(UnifiedFileInterface it) {
        AbstractC2855l.g(it, "it");
        return it.length();
    }

    public static /* synthetic */ void create$default(FileSystemDirectory fileSystemDirectory, CreateOptions createOptions, int i10, Object obj) throws InvalidTypeFolderException, UnableToCreateException {
        if ((i10 & 1) != 0) {
            createOptions = new CreateOptions(false, false, false, 7, null);
        }
        fileSystemDirectory.create(createOptions);
    }

    public final String asString() {
        String string = getFile().getUri().toString();
        AbstractC2855l.f(string, "toString(...)");
        if (q.w(string, "/", false, 2, null)) {
            return string;
        }
        return string + "/";
    }

    public final void create(CreateOptions options) throws InvalidTypeFolderException, UnableToCreateException {
        AbstractC2855l.g(options, "options");
        validateType();
        validatePermission(FilePermissionService.Permission.WRITE);
        if (needsCreation(options)) {
            if (FileSystemPathKt.isContentUri(getUri())) {
                throw new UnableToCreateException("create function does not work with SAF Uris, use `createDirectory` and `createFile` instead");
            }
            validateCanCreate(options);
            if (options.getOverwrite() && getFile().exists()) {
                getFile().delete();
            }
            if (!(options.getIntermediates() ? getJavaFile().mkdirs() : getJavaFile().mkdir())) {
                throw new UnableToCreateException("directory already exists or could not be created");
            }
        }
    }

    public final FileSystemDirectory createDirectory(String fileName) throws InvalidTypeFolderException, UnableToCreateException {
        AbstractC2855l.g(fileName, "fileName");
        validateType();
        validatePermission(FilePermissionService.Permission.WRITE);
        UnifiedFileInterface unifiedFileInterfaceCreateDirectory = getFile().createDirectory(fileName);
        if (unifiedFileInterfaceCreateDirectory != null) {
            return new FileSystemDirectory(unifiedFileInterfaceCreateDirectory.getUri());
        }
        throw new UnableToCreateException("directory could not be created");
    }

    public final FileSystemFile createFile(String mimeType, String fileName) throws InvalidTypeFolderException, UnableToCreateException {
        AbstractC2855l.g(fileName, "fileName");
        validateType();
        validatePermission(FilePermissionService.Permission.WRITE);
        UnifiedFileInterface file = getFile();
        if (mimeType == null) {
            mimeType = "text/plain";
        }
        UnifiedFileInterface unifiedFileInterfaceCreateFile = file.createFile(mimeType, fileName);
        if (unifiedFileInterfaceCreateFile != null) {
            return new FileSystemFile(unifiedFileInterfaceCreateFile.getUri());
        }
        throw new UnableToCreateException("file could not be created");
    }

    public final boolean getExists() {
        if (checkPermission(FilePermissionService.Permission.READ)) {
            return getFile().isDirectory();
        }
        return false;
    }

    public final long getSize() throws InvalidTypeFolderException {
        validatePermission(FilePermissionService.Permission.READ);
        validateType();
        return l.O(l.J(l.y(getFile().walkTopDown(), new Function1() { // from class: expo.modules.filesystem.a
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(FileSystemDirectory._get_size_$lambda$0((UnifiedFileInterface) obj));
            }
        }), new Function1() { // from class: expo.modules.filesystem.b
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Long.valueOf(FileSystemDirectory._get_size_$lambda$1((UnifiedFileInterface) obj));
            }
        }));
    }

    public final DirectoryInfo info() throws InvalidTypeFolderException {
        validateType();
        validatePermission(FilePermissionService.Permission.READ);
        if (!getFile().exists()) {
            return new DirectoryInfo(false, FileSystemPathKt.slashifyFilePath(getFile().getUri().toString()), null, null, null, null, null, 124, null);
        }
        String strSlashifyFilePath = FileSystemPathKt.slashifyFilePath(getFile().getUri().toString());
        List<UnifiedFileInterface> listListFilesAsUnified = getFile().listFilesAsUnified();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listListFilesAsUnified.iterator();
        while (it.hasNext()) {
            String fileName = ((UnifiedFileInterface) it.next()).getFileName();
            if (fileName != null) {
                arrayList.add(fileName);
            }
        }
        return new DirectoryInfo(true, strSlashifyFilePath, arrayList, null, Long.valueOf(getSize()), getModificationTime(), getCreationTime(), 8, null);
    }

    public final List<Map<String, Object>> listAsRecords() throws InvalidTypeFolderException {
        validateType();
        validatePermission(FilePermissionService.Permission.READ);
        List<UnifiedFileInterface> listListFilesAsUnified = getFile().listFilesAsUnified();
        ArrayList arrayList = new ArrayList(AbstractC2800q.u(listListFilesAsUnified, 10));
        for (UnifiedFileInterface unifiedFileInterface : listListFilesAsUnified) {
            String string = unifiedFileInterface.getUri().toString();
            AbstractC2855l.f(string, "toString(...)");
            boolean zIsDirectory = unifiedFileInterface.isDirectory();
            Pair pairA = t.a("isDirectory", Boolean.valueOf(zIsDirectory));
            if (zIsDirectory && !q.w(string, "/", false, 2, null)) {
                string = string + "/";
            }
            arrayList.add(K.l(pairA, t.a("uri", string)));
        }
        return arrayList;
    }

    public final boolean needsCreation(CreateOptions options) {
        AbstractC2855l.g(options, "options");
        return (getFile().exists() && options.getIdempotent()) ? false : true;
    }

    @Override // expo.modules.filesystem.FileSystemPath
    public void validateType() throws InvalidTypeFolderException {
        if (getFile().exists() && !getFile().isDirectory()) {
            throw new InvalidTypeFolderException();
        }
    }

    public final void validatePath() {
    }
}
