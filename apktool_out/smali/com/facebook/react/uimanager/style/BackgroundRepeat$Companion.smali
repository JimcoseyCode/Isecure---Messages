.class public final Lcom/facebook/react/uimanager/style/BackgroundRepeat$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/react/uimanager/style/BackgroundRepeat;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\u001a\u0010\u0008\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\u000cH\u0002\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/BackgroundRepeat$Companion;",
        "",
        "<init>",
        "()V",
        "parse",
        "Lcom/facebook/react/uimanager/style/BackgroundRepeat;",
        "backgroundRepeatMap",
        "Lcom/facebook/react/bridge/ReadableMap;",
        "parseRepeatStyle",
        "Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;",
        "map",
        "key",
        "",
        "ReactAndroid_release"
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
    invoke-direct {p0}, Lcom/facebook/react/uimanager/style/BackgroundRepeat$Companion;-><init>()V

    return-void
.end method

.method private final parseRepeatStyle(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;
    .locals 3

    .line 1
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->hasKey(Ljava/lang/String;)Z

    .line 2
    .line 3
    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    if-eqz v0, :cond_5

    .line 7
    .line 8
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getType(Ljava/lang/String;)Lcom/facebook/react/bridge/ReadableType;

    .line 9
    .line 10
    .line 11
    move-result-object v0

    .line 12
    sget-object v2, Lcom/facebook/react/bridge/ReadableType;->String:Lcom/facebook/react/bridge/ReadableType;

    .line 13
    .line 14
    if-eq v0, v2, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    invoke-interface {p1, p2}, Lcom/facebook/react/bridge/ReadableMap;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-eqz p1, :cond_5

    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 24
    .line 25
    .line 26
    move-result p2

    .line 27
    sparse-switch p2, :sswitch_data_0

    .line 28
    .line 29
    .line 30
    goto :goto_0

    .line 31
    :sswitch_0
    const-string p2, "space"

    .line 32
    .line 33
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 34
    .line 35
    .line 36
    move-result p1

    .line 37
    if-nez p1, :cond_1

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_1
    sget-object p1, Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;->Space:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 41
    .line 42
    return-object p1

    .line 43
    :sswitch_1
    const-string p2, "round"

    .line 44
    .line 45
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 46
    .line 47
    .line 48
    move-result p1

    .line 49
    if-nez p1, :cond_2

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_2
    sget-object p1, Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;->Round:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 53
    .line 54
    return-object p1

    .line 55
    :sswitch_2
    const-string p2, "no-repeat"

    .line 56
    .line 57
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 58
    .line 59
    .line 60
    move-result p1

    .line 61
    if-nez p1, :cond_3

    .line 62
    .line 63
    goto :goto_0

    .line 64
    :cond_3
    sget-object p1, Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;->NoRepeat:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 65
    .line 66
    return-object p1

    .line 67
    :sswitch_3
    const-string p2, "repeat"

    .line 68
    .line 69
    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 70
    .line 71
    .line 72
    move-result p1

    .line 73
    if-nez p1, :cond_4

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_4
    sget-object p1, Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;->Repeat:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 77
    .line 78
    return-object p1

    .line 79
    :cond_5
    :goto_0
    return-object v1

    .line 80
    nop

    .line 81
    :sswitch_data_0
    .sparse-switch
        -0x37b3d265 -> :sswitch_3
        -0x2b3140d9 -> :sswitch_2
        0x67ab18e -> :sswitch_1
        0x688f106 -> :sswitch_0
    .end sparse-switch
.end method


# virtual methods
.method public final parse(Lcom/facebook/react/bridge/ReadableMap;)Lcom/facebook/react/uimanager/style/BackgroundRepeat;
    .locals 2

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    const/4 p1, 0x0

    .line 4
    return-object p1

    .line 5
    :cond_0
    const-string v0, "x"

    .line 6
    .line 7
    invoke-direct {p0, p1, v0}, Lcom/facebook/react/uimanager/style/BackgroundRepeat$Companion;->parseRepeatStyle(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    if-nez v0, :cond_1

    .line 12
    .line 13
    sget-object v0, Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;->Repeat:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 14
    .line 15
    :cond_1
    const-string v1, "y"

    .line 16
    .line 17
    invoke-direct {p0, p1, v1}, Lcom/facebook/react/uimanager/style/BackgroundRepeat$Companion;->parseRepeatStyle(Lcom/facebook/react/bridge/ReadableMap;Ljava/lang/String;)Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    if-nez p1, :cond_2

    .line 22
    .line 23
    sget-object p1, Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;->Repeat:Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;

    .line 24
    .line 25
    :cond_2
    new-instance v1, Lcom/facebook/react/uimanager/style/BackgroundRepeat;

    .line 26
    .line 27
    invoke-direct {v1, v0, p1}, Lcom/facebook/react/uimanager/style/BackgroundRepeat;-><init>(Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;Lcom/facebook/react/uimanager/style/BackgroundRepeatKeyword;)V

    .line 28
    .line 29
    .line 30
    return-object v1
.end method
