.class public final Lexpo/modules/fetch/NativeRequestKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\u0008\u0004\"\u001c\u0010\u0000\u001a\u0008\u0012\u0004\u0012\u00020\u00020\u0001X\u0080\u0004\u00a2\u0006\n\n\u0002\u0010\u0005\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "METHODS_REQUIRING_BODY",
        "",
        "",
        "getMETHODS_REQUIRING_BODY",
        "()[Ljava/lang/String;",
        "[Ljava/lang/String;",
        "expo_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final METHODS_REQUIRING_BODY:[Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    const-string v0, "PUT"

    .line 2
    .line 3
    const-string v1, "PATCH"

    .line 4
    .line 5
    const-string v2, "POST"

    .line 6
    .line 7
    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    sput-object v0, Lexpo/modules/fetch/NativeRequestKt;->METHODS_REQUIRING_BODY:[Ljava/lang/String;

    .line 12
    .line 13
    return-void
.end method

.method public static final getMETHODS_REQUIRING_BODY()[Ljava/lang/String;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/fetch/NativeRequestKt;->METHODS_REQUIRING_BODY:[Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
