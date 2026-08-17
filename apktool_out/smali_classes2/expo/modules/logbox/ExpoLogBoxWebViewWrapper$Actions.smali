.class public final Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Actions"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;,
        Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001:\u0002\u0019\u001aB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0011\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r\u00a2\u0006\u0002\u0010\u000fJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0005H\u00c6\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005H\u00c6\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0016\u001a\u00020\u0017H\u00d6\u0001J\t\u0010\u0018\u001a\u00020\u000eH\u00d6\u0001R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0008\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\n\u0010\u000b\u00a8\u0006\u001b"
    }
    d2 = {
        "Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;",
        "",
        "onReload",
        "Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;",
        "fetchTextAsync",
        "Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;",
        "<init>",
        "(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;)V",
        "getOnReload",
        "()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;",
        "getFetchTextAsync",
        "()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;",
        "getNames",
        "",
        "",
        "()[Ljava/lang/String;",
        "component1",
        "component2",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "",
        "toString",
        "OnReload",
        "FetchTextAsync",
        "expo-log-box_release"
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
.field private final fetchTextAsync:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

.field private final onReload:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;


# direct methods
.method public constructor <init>(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;)V
    .locals 1

    .line 1
    const-string v0, "onReload"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fetchTextAsync"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iput-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->onReload:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;

    .line 15
    .line 16
    iput-object p2, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->fetchTextAsync:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

    .line 17
    .line 18
    return-void
.end method

.method public static synthetic copy$default(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;ILjava/lang/Object;)Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;
    .locals 0

    .line 1
    and-int/lit8 p4, p3, 0x1

    .line 2
    .line 3
    if-eqz p4, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->onReload:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;

    .line 6
    .line 7
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 8
    .line 9
    if-eqz p3, :cond_1

    .line 10
    .line 11
    iget-object p2, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->fetchTextAsync:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

    .line 12
    .line 13
    :cond_1
    invoke-virtual {p0, p1, p2}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->copy(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;)Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method


# virtual methods
.method public final component1()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->onReload:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;

    .line 2
    .line 3
    return-object v0
.end method

.method public final component2()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->fetchTextAsync:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;)Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;
    .locals 1

    .line 1
    const-string v0, "onReload"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "fetchTextAsync"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;

    .line 12
    .line 13
    invoke-direct {v0, p1, p2}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;-><init>(Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;

    .line 6
    .line 7
    const/4 v2, 0x0

    .line 8
    if-nez v1, :cond_1

    .line 9
    .line 10
    return v2

    .line 11
    :cond_1
    check-cast p1, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->onReload:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;

    .line 14
    .line 15
    iget-object v3, p1, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->onReload:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;

    .line 16
    .line 17
    invoke-static {v1, v3}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v1

    .line 21
    if-nez v1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    iget-object v1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->fetchTextAsync:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

    .line 25
    .line 26
    iget-object p1, p1, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->fetchTextAsync:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

    .line 27
    .line 28
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    if-nez p1, :cond_3

    .line 33
    .line 34
    return v2

    .line 35
    :cond_3
    return v0
.end method

.method public final getFetchTextAsync()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->fetchTextAsync:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getNames()[Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->onReload:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;->getName()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    iget-object v1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->fetchTextAsync:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

    .line 8
    .line 9
    invoke-virtual {v1}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;->getName()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    return-object v0
.end method

.method public final getOnReload()Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->onReload:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->onReload:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;

    .line 2
    .line 3
    invoke-virtual {v0}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    mul-int/lit8 v0, v0, 0x1f

    .line 8
    .line 9
    iget-object v1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->fetchTextAsync:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

    .line 10
    .line 11
    invoke-virtual {v1}, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;->hashCode()I

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    add-int/2addr v0, v1

    .line 16
    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    .line 1
    iget-object v0, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->onReload:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$OnReload;

    .line 2
    .line 3
    iget-object v1, p0, Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions;->fetchTextAsync:Lexpo/modules/logbox/ExpoLogBoxWebViewWrapper$Actions$FetchTextAsync;

    .line 4
    .line 5
    new-instance v2, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    .line 10
    const-string v3, "Actions(onReload="

    .line 11
    .line 12
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    .line 18
    const-string v0, ", fetchTextAsync="

    .line 19
    .line 20
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    .line 26
    const-string v0, ")"

    .line 27
    .line 28
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object v0

    .line 35
    return-object v0
.end method
