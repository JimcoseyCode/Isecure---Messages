.class public final Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;
.super Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;->register(Ljava/lang/String;Landroidx/lifecycle/r;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;)Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher<",
        "TI;TO;>;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005*\u0001\u0000\u0008\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J%\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0002\u001a\u00028\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003H\u0016\u00a2\u0006\u0004\u0008\u0006\u0010\u0007R&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00088\u0016X\u0096\u0004\u00a2\u0006\u000c\n\u0004\u0008\t\u0010\n\u001a\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "expo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2",
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;",
        "input",
        "Ld/a;",
        "callback",
        "Li7/B;",
        "launch",
        "(Ljava/io/Serializable;Ld/a;)V",
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;",
        "contract",
        "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;",
        "getContract",
        "()Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;",
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


# instance fields
.field final synthetic $contract:Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract<",
            "TI;TO;>;"
        }
    .end annotation
.end field

.field final synthetic $fallbackCallback:Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback<",
            "TI;TO;>;"
        }
    .end annotation
.end field

.field final synthetic $key:Ljava/lang/String;

.field private final contract:Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract<",
            "TI;TO;>;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;


# direct methods
.method constructor <init>(Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;Ljava/lang/String;Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract<",
            "TI;TO;>;",
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;",
            "Ljava/lang/String;",
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback<",
            "TI;TO;>;)V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$contract:Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->this$0:Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;

    .line 4
    .line 5
    iput-object p3, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$key:Ljava/lang/String;

    .line 6
    .line 7
    iput-object p4, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$fallbackCallback:Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;

    .line 8
    .line 9
    invoke-direct {p0}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultLauncher;-><init>()V

    .line 10
    .line 11
    .line 12
    iput-object p1, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->contract:Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public getContract()Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract<",
            "TI;TO;>;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->contract:Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;

    .line 2
    .line 3
    return-object v0
.end method

.method public launch(Ljava/io/Serializable;Ld/a;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TI;",
            "Ld/a;",
            ")V"
        }
    .end annotation

    .line 1
    const-string v0, "input"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "callback"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    iget-object v0, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->this$0:Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;

    .line 12
    .line 13
    invoke-static {v0}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;->access$getKeyToRequestCode$p(Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;)Ljava/util/Map;

    .line 14
    .line 15
    .line 16
    move-result-object v0

    .line 17
    iget-object v1, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$key:Ljava/lang/String;

    .line 18
    .line 19
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    .line 21
    .line 22
    move-result-object v0

    .line 23
    check-cast v0, Ljava/lang/Integer;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 28
    .line 29
    .line 30
    move-result v0

    .line 31
    iget-object v1, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->this$0:Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;

    .line 32
    .line 33
    invoke-static {v1}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;->access$getKeyToCallbacksAndContract$p(Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;)Ljava/util/Map;

    .line 34
    .line 35
    .line 36
    move-result-object v1

    .line 37
    iget-object v2, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$key:Ljava/lang/String;

    .line 38
    .line 39
    new-instance v3, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$CallbacksAndContract;

    .line 40
    .line 41
    iget-object v4, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$fallbackCallback:Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;

    .line 42
    .line 43
    iget-object v5, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$contract:Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;

    .line 44
    .line 45
    invoke-direct {v3, v4, p2, v5}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$CallbacksAndContract;-><init>(Lexpo/modules/kotlin/activityresult/AppContextActivityResultFallbackCallback;Ld/a;Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;)V

    .line 46
    .line 47
    .line 48
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 49
    .line 50
    .line 51
    iget-object p2, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->this$0:Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;

    .line 52
    .line 53
    invoke-static {p2}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;->access$getKeyToInputParam$p(Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;)Ljava/util/Map;

    .line 54
    .line 55
    .line 56
    move-result-object p2

    .line 57
    iget-object v1, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$key:Ljava/lang/String;

    .line 58
    .line 59
    invoke-interface {p2, v1, p1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 60
    .line 61
    .line 62
    iget-object p2, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->this$0:Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;

    .line 63
    .line 64
    invoke-static {p2}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;->access$getLaunchedKeys$p(Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;)Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    move-result-object p2

    .line 68
    iget-object v1, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$key:Ljava/lang/String;

    .line 69
    .line 70
    invoke-virtual {p2, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 71
    .line 72
    .line 73
    :try_start_0
    iget-object p2, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->this$0:Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;

    .line 74
    .line 75
    iget-object v1, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$contract:Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;

    .line 76
    .line 77
    invoke-virtual {p2, v0, v1, p1}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;->onLaunch(ILexpo/modules/kotlin/activityresult/AppContextActivityResultContract;Ljava/io/Serializable;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    .line 79
    .line 80
    return-void

    .line 81
    :catch_0
    move-exception p1

    .line 82
    iget-object p2, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->this$0:Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;

    .line 83
    .line 84
    invoke-static {p2}, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;->access$getLaunchedKeys$p(Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry;)Ljava/util/ArrayList;

    .line 85
    .line 86
    .line 87
    move-result-object p2

    .line 88
    iget-object v0, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$key:Ljava/lang/String;

    .line 89
    .line 90
    invoke-virtual {p2, v0}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 91
    .line 92
    .line 93
    throw p1

    .line 94
    :cond_0
    new-instance p2, Ljava/lang/IllegalStateException;

    .line 95
    .line 96
    iget-object v0, p0, Lexpo/modules/kotlin/activityresult/AppContextActivityResultRegistry$register$2;->$contract:Lexpo/modules/kotlin/activityresult/AppContextActivityResultContract;

    .line 97
    .line 98
    new-instance v1, Ljava/lang/StringBuilder;

    .line 99
    .line 100
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 101
    .line 102
    .line 103
    const-string v2, "Attempting to launch an unregistered ActivityResultLauncher with contract "

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 109
    .line 110
    .line 111
    const-string v0, " and input "

    .line 112
    .line 113
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 117
    .line 118
    .line 119
    const-string p1, ". You must ensure the ActivityResultLauncher is registered before calling launch()"

    .line 120
    .line 121
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    .line 126
    .line 127
    move-result-object p1

    .line 128
    invoke-direct {p2, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 129
    .line 130
    .line 131
    throw p2
.end method
