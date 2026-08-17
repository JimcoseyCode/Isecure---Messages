.class public final Lexpo/modules/sharing/ContentType$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/sharing/ContentType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lexpo/modules/sharing/ContentType$Companion;",
        "",
        "<init>",
        "()V",
        "fromMimeType",
        "Lexpo/modules/sharing/ContentType;",
        "mimeType",
        "",
        "expo-sharing_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/sharing/ContentType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final fromMimeType(Ljava/lang/String;)Lexpo/modules/sharing/ContentType;
    .locals 4

    .line 1
    const-string v0, "mimeType"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "text/html"

    .line 7
    .line 8
    const/4 v1, 0x0

    .line 9
    const/4 v2, 0x2

    .line 10
    const/4 v3, 0x0

    .line 11
    invoke-static {p1, v0, v1, v2, v3}, LP8/q;->Q(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 12
    .line 13
    .line 14
    move-result v0

    .line 15
    if-nez v0, :cond_5

    .line 16
    .line 17
    const-string v0, "application/xhtml+xml"

    .line 18
    .line 19
    invoke-static {p1, v0, v1, v2, v3}, LP8/q;->Q(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 20
    .line 21
    .line 22
    move-result v0

    .line 23
    if-eqz v0, :cond_0

    .line 24
    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const-string v0, "image/"

    .line 27
    .line 28
    invoke-static {p1, v0, v1, v2, v3}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 29
    .line 30
    .line 31
    move-result v0

    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    sget-object p1, Lexpo/modules/sharing/ContentType;->Image:Lexpo/modules/sharing/ContentType;

    .line 35
    .line 36
    return-object p1

    .line 37
    :cond_1
    const-string v0, "video/"

    .line 38
    .line 39
    invoke-static {p1, v0, v1, v2, v3}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 40
    .line 41
    .line 42
    move-result v0

    .line 43
    if-eqz v0, :cond_2

    .line 44
    .line 45
    sget-object p1, Lexpo/modules/sharing/ContentType;->Video:Lexpo/modules/sharing/ContentType;

    .line 46
    .line 47
    return-object p1

    .line 48
    :cond_2
    const-string v0, "audio/"

    .line 49
    .line 50
    invoke-static {p1, v0, v1, v2, v3}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v0

    .line 54
    if-eqz v0, :cond_3

    .line 55
    .line 56
    sget-object p1, Lexpo/modules/sharing/ContentType;->Audio:Lexpo/modules/sharing/ContentType;

    .line 57
    .line 58
    return-object p1

    .line 59
    :cond_3
    const-string v0, "text/"

    .line 60
    .line 61
    invoke-static {p1, v0, v1, v2, v3}, LP8/q;->K(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 62
    .line 63
    .line 64
    move-result p1

    .line 65
    if-eqz p1, :cond_4

    .line 66
    .line 67
    sget-object p1, Lexpo/modules/sharing/ContentType;->Text:Lexpo/modules/sharing/ContentType;

    .line 68
    .line 69
    return-object p1

    .line 70
    :cond_4
    sget-object p1, Lexpo/modules/sharing/ContentType;->File:Lexpo/modules/sharing/ContentType;

    .line 71
    .line 72
    return-object p1

    .line 73
    :cond_5
    :goto_0
    sget-object p1, Lexpo/modules/sharing/ContentType;->Website:Lexpo/modules/sharing/ContentType;

    .line 74
    .line 75
    return-object p1
.end method
