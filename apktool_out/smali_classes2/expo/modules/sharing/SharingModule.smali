.class public final Lexpo/modules/sharing/SharingModule;
.super Lexpo/modules/kotlin/modules/Module;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lexpo/modules/sharing/SharingModule$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 \u00172\u00020\u0001:\u0001\u0017B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\n\u001a\u00020\u000bH\u0016J\u0012\u0010\u000c\u001a\u00020\r2\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u0012\u0010\u0010\u001a\u00020\u00112\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0002J\u001a\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u0006\u0010\u0007R\u0010\u0010\u0008\u001a\u0004\u0018\u00010\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"
    }
    d2 = {
        "Lexpo/modules/sharing/SharingModule;",
        "Lexpo/modules/kotlin/modules/Module;",
        "<init>",
        "()V",
        "context",
        "Landroid/content/Context;",
        "getContext",
        "()Landroid/content/Context;",
        "pendingPromise",
        "Lexpo/modules/kotlin/Promise;",
        "definition",
        "Lexpo/modules/kotlin/modules/ModuleDefinitionData;",
        "getLocalFileFoUrl",
        "Ljava/io/File;",
        "url",
        "",
        "isAllowedToRead",
        "",
        "createSharingIntent",
        "Landroid/content/Intent;",
        "uri",
        "Landroid/net/Uri;",
        "mimeType",
        "Companion",
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


# static fields
.field public static final Companion:Lexpo/modules/sharing/SharingModule$Companion;

.field private static final REQUEST_CODE:I = 0x214c


# instance fields
.field private pendingPromise:Lexpo/modules/kotlin/Promise;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Lexpo/modules/sharing/SharingModule$Companion;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, v1}, Lexpo/modules/sharing/SharingModule$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 5
    .line 6
    .line 7
    sput-object v0, Lexpo/modules/sharing/SharingModule;->Companion:Lexpo/modules/sharing/SharingModule$Companion;

    .line 8
    .line 9
    return-void
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/kotlin/modules/Module;-><init>()V

    .line 2
    .line 3
    .line 4
    return-void
.end method

