.class public final Lexpo/modules/kotlin/CoreLoggerKt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0080\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "logger",
        "Lexpo/modules/core/logging/Logger;",
        "getLogger",
        "()Lexpo/modules/core/logging/Logger;",
        "expo-modules-core_release"
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
.field private static final logger:Lexpo/modules/core/logging/Logger;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Lexpo/modules/core/logging/Logger;

    .line 2
    .line 3
    sget-object v1, Lexpo/modules/core/logging/LogHandlers;->INSTANCE:Lexpo/modules/core/logging/LogHandlers;

    .line 4
    .line 5
    const-string v2, "ExpoModulesCore"

    .line 6
    .line 7
    invoke-virtual {v1, v2}, Lexpo/modules/core/logging/LogHandlers;->createOSLogHandler(Ljava/lang/String;)Lexpo/modules/core/logging/LogHandler;

    .line 8
    .line 9
    .line 10
    move-result-object v1

    .line 11
    invoke-static {v1}, Lj7/q;->e(Ljava/lang/Object;)Ljava/util/List;

    .line 12
    .line 13
    .line 14
    move-result-object v1

    .line 15
    invoke-direct {v0, v1}, Lexpo/modules/core/logging/Logger;-><init>(Ljava/util/List;)V

    .line 16
    .line 17
    .line 18
    sput-object v0, Lexpo/modules/kotlin/CoreLoggerKt;->logger:Lexpo/modules/core/logging/Logger;

    .line 19
    .line 20
    return-void
.end method

.method public static final getLogger()Lexpo/modules/core/logging/Logger;
    .locals 1

    .line 1
    sget-object v0, Lexpo/modules/kotlin/CoreLoggerKt;->logger:Lexpo/modules/core/logging/Logger;

    .line 2
    .line 3
    return-object v0
.end method
