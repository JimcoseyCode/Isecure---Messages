.class public final Lexpo/modules/securestore/AuthenticationPrompt$authenticate$2$1;
.super Lo/f$a;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/securestore/AuthenticationPrompt;->authenticate(Ljavax/crypto/Cipher;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004*\u0001\u0000\u0008\n\u0018\u00002\u00020\u0001J\u001f\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\tH\u0016\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "expo/modules/securestore/AuthenticationPrompt$authenticate$2$1",
        "Lo/f$a;",
        "",
        "errorCode",
        "",
        "errString",
        "Li7/B;",
        "onAuthenticationError",
        "(ILjava/lang/CharSequence;)V",
        "Lo/f$b;",
        "result",
        "onAuthenticationSucceeded",
        "(Lo/f$b;)V",
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
.field final synthetic $continuation:Ln7/f;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ln7/f;"
        }
    .end annotation
.end field

.field final synthetic this$0:Lexpo/modules/securestore/AuthenticationPrompt;


# direct methods
.method constructor <init>(Lexpo/modules/securestore/AuthenticationPrompt;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/securestore/AuthenticationPrompt;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationPrompt$authenticate$2$1;->this$0:Lexpo/modules/securestore/AuthenticationPrompt;

    .line 2
    .line 3
    iput-object p2, p0, Lexpo/modules/securestore/AuthenticationPrompt$authenticate$2$1;->$continuation:Ln7/f;

    .line 4
    .line 5
    invoke-direct {p0}, Lo/f$a;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public onAuthenticationError(ILjava/lang/CharSequence;)V
    .locals 3

    .line 1
    const-string v0, "errString"

    .line 2
    .line 3
    invoke-static {p2, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1, p2}, Lo/f$a;->onAuthenticationError(ILjava/lang/CharSequence;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lexpo/modules/securestore/AuthenticationPrompt$authenticate$2$1;->this$0:Lexpo/modules/securestore/AuthenticationPrompt;

    .line 10
    .line 11
    invoke-static {v0, p1}, Lexpo/modules/securestore/AuthenticationPrompt;->access$convertErrorCode(Lexpo/modules/securestore/AuthenticationPrompt;I)Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    new-instance v0, Ljava/lang/StringBuilder;

    .line 16
    .line 17
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    const-string p1, ". "

    .line 24
    .line 25
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    .line 33
    .line 34
    move-result-object p1

    .line 35
    iget-object p2, p0, Lexpo/modules/securestore/AuthenticationPrompt$authenticate$2$1;->$continuation:Ln7/f;

    .line 36
    .line 37
    sget-object v0, Li7/o;->h:Li7/o$a;

    .line 38
    .line 39
    new-instance v0, Lexpo/modules/securestore/AuthenticationException;

    .line 40
    .line 41
    const/4 v1, 0x0

    .line 42
    const/4 v2, 0x2

    .line 43
    invoke-direct {v0, p1, v1, v2, v1}, Lexpo/modules/securestore/AuthenticationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Li7/p;->a(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object p1

    .line 50
    invoke-static {p1}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    .line 52
    .line 53
    move-result-object p1

    .line 54
    invoke-interface {p2, p1}, Ln7/f;->resumeWith(Ljava/lang/Object;)V

    .line 55
    .line 56
    .line 57
    return-void
.end method

.method public onAuthenticationSucceeded(Lo/f$b;)V
    .locals 1

    .line 1
    const-string v0, "result"

    .line 2
    .line 3
    invoke-static {p1, v0}, Lkotlin/jvm/internal/l;->g(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    .line 5
    .line 6
    invoke-super {p0, p1}, Lo/f$a;->onAuthenticationSucceeded(Lo/f$b;)V

    .line 7
    .line 8
    .line 9
    iget-object v0, p0, Lexpo/modules/securestore/AuthenticationPrompt$authenticate$2$1;->$continuation:Ln7/f;

    .line 10
    .line 11
    invoke-static {p1}, Li7/o;->b(Ljava/lang/Object;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p1

    .line 15
    invoke-interface {v0, p1}, Ln7/f;->resumeWith(Ljava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method