.method public static final synthetic access$createSharingIntent(Lexpo/modules/sharing/SharingModule;Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lexpo/modules/sharing/SharingModule;->createSharingIntent(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getContext(Lexpo/modules/sharing/SharingModule;)Landroid/content/Context;
    .locals 0

    .line 1
    invoke-direct {p0}, Lexpo/modules/sharing/SharingModule;->getContext()Landroid/content/Context;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getLocalFileFoUrl(Lexpo/modules/sharing/SharingModule;Ljava/lang/String;)Ljava/io/File;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/sharing/SharingModule;->getLocalFileFoUrl(Ljava/lang/String;)Ljava/io/File;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method public static final synthetic access$getPendingPromise$p(Lexpo/modules/sharing/SharingModule;)Lexpo/modules/kotlin/Promise;
    .locals 0

    .line 1
    iget-object p0, p0, Lexpo/modules/sharing/SharingModule;->pendingPromise:Lexpo/modules/kotlin/Promise;

    .line 2
    .line 3
    return-object p0
.end method

.method public static final synthetic access$setPendingPromise$p(Lexpo/modules/sharing/SharingModule;Lexpo/modules/kotlin/Promise;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lexpo/modules/sharing/SharingModule;->pendingPromise:Lexpo/modules/kotlin/Promise;

    .line 2
    .line 3
    return-void
.end method

.method private final createSharingIntent(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
    .locals 2

    .line 1
    new-instance v0, Landroid/content/Intent;

    .line 2
    .line 3
    const-string v1, "android.intent.action.SEND"

    .line 4
    .line 5
    invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string v1, "android.intent.extra.STREAM"

    .line 9
    .line 10
    invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Landroid/os/Parcelable;)Landroid/content/Intent;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p2}, Landroid/content/Intent;->setTypeAndNormalize(Ljava/lang/String;)Landroid/content/Intent;

    .line 14
    .line 15
    .line 16
    const/4 p1, 0x1

    .line 17
    invoke-virtual {v0, p1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;

    .line 18
    .line 19
    .line 20
    return-object v0
.end method

.method private final getContext()Landroid/content/Context;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getReactContext()Landroid/content/Context;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    return-object v0

    .line 12
    :cond_0
    new-instance v0, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;

    .line 13
    .line 14
    invoke-direct {v0}, Lexpo/modules/kotlin/exception/Exceptions$ReactContextLost;-><init>()V

    .line 15
    .line 16
    .line 17
    throw v0
.end method

.method private final getLocalFileFoUrl(Ljava/lang/String;)Ljava/io/File;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lexpo/modules/core/errors/InvalidArgumentException;
        }
    .end annotation

    .line 1
    if-eqz p1, :cond_3

    .line 2
    .line 3
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 4
    .line 5
    .line 6
    move-result-object p1

    .line 7
    const-string v0, "file"

    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    invoke-static {v0, v1}, Lkotlin/jvm/internal/l;->b(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-eqz v0, :cond_2

    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    if-eqz p1, :cond_1

    .line 24
    .line 25
    invoke-direct {p0, p1}, Lexpo/modules/sharing/SharingModule;->isAllowedToRead(Ljava/lang/String;)Z

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    if-eqz v0, :cond_0

    .line 30
    .line 31
    new-instance v0, Ljava/io/File;

    .line 32
    .line 33
    invoke-direct {v0, p1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    return-object v0

    .line 37
    :cond_0
    new-instance p1, Lexpo/modules/core/errors/InvalidArgumentException;

    .line 38
    .line 39
    const-string v0, "Not allowed to read file under given URL."

    .line 40
    .line 41
    invoke-direct {p1, v0}, Lexpo/modules/core/errors/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 42
    .line 43
    .line 44
    throw p1

    .line 45
    :cond_1
    new-instance p1, Lexpo/modules/core/errors/InvalidArgumentException;

    .line 46
    .line 47
    const-string v0, "Path component of the URL to share cannot be null."

    .line 48
    .line 49
    invoke-direct {p1, v0}, Lexpo/modules/core/errors/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    throw p1

    .line 53
    :cond_2
    new-instance v0, Lexpo/modules/core/errors/InvalidArgumentException;

    .line 54
    .line 55
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    new-instance v1, Ljava/lang/StringBuilder;

    .line 60
    .line 61
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 62
    .line 63
    .line 64
    const-string v2, "Only local file URLs are supported (expected scheme to be \'file\', got \'"

    .line 65
    .line 66
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 70
    .line 71
    .line 72
    const-string p1, "\'."

    .line 73
    .line 74
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 78
    .line 79
    .line 80
    move-result-object p1

    .line 81
    invoke-direct {v0, p1}, Lexpo/modules/core/errors/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 82
    .line 83
    .line 84
    throw v0

    .line 85
    :cond_3
    new-instance p1, Lexpo/modules/core/errors/InvalidArgumentException;

    .line 86
    .line 87
    const-string v0, "URL to share cannot be null."

    .line 88
    .line 89
    invoke-direct {p1, v0}, Lexpo/modules/core/errors/InvalidArgumentException;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    throw p1
.end method

.method private final isAllowedToRead(Ljava/lang/String;)Z
    .locals 2

    .line 1
    invoke-virtual {p0}, Lexpo/modules/kotlin/modules/Module;->getAppContext()Lexpo/modules/kotlin/AppContext;

    .line 2
    .line 3
    .line 4
    move-result-object v0

    .line 5
    invoke-virtual {v0}, Lexpo/modules/kotlin/AppContext;->getFilePermission()Lexpo/modules/kotlin/services/FilePermissionService;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-nez p1, :cond_0

    .line 10
    .line 11
    const/4 p1, 0x0

    .line 12
    return p1

    .line 13
    :cond_0
    invoke-direct {p0}, Lexpo/modules/sharing/SharingModule;->getContext()Landroid/content/Context;

    .line 14
    .line 15
    .line 16
    move-result-object v1

    .line 17
    invoke-virtual {v0, v1, p1}, Lexpo/modules/kotlin/services/FilePermissionService;->getPathPermissions(Landroid/content/Context;Ljava/lang/String;)Ljava/util/EnumSet;

    .line 18
    .line 19
    .line 20
    move-result-object p1

    .line 21
    sget-object v0, Lexpo/modules/kotlin/services/FilePermissionService$Permission;->READ:Lexpo/modules/kotlin/services/FilePermissionService$Permission;

    .line 22
    .line 23
    invoke-virtual {p1, v0}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result p1

    .line 27
    return p1
.end method


# virtual methods
.method public definition()Lexpo/modules/kotlin/modules/ModuleDefinitionData;
    .locals 12

    .line 1
    const-class v0, Lexpo/modules/sharing/SharingOptions;

    .line 2
    .line 3
    const-class v1, Ljava/lang/String;

    .line 4
    .line 5
    const-class v2, Ljava/lang/Object;

    .line 6
    .line 7
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 8
    .line 9
    .line 10
    move-result-object v3

    .line 11
    new-instance v4, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string v3, ".ModuleDefinition"

    .line 20
    .line 21
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object v3

    .line 28
    new-instance v4, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    .line 31
    .line 32
    .line 33
    const-string v5, "["

    .line 34
    .line 35
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    .line 38
    const-string v5, "ExpoModulesCore"

    .line 39
    .line 40
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    const-string v5, "] "

    .line 44
    .line 45
    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    move-result-object v3

    .line 55
    invoke-static {v3}, Ll1/a;->c(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    :try_start_0
    new-instance v3, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;

    .line 59
    .line 60
    invoke-direct {v3, p0}, Lexpo/modules/kotlin/modules/ModuleDefinitionBuilder;-><init>(Lexpo/modules/kotlin/modules/Module;)V

    .line 61
    .line 62
    .line 63
    const-string v4, "ExpoSharing"

    .line 64
    .line 65
    invoke-virtual {v3, v4}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->Name(Ljava/lang/String;)V

    .line 66
    .line 67
    .line 68
    const-string v4, "shareAsync"

    .line 69
    .line 70
    new-instance v5, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;

    .line 71
    .line 72
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getConverters()Lexpo/modules/kotlin/types/TypeConverterProvider;

    .line 73
    .line 74
    .line 75
    move-result-object v6

    .line 76
    sget-object v7, Lexpo/modules/kotlin/types/AnyTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/AnyTypeProvider;

    .line 77
    .line 78
    new-instance v8, Lkotlin/Pair;

    .line 79
    .line 80
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 81
    .line 82
    .line 83
    move-result-object v9

    .line 84
    sget-object v10, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 85
    .line 86
    invoke-direct {v8, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 90
    .line 91
    .line 92
    move-result-object v9

    .line 93
    invoke-interface {v9, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    move-result-object v8

    .line 97
    check-cast v8, Lexpo/modules/kotlin/types/AnyType;

    .line 98
    .line 99
    if-nez v8, :cond_0

    .line 100
    .line 101
    sget-object v8, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithPromise$1;->INSTANCE:Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithPromise$1;

    .line 102
    .line 103
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 104
    .line 105
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    .line 106
    .line 107
    invoke-static {v1}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 108
    .line 109
    .line 110
    move-result-object v1

    .line 111
    const/4 v11, 0x1

    .line 112
    invoke-direct {v10, v1, v11, v8}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 113
    .line 114
    .line 115
    invoke-direct {v9, v10, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 116
    .line 117
    .line 118
    move-object v8, v9

    .line 119
    goto :goto_0

    .line 120
    :catchall_0
    move-exception v0

    .line 121
    goto/16 :goto_1

    .line 122
    .line 123
    :cond_0
    :goto_0
    new-instance v1, Lkotlin/Pair;

    .line 124
    .line 125
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 126
    .line 127
    .line 128
    move-result-object v9

    .line 129
    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 130
    .line 131
    invoke-direct {v1, v9, v10}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v7}, Lexpo/modules/kotlin/types/AnyTypeProvider;->getTypesMap()Ljava/util/Map;

    .line 135
    .line 136
    .line 137
    move-result-object v7

    .line 138
    invoke-interface {v7, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    .line 140
    .line 141
    move-result-object v1

    .line 142
    check-cast v1, Lexpo/modules/kotlin/types/AnyType;

    .line 143
    .line 144
    const/4 v7, 0x0

    .line 145
    if-nez v1, :cond_1

    .line 146
    .line 147
    sget-object v1, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithPromise$2;->INSTANCE:Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithPromise$2;

    .line 148
    .line 149
    new-instance v9, Lexpo/modules/kotlin/types/AnyType;

    .line 150
    .line 151
    new-instance v10, Lexpo/modules/kotlin/types/LazyKType;

    .line 152
    .line 153
    invoke-static {v0}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 154
    .line 155
    .line 156
    move-result-object v0

    .line 157
    invoke-direct {v10, v0, v7, v1}, Lexpo/modules/kotlin/types/LazyKType;-><init>(LC7/d;ZLw7/a;)V

    .line 158
    .line 159
    .line 160
    invoke-direct {v9, v10, v6}, Lexpo/modules/kotlin/types/AnyType;-><init>(LC7/o;Lexpo/modules/kotlin/types/TypeConverterProvider;)V

    .line 161
    .line 162
    .line 163
    move-object v1, v9

    .line 164
    :cond_1
    filled-new-array {v8, v1}, [Lexpo/modules/kotlin/types/AnyType;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    new-instance v1, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithPromise$3;

    .line 169
    .line 170
    invoke-direct {v1, p0}, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithPromise$3;-><init>(Lexpo/modules/sharing/SharingModule;)V

    .line 171
    .line 172
    .line 173
    invoke-direct {v5, v4, v0, v1}, Lexpo/modules/kotlin/functions/AsyncFunctionWithPromiseComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function2;)V

    .line 174
    .line 175
    .line 176
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-interface {v0, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    .line 182
    .line 183
    const-string v0, "getSharedPayloads"

    .line 184
    .line 185
    new-instance v1, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 186
    .line 187
    new-array v4, v7, [Lexpo/modules/kotlin/types/AnyType;

    .line 188
    .line 189
    sget-object v5, Lexpo/modules/kotlin/types/ReturnTypeProvider;->INSTANCE:Lexpo/modules/kotlin/types/ReturnTypeProvider;

    .line 190
    .line 191
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 192
    .line 193
    .line 194
    move-result-object v6

    .line 195
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 196
    .line 197
    .line 198
    move-result-object v8

    .line 199
    invoke-interface {v6, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 200
    .line 201
    .line 202
    move-result-object v6

    .line 203
    check-cast v6, Lexpo/modules/kotlin/types/ReturnType;

    .line 204
    .line 205
    if-nez v6, :cond_2

    .line 206
    .line 207
    new-instance v6, Lexpo/modules/kotlin/types/ReturnType;

    .line 208
    .line 209
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 210
    .line 211
    .line 212
    move-result-object v8

    .line 213
    invoke-direct {v6, v8}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 217
    .line 218
    .line 219
    move-result-object v8

    .line 220
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 221
    .line 222
    .line 223
    move-result-object v9

    .line 224
    invoke-interface {v8, v9, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    .line 226
    .line 227
    :cond_2
    new-instance v8, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$FunctionWithoutArgs$1;

    .line 228
    .line 229
    invoke-direct {v8, p0}, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$FunctionWithoutArgs$1;-><init>(Lexpo/modules/sharing/SharingModule;)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v1, v0, v4, v6, v8}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 233
    .line 234
    .line 235
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 236
    .line 237
    .line 238
    move-result-object v4

    .line 239
    invoke-interface {v4, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 240
    .line 241
    .line 242
    const-string v0, "getResolvedSharedPayloadsAsync"

    .line 243
    .line 244
    new-array v1, v7, [Lexpo/modules/kotlin/types/AnyType;

    .line 245
    .line 246
    new-instance v4, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithoutArgs$1;

    .line 247
    .line 248
    invoke-direct {v4, p0}, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$AsyncFunctionWithoutArgs$1;-><init>(Lexpo/modules/sharing/SharingModule;)V

    .line 249
    .line 250
    .line 251
    new-instance v6, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;

    .line 252
    .line 253
    invoke-direct {v6, v0, v1, v4}, Lexpo/modules/kotlin/functions/UntypedAsyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lkotlin/jvm/functions/Function1;)V

    .line 254
    .line 255
    .line 256
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getAsyncFunctions()Ljava/util/Map;

    .line 257
    .line 258
    .line 259
    move-result-object v1

    .line 260
    invoke-interface {v1, v0, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 261
    .line 262
    .line 263
    const-string v0, "clearSharedPayloads"

    .line 264
    .line 265
    new-instance v1, Lexpo/modules/kotlin/functions/SyncFunctionComponent;

    .line 266
    .line 267
    new-array v4, v7, [Lexpo/modules/kotlin/types/AnyType;

    .line 268
    .line 269
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 270
    .line 271
    .line 272
    move-result-object v6

    .line 273
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 274
    .line 275
    .line 276
    move-result-object v7

    .line 277
    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 278
    .line 279
    .line 280
    move-result-object v6

    .line 281
    check-cast v6, Lexpo/modules/kotlin/types/ReturnType;

    .line 282
    .line 283
    if-nez v6, :cond_3

    .line 284
    .line 285
    new-instance v6, Lexpo/modules/kotlin/types/ReturnType;

    .line 286
    .line 287
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 288
    .line 289
    .line 290
    move-result-object v7

    .line 291
    invoke-direct {v6, v7}, Lexpo/modules/kotlin/types/ReturnType;-><init>(LC7/d;)V

    .line 292
    .line 293
    .line 294
    invoke-virtual {v5}, Lexpo/modules/kotlin/types/ReturnTypeProvider;->getTypes()Ljava/util/Map;

    .line 295
    .line 296
    .line 297
    move-result-object v5

    .line 298
    invoke-static {v2}, Lkotlin/jvm/internal/D;->b(Ljava/lang/Class;)LC7/d;

    .line 299
    .line 300
    .line 301
    move-result-object v2

    .line 302
    invoke-interface {v5, v2, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 303
    .line 304
    .line 305
    :cond_3
    new-instance v2, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$FunctionWithoutArgs$2;

    .line 306
    .line 307
    invoke-direct {v2}, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$FunctionWithoutArgs$2;-><init>()V

    .line 308
    .line 309
    .line 310
    invoke-direct {v1, v0, v4, v6, v2}, Lexpo/modules/kotlin/functions/SyncFunctionComponent;-><init>(Ljava/lang/String;[Lexpo/modules/kotlin/types/AnyType;Lexpo/modules/kotlin/types/ReturnType;Lkotlin/jvm/functions/Function1;)V

    .line 311
    .line 312
    .line 313
    invoke-virtual {v3}, Lexpo/modules/kotlin/objects/ObjectDefinitionBuilder;->getSyncFunctions()Ljava/util/Map;

    .line 314
    .line 315
    .line 316
    move-result-object v2

    .line 317
    invoke-interface {v2, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->getEventListeners()Ljava/util/Map;

    .line 321
    .line 322
    .line 323
    move-result-object v0

    .line 324
    sget-object v1, Lexpo/modules/kotlin/events/EventName;->ON_ACTIVITY_RESULT:Lexpo/modules/kotlin/events/EventName;

    .line 325
    .line 326
    new-instance v2, Lexpo/modules/kotlin/events/EventListenerWithSenderAndPayload;

    .line 327
    .line 328
    new-instance v4, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$OnActivityResult$1;

    .line 329
    .line 330
    invoke-direct {v4, p0}, Lexpo/modules/sharing/SharingModule$definition$lambda$6$$inlined$OnActivityResult$1;-><init>(Lexpo/modules/sharing/SharingModule;)V

    .line 331
    .line 332
    .line 333
    invoke-direct {v2, v1, v4}, Lexpo/modules/kotlin/events/EventListenerWithSenderAndPayload;-><init>(Lexpo/modules/kotlin/events/EventName;Lkotlin/jvm/functions/Function2;)V

    .line 334
    .line 335
    .line 336
    invoke-interface {v0, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 337
    .line 338
    .line 339
    invoke-virtual {v3}, Lexpo/modules/kotlin/modules/InternalModuleDefinitionBuilder;->buildModule()Lexpo/modules/kotlin/modules/ModuleDefinitionData;

    .line 340
    .line 341
    .line 342
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 343
    invoke-static {}, Ll1/a;->f()V

    .line 344
    .line 345
    .line 346
    return-object v0

    .line 347
    :goto_1
    invoke-static {}, Ll1/a;->f()V

    .line 348
    .line 349
    .line 350
    throw v0
.end method
