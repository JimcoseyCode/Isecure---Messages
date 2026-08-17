.class final Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;
.super Lkotlin/coroutines/jvm/internal/d;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lexpo/modules/securestore/AuthenticationHelper;->authenticateCipher(Ljavax/crypto/Cipher;ZLjava/lang/String;Ln7/f;)Ljava/lang/Object;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    k = 0x3
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lkotlin/coroutines/jvm/internal/f;
    c = "expo.modules.securestore.AuthenticationHelper"
    f = "AuthenticationHelper.kt"
    l = {
        0x18
    }
    m = "authenticateCipher"
.end annotation


# instance fields
.field label:I

.field synthetic result:Ljava/lang/Object;

.field final synthetic this$0:Lexpo/modules/securestore/AuthenticationHelper;


# direct methods
.method constructor <init>(Lexpo/modules/securestore/AuthenticationHelper;Ln7/f;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lexpo/modules/securestore/AuthenticationHelper;",
            "Ln7/f;",
            ")V"
        }
    .end annotation

    .line 1
    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->this$0:Lexpo/modules/securestore/AuthenticationHelper;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lkotlin/coroutines/jvm/internal/d;-><init>(Ln7/f;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    iput-object p1, p0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->result:Ljava/lang/Object;

    .line 2
    .line 3
    iget p1, p0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->label:I

    .line 4
    .line 5
    const/high16 v0, -0x80000000

    .line 6
    .line 7
    or-int/2addr p1, v0

    .line 8
    iput p1, p0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->label:I

    .line 9
    .line 10
    iget-object p1, p0, Lexpo/modules/securestore/AuthenticationHelper$authenticateCipher$1;->this$0:Lexpo/modules/securestore/AuthenticationHelper;

    .line 11
    .line 12
    const/4 v0, 0x0

    .line 13
    const/4 v1, 0x0

    .line 14
    invoke-virtual {p1, v0, v1, v0, p0}, Lexpo/modules/securestore/AuthenticationHelper;->authenticateCipher(Ljavax/crypto/Cipher;ZLjava/lang/String;Ln7/f;)Ljava/lang/Object;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    return-object p1
.end method
