.class public final Lexpo/modules/securestore/AuthenticationPrompt;
.super Ljava/lang/Object;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0017\u0010\u000c\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u001a\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0086@\u00a2\u0006\u0004\u0008\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0003\u0010\u0013R\u0016\u0010\u0015\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0016\u0010\u0018\u001a\u00020\u00178\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lexpo/modules/securestore/AuthenticationPrompt;",
        "",
        "Landroidx/fragment/app/q;",
        "currentActivity",
        "Landroid/content/Context;",
        "context",
        "",
        "title",
        "<init>",
        "(Landroidx/fragment/app/q;Landroid/content/Context;Ljava/lang/String;)V",
        "",
        "code",
        "convertErrorCode",
        "(I)Ljava/lang/String;",
        "Ljavax/crypto/Cipher;",
        "cipher",
        "Lo/f$b;",
        "authenticate",
        "(Ljavax/crypto/Cipher;Ln7/f;)Ljava/lang/Object;",
        "Landroidx/fragment/app/q;",
        "Ljava/util/concurrent/Executor;",
        "executor",
        "Ljava/util/concurrent/Executor;",
        "Lo/f$d;",
        "promptInfo",
        "Lo/f$d;",
        "expo-secure-store_release"
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
.field private final currentActivity:Landroidx/fragment/app/q;

.field private executor:Ljava/util/concurrent/Executor;

.field private promptInfo:Lo/f$d;


