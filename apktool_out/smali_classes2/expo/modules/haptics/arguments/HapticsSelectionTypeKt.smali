.class public final Lexpo/modules/haptics/arguments/HapticsSelectionTypeKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0011\u0010\u0000\u001a\u00020\u0001\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "HapticsSelectionType",
        "Lexpo/modules/haptics/arguments/HapticsVibrationType;",
        "getHapticsSelectionType",
        "()Lexpo/modules/haptics/arguments/HapticsVibrationType;",
        "expo-haptics_release"
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
.field private static final HapticsSelectionType:Lexpo/modules/haptics/arguments/HapticsVibrationType;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 2
    .line 3
    const/4 v1, 0x2

    .line 4
    new-array v2, v1, [J

    .line 5
    .line 6
    fill-array-data v2, :array_0

    .line 7
    .line 8
    .line 9
    const/4 v3, 0x0

    .line 10
    const/16 v4, 0x1e

    .line 11
    .line 12
    filled-new-array {v3, v4}, [I

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    new-array v1, v1, [J

    .line 17
    .line 18
    fill-array-data v1, :array_1

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v2, v3, v1}, Lexpo/modules/haptics/arguments/HapticsVibrationType;-><init>([J[I[J)V

    .line 22
    .line 23
    .line 24
    sput-object v0, Lexpo/modules/haptics/arguments/HapticsSelectionTypeKt;->HapticsSelectionType:Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 25
    .line 26
    return-void

    .line 27
    :array_0
    .array-data 8
        0x0
        0x32
    .end array-data

    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    :array_1
    .array-data 8
        0x0
        0x46
    .end array-data
.end method

.method public static final getHapticsSelectionType()Lexpo/modules/haptics/arguments/HapticsVibrationType;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/haptics/arguments/HapticsSelectionTypeKt;->HapticsSelectionType:Lexpo/modules/haptics/arguments/HapticsVibrationType;

    .line 2
    .line 3
    return-object v0
.end method
