.class public final Lexpo/modules/filesystem/FilePickerContractResult$Success;
.super Lexpo/modules/filesystem/FilePickerContractResult;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/filesystem/FilePickerContractResult;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Success"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lexpo/modules/filesystem/FilePickerContractResult$Success;",
        "Lexpo/modules/filesystem/FilePickerContractResult;",
        "path",
        "Lexpo/modules/filesystem/FileSystemPath;",
        "<init>",
        "(Lexpo/modules/filesystem/FileSystemPath;)V",
        "getPath",
        "()Lexpo/modules/filesystem/FileSystemPath;",
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
.field private final path:Lexpo/modules/filesystem/FileSystemPath;


# direct methods
.method public constructor <init>(Lexpo/modules/filesystem/FileSystemPath;)V
    .locals 1

    .line 1
    const-string v0, "path"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const/4 v0, 0x0

    .line 7
    invoke-direct {p0, v0}, Lexpo/modules/filesystem/FilePickerContractResult;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 8
    .line 9
    .line 10
    iput-object p1, p0, Lexpo/modules/filesystem/FilePickerContractResult$Success;->path:Lexpo/modules/filesystem/FileSystemPath;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final getPath()Lexpo/modules/filesystem/FileSystemPath;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/filesystem/FilePickerContractResult$Success;->path:Lexpo/modules/filesystem/FileSystemPath;

    .line 2
    .line 3
    return-object v0
.end method
