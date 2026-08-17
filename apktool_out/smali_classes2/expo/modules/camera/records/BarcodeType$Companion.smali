.class public final Lexpo/modules/camera/records/BarcodeType$Companion;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lexpo/modules/camera/records/BarcodeType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lexpo/modules/camera/records/BarcodeType$Companion;",
        "",
        "<init>",
        "()V",
        "mapFormatToString",
        "",
        "format",
        "",
        "expo-camera_release"
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
    invoke-direct {p0}, Lexpo/modules/camera/records/BarcodeType$Companion;-><init>()V

    return-void
.end method


# virtual methods
.method public final mapFormatToString(I)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    if-eq p1, v0, :cond_1

    .line 3
    .line 4
    const/4 v0, 0x2

    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    .line 7
    sparse-switch p1, :sswitch_data_0

    .line 8
    .line 9
    .line 10
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->UNKNOWN:Lexpo/modules/camera/records/BarcodeType;

    .line 11
    .line 12
    goto :goto_0

    .line 13
    :sswitch_0
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->AZTEC:Lexpo/modules/camera/records/BarcodeType;

    .line 14
    .line 15
    goto :goto_0

    .line 16
    :sswitch_1
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->PDF417:Lexpo/modules/camera/records/BarcodeType;

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :sswitch_2
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->UPCE:Lexpo/modules/camera/records/BarcodeType;

    .line 20
    .line 21
    goto :goto_0

    .line 22
    :sswitch_3
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->UPCA:Lexpo/modules/camera/records/BarcodeType;

    .line 23
    .line 24
    goto :goto_0

    .line 25
    :sswitch_4
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->QR:Lexpo/modules/camera/records/BarcodeType;

    .line 26
    .line 27
    goto :goto_0

    .line 28
    :sswitch_5
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->ITF14:Lexpo/modules/camera/records/BarcodeType;

    .line 29
    .line 30
    goto :goto_0

    .line 31
    :sswitch_6
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->EAN8:Lexpo/modules/camera/records/BarcodeType;

    .line 32
    .line 33
    goto :goto_0

    .line 34
    :sswitch_7
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->EAN13:Lexpo/modules/camera/records/BarcodeType;

    .line 35
    .line 36
    goto :goto_0

    .line 37
    :sswitch_8
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->DATAMATRIX:Lexpo/modules/camera/records/BarcodeType;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :sswitch_9
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->CODABAR:Lexpo/modules/camera/records/BarcodeType;

    .line 41
    .line 42
    goto :goto_0

    .line 43
    :sswitch_a
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->CODE93:Lexpo/modules/camera/records/BarcodeType;

    .line 44
    .line 45
    goto :goto_0

    .line 46
    :cond_0
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->CODE39:Lexpo/modules/camera/records/BarcodeType;

    .line 47
    .line 48
    goto :goto_0

    .line 49
    :cond_1
    sget-object p1, Lexpo/modules/camera/records/BarcodeType;->CODE128:Lexpo/modules/camera/records/BarcodeType;

    .line 50
    .line 51
    :goto_0
    invoke-static {p1}, Lexpo/modules/camera/records/BarcodeType;->access$getValue$p(Lexpo/modules/camera/records/BarcodeType;)Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    return-object p1

    .line 56
    nop

    .line 57
    :sswitch_data_0
    .sparse-switch
        0x4 -> :sswitch_a
        0x8 -> :sswitch_9
        0x10 -> :sswitch_8
        0x20 -> :sswitch_7
        0x40 -> :sswitch_6
        0x80 -> :sswitch_5
        0x100 -> :sswitch_4
        0x200 -> :sswitch_3
        0x400 -> :sswitch_2
        0x800 -> :sswitch_1
        0x1000 -> :sswitch_0
    .end sparse-switch
.end method
