.class public final Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"

# interfaces
.implements Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;->definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\'\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tR\"\u0010\n\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010"
    }
    d2 = {
        "expo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1",
        "Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$ProgressListener;",
        "",
        "bytesRead",
        "contentLength",
        "",
        "done",
        "Li7/B;",
        "update",
        "(JJZ)V",
        "mLastUpdate",
        "J",
        "getMLastUpdate",
        "()J",
        "setMLastUpdate",
        "(J)V",
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


# instance fields
.field final synthetic $resumeData:Ljava/lang/String;

.field final synthetic $uuid:Ljava/lang/String;

.field private mLastUpdate:J

.field final synthetic this$0:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;


# direct methods
.method constructor <init>(Ljava/lang/String;Ljava/lang/String;Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->$resumeData:Ljava/lang/String;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->$uuid:Ljava/lang/String;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->this$0:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    const-wide/16 p1, -0x1

    .line 11
    .line 12
    iput-wide p1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->mLastUpdate:J

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final getMLastUpdate()J
    .locals 2

    .line 1
    iget-wide v0, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->mLastUpdate:J

    .line 2
    .line 3
    return-wide v0
.end method

.method public final setMLastUpdate(J)V
    .locals 0

    .line 1
    iput-wide p1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->mLastUpdate:J

    .line 2
    .line 3
    return-void
.end method

.method public update(JJZ)V
    .locals 7

    .line 1
    new-instance p5, Landroid/os/Bundle;

    .line 2
    .line 3
    invoke-direct {p5}, Landroid/os/Bundle;-><init>()V

    .line 4
    .line 5
    .line 6
    new-instance v0, Landroid/os/Bundle;

    .line 7
    .line 8
    invoke-direct {v0}, Landroid/os/Bundle;-><init>()V

    .line 9
    .line 10
    .line 11
    iget-object v1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->$resumeData:Ljava/lang/String;

    .line 12
    .line 13
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 18
    .line 19
    .line 20
    move-result-wide v4

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-wide v4, v2

    .line 23
    :goto_0
    add-long/2addr p1, v4

    .line 24
    iget-object v1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->$resumeData:Ljava/lang/String;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    invoke-static {v1}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    .line 29
    .line 30
    .line 31
    move-result-wide v2

    .line 32
    :cond_1
    add-long/2addr p3, v2

    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    .line 35
    .line 36
    move-result-wide v1

    .line 37
    iget-wide v3, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->mLastUpdate:J

    .line 38
    .line 39
    const-wide/16 v5, 0x64

    .line 40
    .line 41
    add-long/2addr v3, v5

    .line 42
    cmp-long v3, v1, v3

    .line 43
    .line 44
    if-gtz v3, :cond_3

    .line 45
    .line 46
    cmp-long v3, p1, p3

    .line 47
    .line 48
    if-nez v3, :cond_2

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    return-void

    .line 52
    :cond_3
    :goto_1
    iput-wide v1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->mLastUpdate:J

    .line 53
    .line 54
    const-string v1, "totalBytesWritten"

    .line 55
    .line 56
    long-to-double p1, p1

    .line 57
    invoke-virtual {v0, v1, p1, p2}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 58
    .line 59
    .line 60
    const-string p1, "totalBytesExpectedToWrite"

    .line 61
    .line 62
    long-to-double p2, p3

    .line 63
    invoke-virtual {v0, p1, p2, p3}, Landroid/os/BaseBundle;->putDouble(Ljava/lang/String;D)V

    .line 64
    .line 65
    .line 66
    const-string p1, "uuid"

    .line 67
    .line 68
    iget-object p2, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->$uuid:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p5, p1, p2}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    const-string p1, "data"

    .line 74
    .line 75
    invoke-virtual {p5, p1, v0}, Landroid/os/Bundle;->putBundle(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 76
    .line 77
    .line 78
    iget-object p1, p0, Lexpo/modules/filesystem/legacy/FileSystemLegacyModule$definition$1$24$progressListener$1;->this$0:Lexpo/modules/filesystem/legacy/FileSystemLegacyModule;

    .line 79
    .line 80
    const-string p2, "expo-file-system.downloadProgress"

    .line 81
    .line 82
    invoke-virtual {p1, p2, p5}, Lexpo/modules/kotlin/modules/Module;->sendEvent(Ljava/lang/String;Landroid/os/Bundle;)V

    .line 83
    .line 84
    .line 85
    return-void
.end method
