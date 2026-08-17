.class public interface abstract Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface$DefaultImpls;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0002\u0008\u0008\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0010\u0008f\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0003\u0010\u0004J\u000f\u0010\u0005\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u0006\u0010\u0004J!\u0010\n\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00002\u0006\u0010\t\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000e\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u000e\u0010\u0004J\u000f\u0010\u000f\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u000f\u0010\u0004J\u0015\u0010\u0011\u001a\u0008\u0012\u0004\u0012\u00020\u00000\u0010H&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0011\u0010\u0014\u001a\u0004\u0018\u00010\u0013H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H&\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0019\u0010\u001d\u001a\u00020\u001c2\u0008\u0008\u0002\u0010\u001b\u001a\u00020\u0002H&\u00a2\u0006\u0004\u0008\u001d\u0010\u001eJ\u000f\u0010 \u001a\u00020\u001fH&\u00a2\u0006\u0004\u0008 \u0010!J\u000f\u0010\"\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\"\u0010#J\u0015\u0010%\u001a\u0008\u0012\u0004\u0012\u00020\u00000$H&\u00a2\u0006\u0004\u0008%\u0010&R\u0016\u0010)\u001a\u0004\u0018\u00010\u00008&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\'\u0010(R\u0014\u0010,\u001a\u00020\u00188&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008*\u0010+R\u0016\u0010/\u001a\u0004\u0018\u00010\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u0008-\u0010.R\u0016\u00101\u001a\u0004\u0018\u00010\u00138&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00080\u0010\u0015R\u0016\u00103\u001a\u0004\u0018\u00010\u00078&X\u00a6\u0004\u00a2\u0006\u0006\u001a\u0004\u00082\u0010.\u00a8\u00064"
    }
    d2 = {
        "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
        "",
        "",
        "exists",
        "()Z",
        "isDirectory",
        "isFile",
        "",
        "mimeType",
        "displayName",
        "createFile",
        "(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
        "createDirectory",
        "(Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
        "delete",
        "deleteRecursively",
        "",
        "listFilesAsUnified",
        "()Ljava/util/List;",
        "",
        "lastModified",
        "()Ljava/lang/Long;",
        "Lexpo/modules/kotlin/AppContext;",
        "appContext",
        "Landroid/net/Uri;",
        "getContentUri",
        "(Lexpo/modules/kotlin/AppContext;)Landroid/net/Uri;",
        "append",
        "Ljava/io/OutputStream;",
        "outputStream",
        "(Z)Ljava/io/OutputStream;",
        "Ljava/io/InputStream;",
        "inputStream",
        "()Ljava/io/InputStream;",
        "length",
        "()J",
        "LO8/i;",
        "walkTopDown",
        "()LO8/i;",
        "getParentFile",
        "()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
        "parentFile",
        "getUri",
        "()Landroid/net/Uri;",
        "uri",
        "getType",
        "()Ljava/lang/String;",
        "type",
        "getCreationTime",
        "creationTime",
        "getFileName",
        "fileName",
        "expo-file-system_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# virtual methods
.method public abstract createDirectory(Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
.end method

.method public abstract createFile(Ljava/lang/String;Ljava/lang/String;)Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
.end method

.method public abstract delete()Z
.end method

.method public abstract deleteRecursively()Z
.end method

.method public abstract exists()Z
.end method

.method public abstract getContentUri(Lexpo/modules/kotlin/AppContext;)Landroid/net/Uri;
.end method

.method public abstract getCreationTime()Ljava/lang/Long;
.end method

.method public abstract getFileName()Ljava/lang/String;
.end method

.method public abstract getParentFile()Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;
.end method

.method public abstract getType()Ljava/lang/String;
.end method

.method public abstract getUri()Landroid/net/Uri;
.end method

.method public abstract inputStream()Ljava/io/InputStream;
.end method

.method public abstract isDirectory()Z
.end method

.method public abstract isFile()Z
.end method

.method public abstract lastModified()Ljava/lang/Long;
.end method

.method public abstract length()J
.end method

.method public abstract listFilesAsUnified()Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lexpo/modules/filesystem/unifiedfile/UnifiedFileInterface;",
            ">;"
        }
    .end annotation
.end method

.method public abstract outputStream(Z)Ljava/io/OutputStream;
.end method

.method public abstract walkTopDown()LO8/i;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "LO8/i;"
        }
    .end annotation
.end method
