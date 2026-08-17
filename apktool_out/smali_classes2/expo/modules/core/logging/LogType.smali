.class public final enum Lexpo/modules/core/logging/LogType;
.super Ljava/lang/Enum;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/core/logging/LogType$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lexpo/modules/core/logging/LogType;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u000e\u0008\u0086\u0081\u0002\u0018\u0000 \u00102\u0008\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0010B\u0011\u0008\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0006\u0010\u0007j\u0002\u0008\u0008j\u0002\u0008\tj\u0002\u0008\nj\u0002\u0008\u000bj\u0002\u0008\u000cj\u0002\u0008\rj\u0002\u0008\u000ej\u0002\u0008\u000f\u00a8\u0006\u0011"
    }
    d2 = {
        "Lexpo/modules/core/logging/LogType;",
        "",
        "type",
        "",
        "<init>",
        "(Ljava/lang/String;ILjava/lang/String;)V",
        "getType",
        "()Ljava/lang/String;",
        "Trace",
        "Timer",
        "Stacktrace",
        "Debug",
        "Info",
        "Warn",
        "Error",
        "Fatal",
        "Companion",
        "expo-modules-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final synthetic $ENTRIES:Lkotlin/enums/EnumEntries;

.field private static final synthetic $VALUES:[Lexpo/modules/core/logging/LogType;

.field public static final Companion:Lexpo/modules/core/logging/LogType$Companion;

.field public static final enum Debug:Lexpo/modules/core/logging/LogType;

.field public static final enum Error:Lexpo/modules/core/logging/LogType;

.field public static final enum Fatal:Lexpo/modules/core/logging/LogType;

.field public static final enum Info:Lexpo/modules/core/logging/LogType;

.field public static final enum Stacktrace:Lexpo/modules/core/logging/LogType;

.field public static final enum Timer:Lexpo/modules/core/logging/LogType;

.field public static final enum Trace:Lexpo/modules/core/logging/LogType;

.field public static final enum Warn:Lexpo/modules/core/logging/LogType;


# instance fields
.field private final type:Ljava/lang/String;


# direct methods
.method private static final synthetic $values()[Lexpo/modules/core/logging/LogType;
    .locals 8

    .line 1
    sget-object v0, Lexpo/modules/core/logging/LogType;->Trace:Lexpo/modules/core/logging/LogType;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/core/logging/LogType;->Timer:Lexpo/modules/core/logging/LogType;

    .line 4
    .line 5
    sget-object v2, Lexpo/modules/core/logging/LogType;->Stacktrace:Lexpo/modules/core/logging/LogType;

    .line 6
    .line 7
    sget-object v3, Lexpo/modules/core/logging/LogType;->Debug:Lexpo/modules/core/logging/LogType;

    .line 8
    .line 9
    sget-object v4, Lexpo/modules/core/logging/LogType;->Info:Lexpo/modules/core/logging/LogType;

    .line 10
    .line 11
    sget-object v5, Lexpo/modules/core/logging/LogType;->Warn:Lexpo/modules/core/logging/LogType;

    .line 12
    .line 13
    sget-object v6, Lexpo/modules/core/logging/LogType;->Error:Lexpo/modules/core/logging/LogType;

    .line 14
    .line 15
    sget-object v7, Lexpo/modules/core/logging/LogType;->Fatal:Lexpo/modules/core/logging/LogType;

    .line 16
    .line 17
    filled-new-array/range {v0 .. v7}, [Lexpo/modules/core/logging/LogType;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    return-object v0
.end method

.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Lexpo/modules/core/logging/LogType;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    const-string v2, "trace"

    .line 5
    .line 6
    const-string v3, "Trace"

    .line 7
    .line 8
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/core/logging/LogType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 9
    .line 10
    .line 11
    sput-object v0, Lexpo/modules/core/logging/LogType;->Trace:Lexpo/modules/core/logging/LogType;

    .line 12
    .line 13
    new-instance v0, Lexpo/modules/core/logging/LogType;

    .line 14
    .line 15
    const/4 v1, 0x1

    .line 16
    const-string v2, "timer"

    .line 17
    .line 18
    const-string v3, "Timer"

    .line 19
    .line 20
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/core/logging/LogType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 21
    .line 22
    .line 23
    sput-object v0, Lexpo/modules/core/logging/LogType;->Timer:Lexpo/modules/core/logging/LogType;

    .line 24
    .line 25
    new-instance v0, Lexpo/modules/core/logging/LogType;

    .line 26
    .line 27
    const/4 v1, 0x2

    .line 28
    const-string v2, "stacktrace"

    .line 29
    .line 30
    const-string v3, "Stacktrace"

    .line 31
    .line 32
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/core/logging/LogType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 33
    .line 34
    .line 35
    sput-object v0, Lexpo/modules/core/logging/LogType;->Stacktrace:Lexpo/modules/core/logging/LogType;

    .line 36
    .line 37
    new-instance v0, Lexpo/modules/core/logging/LogType;

    .line 38
    .line 39
    const/4 v1, 0x3

    .line 40
    const-string v2, "debug"

    .line 41
    .line 42
    const-string v3, "Debug"

    .line 43
    .line 44
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/core/logging/LogType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 45
    .line 46
    .line 47
    sput-object v0, Lexpo/modules/core/logging/LogType;->Debug:Lexpo/modules/core/logging/LogType;

    .line 48
    .line 49
    new-instance v0, Lexpo/modules/core/logging/LogType;

    .line 50
    .line 51
    const/4 v1, 0x4

    .line 52
    const-string v2, "info"

    .line 53
    .line 54
    const-string v3, "Info"

    .line 55
    .line 56
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/core/logging/LogType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 57
    .line 58
    .line 59
    sput-object v0, Lexpo/modules/core/logging/LogType;->Info:Lexpo/modules/core/logging/LogType;

    .line 60
    .line 61
    new-instance v0, Lexpo/modules/core/logging/LogType;

    .line 62
    .line 63
    const/4 v1, 0x5

    .line 64
    const-string v2, "warn"

    .line 65
    .line 66
    const-string v3, "Warn"

    .line 67
    .line 68
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/core/logging/LogType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 69
    .line 70
    .line 71
    sput-object v0, Lexpo/modules/core/logging/LogType;->Warn:Lexpo/modules/core/logging/LogType;

    .line 72
    .line 73
    new-instance v0, Lexpo/modules/core/logging/LogType;

    .line 74
    .line 75
    const/4 v1, 0x6

    .line 76
    const-string v2, "error"

    .line 77
    .line 78
    const-string v3, "Error"

    .line 79
    .line 80
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/core/logging/LogType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 81
    .line 82
    .line 83
    sput-object v0, Lexpo/modules/core/logging/LogType;->Error:Lexpo/modules/core/logging/LogType;

    .line 84
    .line 85
    new-instance v0, Lexpo/modules/core/logging/LogType;

    .line 86
    .line 87
    const/4 v1, 0x7

    .line 88
    const-string v2, "fatal"

    .line 89
    .line 90
    const-string v3, "Fatal"

    .line 91
    .line 92
    invoke-direct {v0, v3, v1, v2}, Lexpo/modules/core/logging/LogType;-><init>(Ljava/lang/String;ILjava/lang/String;)V

    .line 93
    .line 94
    .line 95
    sput-object v0, Lexpo/modules/core/logging/LogType;->Fatal:Lexpo/modules/core/logging/LogType;

    .line 96
    .line 97
    invoke-static {}, Lexpo/modules/core/logging/LogType;->$values()[Lexpo/modules/core/logging/LogType;

    .line 98
    .line 99
    .line 100
    move-result-object v0

    .line 101
    sput-object v0, Lexpo/modules/core/logging/LogType;->$VALUES:[Lexpo/modules/core/logging/LogType;

    .line 102
    .line 103
    invoke-static {v0}, Lp7/a;->a([Ljava/lang/Enum;)Lkotlin/enums/EnumEntries;

    .line 104
    .line 105
    .line 106
    move-result-object v0

    .line 107
    sput-object v0, Lexpo/modules/core/logging/LogType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 108
    .line 109
    new-instance v0, Lexpo/modules/core/logging/LogType$Companion;

    .line 110
    .line 111
    const/4 v1, 0x0

    .line 112
    invoke-direct {v0, v1}, Lexpo/modules/core/logging/LogType$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 113
    .line 114
    .line 115
    sput-object v0, Lexpo/modules/core/logging/LogType;->Companion:Lexpo/modules/core/logging/LogType$Companion;

    .line 116
    .line 117
    return-void
.end method

.method private constructor <init>(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    .line 2
    .line 3
    .line 4
    iput-object p3, p0, Lexpo/modules/core/logging/LogType;->type:Ljava/lang/String;

    .line 5
    .line 6
    return-void
.end method

.method public static getEntries()Lkotlin/enums/EnumEntries;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/enums/EnumEntries;"
        }
    .end annotation

    .line 1
    sget-object v0, Lexpo/modules/core/logging/LogType;->$ENTRIES:Lkotlin/enums/EnumEntries;

    .line 2
    .line 3
    return-object v0
.end method

.method public static valueOf(Ljava/lang/String;)Lexpo/modules/core/logging/LogType;
    .locals 1

    .line 1
    const-class v0, Lexpo/modules/core/logging/LogType;

    .line 2
    .line 3
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lexpo/modules/core/logging/LogType;

    .line 8
    .line 9
    return-object p0
.end method

.method public static values()[Lexpo/modules/core/logging/LogType;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/core/logging/LogType;->$VALUES:[Lexpo/modules/core/logging/LogType;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, [Lexpo/modules/core/logging/LogType;

    .line 8
    .line 9
    return-object v0
.end method


# virtual methods
.method public final getType()Ljava/lang/String;
    .locals 1

    .line 1
    iget-object v0, p0, Lexpo/modules/core/logging/LogType;->type:Ljava/lang/String;

    .line 2
    .line 3
    return-object v0
.end method
