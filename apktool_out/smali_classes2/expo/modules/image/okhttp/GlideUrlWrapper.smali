.class public final Lexpo/modules/image/okhttp/GlideUrlWrapper;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0006\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0010\u0010\t\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001a\u0010\u000b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u00c6\u0001\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0010\u0010\u000e\u001a\u00020\rH\u00d6\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\u0008\u0010\u0010\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010\u0014\u001a\u0004\u0008\u0015\u0010\nR$\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0017\u0010\u0018\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001d"
    }
    d2 = {
        "Lexpo/modules/image/okhttp/GlideUrlWrapper;",
        "",
        "LB1/h;",
        "glideUrl",
        "<init>",
        "(LB1/h;)V",
        "",
        "toString",
        "()Ljava/lang/String;",
        "component1",
        "()LB1/h;",
        "copy",
        "(LB1/h;)Lexpo/modules/image/okhttp/GlideUrlWrapper;",
        "",
        "hashCode",
        "()I",
        "other",
        "",
        "equals",
        "(Ljava/lang/Object;)Z",
        "LB1/h;",
        "getGlideUrl",
        "Lexpo/modules/image/events/OkHttpProgressListener;",
        "progressListener",
        "Lexpo/modules/image/events/OkHttpProgressListener;",
        "getProgressListener",
        "()Lexpo/modules/image/events/OkHttpProgressListener;",
        "setProgressListener",
        "(Lexpo/modules/image/events/OkHttpProgressListener;)V",
        "expo-image_release"
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
.field private final glideUrl:LB1/h;

.field private progressListener:Lexpo/modules/image/events/OkHttpProgressListener;


# direct methods
.method public constructor <init>(LB1/h;)V
    .locals 1

    .line 1
    const-string v0, "glideUrl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    .line 8
    .line 9
    iput-object p1, p0, Lexpo/modules/image/okhttp/GlideUrlWrapper;->glideUrl:LB1/h;

    .line 10
    .line 11
    return-void
.end method

.method public static synthetic copy$default(Lexpo/modules/image/okhttp/GlideUrlWrapper;LB1/h;ILjava/lang/Object;)Lexpo/modules/image/okhttp/GlideUrlWrapper;
    .locals 0

    .line 1
    and-int/lit8 p2, p2, 0x1

    .line 2
    .line 3
    if-eqz p2, :cond_0

    .line 4
    .line 5
    iget-object p1, p0, Lexpo/modules/image/okhttp/GlideUrlWrapper;->glideUrl:LB1/h;

    .line 6
    .line 7
    :cond_0
    invoke-virtual {p0, p1}, Lexpo/modules/image/okhttp/GlideUrlWrapper;->copy(LB1/h;)Lexpo/modules/image/okhttp/GlideUrlWrapper;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    return-object p0
.end method


# virtual methods
.method public final component1()LB1/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/image/okhttp/GlideUrlWrapper;->glideUrl:LB1/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final copy(LB1/h;)Lexpo/modules/image/okhttp/GlideUrlWrapper;
    .locals 1

    .line 1
    const-string v0, "glideUrl"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/image/okhttp/GlideUrlWrapper;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lexpo/modules/image/okhttp/GlideUrlWrapper;-><init>(LB1/h;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p0, p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    instance-of v1, p1, Lexpo/modules/image/okhttp/GlideUrlWrapper;

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
    check-cast p1, Lexpo/modules/image/okhttp/GlideUrlWrapper;

    .line 12
    .line 13
    iget-object v1, p0, Lexpo/modules/image/okhttp/GlideUrlWrapper;->glideUrl:LB1/h;

    .line 14
    .line 15
    iget-object p1, p1, Lexpo/modules/image/okhttp/GlideUrlWrapper;->glideUrl:LB1/h;

    .line 16
    .line 17
    invoke-static {v1, p1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    return v2

    .line 24
    :cond_2
    return v0
.end method

.method public final getGlideUrl()LB1/h;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/image/okhttp/GlideUrlWrapper;->glideUrl:LB1/h;

    .line 2
    .line 3
    return-object v0
.end method

.method public final getProgressListener()Lexpo/modules/image/events/OkHttpProgressListener;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/image/okhttp/GlideUrlWrapper;->progressListener:Lexpo/modules/image/events/OkHttpProgressListener;

    .line 2
    .line 3
    return-object v0
.end method

.method public hashCode()I
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/image/okhttp/GlideUrlWrapper;->glideUrl:LB1/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LB1/h;->hashCode()I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    return v0
.end method

.method public final setProgressListener(Lexpo/modules/image/events/OkHttpProgressListener;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/image/okhttp/GlideUrlWrapper;->progressListener:Lexpo/modules/image/events/OkHttpProgressListener;

    .line 2
    .line 3
    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    iget-object v0, p0, Lexpo/modules/image/okhttp/GlideUrlWrapper;->glideUrl:LB1/h;

    .line 2
    .line 3
    invoke-virtual {v0}, LB1/h;->toString()Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    const-string v1, "toString(...)"

    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    return-object v0
.end method
