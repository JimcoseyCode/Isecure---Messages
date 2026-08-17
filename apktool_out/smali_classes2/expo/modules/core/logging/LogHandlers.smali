.class public final Lexpo/modules/core/logging/LogHandlers;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007J\u0016\u0010\u0008\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0006\u001a\u00020\u0007\u00a8\u0006\u000b"
    }
    d2 = {
        "Lexpo/modules/core/logging/LogHandlers;",
        "",
        "<init>",
        "()V",
        "createOSLogHandler",
        "Lexpo/modules/core/logging/LogHandler;",
        "category",
        "",
        "createPersistentFileLogHandler",
        "filesDirectory",
        "Ljava/io/File;",
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
.field public static final INSTANCE:Lexpo/modules/core/logging/LogHandlers;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    new-instance v0, Lexpo/modules/core/logging/LogHandlers;

    .line 2
    .line 3
    invoke-direct {v0}, Lexpo/modules/core/logging/LogHandlers;-><init>()V

    .line 4
    .line 5
    .line 6
    sput-object v0, Lexpo/modules/core/logging/LogHandlers;->INSTANCE:Lexpo/modules/core/logging/LogHandlers;

    .line 7
    .line 8
    return-void
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method


# virtual methods
.method public final createOSLogHandler(Ljava/lang/String;)Lexpo/modules/core/logging/LogHandler;
    .locals 1

    .line 1
    const-string v0, "category"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    new-instance v0, Lexpo/modules/core/logging/OSLogHandler;

    .line 7
    .line 8
    invoke-direct {v0, p1}, Lexpo/modules/core/logging/OSLogHandler;-><init>(Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    return-object v0
.end method

.method public final createPersistentFileLogHandler(Ljava/io/File;Ljava/lang/String;)Lexpo/modules/core/logging/LogHandler;
    .locals 1

    .line 1
    const-string v0, "filesDirectory"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "category"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    new-instance v0, Lexpo/modules/core/logging/PersistentFileLogHandler;

    .line 12
    .line 13
    invoke-direct {v0, p2, p1}, Lexpo/modules/core/logging/PersistentFileLogHandler;-><init>(Ljava/lang/String;Ljava/io/File;)V

    .line 14
    .line 15
    .line 16
    return-object v0
.end method
