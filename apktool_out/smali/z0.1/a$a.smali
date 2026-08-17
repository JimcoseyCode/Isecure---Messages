.class Lz0/a$a;
.super Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;
.source "r8-map-id-061e463ed15b965618257332b2076f08a8430850913ea9e10e0349edf4e95e68"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lz0/a;->h(Lz0/a$c;)Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lz0/a$c;


# direct methods
.method constructor <init>(Lz0/a$c;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lz0/a$a;->a:Lz0/a$c;

    .line 2
    .line 3
    invoke-direct {p0}, Landroid/hardware/fingerprint/FingerprintManager$AuthenticationCallback;-><init>()V

    .line 4
    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public onAuthenticationError(ILjava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/a$a;->a:Lz0/a$c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lz0/a$c;->a(ILjava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAuthenticationFailed()V
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/a$a;->a:Lz0/a$c;

    .line 2
    .line 3
    invoke-virtual {v0}, Lz0/a$c;->b()V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAuthenticationHelp(ILjava/lang/CharSequence;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lz0/a$a;->a:Lz0/a$c;

    .line 2
    .line 3
    invoke-virtual {v0, p1, p2}, Lz0/a$c;->c(ILjava/lang/CharSequence;)V

    .line 4
    .line 5
    .line 6
    return-void
.end method

.method public onAuthenticationSucceeded(Landroid/hardware/fingerprint/FingerprintManager$AuthenticationResult;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lz0/a$a;->a:Lz0/a$c;

    .line 2
    .line 3
    new-instance v1, Lz0/a$d;

    .line 4
    .line 5
    invoke-static {p1}, Lz0/a$b;->b(Ljava/lang/Object;)Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;

    .line 6
    .line 7
    .line 8
    move-result-object p1

    .line 9
    invoke-static {p1}, Lz0/a;->g(Landroid/hardware/fingerprint/FingerprintManager$CryptoObject;)Lz0/a$e;

    .line 10
    .line 11
    .line 12
    move-result-object p1

    .line 13
    invoke-direct {v1, p1}, Lz0/a$d;-><init>(Lz0/a$e;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lz0/a$c;->d(Lz0/a$d;)V

    .line 17
    .line 18
    .line 19
    return-void
.end method