# direct methods
.method public constructor <init>(Landroidx/fragment/app/q;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    const-string v0, "currentActivity"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    const-string v0, "context"

    .line 7
    .line 8
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 9
    .line 10
    .line 11
    const-string v0, "title"

    .line 12
    .line 13
    invoke-static {p3, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 17
    .line 18
    .line 19
    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationPrompt;->currentActivity:Landroidx/fragment/app/q;

    .line 20
    .line 21
    invoke-static {p2}, Landroidx/core/content/a;->h(Landroid/content/Context;)Ljava/util/concurrent/Executor;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    const-string v0, "getMainExecutor(...)"

    .line 26
    .line 27
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationPrompt;->executor:Ljava/util/concurrent/Executor;

    .line 31
    .line 32
    new-instance p1, Lo/f$d$a;

    .line 33
    .line 34
    invoke-direct {p1}, Lo/f$d$a;-><init>()V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, p3}, Lo/f$d$a;->c(Ljava/lang/CharSequence;)Lo/f$d$a;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    const/high16 p3, 0x1040000

    .line 42
    .line 43
    invoke-virtual {p2, p3}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    .line 44
    .line 45
    .line 46
    move-result-object p2

    .line 47
    invoke-virtual {p1, p2}, Lo/f$d$a;->b(Ljava/lang/CharSequence;)Lo/f$d$a;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    invoke-virtual {p1}, Lo/f$d$a;->a()Lo/f$d;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    const-string p2, "build(...)"

    .line 56
    .line 57
    invoke-static {p1, p2}, Lkotlin/jvm/internal/l;->f(Ljava/lang/Object;Ljava/lang/String;)V

    .line 58
    .line 59
    .line 60
    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationPrompt;->promptInfo:Lo/f$d;

    .line 61
    .line 62
    return-void
.end method

.method public static final synthetic access$convertErrorCode(Lexpo/modules/securestore/AuthenticationPrompt;I)Ljava/lang/String;
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lexpo/modules/securestore/AuthenticationPrompt;->convertErrorCode(I)Ljava/lang/String;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    return-object p0
.end method

.method private final convertErrorCode(I)Ljava/lang/String;
    .locals 2

    .line 1
    const-string v0, "User canceled the authentication"

    .line 2
    .line 3
    packed-switch p1, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    :pswitch_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string v1, "Unknown error (code: "

    .line 12
    .line 13
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    const-string p1, ")"

    .line 20
    .line 21
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :pswitch_1
    const-string p1, "No device credential"

    .line 30
    .line 31
    return-object p1

    .line 32
    :pswitch_2
    return-object v0

    .line 33
    :pswitch_3
    const-string p1, "Hardware not present"

    .line 34
    .line 35
    return-object p1

    .line 36
    :pswitch_4
    const-string p1, "No biometrics enrolled"

    .line 37
    .line 38
    return-object p1

    .line 39
    :pswitch_5
    return-object v0

    .line 40
    :pswitch_6
    const-string p1, "Lockout permanent"

    .line 41
    .line 42
    return-object p1

    .line 43
    :pswitch_7
    const-string p1, "Vendor error"

    .line 44
    .line 45
    return-object p1

    .line 46
    :pswitch_8
    const-string p1, "Lockout"

    .line 47
    .line 48
    return-object p1

    .line 49
    :pswitch_9
    const-string p1, "No space"

    .line 50
    .line 51
    return-object p1

    .line 52
    :pswitch_a
    const-string p1, "Timeout"

    .line 53
    .line 54
    return-object p1

    .line 55
    :pswitch_b
    const-string p1, "Unable to process"

    .line 56
    .line 57
    return-object p1

    .line 58
    :pswitch_c
    const-string p1, "Hardware unavailable"

    .line 59
    .line 60
    return-object p1

    .line 61
    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_c
        :pswitch_b
        :pswitch_a
        :pswitch_9
        :pswitch_0
        :pswitch_0
        :pswitch_8
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method


# virtual methods
.method public final authenticate(Ljavax/crypto/Cipher;Ln7/f;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljavax/crypto/Cipher;",
            "Ln7/f;",
            ")",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    new-instance v0, Ln7/l;

    .line 2
    .line 3
    invoke-static {p2}, Lo7/b;->c(Ln7/f;)Ln7/f;

    .line 4
    .line 5
    .line 6
    move-result-object v1

    .line 7
    invoke-direct {v0, v1}, Ln7/l;-><init>(Ln7/f;)V

    .line 8
    .line 9
    .line 10
    new-instance v1, Lo/f;

    .line 11
    .line 12
    iget-object v2, p0, Lexpo/modules/securestore/AuthenticationPrompt;->currentActivity:Landroidx/fragment/app/q;

    .line 13
    .line 14
    iget-object v3, p0, Lexpo/modules/securestore/AuthenticationPrompt;->executor:Ljava/util/concurrent/Executor;

    .line 15
    .line 16
    new-instance v4, Lexpo/modules/securestore/AuthenticationPrompt$authenticate$2$1;

    .line 17
    .line 18
    invoke-direct {v4, p0, v0}, Lexpo/modules/securestore/AuthenticationPrompt$authenticate$2$1;-><init>(Lexpo/modules/securestore/AuthenticationPrompt;Ln7/f;)V

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3, v4}, Lo/f;-><init>(Landroidx/fragment/app/q;Ljava/util/concurrent/Executor;Lo/f$a;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, p0, Lexpo/modules/securestore/AuthenticationPrompt;->promptInfo:Lo/f$d;

    .line 25
    .line 26
    new-instance v3, Lo/f$c;

    .line 27
    .line 28
    invoke-direct {v3, p1}, Lo/f$c;-><init>(Ljavax/crypto/Cipher;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2, v3}, Lo/f;->a(Lo/f$d;Lo/f$c;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ln7/l;->a()Ljava/lang/Object;

    .line 35
    .line 36
    .line 37
    move-result-object p1

    .line 38
    invoke-static {}, Lo7/b;->e()Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v0

    .line 42
    if-ne p1, v0, :cond_0

    .line 43
    .line 44
    invoke-static {p2}, Lkotlin/coroutines/jvm/internal/h;->c(Ln7/f;)V

    .line 45
    .line 46
    .line 47
    :cond_0
    return-object p1
.end method
